
union TDDIAssuranceCasePackageUnion{
    1: TDDIAssuranceCasePackage& AssuranceCasePackage,
    2: TDDIAssuranceCasePackageInterface& AssuranceCasePackageInterface,
    3: TDDIAssuranceCasePackageBinding& AssuranceCasePackageBinding
}

struct TDDIAbstractAssuranceCasePackage{
    1: TDDIAssuranceCasePackageUnion UsedAssuranceCasePackage,
    2: TDDIAssuranceCasePackageUnionType UsedAssuranceCasePackageType
}

struct TDDIAssuranceCasePackage{
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement& CitedElement,
    5: TDDIAbstractSACMElement& AbstractForm,
    6: TDDIAbstractLangString& Name, 
    7: TDDIDescription& Description,
    8: list<TDDIImplementationConstraintRef> ImplementationConstraint = [],
    9: list<TDDINoteRef> Note = [],
    10: list<TDDITaggedValueRef> TaggedValue = [],
    11: list<TDDIAbstractAssuranceCasePackageRef> AssuranceCasePackage = [],
    12: list<TDDIAssuranceCasePackageInterfaceRef> Interface = [],
    13: list<TDDIAbstractArtifactPackageRef> ArtifactPackage = [],
    14: list<TDDIAbstractArgumentPackageRef> ArgumentPackage = [],
    15: list<TDDIAbstractTerminologyPackageRef> TerminologyPackage = []
}

struct TDDIAssuranceCasePackageInterface{
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement& CitedElement,
    5: TDDIAbstractSACMElement& AbstractForm,
    6: TDDIAbstractLangString& Name, 
    7: TDDIDescription& Description,
    8: list<TDDIImplementationConstraintRef> ImplementationConstraint = [],
    9: list<TDDINoteRef> Note = [],
    10: list<TDDITaggedValueRef> TaggedValue = [],
    11: list<TDDIAbstractAssuranceCasePackageRef> AssuranceCasePackage = [],
    12: list<TDDIAssuranceCasePackageInterfaceRef> Interface = [],
    13: list<TDDIAbstractArtifactPackageRef> ArtifactPackage = [],
    14: list<TDDIAbstractArgumentPackageRef> ArgumentPackage = [],
    15: list<TDDIAbstractTerminologyPackageRef> TerminologyPackage = [],
    16: TDDIAbstractAssuranceCasePackage Implements
}

struct TDDIAssuranceCasePackageBinding{
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement& CitedElement,
    5: TDDIAbstractSACMElement& AbstractForm,
    6: TDDIAbstractLangString& Name, 
    7: TDDIDescription& Description,
    8: list<TDDIImplementationConstraintRef> ImplementationConstraint = [],
    9: list<TDDINoteRef> Note = [],
    10: list<TDDITaggedValueRef> TaggedValue = [],
    11: list<TDDIAbstractAssuranceCasePackageRef> AssuranceCasePackage = [],
    12: list<TDDIAssuranceCasePackageInterfaceRef> Interface = [],
    13: list<TDDIAbstractArtifactPackageRef> ArtifactPackage = [],
    14: list<TDDIAbstractArgumentPackageRef> ArgumentPackage = [],
    15: list<TDDIAbstractTerminologyPackageRef> TerminologyPackage = [],
    16: list<TDDIAbstractAssuranceCasePackageRef> ParticipantPackage = []
}