
union TDDITerminologyElementUnion{
    1: TDDITerminologyGroup& TerminologyGroup,
    2: TDDIAbstractTerminologyPackage& TerminologyPackage,
    3: TDDIAbstractTerminologyAsset& TerminologyAsset
}

// abstract TerminologyElement union
struct TDDIAbstractTerminologyElement{
	1: TDDITerminologyElementUnion UsedTerminologyElement,
	2: TDDITerminologyElementUnionType UsedTerminologyElementType
}

/* Attributes and references of an abstract TerminologyElement
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement CitedElement,
    5: TDDIAbstractSACMElement AbstractForm,
    6: TDDIAbstractLangstring Name = "", 
    7: TDDIDescription Description,
    8: list<TDDIImplementationConstraintRef> ImplementationConstraint = [],
    9: list<TDDINoteRef> Note = [],
    10: list<TDDITaggedValueRef> TaggedValue = [],
*/

struct TDDITerminologyGroup{
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
    11: list<TDDIAbstractTerminologyElement> TerminologyElement = []
}

union TDDITerminologyPackageUnion{
    1: TDDITerminologyPackage& TerminologyPackage,
    2: TDDITerminologyPackageBinding& TerminologyPackageBinding,
    3: TDDITerminologyPackageInterface& TerminologyPackageInterface
}

// TerminologyPackage union
struct TDDIAbstractTerminologyPackage{
    1: TDDITerminologyPackageUnion UsedTerminologyPackage,
    2: TDDITerminologyPackageUnionType UsedTerminologyPackageType
}

struct TDDITerminologyPackage{
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
    11: list<TDDIAbstractTerminologyElement> TerminologyElement = []
}

struct TDDITerminologyPackageBinding{
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
    11: list<TDDIAbstractTerminologyElement> TerminologyElement = [],
    12: list<TDDIAbstractTerminologyPackage> ParticipantPackage = []
}

struct TDDITerminologyPackageInterface{
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
    11: list<TDDIAbstractTerminologyElement> TerminologyElement = [],
    12: TDDIAbstractTerminologyPackage Implements
}

/* Attributes and references of an abstract TerminologyAsset
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement CitedElement,
    5: TDDIAbstractSACMElement AbstractForm,
    6: TDDIAbstractLangstring Name = "", 
    7: TDDIDescription Description,
    8: list<TDDIImplementationConstraintRef> ImplementationConstraint = [],
    9: list<TDDINoteRef> Note = [],
    10: list<TDDITaggedValueRef> TaggedValue = [],
*/

struct TDDICategory{
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement& CitedElement,
    5: TDDIAbstractSACMElement& AbstractForm,
    6: TDDIAbstractLangString& Name, 
    7: TDDIDescription& Description,
    8: list<TDDIImplementationConstraintRef> ImplementationConstraint = [],
    9: list<TDDINoteRef> Note = [],
    10: list<TDDITaggedValueRef> TaggedValue = []
}

/* Attributes and references of an abstract ExpressionElement
    1: string Gid = "",
    2: bool IsCitation = false,
    3: bool IsAbstract = false,
    4: TDDIAbstractSACMElement CitedElement,
    5: TDDIAbstractSACMElement AbstractForm,
    6: TDDIAbstractLangstring Name = "", 
    7: TDDIDescription Description,
    8: list<TDDIImplementationConstraintRef> ImplementationConstraint = [],
    9: list<TDDINoteRef> Note = [],
    10: list<TDDITaggedValueRef> TaggedValue = [],
    11: string Value = "",
    12: list<TDDICategoryRef> Category
*/

struct TDDIExpression{
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
    11: string Value = "",
    12: list<TDDICategoryRef> Categories = [],
    13: list<TDDIAbstractExpressionElementRef> Element = []
}

struct TDDITerm{
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
    11: string Value = "",
    12: list<TDDICategoryRef> Category,
    13: string ExternalReference = "",
    14: TDDIAbstractModelElement& Origin
}

union TDDIExpressionElementUnion{
    1: TDDIExpression& Expression,
    2: TDDITerm& Term
}

// abstract ExpressionElement
struct TDDIAbstractExpressionElement{
	1: TDDIExpressionElementUnion UsedExpressionElement,
	2: TDDIExpressionElementUnionType UsedExpressionElementType
}

union TDDITerminologyAssetUnion{
    1: TDDICategory& Category,
    2: TDDIAbstractExpressionElement& ExpressionElement
}

// abstract TerminologyAsset
struct TDDIAbstractTerminologyAsset{
	1: TDDITerminologyAssetUnion UsedTerminologyAsset,
	2: TDDITerminologyAssetUnionType UsedTerminologyAssetType
}