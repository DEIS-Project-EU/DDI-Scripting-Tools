
struct TDDIFMEAPackage{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractFailureAnalysisArtifactRef> FailureAnalysisArtifacts = [],
    9: list<TDDIAbstractFMEAArtifactRef> FMEAArtifacts = []
}

struct TDDIFMEAPackageInterface{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractFailureAnalysisArtifactRef> FailureAnalysisArtifacts = [],
    9: list<TDDIAbstractFMEAArtifactRef> FMEAArtifacts = [],
    11: TDDIAbstractFMEAPackage& Implements
}

struct TDDIFMEAPackageBinding{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractFailureAnalysisArtifactRef> FailureAnalysisArtifacts = [],
    9: list<TDDIAbstractFMEAArtifactRef> FMEAArtifacts = [],
    11: list<TDDIAbstractFMEAPackageRef> ParticipantPackages = []
}

struct TDDIBasicFMEAPackage{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractFailureAnalysisArtifactRef> FailureAnalysisArtifacts = [],
    9: list<TDDIAbstractFMEAArtifactRef> FMEAArtifacts = []
}

struct TDDIFMEDAPackage{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractFailureAnalysisArtifactRef> FailureAnalysisArtifacts = [],
    9: list<TDDIAbstractFMEAArtifactRef> FMEAArtifacts = []
}

union TDDIFMEAPackageUnion{
    1: TDDIFMEAPackage FMEAPackage,
    2: TDDIFMEAPackageInterface FMEAPackageInterface,
    3: TDDIFMEAPackageBinding FMEAPackageBinding,
    4: TDDIBasicFMEAPackage BasicFMEAPackage,
    5: TDDIFMEDAPackage FMEDAPackage
}

// FMEAPackage union
struct TDDIAbstractFMEAPackage{
    1: TDDIFMEAPackageUnion UsedFMEAPackage,
    2: TDDIFMEAPackageUnionType UsedFMEAPackageType
}

union TDDIFMEAArtifactUnion{
    1: TDDIAbstractFMEAPropagation& FMEAPropagation
}

// FMEAArtifact union
struct TDDIAbstractFMEAArtifact{
    1: TDDIFMEAArtifactUnion UsedFMEAArtifact,
    2: TDDIFMEAArtifactUnionType UsedFMEAArtifactType
}

struct TDDIFMEAFailure{
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
    12: TDDIInputFailure& InputFailure
}

struct TDDIFMEAPropagation{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: TDDIFMEAFailure FMEACause,
    9: TDDIFMEAFailure FMEAEffect
}

struct TDDIDiagnosableFailurePropagation{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: TDDIFMEAFailure FMEACause,
    9: TDDIFMEAFailure FMEAEffect,
    10: double DiagnosisRate = 0.0,
    11: TDDIProbabilityDistribution& ProbabilityDistribution
}

union TDDIFMEAPropagationUnion{
    1: TDDIFMEAPropagation FMEAPropagation,
    2: TDDIDiagnosableFailurePropagation DiagnosableFailurePropagation
}

// FMEAPropagation union
struct TDDIAbstractFMEAPropagation{
    1: TDDIFMEAPropagationUnion UsedFMEAPropagation,
    2: TDDIFMEAPropagationUnionType UsedFMEAPropagationType
}