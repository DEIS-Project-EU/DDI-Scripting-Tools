
struct TDDIState{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: bool IsInitialState
}

struct TDDIFailState{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: double FailureRate,
    9: TDDIFailureMode& FailureMode,
    10: TDDIProbabilityDistribution& ProbabilityDistribution,
    11: TDDIOutputFailure& OutputFailure,
    12: list<TDDIState> AssociatedStates = []
}

struct TDDITransition{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: double Probability,
    9: TDDIProbabilityDistribution& ProbabilityDistribution,
    10: TDDIFailState& FromFailState,
    11: TDDIFailState& ToFailState,
    12: TDDIState& FromState,
    13: TDDIState& ToState
}

union TDDIMarkovArtifactUnion{
    1: TDDITransition Transition,
    2: TDDIState State
}

// MarkovArtifact union
struct TDDIAbstractMarkovArtifact{
    1: TDDIMarkovArtifactUnion UsedMarkovArtifact,
    2: TDDIMarkovArtifactUnionType UsedMarkovArtifactType
}

union TDDIMarkovChainPackageUnion{
    1: TDDIMarkovChainPackage& MarkovChainPackage,
    2: TDDIMarkovChainPackageInterface& MarkovChainPackageInterface,
    3: TDDIMarkovChainPackageBinding& MarkovChainPackageBinding
}

// MarkovChainPackage union
struct TDDIAbstractMarkovChainPackage{
    1: TDDIMarkovChainPackageUnion UsedMarkovChainPackage,
    2: TDDIMarkovChainPackageUnionType UsedMarkovChainPackageType
}

struct TDDIMarkovChainPackage{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractFailureAnalysisArtifactRef> FailureAnalysisArtifacts = [],
    9: list<TDDIAbstractMarkovArtifact> MarkovArtifacts = [],
    10: list<TDDIFailState> FailStates = []
}

struct TDDIMarkovChainPackageInterface{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractFailureAnalysisArtifactRef> FailureAnalysisArtifacts = [],
    9: list<TDDIAbstractMarkovArtifact> MarkovArtifacts = [],
    10: list<TDDIFailState> FailStates = []
    11: TDDIAbstractMarkovChainPackage Implements
}

struct TDDIMarkovChainPackageBinding{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractFailureAnalysisArtifactRef> FailureAnalysisArtifacts = [],
    9: list<TDDIAbstractMarkovArtifact> MarkovArtifacts = [],
    10: list<TDDIFailState> FailStates = []
    11: list<TDDIAbstractMarkovChainPackageRef> ParticipantPackages = []
}