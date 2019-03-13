
struct TDDIHazardType{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement
}

struct TDDIHazardTypeSystem{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIHazardType> HazardTypes = []
}

struct TDDIRiskParameter{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: string Argument = ""
}

struct TDDISituation{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: string Argument = "",
    9: string Likelihood = ""
}

struct TDDIAccident{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: string Argument = "",
    9: string Severity = ""
}

struct TDDIOperationMeasure{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: string Argument = "",
    9: string Controlability = ""
}

struct TDDIHazard{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: string Condition = "",
    9: TDDIHazardType HazardType,
    10: list<TDDIAbstractMeasureRef> Measures = [],
    11: TDDIOutputFailure& OutputFailure
}

struct TDDIRiskAssessment{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: string RelatedStandard = "",
    9: list<TDDIAbstractRiskParameterRef> RiskParamaters = [],
    10: TDDIHazard Hazard
}

struct TDDIMalFunction{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIHazard> Hazards = []
}


union TDDIRiskParameterUnion{
    1: TDDIRiskParameter RiskParameter,
    2: TDDISituation Situation,
    3: TDDIAccident Accident,
    4: TDDIOperationMeasure OperationMeasure
}

// RiskParameter union
struct TDDIAbstractRiskParameter{
    1: TDDIRiskParameterUnion UsedRiskParameter,
    2: TDDIRiskParameterUnionType UsedRiskParameterType
}

union TDDIHARAArtifactUnion{
    1: TDDIAbstractHARAPackage& HARAPackage,
    2: TDDIHazardTypeSystem HazardTypeSystem,
    3: TDDIAbstractRiskParameter RiskParameter,
    4: TDDIRiskAssessment RiskAssessment,
    5: TDDIHazardType HazardType,
    6: TDDIMalFunction MalFunction,
    7: TDDIHazard Hazard
}

// HaraArtifact union
struct TDDIAbstractHARAArtifact{
    1: TDDIHARAArtifactUnion UsedHARAArtifact,
    2: TDDIHARAArtifactUnionType UsedHARAArtifactType
}

struct TDDIHARAPackage{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractHARAArtifact> HARAArtifacts = []
}

struct TDDIHARAPackageInterface{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractHARAArtifact> HARAArtifacts = [],
    9: TDDIAbstractHARAPackage& Implements
}

struct TDDIHARAPackageBinding{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractHARAArtifact> HARAArtifacts = [],
    9: list<TDDIAbstractHARAPackageRef> ParticipantPackages = []
}

union TDDIHARAPackageUnion{
    1: TDDIHARAPackage HARAPackage,
    2: TDDIHARAPackageInterface HARAPackageInterface,
    3: TDDIHARAPackageBinding HARAPackageBinding
}

// HARAPackage union
struct TDDIAbstractHARAPackage{
    1: TDDIHARAPackageUnion UsedHARAPackage,
    2: TDDIHARAPackageUnionType UsedHARAPackageType
}