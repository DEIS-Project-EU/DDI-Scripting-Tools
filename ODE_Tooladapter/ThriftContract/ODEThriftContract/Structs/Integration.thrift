
union TDDIODEPackageUnion{
    1: TDDIODEPackage& ODEPackage,
    2: TDDIODEPackageInterface& ODEPackageInterface,
    3: TDDIODEPackageBinding& ODEPackageBinding
}

// ODEPackage union
struct TDDIAbstractODEPackage{
    1: TDDIODEPackageUnion UsedODEPackage,
    2: TDDIODEPackageUnionType UsedODEPackageType
}

struct TDDIODEPackage{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractODEPackageRef> ODEPackages = [],
    9: list<TDDIAbstractArchitecturePackageRef> ArchitecturePackages = [],
    10: list<TDDIAbstractDependabilityPackageRef> DependabilityPackages = [],
    11: list<TDDIAbstractFailureLogicPackageRef> FailureLogicPackages = [],
    12: list<TDDIAbstractAssuranceCasePackageRef> AssuranceCasePackages = []
}

struct TDDIODEPackageInterface{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractODEPackageRef> ODEPackages = [],
    9: list<TDDIAbstractArchitecturePackageRef> ArchitecturePackages = [],
    10: list<TDDIAbstractDependabilityPackageRef> DependabilityPackages = [],
    11: list<TDDIAbstractFailureLogicPackageRef> FailureLogicPackages = [],
    12: list<TDDIAbstractAssuranceCasePackageRef> AssuranceCasePackages = []
    13: TDDIAbstractODEPackage Implements
}

struct TDDIODEPackageBinding{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
    8: list<TDDIAbstractODEPackageRef> ODEPackages = [],
    9: list<TDDIAbstractArchitecturePackageRef> ArchitecturePackages = [],
    10: list<TDDIAbstractDependabilityPackageRef> DependabilityPackages = [],
    11: list<TDDIAbstractFailureLogicPackageRef> FailureLogicPackages = [],
    12: list<TDDIAbstractAssuranceCasePackageRef> AssuranceCasePackages = []
    13: list<TDDIAbstractODEPackageRef> ParticipantPackages = []
}