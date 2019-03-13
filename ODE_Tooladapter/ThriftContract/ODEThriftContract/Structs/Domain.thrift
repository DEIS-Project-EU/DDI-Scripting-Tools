
union TDDIDomainPackageUnion{
    1: TDDIDomainPackage& DomainPackage,
    2: TDDIDomainPackageInterface& DomainPackageInterface,
    3: TDDIDomainPackageBinding& DomainPackageBinding
}

// DomainPackage union
struct TDDIAbstractDomainPackage{
    1: TDDIDomainPackageUnion UsedDomainPackage,
    2: TDDIAbstractDomainPackageType UsedDomainPackageType
}

struct TDDIDomainPackage{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractDomainElementRef> DomainElements = []
}

struct TDDIDomainPackageInterface{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractDomainElementRef> DomainElements = [],
    9: TDDIAbstractDomainPackage Implements
}

struct TDDIDomainPackageBinding{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractDomainElementRef> DomainElements = [],
    9: list<TDDIAbstractDomainPackageRef> ParticipantPackages = []
}

struct TDDIAssuranceLevel{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement
}

struct TDDIStandard{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement
}

struct TDDISafetyStandard{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAssuranceLevel> AssuranceLevels = []
}

union TDDIStandardUnion{
    1: TDDIStandard Standard,
    2: TDDISafetyStandard SafetyStandard
}

// Standard union
struct TDDIAbstractStandard{
    1: TDDIStandardUnion UsedStandard,
    2: TDDIStandardUnionType UsedStandardType
}

union TDDIDomainElementUnion{
    1: TDDIAbstractDomainPackage DomainPackage,
    2: TDDIAbstractStandard Standard,
    3: TDDIAssuranceLevel AssuranceLevel
}

// DomainElement union
struct TDDIAbstractDomainElement{
    1: TDDIDomainElementUnion UsedDomainElement,
	2: TDDIDomainElementUnionType UsedDomainElementType
}