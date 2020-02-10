
struct TDDIInputEvent{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: TDDIInputFailure& InputFailure
}

struct TDDIOutputEvent{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: TDDIOutputFailure& OutputFailure
}

struct TDDIGate{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: TDDIGateType Type = TDDIGateType.GTOR,
    9: list<TDDIMinimalCutsetRef> MinimalCutsets = []
}

struct TDDIFTAPropagation{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: TDDIAbstractFailureAnalysisArtifact& Source,
    9: TDDIAbstractFailureAnalysisArtifact& Target
}

struct TDDIBasicEvent{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: double FailureRate,
    9: TDDIFailureMode& FailureMode,
    10: TDDIProbabilityDistribution& ProbabilityDistribution
}

union TDDIFTAArtifactUnion{
    1: TDDIInputEvent InputEvent,
    2: TDDIOutputEvent OutputEvent,
    3: TDDIGate Gate,
    4: TDDIFTAPropagation FTAPropagation
}

// FTAArtifact union
struct TDDIAbstractFTAArtifact{
    1: TDDIFTAArtifactUnion UsedFTAArtifact,
    2: TDDIFTAArtifactUnionType UsedFTAArtifactType
}

struct TDDIFTAPackage{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractFailureAnalysisArtifactRef> FailureAnalysisArtifacts = [],
    9: list<TDDIAbstractFTAArtifact> FTAArtifacts = [],
    10: list<TDDIBasicEvent> BasicEvents = []
}

struct TDDIFTAPackageInterface{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractFailureAnalysisArtifactRef> FailureAnalysisArtifacts = [],
    9: list<TDDIAbstractFTAArtifact> FTAArtifacts = [],
    10: list<TDDIBasicEvent> BasicEvents = [],
    11: TDDIAbstractFTAPackage& Implements
}

struct TDDIFTAPackageBinding{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractFailureAnalysisArtifactRef> FailureAnalysisArtifacts = [],
    9: list<TDDIAbstractFTAArtifact> FTAArtifacts = [],
    10: list<TDDIBasicEvent> BasicEvents = [],
    11: list<TDDIAbstractFTAPackageRef> ParticipantPackages = []
}

union TDDIFTAPackageUnion{
    1: TDDIFTAPackage FTAPackage,
    2: TDDIFTAPackageInterface FTAPackageInterface,
    3: TDDIFTAPackageBinding FTAPackageBinding
}

// FTAPackage union
struct TDDIAbstractFTAPackage{
    1: TDDIFTAPackageUnion UsedFTAPackage,
    2: TDDIFTAPackageUnionType UsedFTAPackageType
}
