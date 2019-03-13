package serviceImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.FileSystems;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.thrift.TException;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.execute.context.FrameStack;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.SingleFrame;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.dom.Constraint;
import org.eclipse.epsilon.evl.dom.Constraints;
import org.eclipse.epsilon.evl.trace.ConstraintTrace;
import org.eclipse.epsilon.evl.trace.ConstraintTraceItem;

import epsilonScriptExecution.EolExecutor;
import epsilonScriptExecution.EplExecutor;
import epsilonScriptExecution.EvlExecutor;
import epsilonScriptExecution.IEpsilonScriptExecutor;
import evlValidation.DdiValidation;
import integration.DDIPackage;
import serverStartup.ServerMain;
import thriftContract.DDIService;
import thriftContract.TDDIAbstractEpsilonScriptExecutionException;
import thriftContract.TDDIDDIPackage;
import thriftContract.TDDIEpsilonLanguage;
import thriftContract.TDDIEpsilonParameter;
import thriftContract.TDDIEpsilonScriptExecutionConfig;
import thriftContract.TDDIEpsilonScriptExecutionExceptionUnionType;
import thriftContract.TDDIEpsilonScriptModelConfig;
import thriftContract.TDDIServiceConfig;
import thriftContract.TDDIValidationFailedException;
import thriftContract.TDDIValidationResult;
import transformation.ode2thrift.BaseThriftTranslater;
import transformation.ode2thrift.ODE2ThriftTranslater;
import transformation.sacmThrift2ode.SacmBaseEMFTranslater;
import transformation.thrift2ode.BaseEMFTranslater;
import transformation.thrift2ode.Thrift2ODETranslater;
import util.EMFSerialization;


public class DDIServiceHandler implements DDIService.Iface {

	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(DDIServiceHandler.class);
	
	@Override
	public void ExportModelToDDIFile(TDDIServiceConfig ServiceConfiguration, TDDIDDIPackage DDIPackage) throws TDDIAbstractEpsilonScriptExecutionException, TException {
		if(ServiceConfiguration.getDDIFilePath() != null)
		{
			String ddiFilePath = ServiceConfiguration.getDDIFilePath();
			try {
				Log.info("========= Service Invocation: ExportModelToDDIFile("+ddiFilePath+")");
				Log.info("Translation from Thrift -> EMF starting");
				BaseEMFTranslater.thrift2EmfMap.clear();
				SacmBaseEMFTranslater.thrift2EmfMap.clear();
				DDIPackage emfDDIPackage;
				try{
					emfDDIPackage = Thrift2ODETranslater.transformDDIPackage(DDIPackage);
				}
				catch (Exception e){
					String message = "Exception of type " + e.getClass().getName() + " has occured. Message: " + e.getMessage();
					Log.warn(message);
					throw new TException(message);
				}
				Log.info("Translation from Thrift -> EMF finished");
				//DDI Validation based on EVL
				Log.info("Export EMF Model to File (Path must be an absolute system path with access rights and the filename must have .ddi as extension");
				EMFSerialization.saveEMFModelToFile(ddiFilePath, emfDDIPackage); 
				Log.info("Starting DDI Validation based on Eclipse Validation Language");
				
				try {
					TDDIValidationResult lastValidationResult = executeDDIValidation(ddiFilePath, getStandardEvlFilePath());
					if(lastValidationResult.ValidationViolationOccurred){
						TDDIValidationFailedException validationException = new TDDIValidationFailedException();
						validationException.setValidationResult(lastValidationResult);
						
						TDDIAbstractEpsilonScriptExecutionException exception = new TDDIAbstractEpsilonScriptExecutionException();
						exception.UsedExceptionType = TDDIEpsilonScriptExecutionExceptionUnionType.ESEEUTValidationFailedException;
						exception.UsedException.setValidationFailedException(validationException);
						throw exception;
					}
				} catch (Exception e) {
					TException ex = new TException(e.getMessage());
					ex.setStackTrace(e.getStackTrace());
					throw ex;
				}
			}
			finally {
				
			}
		}
	}
	
