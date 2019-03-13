
union TDDIArtifactPackageUnion{
    1: TDDIArtifactPackage& ArtifactPackage,
    2: TDDIArtifactPackageInterface& ArtifactPackageInterface,
    3: TDDIArtifactPackageBinding& ArtifactPackageBinding
}

struct TDDIAbstractArtifactPackage{
    1: TDDIArtifactPackageUnion UsedArtifactPackage,
    2: TDDIArtifactPackageUnionType UsedArtifactPackageType
}

struct TDDIArtifactPackage{
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
    11: list<TDDIAbstractArtifactElementRef> ArtifactElement = []
}

struct TDDIArtifactPackageInterface{
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
    11: list<TDDIAbstractArtifactElementRef> ArtifactElement = [],
    12: TDDIAbstractArtifactPackage Implements
}

struct TDDIArtifactPackageBinding{
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
    11: list<TDDIAbstractArtifactElementRef> ArtifactElement = [],
    12: list<TDDIAbstractArtifactPackage> ParticipantPackage = []
}

struct TDDIArtifactGroup{
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
    11: list<TDDIAbstractArtifactElementRef> ArtifactElement = []
}

/* Attributes and references of an abstract ArtifactAsset
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement CitedElement,
    5: TDDIAbstractSACMElement AbstractForm,
    6: TDDIAbstractLangstring Name = "", 
    7: TDDIDescription Description,
    8: list<TDDIImplementationConstraint> ImplementationConstraint = [],
    9: list<TDDINote> Note = [],
    10: list<TDDITaggedValue> TaggedValue = [],
    11: list<TDDIProperty> Property = []
*/

struct TDDIProperty{
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
    11: list<TDDIPropertyRef> Property = []
}

struct TDDITechnique{
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
    11: list<TDDIPropertyRef> Property = []
}

struct TDDIParticipant{
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
    11: list<TDDIPropertyRef> Property = []
}

struct TDDIActivity{
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
    11: list<TDDIPropertyRef> Property = [],
    12: string StartTime = "", // is defined as EDate in SACM.emf
    13: string EndTime = ""// is defined as EDate in SACM.emf
}

struct TDDIEvent{
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
    11: list<TDDIPropertyRef> Property = [],
    12: string Occurence = "" // is defined as EDate in SACM.emf
}

struct TDDIResource{
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
    11: list<TDDIPropertyRef> Property = []
}

struct TDDIArtifact{
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
    11: list<TDDIPropertyRef> Property = [],
    12: string Version = "", 
    13: string Date = "" // is defined as EDate in SACM.emf
}

struct TDDIArtifactAssetRelationship{
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
    11: list<TDDIPropertyRef> Property = [],
    12: list<TDDIAbstractArtifactAssetRef> Source = [],
    13: list<TDDIAbstractArtifactAssetRef> Target = []
}

union TDDIArtifactAssetUnion{
    1: TDDIProperty Property,
    2: TDDITechnique Technique,
    3: TDDIParticipant Participant,
    4: TDDIActivity Activity,
    5: TDDIEvent Event,
    6: TDDIResource Resource,
    7: TDDIArtifact Artifact,
    8: TDDIArtifactAssetRelationship ArtifactAssetRelationship
}

// abstract ArtifactAsset union
struct TDDIAbstractArtifactAsset{
    1: TDDIArtifactAssetUnion UsedArtifactAsset,
    2: TDDIArtifactAssetUnionType UsedArtifactAssetType
}