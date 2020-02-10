
union TDDIDependabilityPackageUnion{
    1: TDDIDependabilityPackage& DependabilityPackage,
    2: TDDIDependabilityPackageInterface& DependabilityPackageInterface,
    3: TDDIDependabilityPackageBinding& DependabilityPackageBinding
}

// DependabilityPackage union
struct TDDIAbstractDependabilityPackage{
    1: TDDIDependabilityPackageUnion UsedDependabilityPackage,
	2: TDDIDependabilityPackageUnionType UsedDependabilityPackageType
}

struct TDDIDependabilityPackage{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractDependabilityArtifactRef> DependabilityArtifacts = []
}

struct TDDIDependabilityPackageInterface{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractDependabilityArtifactRef> DependabilityArtifacts = [],
    9: TDDIAbstractDependabilityPackage Implements
}

struct TDDIDependabilityPackageBinding{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractDependabilityArtifactRef> DependabilityArtifacts = [],
    9: list<TDDIAbstractDependabilityPackageRef> ParticipantPackages  = []
}

struct TDDIMeasureType{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement
}

struct TDDIMeasure{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: string IntrinsicSafety = "",
    9: string SafeGuard = "",
    10: string ApplierInformation = "",
    11: bool RiskAcceptability = false,
    12: string FurtherAction = "",
    13: string Source = "",
    14: TDDIAssuranceLevel& AssuranceLevel,
    15: TDDIMeasureType MeasureType
}

struct TDDIFaultToleranceMeasure{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: string IntrinsicSafety = "",
    9: string SafeGuard = "",
    10: string ApplierInformation = "",
    11: bool RiskAcceptability = false,
    12: string FurtherAction = "",
    13: string Source = "",
    14: TDDIAssuranceLevel& AssuranceLevel,
    15: TDDIMeasureType MeasureType
}

struct TDDIMaintenanceProcedure{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: string ActivityDescription = "",
    9: string TechnicalDescription = "",
    10: string ToolSpecification = "",
    11: i32 StaffNumber,
    12: string StaffSkillLevel = "",
    13: string StafftrainingDescription = ""
}

union TDDIMeasureUnion{
    1: TDDIMeasure Measure,
    2: TDDIFaultToleranceMeasure FaultToleranceMeasure
}

// Measure union
struct TDDIAbstractMeasure{
    1: TDDIMeasureUnion UsedMeasure,
	2: TDDIMeasureUnionType UsedMeasureType
}

union TDDIDependabilityArtifactUnion{
    1: TDDIAbstractDependabilityPackage DependabilityPackage,
    2: TDDIAbstractMeasure Measure,
    3: TDDIMeasureType MeasureType,
    4: TDDIMaintenanceProcedure MaintenanceProcedure,
    5: TDDIAbstractDomainElement& DomainElement,
    6: TDDIAbstractRequirementArtifact& RequirementArtifact,
    7: TDDIAbstractHARAArtifact& HARAArtifact
}

// DependabilityArtifact union
struct TDDIAbstractDependabilityArtifact{
    1: TDDIDependabilityArtifactUnion UsedDependabilityArtifact,
	2: TDDIDependabilityArtifactUnionType UsedDependabilityArtifactType
}