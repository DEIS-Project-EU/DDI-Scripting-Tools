
service DDIService{
    void ExportModelToDDIFile(1: TDDIServiceConfig ServiceConfiguration,
							  2: TDDIDDIPackage DDIPackage) throws (1: TDDIAbstractEpsilonScriptExecutionException EpsilonScriptExecutionException),
							
    TDDIDDIPackage ImportDDIModel(1: TDDIServiceConfig ServiceConfiguration) throws (1: TDDIAbstractEpsilonScriptExecutionException EpsilonScriptExecutionException),
	
	TDDIValidationResult ValidateDDI(1: string DdiPath, 2: string EvlFilePath),
    
	TDDIDDIPackage ExecuteEpsilonSriptsOnDDIFile(1: TDDIServiceConfig ServiceConfiguration, 
								    2: bool BackupDDIFile,
								    3: bool ReturnDDIPackage) throws (1: TDDIAbstractEpsilonScriptExecutionException EpsilonScriptExecutionException)
	
	TDDIDDIPackage ExecuteEpsilonSripts(1: TDDIDDIPackage DDIPackage,
									2: TDDIServiceConfig ServiceConfiguration, 
								    3: bool ExportDDIFile,
								    4: bool ReturnDDIPackage) throws (1: TDDIAbstractEpsilonScriptExecutionException EpsilonScriptExecutionException)
}

service ExternalService{
	TDDIDDIPackage InvokeExternalService(1: TDDIDDIPackage DDIPackage,
										 2: string ServiceId,
										 3: list<TDDIExternalServiceParameter> ServiceParameter = [])
}


