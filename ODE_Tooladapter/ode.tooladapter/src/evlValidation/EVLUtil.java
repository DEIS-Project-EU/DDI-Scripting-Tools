package evlValidation;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

public class EVLUtil {

	protected IEolExecutableModule module;
	
	protected Object result;

	private String ddiFilePath;
	
	protected IEolExecutableModule createModule() {
		return new EvlModule();
	}
	
	public static void main(String[] args) {
		EVLUtil evlUtil = new EVLUtil();
		evlUtil.execute(new File("model/example.ddi").getAbsolutePath());
	}
	
	public Object execute(String ddiFilePath) {
		
		//file path
		this.ddiFilePath = ddiFilePath;
		
		//create EVL module
		module = createModule();
		//parse
		try {
			module.parse(new File(getSource()));
		} catch (Exception e) {
			System.out.println("Error loading source file");
			e.printStackTrace();
		}
		
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			System.exit(-1);
		}
		
		try {
			for (IModel model : getModels()) {
				module.getContext().getModelRepository().addModel(model);
				System.out.println(model.getName());
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
		
		return result;
	}
	
	protected Object execute(IEolExecutableModule module) throws EolRuntimeException {
		return module.execute();
	}
	
	public String getSource() throws Exception {
		return "model/system_subsystem.evl";
	}
	
	public void postProcess() {
		
		EvlModule module = (EvlModule) this.module;
		
		Collection<UnsatisfiedConstraint> unsatisfied = module.getContext().getUnsatisfiedConstraints();
	
		if (unsatisfied.size() > 0) {
			System.err.println(unsatisfied.size() + " constraint(s) have not been satisfied");
			for (UnsatisfiedConstraint uc : unsatisfied) {
				System.err.println(uc.getMessage());
			}
		}
		else {
			System.out.println("All constraints have been satisfied");
		}
	}
	
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		List<String> metamodelUris = new ArrayList<String>();
//		metamodelUris.add("file:/" + new File("metamodel/architecture.ecore").getAbsolutePath());
		metamodelUris.add(new File("model/base.ecore").getAbsolutePath());
		metamodelUris.add(new File("model/failureLogic.ecore").getAbsolutePath());
		metamodelUris.add(new File("model/dependability.ecore").getAbsolutePath());
		metamodelUris.add(new File("model/architecture.ecore").getAbsolutePath());
		metamodelUris.add(new File("model/SACM.ecore").getAbsolutePath());
		metamodelUris.add(new File("model/integration.ecore").getAbsolutePath());

		
//		metamodelUris.add("file:/" + new File("metamodel/dependability.ecore").getAbsolutePath());
//		metamodelUris.add("file:/" + new File("metamodel/failureLogic.ecore").getAbsolutePath());
//		metamodelUris.add("file:/" + new File("metamodel/SACM.ecore").getAbsolutePath());
//		metamodelUris.add("file:/" + new File("metamodel/base.ecore").getAbsolutePath());
		
		String paths = new File("model/integration.ecore").getAbsolutePath(); /*+ ", " +
				new File("model/failureLogic.ecore").getAbsolutePath() + ", " +
				new File("model/dependability.ecore").getAbsolutePath() + ", " +
				new File("model/architecture.ecore").getAbsolutePath() + ", " +
				new File("model/SACM.ecore").getAbsolutePath() + ", " +
				new File("model/integration.ecore").getAbsolutePath();*/
		
		
		models.add(createEmfModel("a", ddiFilePath, paths, true, false));
		return models;
	}
	
	public static EmfModel createEmfModel(String name, String model, String metamodels, boolean readOnLoad, boolean storeOnDisposal) {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, metamodels);
		properties.put(EmfModel.PROPERTY_MODEL_URI, model);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		try {
			emfModel.load(properties);
			//emfModel.load(properties, "");
		} catch (EolModelLoadingException e) {
			System.out.println("Error loading model " + name);
			e.printStackTrace();
		}
		return emfModel;
	}
}
