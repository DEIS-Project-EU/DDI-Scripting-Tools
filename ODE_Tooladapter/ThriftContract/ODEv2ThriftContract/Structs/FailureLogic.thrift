
struct TDDIProbDistParam{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: string Value = ""
}

struct TDDIProbDist{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: string Type = "",
    6: list<TDDIProbDistParam> Parameters = []
}

struct TDDIFailure{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: TDDIFailureOriginType OriginType,
    6: string FailureClass,
    7: double FailureRate,
    8: bool IsCCF,
    9: list<TDDIAbstractFailureRef> CCFFailures = [],
    10: TDDIProbDist FailureProbDistribution
}

struct TDDISecurityViolation{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // From TDDIFailure
    5: TDDIFailureOriginType OriginType,
    6: string FailureClass,
    7: double FailureRate,
    8: bool IsCCF,
    9: list<TDDIAbstractFailureRef> CCFFailures = [],
    10: TDDIProbDist FailureProbDistribution
}

union TDDIFailureUnion{
    1: TDDIFailure& Failure,
    2: TDDISecurityViolation& SecurityViolation
}

struct TDDIAbstractFailure{
    1: TDDIFailureUnion UsedFailure,
    2: TDDIFailureUnionType UsedFailureType
}

struct TDDIMinimalCutSet{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: list<TDDIAbstractFailureRef> Failures = []
}

struct TDDIMinimalCutSets{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: list<TDDIMinimalCutSet> Cutsets = [],
    6: list<TDDIAbstractFailureRef> Failures = []
}

struct TDDIFailureModel{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: list<TDDIMinimalCutSets> MinimalCutSets = [],
    6: list<TDDIAbstractFailure> Failures = [],
    7: list<TDDIAbstractFailureModelRef> SubModels = []
}

union TDDIFailureModelUnion{
    1: TDDIFailureModel& FailureModel,
    2: TDDIFMEA& FMEA,
    3: TDDIMarkovChain& MarkovChain,
    4: TDDIFaultTree& FaultTree
}

struct TDDIAbstractFailureModel{
    1: TDDIFailureModelUnion UsedFailureModel,
    2: TDDIFailureModelUnionType UsedFailureModelType
}

struct TDDIFailureLogicPackage{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: list<TDDIAbstractFailureModel> FailureModels = []
}

