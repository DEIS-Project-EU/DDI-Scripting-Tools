package epsilonScriptExecution;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;

import resourcePackage.EcoreResourceLoader;
import sacm.SacmEcoreResourceLoader;
import thriftContract.TDDIEpsilonScriptExecutionConfig;
import thriftContract.TDDIEpsilonScriptModelConfig;

public abstract class AbstractEpsilonScriptExecutor implements IEpsilonScriptExecutor{

	protected IEolExecutableModule module;
	
	protected boolean executeWithScriptFile;
	protected File epsilonScriptFile;
	protected String actualEpsilonScript;
	
	protected List<URI> metaModelURIs = new ArrayList<URI>();
	
	protected List<String> metaModelPaths = new ArrayList<String>();
	
	protected Object result;
	
	protected abstract void setModule();
	
	public void postProcess() {};
	
	public void preProcess() {};
	
	private static final Logger Log = LogManager.getLogger(AbstractEpsilonScriptExecutor.class);
	
	protected AbstractEpsilonScriptExecutor(TDDIEpsilonScriptExecutionConfig scriptConfig, List<Variable> importedVariables){
		// set metamodel uris
		try {
			setMetaModelUris();
			setMetaModelPaths();
		} catch (URISyntaxException e1) {
			System.out.println("Error on creating meta model uris.\nMessage: " + e1.getMessage());
			e1.printStackTrace();
		}
		
		
		
		// set module
		setModule();
		
		// set epsilon script, whether script file path is given or actual epsilon code
		this.executeWithScriptFile = scriptConfig.ExecuteWithScriptFile;
		if(this.executeWithScriptFile){
			// create uri to script file
			try {
				this.epsilonScriptFile = new File(scriptConfig.ScriptFilePath);
			}	
			catch(Exception e){
				Log.error("Error while creating script file object from path.\n"+
						"Path: " + scriptConfig.ScriptFilePath + "\n"+
						"Error message: " + e.getMessage());
			}
		}
		else {
			this.actualEpsilonScript = scriptConfig.getScriptContent();
		}
		
		// set models
		setModelsForExecutionContext(scriptConfig.getModelConfigs());
		
		// set parameters 
		for (Variable parameter : importedVariables) {
			module.getContext().getFrameStack().put(parameter);
		}
	}
	
	@Override
	public void execute() throws Exception{
		if(executeWithScriptFile){
			if(epsilonScriptFile != null){
				module.parse(epsilonScriptFile);
			}
			else{
				throw new Exception("Invalid path to script file.");
			}
		}
		else {
			module.parse(actualEpsilonScript);
		}
		
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			return;
		}
		
		preProcess();
		result = execute(module);
		postProcess();
		
		module.getContext().getModelRepository().dispose();
	};
	
	public Object getExecutionResult(){
		return result;
	}
	
	@Override
	public IEolExecutableModule getModule(){
		return module;
	}
	
	protected Object execute(IEolExecutableModule module) throws EolRuntimeException {
		return module.execute();
	}
	
	/**
	 * Creates emf models for each model configuration in list and adds them to the module context
	 * Only works for models saved as file
	 * */
	private void setModelsForExecutionContext(List<TDDIEpsilonScriptModelConfig> modelConfigs){
		for(TDDIEpsilonScriptModelConfig modelConfig : modelConfigs){
			String modelUri = modelConfig.getModelUri();
			String modelName = modelConfig.getModelName();
			String alias = modelConfig.getAlias();
			boolean readOnLoad = modelConfig.ReadOnLoad;
			boolean storeOnDisposal = modelConfig.StoreOnDisposal;
			try {
				module.getContext().getModelRepository().addModel(createEmfModel(modelUri, modelName, alias, readOnLoad, storeOnDisposal));
			} catch (IOException e) {
				String message = "An IOException occured while creating model. Message: " + e.getMessage();
				Log.warn(message);
				e.printStackTrace();
			}
		}
	}
	
	private EmfModel createEmfModel(String modelUri, String modelName, String alias, boolean readOnLoad, boolean storeOnDisposal) throws IOException {
		EmfModel emfModel = new EmfModel();
		
		String metaModelUrisCsv = this.metaModelURIs.stream().map(uri -> uri.toString()).reduce((a, b) -> a + "," + b).get();
		//String metaModelPathsCsv = String.join(",", this.metaModelPaths);
		List<String> metamodelPathsWithoutSlash = new ArrayList<String>();
		
		String metaModelPathsCsv = this.metaModelPaths.stream().reduce((a, b)-> a + "," + b).get();
		File modelFile = new File(modelUri);
		modelFile.createNewFile();
			
		String ddiFileUriAsString = modelFile.toURI().toString();
		
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, modelName);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, metaModelUrisCsv);
		
		//properties.put(EmfModel.PROPERTY_METAMODEL_FILE, metaModelPathsCsv);
		properties.put(EmfModel.PROPERTY_MODEL_URI, ddiFileUriAsString);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		
		if(alias != ""){
			properties.put(EmfModel.PROPERTY_ALIASES, alias);	
		}
		try {
			emfModel.load(properties, (IRelativePathResolver) null);
		} catch (EolModelLoadingException e) {
			System.out.println("Error loading model " + modelName);
			e.printStackTrace();
		}
		return emfModel;
	}
	
	private void setMetaModelUris() throws URISyntaxException{
		List<String> metaModelFileNames = getOdeMetaModelFileNames();
		for(String metaModelFileName : metaModelFileNames){
			this.metaModelURIs.add(EcoreResourceLoader.getEcoreUri(metaModelFileName));
		}
		
		List<String> sacmMetaModelFileNames = getSacmMetaModelFileNames();
		for(String sacmMetaModelFileName : sacmMetaModelFileNames){
			this.metaModelURIs.add(SacmEcoreResourceLoader.getEcoreUri(sacmMetaModelFileName));
		}
	}
	
	private void setMetaModelPaths() throws URISyntaxException{
		for(String metaModelFileName : getOdeMetaModelFileNames()){
			this.metaModelPaths.add(EcoreResourceLoader.getEcorePath(metaModelFileName));
		}
		
		/*List<String> sacmMetaModelFileNames = getSacmMetaModelFileNames();
		for(String sacmMetaModelFileName : sacmMetaModelFileNames){
			this.metaModelPaths.add(SacmEcoreResourceLoader.getEcorePath(sacmMetaModelFileName));
		}*/
	}
	
	private List<String> getOdeMetaModelFileNames(){
		List<String> metaModelFileNames = new ArrayList<String>();
		
		// order of metaModelFileNames list has to be considered
		metaModelFileNames.add("integration.ecore");
		metaModelFileNames.add("architecture.ecore");
		metaModelFileNames.add("dependability.ecore");
		metaModelFileNames.add("failureLogic.ecore");
		metaModelFileNames.add("odeBase.ecore");
		return metaModelFileNames; 
	}
	
	private List<String> getSacmMetaModelFileNames(){
		List<String> sacmMetaModelFileNames = new ArrayList<String>();

		// order of metaModelFileNames list has to be considered
		sacmMetaModelFileNames.add("assurancecase.ecore");
		sacmMetaModelFileNames.add("argumentation.ecore");
		sacmMetaModelFileNames.add("artifact.ecore");
		sacmMetaModelFileNames.add("terminology.ecore");
		sacmMetaModelFileNames.add("base.ecore");
		return sacmMetaModelFileNames;
	}
}

