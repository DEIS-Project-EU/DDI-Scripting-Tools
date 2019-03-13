struct TDDIDDIPackage{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: list<TDDIAbstractODEProductPackage> ODEProductPackages = [],
    6: list<TDDIAbstractAssuranceCasePackage> AssuranceCasePackages = []
}

union TDDIODEProductPackageUnion{
	1: TDDIDesignPackage& DesignPackage, 
	2: TDDIFailureLogicPackage& FailureLogicPackage,
	3: TDDIRequirementPackage& RequirementPackage,
	4: TDDIHARAPackage& HARAPackage,
    5: TDDIDependabilityPackage& DependabilityPackage,
    6: TDDITARAPackage& TARAPackage,
    7: TDDIDomainPackage& DomainPackage
}

struct TDDIAbstractODEProductPackage{
	1: TDDIODEProductPackageUnion UsedODEProductPackage,
	2: TDDIODEProductPackageUnionType UsedODEProductPackageType
}