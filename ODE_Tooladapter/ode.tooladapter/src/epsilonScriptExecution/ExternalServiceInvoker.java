package epsilonScriptExecution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.ModelGroup;

import integration.DDIPackage;
import integration.impl.DDIPackageImpl;
import thriftContract.ExternalService;
import thriftContract.TDDIDDIPackage;
import thriftContract.TDDIExternalServiceParameter;
import transformation.ode2thrift.BaseThriftTranslater;
import transformation.ode2thrift.ODE2ThriftTranslater;
import transformation.thrift2ode.Thrift2ODETranslater;
import util.EMFSerialization;
import util.MissingThriftUnionTypeException;

public class ExternalServiceInvoker {
	
	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(ExternalServiceInvoker.class);

	private int serverTimoutSeconds = 5;
    private int serverPort = 9099;
    private String host = "127.0.0.1";
    
    private TTransport transport;
    private ExternalService.Client externalServiceClient;

    /**
     * Empty Constructor: following default values are set  
     * - serverTimeOutSeconds = 5
     * - serverPort = 9099
     * - host = "127.0.0.1"
     * */
    public ExternalServiceInvoker(){
    	
    }
    
    public ExternalServiceInvoker(int currentServerPort){
    	this.serverPort = currentServerPort;
    }
    
    public ExternalServiceInvoker(int currentServerPort, String host){
    	this(currentServerPort);
    	this.host = host;
    }
    
    public ExternalServiceInvoker(int currentServerPort, String host, int serverTimeoutSeconds){
    	this(currentServerPort, host);
    	this.serverTimoutSeconds = serverTimeoutSeconds;
    }
    
    public void closeConnection()
    {
        if (transport != null) {
            transport.close();
        }
    }
        
	public DDIPackage InvokeExternalService(IModel model, String serviceName, HashMap<String, String> valuesByParameterName){
		String nullIsReturnedMessage = "\nNull is returned to Epsilon script.";
		
		TDDIDDIPackage tDdiPackageFromEpsilon = getThriftDDIPackageFromModel(model);
		
		if(tDdiPackageFromEpsilon == null){
			Log.warn("Could not get TDDIDDIPackage from given model." + nullIsReturnedMessage);
			return null;
		}
		
		// DDIPackage from epsilon context as TDDIDDIPackage
		try {
			 //tDdiPackageFromEpsilon = getThriftDDIPackageFromModelGroup(epsilonModelGroup);
		} catch (Exception e1) {
			Log.warn(e1 + nullIsReturnedMessage);
			return null;
		}
		
		// get parameter as TDDIExternalServiceParameter
		List<TDDIExternalServiceParameter> tParameters = new ArrayList<TDDIExternalServiceParameter>();
		for(String parameterName : valuesByParameterName.keySet()){
			TDDIExternalServiceParameter tParam = new TDDIExternalServiceParameter();
			tParam.setName(parameterName);
			tParam.setNameIsSet(true);
			tParam.setValue(valuesByParameterName.get(parameterName));
			tParam.setValueIsSet(true);
			tParameters.add(tParam);
		}
		
		// updated thrift ddi package
		TDDIDDIPackage updatedThriftDdiPackage = null;

		// invoke external service, if thrift client could be initialized successfully.
		if(InitializeThriftClient()){
			try {
				updatedThriftDdiPackage = externalServiceClient.InvokeExternalService(tDdiPackageFromEpsilon, serviceName, tParameters);
			} catch (TException e) {
				Log.error(e.getMessage() + nullIsReturnedMessage, e);
				return null;
			}
		}
				
		DDIPackage updatedEmfDdiPackage = null;
		
		// transform thrift ddi package back into emf ddi package, if thrift ddi package is not null.
		if(updatedThriftDdiPackage != null){
			try {
				updatedEmfDdiPackage = Thrift2ODETranslater.transformDDIPackage(updatedThriftDdiPackage);
			} catch (MissingThriftUnionTypeException e) {
				Log.warn(e.getMessage() + nullIsReturnedMessage);
			}	
		}
		
		// close connection between tooladapter and external service provider
		closeConnection();
		
		return updatedEmfDdiPackage;
	}
	
	public void SerializeDDIObject(DDIPackage ddiPackage, String path){
		EMFSerialization.saveEMFModelToFile(path, ddiPackage);
	}
	
	private boolean InitializeThriftClient()
    {
        closeConnection();
        int elapsedTries = 0;
        while (elapsedTries <= serverTimoutSeconds) {
            try {
                transport = new TSocket(host, serverPort);
                transport.open();
                TProtocol protocol = new TBinaryProtocol(transport);
                externalServiceClient = new ExternalService.Client(protocol);
                Log.info("Thrift client initialized.");
                return true;
            } catch (TTransportException e) {
                if (elapsedTries < serverTimoutSeconds) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(1000);
                    } catch (InterruptedException e1) {
                        Log.error("", e1);
                    }
                    elapsedTries++;
                }
                else {
                    Log.error("", e);
                }
            }
        }
        return false;
    }
	
	private TDDIDDIPackage getThriftDDIPackageFromModel(IModel model){
		TDDIDDIPackage thriftDDIPackage = null;
		if(model instanceof EmfModel){
			EmfModel modelAsEmfModel = (EmfModel) model;
			String modelUri = modelAsEmfModel.getModelFile();
			DDIPackage ddiPackage = EMFSerialization.loadEMFModelFromFile(modelUri);
			BaseThriftTranslater.preserveIds = true;
			thriftDDIPackage = ODE2ThriftTranslater.transformDDIPackage(ddiPackage);
			BaseThriftTranslater.preserveIds = false;
		}
		return thriftDDIPackage;
	}
	
	private TDDIDDIPackage getThriftDDIPackageFromModelGroup(ModelGroup epsilonModelGroup) throws Exception {
		TDDIDDIPackage thriftDDIPackage = null;
		
		List<IModel> models = epsilonModelGroup.getModels();
		
		if(models.size() != 1)
		{
			String message = "Parameter ModelGroupOnly can only contain one model.";
			Log.warn(message);
			throw new Exception(message);
		}
		
		Optional<IModel> optionalFirstModel = models.stream().findFirst();
		IModel actualModel = null;
		if(optionalFirstModel.isPresent()){
			actualModel = optionalFirstModel.get();
		}
		
		if(actualModel != null){
			if(actualModel instanceof EmfModel){
				EmfModel modelAsEmfModel = (EmfModel) actualModel;
				String modelUri = modelAsEmfModel.getModelFile();
				DDIPackage ddiPackage = EMFSerialization.loadEMFModelFromFile(modelUri);
				BaseThriftTranslater.preserveIds = true;
				thriftDDIPackage = ODE2ThriftTranslater.transformDDIPackage(ddiPackage);
				BaseThriftTranslater.preserveIds = false;
			}
		}
		return thriftDDIPackage;
	}
}
