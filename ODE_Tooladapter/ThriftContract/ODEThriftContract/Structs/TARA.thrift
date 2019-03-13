// Enums, move to enum file
enum TDDIFinancialCostType {
	FCTUSD,
	FCTEUR,
	FCTGBP
}

enum TDDISecurityApplicationType {
	SATPreventive,
	SATActive,
	SATPassive
}

enum TDDIOperationalCostType {
	OCTWorkhours,
	OCTWorkdays,
	OCTWorkmonths
}

enum TDDIAbstractAssetUnionType {
	AAUTAsset,
	AAUTVulnerableItem
}

enum TDDIAbstractThreatAgentUnionType {
	ATAUTThreatAgent,
	ATAUTHuman,
	ATAUTNonHuman
}

enum TDDIAbstractAttackUnionType {
	AAUTAttack,
	AAUTAction,
	AAUTPayload
}
// end enums

// Refs, move to ref file
struct TDDIVulnerabilityRef {
	1: TDDIVulnerability& ref
}

struct TDDIVulnerableItemRef {
	1: TDDIVulnerableItem& ref
}

struct TDDISecurityControlRef {
	1: TDDISecurityControl& ref
}

struct TDDIAttackerGoalRef {
	1: TDDIAttackerGoal& ref
}

// This should already been defined by FailureLogic, double-check
struct TDDISecurityViolationRef {
	1: TDDISecurityViolation& ref
}

struct TDDIActionRef {
	1: TDDIAction& ref
}

struct TDDIPayloadRef {
	1: TDDIPayload& ref
}
// end refs

struct TDDIVulnerability {
	// From TDDIBaseElement
	1: i64 Id,
	2: string Name = "",
	3: string Description = "",
	4: list<TDDIKeyValueMapRef> KeyValueMaps = [],
	// Own
	5: string Category = ""
}

struct TDDIAsset {
	// From TDDIBaseElement
	1: i64 Id,
	2: string Name = "",
	3: string Description = "",
	4: list<TDDIKeyValueMapRef> KeyValueMaps = [],
	// Own
	5: float FinancialValue = 0.0,
	6: TDDIFinancialCostType FinCostType = FCTEUR,
	7: float OperationalCost = 0.0,
	8: TDDIOperationalCostType OpCostType = OCTWorkdays
}

struct TDDIVulnerableItem {
	// From TDDIBaseElement
	1: i64 Id,
	2: string Name = "",
	3: string Description = "",
	4: list<TDDIKeyValueMapRef> KeyValueMaps = [],
	// From Asset
	5: float FinancialValue = 0.0,
	6: TDDIFinancialCostType FinCostType = FCTEUR,
	7: float OperationalCost = 0.0,
	8: TDDIOperationalCostType OpCostType = OCTWorkdays,
	// Own
	9: list<TDDIVulnerability> Vulnerabilities
}

union TDDIAbstractAssetUnion {
	1: TDDIAsset& Asset,
	2: TDDIVulnerableItem& VulnerableItem
}

struct TDDIAbstractAsset {
	1: TDDIAbstractAssetUnion UsedAsset,
	2: TDDIAbstractAssetUnionType UsedAssetType
}

struct TDDISecurityControl {
	// From TDDIBaseElement
	1: i64 Id,
	2: string Name = "",
	3: string Description = "",
	4: list<TDDIKeyValueMapRef> KeyValueMaps = [],
	// From TDDIMeasure
	5: string IntrinsicSafety = "",
    6: string SafeGuard = "",
    7: string ApplierInformation = "",
    8: bool RiskAcceptability = false,
    9: string FurtherAction = "",
    10: string Source = "",
    11: TDDIAssuranceLevel& AssuranceLevel,
    12: TDDIMeasureType MeasureType,
	// Own
	13: string Category = "",
	14: TDDISecurityApplicationType SecAppType = SATPreventive,
	15: list<TDDIVulnerabilityRef> Vulnerabilities
}

struct TDDISecurityCapability {
	// From TDDIBaseElement
	1: i64 Id,
	2: string Name = "",
	3: string Description = "",
	4: list<TDDIKeyValueMapRef> KeyValueMaps = [],
	// Own
	5: string Category = "",
	6: TDDISecurityApplicationType SecAppType = SATPreventive,
	7: list<TDDISecurityControlRef> ImplementedBy
}

struct TDDISecurityRisk {
	// From TDDIBaseElement
	1: i64 Id,
	2: string Name = "",
	3: string Description = "",
	4: list<TDDIKeyValueMapRef> KeyValueMaps = [],
	// Own
	5: double Likelihood = 0.0,
	6: string ImpactAsset = "",
	7: string ImpactIndividuals = "",
	8: string ImpactBusiness = "",
	9: list<TDDIAttackerGoalRef> AttackerGoals
}

