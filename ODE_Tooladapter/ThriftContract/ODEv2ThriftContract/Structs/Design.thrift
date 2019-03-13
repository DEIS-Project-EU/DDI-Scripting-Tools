
struct TDDIPort{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
	// Own
	5: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	6: TDDIAssuranceLevel& AssuranceLevel,
	7: string FlowType = "",
	8: TDDIPortDirection Direction = TDDIPortDirection.PDIN,
	9: list<TDDIPortRef> RefinedPorts = [],
	10: list<TDDIAbstractFailureRef> InterfaceFailures = []
}

struct TDDISystemBoundary{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
	// Own
	5: list<TDDIPortRef> Ports = []
}

struct TDDISignal{    
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
	// Own
	5: required TDDIPort& FromPort,
	6: required TDDIPort& ToPort
}

struct TDDIPerfChars{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
	// Own
	5: double ResponseTime = 0.0
}

struct TDDIFunction{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
	// Own
	5: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	6: TDDIAssuranceLevel& AssuranceLevel,
	7: list<TDDIAbstractFunctionRef> SubFunctions = [], 
	8: list<TDDIPort> Ports = [],
	9: list<TDDISignal> Signals = [],
	10: TDDIPerfChars PerfChars,
	11: list<TDDIAbstractFailureModelRef> FailureModels = [],
	12: list<TDDIMalfunctionRef> Malfunctions = [],
	13: TDDIAbstractAsset& AsAsset
}

struct TDDISafetyFunction{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
	// From TDDIFunction
	5: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	6: TDDIAssuranceLevel& AssuranceLevel,
	7: list<TDDIAbstractFunctionRef> SubFunctions = [], 
	8: list<TDDIPort> Ports = [],
	9: list<TDDISignal> Signals = [],
	10: TDDIPerfChars PerfChars,
	11: list<TDDIAbstractFailureModelRef> FailureModels = [],
	12: list<TDDIMalfunctionRef> Malfunctions = [],
	13: TDDIAbstractAsset& AsAsset,
	// Own
	14: string Object = "",
	15: string Behavior = "",
	16: string SafeState = ""
}

union TDDIFunctionUnion{
	1: TDDIFunction& Function,
	2: TDDISafetyFunction& SafetyFunction
}

struct TDDIAbstractFunction{
	1: TDDIFunctionUnion UsedFunction,
	2: TDDIFunctionUnionType UsedFunctionType
}

struct TDDIConfiguration{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
	// Own
	5: list<TDDIAbstractSystemRef> SubSystems = []
}

struct TDDIContext{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
	// Own
	5: string UsageHistory = "",
	6: double MissionTime = 0.0,
	7: TDDITimeUnit MissionTimeTimeUnit = TDDITimeUnit.TUHour
}

struct TDDISystem{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
	// Own
	5: double OverallLifetime = 0.0,
	6: TDDITimeUnit OverallLifetimeTimeUnit = TDDITimeUnit.TUHour,
	7: list<TDDIContext> Contexts = [],
	8: list<TDDIConfiguration> Configurations = [],
	9: list<TDDIPort> Ports = [],
	10: list<TDDISignal> Signals = [],
	11: list<TDDISystemBoundary> SystemBoundaries = [],
	12: list<TDDIAbstractStandardRef> AppliedStandards = [],
	13: list<TDDIAbstractFunctionRef> RealisedFunctions = [],
	14: TDDIAbstractAsset& AsAsset,
	15: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	16: TDDIAssuranceLevel& AssuranceLevel,
	17: list<TDDIAbstractFailureModelRef> FailureModels = [],
	18: list<TDDIAbstractSystemRef> SubSystems = []
}

