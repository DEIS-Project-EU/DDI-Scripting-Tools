
struct TDDIDomainPackage{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    // Own
    5: list<TDDIAbstractStandard> Standards = [],
    6: list<TDDIAssuranceLevel> AssuranceLevels = []
}

struct TDDIAssuranceLevel{
	// From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = []
}

struct TDDIStandard{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = []
}

struct TDDISafetyStandard{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
    5: list<TDDIAssuranceLevelRef> AssuranceLevels = []
}

union TDDIStandardUnion{
    1: TDDIStandard& Standard,
    2: TDDISafetyStandard& SafetyStandard
}

// Standard union
struct TDDIAbstractStandard{
    1: TDDIStandardUnion UsedStandard,
    2: TDDIStandardUnionType UsedStandardType
}


