
struct TDDIHazardType{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
}

struct TDDIHazardTypeSystem{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
	// Own
    5: list<TDDIHazardTypeRef> HazardTypes = []
}

struct TDDIRiskParameter{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
	// Own
    5: string Argument = ""
}

struct TDDISituation{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // From TDDIRiskParamter
    5: string Argument = "",
    // Own
    6: string Likelihood = ""
}

struct TDDIAccident{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // From TDDIRiskParamter
    5: string Argument = "",
    // Own
    6: string Severity = ""
}

struct TDDIOperatorMeasure{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // From TDDIRiskParamter
    5: string Argument = "",
    // Own
    6: string Controlability = ""
}

union TDDIRiskParameterUnion{
    1: TDDIRiskParameter& RiskParameter,
    2: TDDISituation& Situation,
    3: TDDIAccident& Accident,
    4: TDDIOperatorMeasure& OperatorMeasure
}

struct TDDIAbstractRiskParameter{
    1: TDDIRiskParameterUnion UsedRiskParameter,
	2: TDDIRiskParameterUnionType UsedRiskParameterType
}

struct TDDIHazard{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: string Condition = "",
    6: TDDIHazardType& HazardType,
    7: list<TDDIAbstractMeasureRef> Measures = [],
    8: list<TDDIAbstractFailureRef> Failures = []
}

struct TDDIRiskAssessment{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: string RelatedStandard = "",
    9: list<TDDIAbstractRiskParameterRef> RiskParamaters = [],
    10: TDDIHazard& Hazard
}

struct TDDIMalfunction{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: list<TDDIHazardRef> Hazards = []
}

struct TDDIHARAPackage{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: list<TDDIHazard> Hazards = [],
    6: list<TDDIHazardType> HazardTypes = [],
    7: list<TDDIHazardTypeSystem> HazardTypeSystems = [],
    8: list<TDDIMalfunction> Malfunctions = [],
    9: list<TDDIRiskAssessment> RiskAssessments = [],
    10: list<TDDIAbstractRiskParameter> RiskParameters = []
}

