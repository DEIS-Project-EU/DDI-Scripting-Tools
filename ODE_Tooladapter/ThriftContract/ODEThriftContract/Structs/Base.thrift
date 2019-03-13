// This union is used to express the actual abstract DesignArtifact which can be instantiated by exact one of the given attributes (concrete design artifacts)
union TDDIBaseElementUnion {
	1: TDDIAbstractDesignArtifact& DesignArtifact,
    2: TDDIAbstractODEPackage& ODEPackage,
    3: TDDIAbstractFailureAnalysisArtifact& FailureAnalysisArtifact,
    4: TDDIAbstractDependabilityArtifact& DependabilityArtifact
}

struct TDDIAbstractBaseElement {
	1: TDDIBaseElementUnion UsedBaseElement,
	2: TDDIBaseElementUnionType UsedBaseElementType
}

struct TDDIValue {
    1: string Tag = "",
    2: string Value = ""
}

struct TDDIKeyValueMap {
    1: string Key = "",
    2: list<TDDIValue> Values = []
}