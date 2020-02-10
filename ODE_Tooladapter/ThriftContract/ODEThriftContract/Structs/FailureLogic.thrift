
struct TDDIFailureMode{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement
}

struct TDDIProbDistParam{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: string Value = ""
}

struct TDDIProbabilityDistribution{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: string Type = "",
    9: list<TDDIProbDistParam> ProbDistParams = []
}

union TDDIFailureUnion{
    1: TDDIAbstractInterfaceFailure& InterfaceFailure,
    2: TDDIAbstractInternalFailure& InternalFailure,
    3: TDDICCF& CCF
}

// Failure union
struct TDDIAbstractFailure{
    1: TDDIFailureUnion UsedFailure,
    2: TDDIFailureUnionType UsedFailureType
}

struct TDDIMinimalCutset{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractFailure> Failures = []
}

struct TDDIOutputFailure{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: double FailureRate,
    9: TDDIFailureMode FailureMode,
    10: TDDIProbabilityDistribution ProbabilityDistribution,
    11: list<TDDIMinimalCutset> MinimalCutsets = []
}

struct TDDIInputFailure{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: double FailureRate,
    9: TDDIFailureMode FailureMode,
    10: TDDIProbabilityDistribution ProbabilityDistribution
}

union TDDIInterfaceFailureUnion{
    1: TDDIOutputFailure OutputFailure,
    2: TDDIInputFailure InputFailure
}

// InterfaceFailure union
struct TDDIAbstractInterfaceFailure{
    1: TDDIInterfaceFailureUnion UsedInterfaceFailure,
    2: TDDIInterfaceFailureUnionType UsedInterfaceFailureType
}

struct TDDIInterfaceFailurePropagation{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: TDDIAbstractInterfaceFailure Cause,
    9: TDDIAbstractInterfaceFailure Effect
}

struct TDDIInternalFailure{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: double FailureRate,
    9: TDDIFailureMode FailureMode,
    10: TDDIProbabilityDistribution ProbabilityDistribution
}

struct TDDICCF{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: double FailureRate,
    9: TDDIFailureMode FailureMode,
    10: TDDIProbabilityDistribution ProbabilityDistribution,
    11: list<TDDIAbstractFailure> Failures = []
}

union TDDIInternalFailureUnion{
    1: TDDIInternalFailure InternalFailure,
    2: TDDIBasicEvent& BasicEvent,
    3: TDDIFMEAFailure& FMEAFailure,
    4: TDDIFailState& FailState
}

// InternalFailure union
struct TDDIAbstractInternalFailure{
    1: TDDIInternalFailureUnion UsedInternalFailure,
    2: TDDIInternalFailureUnionType UsedInternalFailureType
}

union TDDIFailureAnalysisArtifactUnion{
    1: TDDIAbstractFailureLogicPackage& FailureLogicPackage,
    2: TDDIMinimalCutset MinimalCutset,
    3: TDDIInterfaceFailurePropagation InterfaceFailurePropagation,
    4: TDDIAbstractFailure Failure,
    5: TDDIFailureMode FailureMode,
    6: TDDIProbabilityDistribution ProbabilityDistribution, 
    7: TDDIProbDistParam ProbDistParam,
    8: TDDIAbstractFTAArtifact& FTAArtifact,
    9: TDDIAbstractFMEAArtifact& FMEAArtifact,
    10: TDDIAbstractMarkovArtifact& MarkovArtifact
}

// FailureAnalysisArtifact union
struct TDDIAbstractFailureAnalysisArtifact{
    1: TDDIFailureAnalysisArtifactUnion UsedFailureAnalysisArtifact,
    2: TDDIFailureAnalysisArtifactUnionType UsedFailureAnalysisArtifactType
}

struct TDDIFailureLogicPackage{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractFailureAnalysisArtifact> FailureAnalysisArtifacts = [] 
}

struct TDDIFailureLogicPackageInterface{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractFailureAnalysisArtifact> FailureAnalysisArtifacts = [],
    9: TDDIAbstractFailureLogicPackage& Implements
}

struct TDDIFailureLogicPackageBinding{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractFailureAnalysisArtifact> FailureAnalysisArtifacts = [],
    9: list<TDDIAbstractFailureLogicPackageRef> ParticipantPackages = []
}

union TDDIFailureLogicPackageUnion{
    1: TDDIFailureLogicPackage FailureLogicPackage,
    2: TDDIFailureLogicPackageInterface FailureLogicPackageInterface,
    3: TDDIFailureLogicPackageBinding FailureLogicPackageBinding,
    4: TDDIAbstractFTAPackage& FTAPackage,
    5: TDDIAbstractFMEAPackage& FMEAPackage,
    6: TDDIAbstractMarkovChainPackage& MarkovChainPackage
}

// FailureLogicPackage union
struct TDDIAbstractFailureLogicPackage{
    1: TDDIFailureLogicPackageUnion UsedFailureLogicPackage,
    2: TDDIFailureLogicPackageUnionType UsedFailureLogicPackageType
}