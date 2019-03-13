
struct TDDILegalContract{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = []
}

union TDDIRequirementSourceUnion{
    1: TDDILegalContract& LegalContract
}

struct TDDIAbstractRequirementSource{
    1: TDDIRequirementSourceUnion UsedRequirementSource,
    2: TDDIRequirementSourceUnionType UsedRequirementSourceType
}

struct TDDISafetyRequirement{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // From Abstract DependabilityRequirement
    5: string DecompositionArgument = "",
    6: list<TDDIAbstractDependabilityRequirementRef> RefinedRequirements = [],
    7: TDDIAbstractRequirementSource& RequirementSource,
    8: list<TDDIAbstractMeasureRef> Measures = [],
    9: list<TDDIAbstractFailureRef> Failures = [],
    10: TDDIAssuranceLevel& AssuranceLevel,
    11: list<TDDIMaintenanceProcedureRef> MaintenanceProcedures = [],
    // Own
    12: list<TDDIHazardRef> Hazards = [],
    13: double FailureReactionTime,
    14: double FailureDetectionTime,
    15: double FailureLatencyTime,
    16: bool IsSafetyGoal
}

struct TDDISecurityRequirement{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // From Abstract DependabilityRequirement
    5: string DecompositionArgument = "",
    6: list<TDDIAbstractDependabilityRequirementRef> RefinedRequirements = [],
    7: TDDIAbstractRequirementSource& RequirementSource,
    8: list<TDDIAbstractMeasureRef> Measures = [],
    9: list<TDDIAbstractFailureRef> Failures = [],
    10: TDDIAssuranceLevel& AssuranceLevel,
    11: list<TDDIMaintenanceProcedureRef> MaintenanceProcedures = [],
    // Own
    12: list<TDDISecurityCapabilityRef> SecurityCapabilities = []
}

union TDDIDependabilityRequirementUnion{
    1: TDDISafetyRequirement& SafetyRequirement,
    2: TDDISecurityRequirement& SecurityRequirement
}

struct TDDIAbstractDependabilityRequirement{
    1: TDDIDependabilityRequirementUnion UsedDependabilityRequirement,
    2: TDDIDependabilityRequirementUnionType UsedDependabilityRequirementType
}

struct TDDIRequirementPackage{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: list<TDDIAbstractRequirementSource> RequirementSources = [],
    6: list<TDDIAbstractDependabilityRequirement> DependabilityRequirements = []
}