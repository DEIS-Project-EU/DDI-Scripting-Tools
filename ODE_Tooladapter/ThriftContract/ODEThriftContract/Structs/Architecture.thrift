// Ioannis: I could have moved this after the -Package, -Interface and -Binding definitions below, reducing the reference types from 3 to 1 (in the -Interface) but I chose to go for consistency over efficiency here
union TDDIArchitecturePackageUnion{
	1: TDDIArchitecturePackage& ArchitecturePackage,
	2: TDDIArchitecturePackageInterface& ArchitecturePackageInterface,
	3: TDDIArchitecturePackageBinding& ArchitecturePackageBinding
}

struct TDDIAbstractArchitecturePackage{
	1: TDDIArchitecturePackageUnion UsedArchitecturePackage,
	2: TDDIArchitecturePackageUnionType UsedArchitecturePackageType
}

/* All attributes and references of a TDDIAbstractDesignArtifact
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel
*/

struct TDDIArchitecturePackage{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel,
	10: list<TDDIAbstractDesignArtifactRef> DesignArtifacts = []
}

struct TDDIArchitecturePackageInterface{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel,
	10: list<TDDIAbstractDesignArtifactRef> DesignArtifacts = [],
	11: TDDIAbstractArchitecturePackage Implements 
}

struct TDDIArchitecturePackageBinding{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel,
	10: list<TDDIAbstractDesignArtifactRef> DesignArtifacts = [],
	11: list<TDDIAbstractArchitecturePackageRef> ParticipantPackages = []
}

/* Common TDDIAbstractSystem attributes and References
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMap> KeyValueMaps = [],
    7: TDDIAbstractBaseElement CitedElement,
	8: TDDIAbstractDependabilityRequirement DependabilityRequirement,
	9: TDDIAssuranceLevel AssuranceLevel
	10: list<TDDIAbstractSystem> SubSystems = [],
	11: double OverallLifetime = 0.0,
	12: TDDITimeUnit OverallLifetimeTimeUnit = TDDITimeUnit.TUHour,
	13: list<TDDIAbstractFunction> RealisedFunctions = [],
	14: list<TDDIConfiguration> Configurations = [],
	15: list<TDDIContext> Contexts = [],
	16: list<TDDISystemBoundary> SystemBoundaries = [],
	17: list<TDDIAbstractStandard> AppliedStandards = [],
	18: list<TDDIAbstractFailureLogicPackageRef> FailureModels = [],
	19: list<TDDIPortRef> Ports = []
*/

struct TDDIPerfChars{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel,
	10: double ResponseTime = 0.0
}

struct TDDIPort{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel,
	10: string FlowType = "",
	11: TDDIPortDirection Direction = TDDIPortDirection.PDIN,
	12: list<TDDIPortRef> RefinedPorts = [],
	13: list<TDDIAbstractInterfaceFailureRef> InterfaceFailures = []
}

struct TDDISignal{    
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel,
	10: required TDDIPort FromPort,
	11: required TDDIPort ToPort
}

struct TDDIConfiguration{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel,
	10: list<TDDIAbstractSystemRef> SubSystems = []
}

struct TDDIContext{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel,
	10: string UsageHistory = "",
	11: double MissionTime = 0.0,
	12: TDDITimeUnit MissionTimeTimeUnit = TDDITimeUnit.TUHour
}

struct TDDISystemBoundary{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel,
	10: list<TDDIPortRef> Ports = []
}

struct TDDISystem{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel,
	10: list<TDDIAbstractSystemRef> SubSystems = [],
	11: double OverallLifetime = 0.0,
	12: TDDITimeUnit OverallLifetimeTimeUnit = TDDITimeUnit.TUHour,
	13: list<TDDIAbstractFunctionRef> RealisedFunctions = [],
	14: list<TDDIConfiguration> Configurations = [],
	15: list<TDDIContext> Contexts = [],
	16: list<TDDISystemBoundary> SystemBoundaries = [],
	17: list<TDDIAbstractStandardRef> AppliedStandards = [],
	18: list<TDDIAbstractFailureLogicPackageRef> FailureModels = [],
	19: list<TDDIPortRef> Ports = []
}

struct TDDILogicalComponent{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel,
	10: list<TDDIAbstractSystemRef> SubSystems = [],
	11: double OverallLifetime = 0.0,
	12: TDDITimeUnit OverallLifetimeTimeUnit = TDDITimeUnit.TUHour,
	13: list<TDDIAbstractFunctionRef> RealisedFunctions = [],
	14: list<TDDIConfiguration> Configurations = [],
	15: list<TDDIContext> Contexts = [],
	16: list<TDDISystemBoundary> SystemBoundaries = [],
	17: list<TDDIAbstractStandardRef> AppliedStandards = [],
	18: list<TDDIAbstractFailureLogicPackageRef> FailureModels = [],
	19: list<TDDIPortRef> Ports = []
}