	@Override
	public TDDIDDIPackage ImportDDIModel(TDDIServiceConfig ServiceConfiguration) throws TDDIAbstractEpsilonScriptExecutionException, TException {
		
		if(ServiceConfiguration.getDDIFilePath() != null){
			
			String ddiFilePath = ServiceConfiguration.getDDIFilePath();
			boolean ddiFileIsDownloaded = false;
			if(isValidUrl(ddiFilePath)){
				try {
					ddiFilePath = downloadTemporaryDDIFileFromWeb(new URL(ddiFilePath));
					ddiFileIsDownloaded = true;
				} catch (Exception e) {
					
					throw new TException("A Problem occurred while trying to download ddi from " + ddiFilePath);
				}
			}
			
			Log.info("========= Service Invocation: ImportDDIModel(Path='"+ddiFilePath+"')");
			Log.info("Starting DDI Validation based on Eclipse Validation Language");
			
			try {
				TDDIValidationResult lastValidationResult = executeDDIValidation(ddiFilePath, getStandardEvlFilePath());
				if(lastValidationResult.ValidationViolationOccurred){
					
					TDDIValidationFailedException validationException = new TDDIValidationFailedException();
					validationException.setValidationResult(lastValidationResult);
					
					TDDIAbstractEpsilonScriptExecutionException exception = new TDDIAbstractEpsilonScriptExecutionException();
					exception.UsedExceptionType = TDDIEpsilonScriptExecutionExceptionUnionType.ESEEUTValidationFailedException;
					exception.UsedException.setValidationFailedException(validationException);
					throw exception;
				}
			} catch (Exception e) {
				TException ex = new TException(e.getMessage());
				ex.setStackTrace(e.getStackTrace());
				throw ex;
			}
			
			//EVLUtil validationEngine = new EVLUtil();
			//Object result = validationEngine.execute(Path);
			Log.info("Load DDI model from file to EMF");
			BaseThriftTranslater.emf2ThriftMap.clear();
			BaseThriftTranslater.importId = 1;
			DDIPackage emfDDIPackage = EMFSerialization.loadEMFModelFromFile(ddiFilePath);
			Log.info("Loading DDI model finished");		
			Log.info("Translation from EMF -> Thrift starting");
			TDDIDDIPackage tDDIPackage = ODE2ThriftTranslater.transformDDIPackage(emfDDIPackage);
			Log.info("Translation from EMF -> Thrift finished");
			Log.info("Thrift model: "+tDDIPackage.toString());
				
			if(ddiFileIsDownloaded){
				File tempDDIFile = new File(ddiFilePath);
				Log.info("Deleting temporary downloaded ddi file.");
				if(tempDDIFile.delete()) 
		        { 
		            Log.info("Temporary ddi file \"" + ddiFilePath + "\" deleted successfully.");
		        } 
		        else
		        { 
		            Log.warn("Temporary ddi file \"" + ddiFilePath + "\" could not be deleted."); 
		        } 
			}
			
			
			return tDDIPackage;
		}
		else{
			throw new TException("DDIFile path is not given");
		}
	}

	@Override
	public TDDIValidationResult ValidateDDI(String DdiPath, String EvlFilePath) throws TException {
		try {
			return executeDDIValidation(DdiPath, EvlFilePath);		
		} catch (InvalidPathException e) {
			TException ex = new TException("IvalidPathException occurred while validation. Exception message: " + e.getMessage());
			ex.setStackTrace(e.getStackTrace());
			throw ex;
		} catch (Exception e) {
			TException ex = new TException("Error occured while executing ddi validation. Exception message: " + e.getMessage());
			ex.setStackTrace(e.getStackTrace());
			e.printStackTrace();
			throw ex;
		}
	}

	@Override
	public TDDIDDIPackage ExecuteEpsilonSriptsOnDDIFile(TDDIServiceConfig ServiceConfiguration, boolean BackupDDIFile, boolean ReturnDDIPackage) throws TDDIAbstractEpsilonScriptExecutionException, TException {

		Map<String, Variable> exportedVariablesByNameDefinedForContext = new HashMap<String, Variable>();
		
		for(TDDIEpsilonScriptExecutionConfig execConfig : ServiceConfiguration.getEpsilonScriptExecutionConfig()){

			List<Variable> variablesToImport = getParametersToImport(execConfig.getImportParameters(), exportedVariablesByNameDefinedForContext);
			
			IEpsilonScriptExecutor scriptExecutor = null;
			
			switch(execConfig.EpsilonLanguage){
			case ELECL:
				break;
			case ELEGL:
				break;
			case ELEML:
				break;
			case ELEOL:
				scriptExecutor = new EolExecutor(execConfig, variablesToImport);
				break;
			case ELEPL:
				scriptExecutor = new EplExecutor(execConfig, variablesToImport);
				break;
			case ELETL:
				break;
			case ELEVL:
				scriptExecutor = new EvlExecutor(execConfig, variablesToImport);
				break;
			case ELEWL:
				break;
			default:
				break;
			}
			
			if(scriptExecutor != null){
				try {
					scriptExecutor.execute();	
					
					// add return value to exportedVariablesByNameDefinedForContext if name for result variable is given in execConfig
					Object epsilonReturnValue = scriptExecutor.getExecutionResult();
					String variableNameOfReturnValue = execConfig.getVariableNameOfReturnValue();
					if(!execConfig.getVariableNameOfReturnValue().isEmpty()){
						if(!exportedVariablesByNameDefinedForContext.containsKey(execConfig.getVariableNameOfReturnValue())){
							exportedVariablesByNameDefinedForContext.put(variableNameOfReturnValue, Variable.createReadOnlyVariable(variableNameOfReturnValue, epsilonReturnValue));
						}
					}
					
					IEolExecutableModule module = scriptExecutor.getModule();
					updateExportedVariables(exportedVariablesByNameDefinedForContext, module, execConfig.getExportParameters());
					
				} catch (Exception e) {
					Log.warn(e.getMessage());
					break;
				}	
			}
		}
		
		return new TDDIDDIPackage();
	}

