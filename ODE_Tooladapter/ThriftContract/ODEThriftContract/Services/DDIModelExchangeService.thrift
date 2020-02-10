
service DDIModelExchangeService{
    void ExportModelToDDIFile(1: string Path, 2: TDDIAbstractODEPackage ODEPackage) throws (1: TDDIValidationFailedException ValidationFailedException),
    TDDIAbstractODEPackage ImportDDIModel(1: string Path) throws (1: TDDIValidationFailedException ValidationFailedException),
    TDDIValidationResult ValidateDdi(1: string DdiPath, 2: string EvlFilePath)
}