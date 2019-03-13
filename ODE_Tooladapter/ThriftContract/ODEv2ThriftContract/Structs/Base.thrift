
union TDDIBaseElementUnion {

    // FailureLogic
    1: TDDIFailureModel& FailureModel,
    2: TDDIMinimalCutSets& MinimalCutSets,
    3: TDDIMinimalCutSet& MinimalCutSet,
    4: TDDIAbstractFailure& Failure,
    5: TDDIProbDist& ProbDist,
    6: TDDIProbDistParam& ProbDistParam,

    // FMEA
    7: TDDIAbstractFMEAEntry& FMEAEntry,

    // Markov
    8: TDDITransition& Transition,
    9: TDDIState& State,

    // FTA
    10: TDDIAbstractCause& Cause,

    // Dependability
    11: TDDIAbstractMeasure& Measure,
    12: TDDIMeasureType& MeasureType,
    13: TDDIMaintenanceProcedure& MaintenanceProcedure,

    // Domain
    14: TDDIAbstractStandard& Standard,
    15: TDDIAssuranceLevel& AssuranceLevel,

    // HARA
    16: TDDIHazardType& HazardType,
    17: TDDIHazardTypeSystem& HazardTypeSystem,
    18: TDDIAbstractRiskParameter& RiskParameter,
    19: TDDIHazard& Hazard,
    20: TDDIRiskAssessment& RiskAssessment,
    21: TDDIMalfunction& Malfunction,

    // TARA
    22: TDDIAbstractThreatAgent& ThreatAgent,
    23: TDDIAttackerGoal& AttackerGoal,
    24: TDDISecurityRisk& SecurityRisk,
    25: TDDIAbstractAttack& Attack,
    26: TDDISecurityCapability& SecurityCapability,
    27: TDDIAbstractAsset& Asset,
    28: TDDIVulnerability& Vulnerability,

    // Requirement
    29: TDDIAbstractRequirementSource& RequirementSource,
    30: TDDIAbstractDependabilityRequirement& DependabilityRequirement,

    // Design
    31: TDDIConfiguration& Configuration,
    32: TDDIAbstractSystem& System,
    33: TDDIAbstractFunction& Function,
    34: TDDIPerfChars& PerfChars,
    35: TDDISignal& Signal,
    36: TDDIContext& Context,
    37: TDDISystemBoundary& SystemBoundary,
    38: TDDIPort& Port,
    39: TDDILifecycleCondition& LifecycleCondition,

    // Packages
    40: TDDIDesignPackage& DesignPackage,
    41: TDDIFailureLogicPackage& FailureLogicPackage,
    42: TDDIDependabilityPackage& DependabilityPackage,
    43: TDDIRequirementPackage& RequirementPackage,
    44: TDDIDomainPackage& DomainPackage,
    45: TDDIHARAPackage& HARAPackage, 
    46: TDDITARAPackage& TARAPackage,
    47: TDDIDDIPackage& DDIPackage
}

struct TDDIAbstractBaseElement {
	1: TDDIBaseElementUnion UsedBaseElement,
	2: TDDIBaseElementUnionType UsedBaseElementType
}

struct TDDIValue {
    1: string Tag = "",
    2: string Value = ""
}

struct TDDIKeyValueMap {
    1: string Key = "",
    2: list<TDDIValue> Values = []
}