struct TDDISafetyRelatedSystem{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel,
	10: list<TDDIAbstractSystemRef> SubSystems = [],
	11: double OverallLifetime = 0.0,
	12: TDDITimeUnit OverallLifetimeTimeUnit = TDDITimeUnit.TUHour,
	13: list<TDDIAbstractFunctionRef> RealisedFunctions = [],
	14: list<TDDIConfiguration> Configurations = [],
	15: list<TDDIContext> Contexts = [],
	16: list<TDDISystemBoundary> SystemBoundaries = [],
	17: list<TDDIAbstractStandardRef> AppliedStandards = [],
	18: list<TDDIAbstractFailureLogicPackageRef> FailureModels = [],
	19: list<TDDIPortRef> Ports = []
	20: string SafeState = ""
}

struct TDDILifecycleCondition{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel,
	10: string Value = "",
	11: list<TDDILifecycleConditionRef> Conditions = []
}

struct TDDIPhysicalComponent{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel,
	10: list<TDDIAbstractSystemRef> SubSystems = [],
	11: double OverallLifetime = 0.0,
	12: TDDITimeUnit OverallLifetimeTimeUnit = TDDITimeUnit.TUHour,
	13: list<TDDIAbstractFunctionRef> RealisedFunctions = [],
	14: list<TDDIConfiguration> Configurations = [],
	15: list<TDDIContext> Contexts = [],
	16: list<TDDISystemBoundary> SystemBoundaries = [],
	17: list<TDDIAbstractStandardRef> AppliedStandards = [],
	18: list<TDDIAbstractFailureLogicPackageRef> FailureModels = [],
	19: list<TDDIPortRef> Ports = [],
	20: string Dimensions = "",
	21: i32 PricePerUnit,
	22: double Mass = 0.0,
	23: i32 ProtectionCategory,
	24: double UsefulLifetime = 0.0,
	25: TDDITimeUnit UsefulLifetimeTimeUnit = TDDITimeUnit.TUMillisecond,
	26: list<TDDILogicalComponent> LogicalComponents = [],
	27: list<TDDILifecycleCondition> LifecycleConditions = [],
	28: TDDIMaintenanceProcedure& MaintenanceProcedure
}

// This union is used to express the polymorphism of the classes System, PhysicalComponent, LogicalComponent
union TDDISystemUnion{
	1: TDDISystem System, 
	2: TDDIPhysicalComponent PhysicalComponent,
	3: TDDILogicalComponent LogicalComponent,
	4: TDDISafetyRelatedSystem SafetyRelatedSystem
}

// This struct is used to express the polymorphism of the classes System, PhysicalComponent, LogicalComponent
struct TDDIAbstractSystem{
	1: TDDISystemUnion UsedSystem,
	2: TDDISystemUnionType UsedSystemType
}

struct TDDIFunction{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel,
	10: list<TDDIAbstractFunctionRef> SubFunctions = [], 
	11: list<TDDIPortRef> Ports = [],
	12: TDDIPerfChars PerfChars,
	13: list<TDDIAbstractFailureLogicPackageRef> FailureModels = [],
	14: list<TDDIMalFunctionRef> Malfunctions = []
}

struct TDDISafetyFunction{
    1: i64 Id,
    2: string Name = "",
    3: string Description = "",
    4: bool IsCitation = false,
    5: bool IsAbstract = false,
    6: list<TDDIKeyValueMapRef> KeyValueMaps = [],
    7: TDDIAbstractBaseElement& CitedElement,
	8: list<TDDIAbstractDependabilityRequirementRef> DependabilityRequirements = [],
	9: TDDIAssuranceLevel& AssuranceLevel,
	10: list<TDDIAbstractFunctionRef> SubFunctions = [], 
	11: list<TDDIPortRef> Ports = [],
	12: TDDIPerfChars PerfChars,
	13: list<TDDIAbstractFailureLogicPackageRef> FailureModels = [],
	14: list<TDDIMalFunctionRef> Malfunctions = [],
	15: string Object = "",
	16: string Behavior = "",
	17: string SafeState = ""
}

union TDDIFunctionUnion{
	1: TDDIFunction Function,
	2: TDDISafetyFunction SafetyFunction
}

// Function union
struct TDDIAbstractFunction{
	1: TDDIFunctionUnion UsedFunction,
	2: TDDIFunctionUnionType UsedFunctionType
}

union TDDIDesignArtifactUnion{
	1: TDDIAbstractSystem System,
	2: TDDIAbstractFunction Function,
	3: TDDIConfiguration Configuration,
	4: TDDISignal Signal,
	5: TDDISystemBoundary SystemBoundary,
	6: TDDIContext Context,
	7: TDDILifecycleCondition LifecycleCondition,
	8: TDDIPort Port, 
	9: TDDIPerfChars PerfChars,
	10: TDDIAbstractArchitecturePackage ArchitecturePackage
}

// This struct is used to define a concrete DesignArtifact
struct TDDIAbstractDesignArtifact{
	1: TDDIDesignArtifactUnion UsedDesignArtifact,
	2: TDDIDesignArtifactUnionType UsedDesignArtifactType
}
