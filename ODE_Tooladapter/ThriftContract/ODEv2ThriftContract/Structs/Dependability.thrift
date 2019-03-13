
struct TDDIMeasureType{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = []
}

struct TDDIMeasure{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: string IntrinsicSafety = "",
    6: string SafeGuard = "",
    7: string ApplierInformation = "",
    8: bool RiskAcceptability = false,
    9: string FurtherAction = "",
    10: string Source = "",
    14: TDDIAssuranceLevel& AssuranceLevel,
    15: TDDIMeasureType& MeasureType
}

struct TDDIFaultToleranceMeasure{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // From TDDIMeasure
    5: string IntrinsicSafety = "",
    6: string SafeGuard = "",
    7: string ApplierInformation = "",
    8: bool RiskAcceptability = false,
    9: string FurtherAction = "",
    10: string Source = "",
    14: TDDIAssuranceLevel& AssuranceLevel,
    15: TDDIMeasureType& MeasureType
}

union TDDIMeasureUnion{
    1: TDDIMeasure& Measure,
    2: TDDIFaultToleranceMeasure& FaultToleranceMeasure,
    3: TDDISecurityControl& SecurityControl
}

struct TDDIAbstractMeasure{
    1: TDDIMeasureUnion UsedMeasure,
	2: TDDIMeasureUnionType UsedMeasureType
}

struct TDDIMaintenanceProcedure{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: string ActivityDescription = "",
    6: string TechnicalDescription = "",
    7: string ToolSpecification = "",
    8: i32 StaffNumber,
    9: string StaffSkillLevel = "",
    10: string StaffTrainingDescription = ""
}

struct TDDIDependabilityPackage{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: list<TDDIAbstractMeasure> Measures = [],
    6: list<TDDIMeasureType> MeasureTypes = [],
    7: list<TDDIMaintenanceProcedure> MaintenanceProcedures = [],
    8: list<TDDIDomainPackage> DomainPackages = [],
    9: list<TDDITARAPackage> TARAPackages = [],
    10: list<TDDIHARAPackage> HARAPackages = [],
    11: list<TDDIRequirementPackage> RequirementPackages = []
}
