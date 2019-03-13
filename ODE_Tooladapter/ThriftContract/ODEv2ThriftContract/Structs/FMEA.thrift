
struct TDDIFMEAEntry{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
	// Ioannis: Should these be 'required' too ?
    5: TDDIAbstractFailure& Effect,
    6: TDDIAbstractFailure& Mode

}

struct TDDIFMEDAEntry{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // From TDDIFMEAEntry
    5: TDDIAbstractFailure& Effect,
    6: TDDIAbstractFailure& Mode,
    // Own
    7: double DiagnosisRate,
    8: TDDIProbDist DiagnosisProbDistribution
}

union TDDIFMEAEntryUnion{
    1: TDDIFMEAEntry& FMEAEntry,
    2: TDDIFMEDAEntry& FMEDAEntry
}

struct TDDIAbstractFMEAEntry{
    1: TDDIFMEAEntryUnion UsedFMEAEntry,
    2: TDDIFMEAEntryUnionType UsedFMEAEntryType
}

struct TDDIFMEA{
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
    8: TDDIFMEAType Type,
    9: list<TDDIAbstractFMEAEntry> Entries = []
}
