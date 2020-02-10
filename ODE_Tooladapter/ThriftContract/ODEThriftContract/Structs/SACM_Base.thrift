
struct TDDILangString{
    1: string Lang = "",
    2: string Content = ""
}

struct TDDIExpressionLangString{
    1: string Lang = "",
    2: string Content = "",
    3: TDDIAbstractExpressionElement& Expression
}

union TDDILangStringUnion{
    1: TDDILangString LangString,
    2: TDDIExpressionLangString ExpressionLangString
}

// LangString union
struct TDDIAbstractLangString{
	1: TDDILangStringUnion UsedLangString,
	2: TDDILangStringUnionType UsedLangStringType
}

struct TDDIMultiLangString{
    1: list<TDDIAbstractLangString> Values = []
}

/* Attributes and references of an abstract SACMElement
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement CitedElement,
    5: TDDIAbstractSACMElement AbstractForm
*/

/* Attributes and references of an abstract UtilityElement
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement& CitedElement,
    5: TDDIAbstractSACMElement& AbstractForm,
    6: TDDIMultiLangString Content 
*/

struct TDDIDescription{
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement& CitedElement,
    5: TDDIAbstractSACMElement& AbstractForm,
    6: TDDIMultiLangString Content   
}

struct TDDIImplementationConstraint{
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement& CitedElement,
    5: TDDIAbstractSACMElement& AbstractForm,
    6: TDDIMultiLangString Content    
}

struct TDDINote{
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement& CitedElement,
    5: TDDIAbstractSACMElement& AbstractForm,
    6: TDDIMultiLangString Content    
}

struct TDDITaggedValue{
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement& CitedElement,
    5: TDDIAbstractSACMElement& AbstractForm,
    6: TDDIMultiLangString Content,
    7: TDDIMultiLangString Key
}

union TDDIUtilityElementUnion{
    1: TDDIDescription Description,
    2: TDDIImplementationConstraint ImplementationConstraint,
    3: TDDINote Note,
    4: TDDITaggedValue TaggedValue
}

// abstract UtilityElement union
struct TDDIAbstractUtilityElement{
    1: TDDIUtilityElementUnion UsedUtilityElement,
	2: TDDIUtilityElementUnionType UsedUtilityElementType
}

union TDDIArtifactElementUnion{
    1: TDDIAbstractTerminologyElement& TerminologyElement,
    2: TDDIAbstractAssuranceCasePackage& AssuranceCasePackage,
    3: TDDIAbstractArtifactPackage& ArtifactPackage,
    4: TDDIArtifactGroup& ArtifactGroup,
    5: TDDIAbstractArtifactAsset& ArtifactAsset,
    6: TDDIAbstractArgumentationElement& ArgumentationElement
}

// abstract ArtifactElement union
struct TDDIAbstractArtifactElement{
    1: TDDIArtifactElementUnion UsedArtifactElement,
    2: TDDIArtifactElementUnionType UsedArtifactElementType
}

union TDDIModelElementUnion{
    1: TDDIAbstractArtifactElement ArtifactElement
}

// abstract ModelElement union
struct TDDIAbstractModelElement{
    1: TDDIModelElementUnion UsedModelElement,
    2: TDDIModelElementUnionType UsedModelElementType
}

/* Attributes and references of an abstract ModelElement
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement CitedElement,
    5: TDDIAbstractSACMElement AbstractForm,
    6: TDDIAbstractLangstring Name = "", 
    7: TDDIDescription Description,
    8: list<TDDIImplementationConstraintRef> ImplementationConstraint = [],
    9: list<TDDINoteRef> Note = [],
    10: list<TDDITaggedValueRef> TaggedValue = []
*/

/* Attributes and references of an abstract ArtifactElement
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement CitedElement,
    5: TDDIAbstractSACMElement AbstractForm,
    6: TDDIAbstractLangstring Name = "", 
    7: TDDIDescription Description,
    8: list<TDDIImplementationConstraintRef> ImplementationConstraint = [],
    9: list<TDDINoteRef> Note = [],
    10: list<TDDITaggedValueRef> TaggedValue = []
*/

union TDDISACMElementUnion{
    1: TDDIAbstractUtilityElement UtilityElement,
    2: TDDIAbstractModelElement ModelElement
}

// abstract SACMElement union
struct TDDIAbstractSACMElement{
	1: TDDISACMElementUnion UsedSACMElement,
	2: TDDISACMElementUnionType UsedSACMElementType
}

union TDDIElementUnion{
    1: TDDIAbstractLangString LangString,
    2: TDDIMultiLangString MultiLangString,
    3: TDDIAbstractSACMElement SACMElement
}

// abstract Element union
struct TDDIAbstractElement{
	1: TDDIElementUnion UsedElement,
	2: TDDIElementUnionType UsedElementType
}