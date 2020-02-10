
service DDIService{
    void ExportModelToDDIFile(1: string DDIFilePath,
							  2: TDDIDDIPackage DDIPackage) throws (1: TDDIAbstractEpsilonScriptExecutionException EpsilonScriptExecutionException),
							
    TDDIDDIPackage ImportDDIModel(1: string DDIFilePath) throws (1: TDDIAbstractEpsilonScriptExecutionException EpsilonScriptExecutionException),
	
	TDDIValidationResult ValidateDDI(1: string DDIFilePath, 2: string EvlFilePath),
    
	TDDIDDIPackage ExecuteEpsilonSriptsOnDDIFile(1: list<TDDIEpsilonScriptExecutionConfig> EpsilonScriptExecutionConfigs, 
								    2: bool BackupDDIFile,
								    3: bool ReturnDDIPackage) throws (1: TDDIAbstractEpsilonScriptExecutionException EpsilonScriptExecutionException)
}

service ExternalService{
	TDDIDDIPackage InvokeExternalService(1: TDDIDDIPackage DDIPackage,
										 2: string ServiceId,
										 3: list<TDDIExternalServiceParameter> ServiceParameter = [])
}