struct TDDILogicalComponent{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
	// From TDDISystem
	5: double OverallLifetime = 0.0,
	6: TDDITimeUnit OverallLifetimeTimeUnit = TDDITimeUnit.TUHour,
	7: list<TDDIContext> Contexts = [],
	8: list<TDDIConfiguration> Configurations = [],
	9: list<TDDIPort> Ports = [],
	10: list<TDDISignal> Signals = [],
	11: list<TDDISystemBoundary> SystemBoundaries = [],
	12: list<TDDIAbstractStandardRef> AppliedStandards = [],
	13: list<TDDIAbstractFunctionRef> RealisedFunctions = [],
	14: TDDIAbstractAsset& AsAsset,
	15: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	16: TDDIAssuranceLevel& AssuranceLevel,
	17: list<TDDIAbstractFailureModelRef> FailureModels = [],
	18: list<TDDIAbstractSystemRef> SubSystems = []
}

struct TDDISafetyRelatedSystem{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
	// From TDDISystem
	5: double OverallLifetime = 0.0,
	6: TDDITimeUnit OverallLifetimeTimeUnit = TDDITimeUnit.TUHour,
	7: list<TDDIContext> Contexts = [],
	8: list<TDDIConfiguration> Configurations = [],
	9: list<TDDIPort> Ports = [],
	10: list<TDDISignal> Signals = [],
	11: list<TDDISystemBoundary> SystemBoundaries = [],
	12: list<TDDIAbstractStandardRef> AppliedStandards = [],
	13: list<TDDIAbstractFunctionRef> RealisedFunctions = [],
	14: TDDIAbstractAsset& AsAsset,
	15: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	16: TDDIAssuranceLevel& AssuranceLevel,
	17: list<TDDIAbstractFailureModelRef> FailureModels = [],
	18: list<TDDIAbstractSystemRef> SubSystems = [],
	// Own
	19: string SafeState = ""
}

struct TDDILifecycleCondition{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
	// Own
	5: string Value = "",
	6: list<TDDILifecycleCondition> Conditions = []
}

struct TDDIPhysicalComponent{
    // From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
	// From TDDISystem
	5: double OverallLifetime = 0.0,
	6: TDDITimeUnit OverallLifetimeTimeUnit = TDDITimeUnit.TUHour,
	7: list<TDDIContext> Contexts = [],
	8: list<TDDIConfiguration> Configurations = [],
	9: list<TDDIPort> Ports = [],
	10: list<TDDISignal> Signals = [],
	11: list<TDDISystemBoundary> SystemBoundaries = [],
	12: list<TDDIAbstractStandardRef> AppliedStandards = [],
	13: list<TDDIAbstractFunctionRef> RealisedFunctions = [],
	14: TDDIAbstractAsset& AsAsset,
	15: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	16: TDDIAssuranceLevel& AssuranceLevel,
	17: list<TDDIAbstractFailureModelRef> FailureModels = [],
	18: list<TDDIAbstractSystemRef> SubSystems = [],
	// Own
	19: string Dimensions = "",
	20: i32 PricePerUnit,
	21: double Mass = 0.0,
	22: i32 ProtectionCategory,
	23: double UsefulLifetime = 0.0,
	24: TDDITimeUnit UsefulLifetimeTimeUnit = TDDITimeUnit.TUMillisecond,
	25: list<TDDILogicalComponentRef> LogicalComponents = [],
	26: list<TDDILifecycleCondition> LifecycleConditions = [],
	27: TDDIMaintenanceProcedure& MaintenanceProcedure
}

union TDDISystemUnion{
	1: TDDISystem& System, 
	2: TDDIPhysicalComponent& PhysicalComponent,
	3: TDDILogicalComponent& LogicalComponent,
	4: TDDISafetyRelatedSystem& SafetyRelatedSystem
}

struct TDDIAbstractSystem{
	1: TDDISystemUnion UsedSystem,
	2: TDDISystemUnionType UsedSystemType
}

struct TDDIDesignPackage{
	// From TDDIBaseElement
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: list<TDDIKeyValueMap> KeyValueMaps = [],
	// Own
	5: list<TDDIAbstractSystem> Systems = [],
	6: list<TDDIAbstractFunction> Functions = []
}
