package evlValidation;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

import resourcePackage.EcoreResourceLoader;
import serverStartup.ServerMain;
import thriftContract.TDDIValidationResult;
import thriftContract.TDDIValidationViolationMessage;

public class DdiValidation {

	protected IEolExecutableModule module;
	
	protected Object result;
	
	private String ddiFilePath;
	
	private List<String> metaModelFileNames;

	private String evlFilePath;
	
	private TDDIValidationResult lastValidationResult;
	
	/**
	 * This constructor is called for validation before importing and after exporting a ddi.
	 * */
	public DdiValidation() throws URISyntaxException, InvalidPathException{
		this(getStandardEvlFilePath());
	}
	
	/**
	 * This constructor is used when validation is called from dedicated validation service.
	 * */
	public DdiValidation(String evlFilePath){
		
		this.lastValidationResult = new TDDIValidationResult();
		
		this.metaModelFileNames = new ArrayList<String>();
		
		// order of metaModelFileNames list has to be considered
		this.metaModelFileNames.add("integration.ecore");
		this.metaModelFileNames.add("SACM.ecore");
    	
		this.metaModelFileNames.add("architecture.ecore");
		this.metaModelFileNames.add("dependability.ecore");
    	
		this.metaModelFileNames.add("failureLogic.ecore");
		this.metaModelFileNames.add("base.ecore");
		
		this.evlFilePath = evlFilePath;
	}
	
	/**
	 * This method returns the path of the evl file located in same directory as runnable jar file. Throws exception if jar file or evl file could not be found. 
	 * **/
	private static String getStandardEvlFilePath() throws URISyntaxException, InvalidPathException{
		File jarFile = new File(ServerMain.class.getProtectionDomain().getCodeSource().getLocation().toURI());
		File dir = jarFile.getAbsoluteFile().getParentFile();
		Path evlPath = FileSystems.getDefault().getPath(dir.toString(), "constraints.evl");
		return evlPath.toString();
	}
	
	public TDDIValidationResult getLastValidationResult() {
		return this.lastValidationResult;
	}
	
	public void execute(String ddiFilePath) {
		
		//file path
		this.ddiFilePath = ddiFilePath;
		
		//create EVL module
		module = createModule();
		//parse
		try {
			module.parse(new File(this.evlFilePath));
		} catch (Exception e) {
			System.out.println("Error loading source file");
			e.printStackTrace();
		}
		
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			return;
		}
		
		try {
			for (IModel model : getModels()) {
				module.getContext().getModelRepository().addModel(model);
			}
		} catch (Exception e) {
			System.out.println("Error accessing models");
			e.printStackTrace();
		}
		
		try {
			result = execute(module);
		} catch (EolRuntimeException e) {
			System.out.println("Error executing module");
			e.printStackTrace();
		}
		postProcess();
		
		module.getContext().getModelRepository().dispose();
	}

	protected IEolExecutableModule createModule() {
		return new EvlModule();
	}

	protected Object execute(IEolExecutableModule module) throws EolRuntimeException {
		return module.execute();
	}
	
	private void postProcess() {
		
 		EvlModule module = (EvlModule) this.module;
		
		Collection<UnsatisfiedConstraint> unsatisfied = module.getContext().getUnsatisfiedConstraints();
		
		if (unsatisfied.size() > 0) {
			
			this.lastValidationResult.setValidationViolationOccurred(true);
			this.lastValidationResult.setValidationViolationOccurredIsSet(true);
			
			
			System.err.println(unsatisfied.size() + " constraint(s) have not been satisfied\n");
			
			Map<String, List<String>> context2UnsatisfiedConstraintMessage = new HashMap<String, List<String>>();
			
			// sort messages by the context type
			for (UnsatisfiedConstraint uc : unsatisfied) {
				String context = uc.getConstraint().getConstraintContext().getTypeName();
				if(context2UnsatisfiedConstraintMessage.containsKey(context)) {
					context2UnsatisfiedConstraintMessage.get(context).add(uc.getMessage());
				}
				else{
					List<String> messagesForObjectType = new ArrayList<String>();
					messagesForObjectType.add(uc.getMessage());
					context2UnsatisfiedConstraintMessage.put(context, messagesForObjectType);
				}
			}
			
			// print UnsatisfiedConstraintMessages
			for(Map.Entry<String, List<String>> unsatisfiedValidationEntry : context2UnsatisfiedConstraintMessage.entrySet()){
				String context = unsatisfiedValidationEntry.getKey();
				System.err.println("Context: " + context);
				
				for(String message : unsatisfiedValidationEntry.getValue()){
					
					this.lastValidationResult.getValidationViolationMessages().add(getThriftValidationViolationMessage(context, message));
					
					System.err.println(message);
				}
				System.err.println();
			}
		}
		else {
			System.out.println("All constraints have been satisfied");
		}
	}
	
	private TDDIValidationViolationMessage getThriftValidationViolationMessage(String context, String message) {
		TDDIValidationViolationMessage thriftViolationMessage = new TDDIValidationViolationMessage();
		thriftViolationMessage.setContext(context);
		thriftViolationMessage.setContextIsSet(true);
		
		thriftViolationMessage.setMessage(message);
		thriftViolationMessage.setMessageIsSet(true);
		return thriftViolationMessage;
	}
	
	private List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		
		List<URI> metaModelUris = new ArrayList<URI>();
		
		for(String metaModelFileName : this.metaModelFileNames){
			metaModelUris.add(EcoreResourceLoader.getEcoreUri(metaModelFileName));
		}
		
		models.add(createEmfModel("", metaModelUris, true, false));
		return models;
	}
	
	private EmfModel createEmfModel(String name, List<URI> metaModelUris, boolean readOnLoad, boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		
		String metaModelUrisCsv = metaModelUris.stream().map(uri -> uri.toString()).reduce((a, b) -> a + "," + b).get();
		String ddiFileUriAsString = new File(this.ddiFilePath).toURI().toString();
		
		StringProperties properties = new StringProperties();
		
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, metaModelUrisCsv);
		
		properties.put(EmfModel.PROPERTY_MODEL_URI, ddiFileUriAsString);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		try {
			emfModel.load(properties, (IRelativePathResolver) null);
		} catch (EolModelLoadingException e) {
			System.out.println("Error loading model " + name);
			e.printStackTrace();
		}
		return emfModel;
	}
	
}
