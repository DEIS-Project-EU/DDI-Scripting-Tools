
struct TDDIState{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: bool IsInitialState,
    6: bool IsFailState,
    7: TDDIAbstractFailure& FailState,
}

struct TDDITransition{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: double Transition,
    6: TDDIProbDist TransitionProbDistribution,
    7: list<TDDIStateRef> FromStates = [],
    8: list<TDDIStateRef> ToStates = []
}

struct TDDIMarkovChain {
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
    8: list<TDDITransition> Transitions = [],
    9: list<TDDIState> States = []
}