struct TDDIAttack {
	// From TDDIBaseElement
	1: i64 Id,
	2: string Name = "",
	3: string Description = "",
	4: list<TDDIKeyValueMapRef> KeyValueMaps = [],
	// Own
	5: string Category = "",
	6: float FinancialCost = 0.0,
	7: TDDIFinancialCostType FinCostType = FCTEUR,
	8: float TimeRequired = 0.0,
	// TODO Double-check time unit
	9: TDDITimeUnit TimeUnit = TUMinutes,
	10: string Difficulty = "",
	11: string Detectability = "",
	12: list<TDDIVulnerabilityRef> ExploitedVulnerabilities,
	13: list<TDDISecurityViolationRef> Violations
}

struct TDDIAction {
	// From TDDIBaseElement
	1: i64 Id,
	2: string Name = "",
	3: string Description = "",
	4: list<TDDIKeyValueMapRef> KeyValueMaps = [],
	// From TDDIAttack
	5: string Category = "",
	6: float FinancialCost = 0.0,
	7: TDDIFinancialCostType FinCostType = FCTEUR,
	8: float TimeRequired = 0.0,
	// TODO Double-check time unit
	9: TDDITimeUnit TimeUnit = TUMinutes,
	10: string Difficulty = "",
	11: string Detectability = "",
	12: list<TDDIVulnerabilityRef> ExploitedVulnerabilities,
	13: list<TDDISecurityViolationRef> Violations
}

struct TDDIPayload {
	// From TDDIBaseElement
	1: i64 Id,
	2: string Name = "",
	3: string Description = "",
	4: list<TDDIKeyValueMapRef> KeyValueMaps = [],
	// From TDDIAttack
	5: string Category = "",
	6: float FinancialCost = 0.0,
	7: TDDIFinancialCostType FinCostType = FCTEUR,
	8: float TimeRequired = 0.0,
	// TODO Double-check time unit
	9: TDDITimeUnit TimeUnit = TUMinutes,
	10: string Difficulty = "",
	11: string Detectability = "",
	12: list<TDDIVulnerabilityRef> ExploitedVulnerabilities,
	13: list<TDDISecurityViolationRef> Violations
}

struct TDDIAbstractAttackUnion {
	1: TDDIAttack Attack,
	2: TDDIAction Action,
	3: TDDIPayload Payload
}

struct TDDIAbstractAttack {
	1: TDDIAbstractAttackUnion UsedAttack,
	2: TDDIAbstractAttackUnionType UsedAttackType
}

struct TDDIAttackerGoal {
	// From TDDIBaseElement
	1: i64 Id,
	2: string Name = "",
	3: string Description = "",
	4: list<TDDIKeyValueMapRef> KeyValueMaps = [],
	// Own
	5: string Category = "",
	6: list<TDDIAbstractAttack> Attacks,
	7: list<TDDISecurityCapability> AddressedBy,
	8: list<TDDIVulnerableItemRef> AttackedItems
}

// Note, generic ThreatAgent does not feature reference of any Attacks
struct TDDIThreatAgent {
	// From TDDIBaseElement
	1: i64 Id,
	2: string Name = "",
	3: string Description = "",
	4: list<TDDIKeyValueMapRef> KeyValueMaps = [],
	// Own
	5: string SkillLevel = "",
	6: string Motivation = "",
	7: string AnonymityDesire = "",
	8: list<TDDIAttackerGoal> AttackerGoals,
}

struct TDDIHuman {
	// From TDDIBaseElement
	1: i64 Id,
	2: string Name = "",
	3: string Description = "",
	4: list<TDDIKeyValueMapRef> KeyValueMaps = [],
	// From TDDIThreatAgent
	5: string SkillLevel = "",
	6: string Motivation = "",
	7: string AnonymityDesire = "",
	8: list<TDDIAttackerGoal> AttackerGoals,
	9: list<TDDIActionRef> Actions
}

struct TDDINonHuman {
	// From TDDIBaseElement
	1: i64 Id,
	2: string Name = "",
	3: string Description = "",
	4: list<TDDIKeyValueMapRef> KeyValueMaps = [],
	// From TDDIThreatAgent
	5: string SkillLevel = "",
	6: string Motivation = "",
	7: string AnonymityDesire = "",
	8: list<TDDIAttackerGoal> AttackerGoals,
	9: list<TDDIPayloadRef> Payloads
}

union TDDIAbstractThreatAgentUnion {
	1: TDDIThreatAgent ThreatAgent,
	2: TDDIHuman Human,
	3: TDDINonHuman NonHuman
}

struct TDDIAbstractThreatAgent {
	1: TDDIAbstractThreatAgentUnion UsedThreatAgent,
	2: TDDIAbstractThreatAgentUnionType UsedThreatAgentType
}

struct TARAPackage {
	1: list<TDDISecurityRisk> IdentifiedRisks,
	2: list<TDDISecurityControl> Controls,
	3: list<TDDIAbstractAsset> ConsideredAssets,
	4: list<TDDIAbstractThreatAgent> ConsideredThreatAgents
}