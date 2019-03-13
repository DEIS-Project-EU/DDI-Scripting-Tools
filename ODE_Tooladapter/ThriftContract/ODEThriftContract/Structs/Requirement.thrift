
struct TDDILegalContract{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement
}

union TDDIRequirementPackageUnion{
    1: TDDIRequirementPackage& RequirementPackage,
    2: TDDIRequirementPackageInterface& RequirementPackageInterface,
    3: TDDIRequirementPackageBinding& RequirementPackageBinding
}

// RequirementPackage union
struct TDDIAbstractRequirementPackage{
    1: TDDIRequirementPackageUnion UsedRequirementPackage,
    2: TDDIRequirementPackageUnionType UsedRequirementPackageType
}

struct TDDIRequirementPackage{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractRequirementArtifactRef> RequirementArtifacts = [] 
}

struct TDDIRequirementPackageInterface{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractRequirementArtifactRef> RequirementArtifacts = [],
    9: TDDIAbstractRequirementPackage& Implements
}

struct TDDIRequirementPackageBinding{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractRequirementArtifactRef> RequirementArtifacts = [],
    9: list<TDDIAbstractRequirementPackageRef> ParticipantPackages = []
}

union TDDIRequirementSourceUnion{
    1: TDDILegalContract LegalContract
}

// RequirementSource union
struct TDDIAbstractRequirementSource{
    1: TDDIRequirementSourceUnion UsedRequirementSource,
    2: TDDIRequirementArtifactUnionType UsedRequirementSourceType
}

/* Attributes of abstract DependabilityRequirement{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMap> KeyValueMaps = [],
    7: TDDIAbstractBaseElement CitedElement,
    8: string DecompositionArgument = "",
    9: list<TDDIAbstractDependabilityRequirement> RefinedRequirements = [],
    10: TDDIAbstractRequirementSource RequirementSource,
    11: list<TDDIAbstractMeasure> Measures = [],
    12: list<TDDIAbstractFailure> FailureModes = [],
    13: TDDIAssuranceLevel AssuranceLevel,
    14: list<TDDIMaintenanceProcedure> MaintenanceProcedures = []
}*/

struct TDDISafetyRequirement{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: string DecompositionArgument = "",
    9: list<TDDIAbstractDependabilityRequirementRef> RefinedRequirements = [],
    10: TDDIAbstractRequirementSource RequirementSource,
    11: list<TDDIAbstractMeasureRef> Measures = [],
    12: list<TDDIAbstractFailureRef> FailureModes = [],
    13: TDDIAssuranceLevel& AssuranceLevel,
    14: list<TDDIMaintenanceProcedureRef> MaintenanceProcedures = [],
    15: list<TDDIHazardRef> Hazards = [],
    16: double FailureReactionTime,
    17: double FailureDetectionTime,
    18: double FailureLatencyTime,
    19: bool IsSafetyGoal
}

union TDDIDependabilityRequirementUnion{
    1: TDDISafetyRequirement SafetyRequirement
}

// DependabilityRequirement union
struct TDDIAbstractDependabilityRequirement{
    1: TDDIDependabilityRequirementUnion UsedDependabilityRequirement,
    2: TDDIDependabilityRequirementUnionType UsedDependabilityRequirementType
}

union TDDIRequirementArtifactUnion{
    1: TDDIAbstractRequirementPackage RequirementPackage,
    2: TDDIAbstractRequirementSource RequirementSource,
    3: TDDIAbstractDependabilityRequirement DependabilityRequirement
}

// RequirementArtifact union
struct TDDIAbstractRequirementArtifact{
    1: TDDIRequirementArtifactUnion UsedRequirementArtifact,
    2: TDDIRequirementArtifactUnionType UsedRequirementArtifactType
}