	private void updateExportedVariables(Map<String, Variable> exportedVariablesByNameDefinedForContext, IEolExecutableModule module, List<TDDIEpsilonParameter> exportParameters) {
		IEolContext context = module.getContext();
		FrameStack frameStack = context.getFrameStack();
		List<SingleFrame> listOfSingleFrames = frameStack.getFrames();
		
		for(SingleFrame singleFrame : listOfSingleFrames){
			Map<String, Variable> variableMap = singleFrame.getAll();
			
			for(TDDIEpsilonParameter exportParam : exportParameters){
				
				Variable newExportedVariable = null;
				
				if(variableMap.containsKey(exportParam.getName())){
					newExportedVariable = variableMap.get(exportParam.getName()).clone();
					
					if(!exportParam.getAlias().isEmpty()){
						newExportedVariable.setName(exportParam.getAlias());
					}

					String varNameForContext = newExportedVariable.getName();
					
					for(Entry<String, Variable> entry : exportedVariablesByNameDefinedForContext.entrySet()){
						if(entry.getKey().equals(varNameForContext))
						{
							Log.warn("Exported variable with context name '" + varNameForContext + "' already exists. Variable will be replaced with new value:\n" + 
									newExportedVariable.toString());	
							break;
						}
					}
					
					exportedVariablesByNameDefinedForContext.put(varNameForContext, newExportedVariable);
				}
			}
		}
		
	}

	private List<Variable> getParametersToImport(List<TDDIEpsilonParameter> importParameters, Map<String, Variable> exportedVariables) {
		List<Variable> variablesToImport = new ArrayList<Variable>();
		
		for(TDDIEpsilonParameter importParam : importParameters){
			Variable variableToImport = null;
			String paramName = importParam.getName();
			
			// search for exported variable with name defined in importParam
			for(String exportedVariableNames : exportedVariables.keySet()){
				if(exportedVariableNames.equals(paramName)){
					
					variableToImport = exportedVariables.get(paramName).clone();
					
					// set alias if defined 
					if(!importParam.getAlias().isEmpty()){
						variableToImport.setName(importParam.getAlias());
					}
					
					variablesToImport.add(variableToImport);
					break;
				}
			}
			if(variableToImport == null){
				Log.warn("Could not find exported variable with name " + paramName);
			}
		}
		
		return variablesToImport;
	}

	@Override
	public TDDIDDIPackage ExecuteEpsilonSripts(TDDIDDIPackage DDIPackage, TDDIServiceConfig ServiceConfiguration, boolean ExportDDIFile, boolean ReturnDDIPackage) throws TDDIAbstractEpsilonScriptExecutionException, TException {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean isValidUrl(String url){
		try{
			new URL(url).toURI();
			return true;
		}
		catch (Exception e){
			return false;
		}
	}
	
	private String downloadTemporaryDDIFileFromWeb(URL url) throws IOException{
		InputStream is = null;
        FileOutputStream fos = null;

        String tempDir = System.getProperty("java.io.tmpdir");
        String outputPath = tempDir + "/" + "TempDDI.ddi";

        try {
        	//connect
            URLConnection urlConn = url.openConnection();

            //get inputstream from connection
            is = urlConn.getInputStream();               
            fos = new FileOutputStream(outputPath);   

            // 4KB buffer
            byte[] buffer = new byte[4096];
            int length;

            // read from source and write into local file
            while ((length = is.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            return outputPath;
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } finally {
                if (fos != null) {
                    fos.close();
                }
            }
        }
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
	
	private TDDIValidationResult executeDDIValidation(String ddiFilePath, String evlFile) throws Exception{
		
		TDDIEpsilonScriptModelConfig modelConfig = new TDDIEpsilonScriptModelConfig();
		modelConfig.setModelUri(ddiFilePath);
		modelConfig.ReadOnLoad = true;
		
		TDDIEpsilonScriptExecutionConfig scriptExecConfig = new TDDIEpsilonScriptExecutionConfig();
		scriptExecConfig.setEpsilonLanguage(TDDIEpsilonLanguage.ELEVL);
		scriptExecConfig.setExecuteWithScriptFile(true);
		scriptExecConfig.setScriptFilePath(evlFile);
		scriptExecConfig.getModelConfigs().add(modelConfig);
		
		IEpsilonScriptExecutor evlExecutor = new EvlExecutor(scriptExecConfig, new ArrayList<Variable>());
		evlExecutor.execute();
		return (TDDIValidationResult) evlExecutor.getExecutionResult();
	}	
}
