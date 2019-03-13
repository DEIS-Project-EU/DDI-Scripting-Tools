
struct TDDICause{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: TDDICauseType Type,
    6: TDDIAbstractFailure& Failure
}

struct TDDIGate{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // From TDDICause
    5: TDDICauseType Type,
    6: TDDIAbstractFailure& Failure,
    // Own
    7: TDDIGateType GateType,
    8: list<TDDIAbstractCauseRef> Causes = []
}

union TDDICauseUnion{
    1: TDDICause& Cause,
    2: TDDIGate& Gate
}

struct TDDIAbstractCause{
    1: TDDICauseUnion UsedCause,
    2: TDDICauseUnionType UsedCauseType
}

struct TDDIFaultTree{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // From TDDIFailureModel
    5: list<TDDIMinimalCutSets> MinimalCutSets = [],
    6: list<TDDIAbstractFailure> Failures = [],
    7: list<TDDIAbstractFailureModelRef> SubModels = [],
    // Own
    8: list<TDDIAbstractCause> Causes = []    
}




