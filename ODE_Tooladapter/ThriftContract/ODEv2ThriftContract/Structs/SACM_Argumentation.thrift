
struct TDDIArtifactReference{
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
    11: list<TDDIAbstractArtifactElementRef> ReferencedArtifactElement = []
}

union TDDIArgumentationElementUnion{
    1: TDDIArgumentGroup& ArgumentGroup
    2: TDDIAbstractArgumentPackage& ArgumentPackage
    3: TDDIAbstractArgumentAsset& ArgumentAsset
}

struct TDDIAbstractArgumentationElement{
    1: TDDIArgumentationElementUnion UsedArgumentationElement,
    2: TDDIArgumentationElementUnionType UsedArgumentationElementType
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
*/

struct TDDIArgumentGroup{
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
    11: list<TDDIAbstractArgumentationElementRef> ArgumentationElement = []
}

union TDDIArgumentPackageUnion{
    1: TDDIArgumentPackage& ArgumentPackage,
    2: TDDIArgumentPackageInterface& ArgumentPackageInterface,
    3: TDDIArgumentPackageBinding& ArgumentPackageBinding
}

struct TDDIAbstractArgumentPackage{
    1: TDDIArgumentPackageUnion UsedArgumentPackage,
    2: TDDIArgumentPackageUnionType UsedArgumentPackageType
}

struct TDDIArgumentPackage{
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
    11: list<TDDIAbstractArgumentationElementRef> ArgumentationElement = []
}

struct TDDIArgumentPackageInterface{
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
    11: list<TDDIAbstractArgumentationElementRef> ArgumentationElement = [],
    12: TDDIAbstractArgumentPackage Implements
}

struct TDDIArgumentPackageBinding{
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
    11: list<TDDIAbstractArgumentationElementRef> ArgumentationElement = [],
    12: list<TDDIAbstractArgumentPackageRef> ParticipantPackage = []
}

union TDDIArgumentAssetUnion{
    1: TDDIAbstractAssertion& Assertion,
    2: TDDIArgumentReasoning& ArgumentReasoning,
    3: TDDIArtifactReference& ArtifactReference
}

// Abstract ArgumentAsset union
struct TDDIAbstractArgumentAsset{
    1: TDDIArgumentAssetUnion UsedArgumentAsset,
    2: TDDIArgumentAssetUnionType UsedArgumentAssetType
}

/* Attributes and references of an abstract ArgumentAsset
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement CitedElement,
    5: TDDIAbstractSACMElement AbstractForm,
    6: TDDIAbstractLangstring Name = "", 
    7: TDDIDescription Description,
    8: list<TDDIImplementationConstraint> ImplementationConstraint = [],
    9: list<TDDINote> Note = [],
    10: list<TDDITaggedValue> TaggedValue = []
*/

struct TDDIArgumentReasoning{
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
    11: TDDIAbstractArgumentPackage Structure
}

struct TDDIClaim{
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
    11: TDDIAssertionDeclaration AssertionDeclaration = TDDIAssertionDeclaration.ADAsserted,
    12: list<TDDIClaimRef> MetaClaim = []
}

union TDDIAssertionUnion{
    1: TDDIClaim& Claim,
    2: TDDIAbstractAssertedRelationship& AssertedRelationship
}

// Abstract Assertion union
struct TDDIAbstractAssertion{
    1: TDDIAssertionUnion UsedAssertion,
    2: TDDIAssertionUnionType UsedAssertionType
}

/* Attributes and references of an abstract Assertion
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
    11: TDDIAssertionDeclaration AssertionDeclaration = TDDIAssertionDeclaration.ADAsserted,
    12: list<TDDIClaimRef> MetaClaim = []
*/

struct TDDIAssertedArtifactSupport{
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
    11: TDDIAssertionDeclaration AssertionDeclaration = TDDIAssertionDeclaration.ADAsserted,
    12: list<TDDIClaimRef> MetaClaim = [],
    13: bool IsCounter = false,
    14: list<TDDIAbstractArgumentAssetRef> Source = [],
    15: list<TDDIAbstractArgumentAssetRef> Target = [],
    16: TDDIArgumentReasoning Reasoning
}

struct TDDIAssertedArtifactContext{
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
    11: TDDIAssertionDeclaration AssertionDeclaration = TDDIAssertionDeclaration.ADAsserted,
    12: list<TDDIClaimRef> MetaClaim = [],
    13: bool IsCounter = false,
    14: list<TDDIAbstractArgumentAssetRef> Source = [],
    15: list<TDDIAbstractArgumentAssetRef> Target = [],
    16: TDDIArgumentReasoning Reasoning
}

struct TDDIAssertedInference{
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
    11: TDDIAssertionDeclaration AssertionDeclaration = TDDIAssertionDeclaration.ADAsserted,
    12: list<TDDIClaimRef> MetaClaim = [],
    13: bool IsCounter = false,
    14: list<TDDIAbstractArgumentAssetRef> Source = [],
    15: list<TDDIAbstractArgumentAssetRef> Target = [],
    16: TDDIArgumentReasoning Reasoning    
}

struct TDDIAssertedEvidence{
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
    11: TDDIAssertionDeclaration AssertionDeclaration = TDDIAssertionDeclaration.ADAsserted,
    12: list<TDDIClaimRef> MetaClaim = [],
    13: bool IsCounter = false,
    14: list<TDDIAbstractArgumentAssetRef> Source = [],
    15: list<TDDIAbstractArgumentAssetRef> Target = [],
    16: TDDIArgumentReasoning Reasoning   
}

struct TDDIAssertedContext{
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
    11: TDDIAssertionDeclaration AssertionDeclaration = TDDIAssertionDeclaration.ADAsserted,
    12: list<TDDIClaimRef> MetaClaim = [],
    13: bool IsCounter = false,
    14: list<TDDIAbstractArgumentAssetRef> Source = [],
    15: list<TDDIAbstractArgumentAssetRef> Target = [],
    16: TDDIArgumentReasoning Reasoning       
}

union TDDIAssertedRelationshipUnion{
    1: TDDIAssertedArtifactSupport& AssertedArtifactSupport,
    2: TDDIAssertedArtifactContext& AssertedArtifactContext,
    3: TDDIAssertedInference& AssertedInference,
    4: TDDIAssertedEvidence& AssertedEvidence,
    5: TDDIAssertedContext& AssertedContext
}

struct TDDIAbstractAssertedRelationship{
    1: TDDIAssertedRelationshipUnion UsedAssertedRelationship,
    2: TDDIAssertedRelationshipUnionType UsedAssertedRelationshipType
}