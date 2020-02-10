package transformation.ode2thrift;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dependability.iface.IAsset;
import dependability.iface.IAttack;
import dependability.iface.IThreatAgent;
import dependability.tara.typed.TAction;
import dependability.tara.typed.TAsset;
import dependability.tara.typed.TAttack;
import dependability.tara.typed.TAttackerGoal;
import dependability.tara.typed.THuman;
import dependability.tara.typed.TNonHuman;
import dependability.tara.typed.TPayload;
import dependability.tara.typed.TSecurityCapability;
import dependability.tara.typed.TSecurityControl;
import dependability.tara.typed.TSecurityRisk;
import dependability.tara.typed.TTARAPackage;
import dependability.tara.typed.TThreatAgent;
import dependability.tara.typed.TVulnerability;
import dependability.tara.typed.TVulnerableItem;
import thriftContract.TDDIAbstractAsset;
import thriftContract.TDDIAbstractAssetUnion;
import thriftContract.TDDIAbstractAssetUnionType;
import thriftContract.TDDIAbstractAttack;
import thriftContract.TDDIAbstractAttackUnion;
import thriftContract.TDDIAbstractAttackUnionType;
import thriftContract.TDDIAbstractThreatAgent;
import thriftContract.TDDIAbstractThreatAgentUnion;
import thriftContract.TDDIAbstractThreatAgentUnionType;
import thriftContract.TDDIAction;
import thriftContract.TDDIActionRef;
import thriftContract.TDDIAsset;
import thriftContract.TDDIAttack;
import thriftContract.TDDIAttackerGoal;
import thriftContract.TDDIAttackerGoalRef;
import thriftContract.TDDIFinancialCostType;
import thriftContract.TDDIHuman;
import thriftContract.TDDINonHuman;
import thriftContract.TDDIOperationalCostType;
import thriftContract.TDDIPayload;
import thriftContract.TDDIPayloadRef;
import thriftContract.TDDISecurityApplicationType;
import thriftContract.TDDISecurityCapability;
import thriftContract.TDDISecurityControl;
import thriftContract.TDDISecurityControlRef;
import thriftContract.TDDISecurityRisk;
import thriftContract.TDDISecurityViolationRef;
import thriftContract.TDDITARAPackage;
import thriftContract.TDDIThreatAgent;
import thriftContract.TDDIVulnerability;
import thriftContract.TDDIVulnerabilityRef;
import thriftContract.TDDIVulnerableItem;
import thriftContract.TDDIVulnerableItemRef;
import top.dependability.Action;
import top.dependability.Asset;
import top.dependability.Attack;
import top.dependability.AttackerGoal;
import top.dependability.FinancialCostType;
import top.dependability.Human;
import top.dependability.NonHuman;
import top.dependability.Payload;
import top.dependability.SecurityApplicationType;
import top.dependability.SecurityCapability;
import top.dependability.SecurityControl;
import top.dependability.SecurityRisk;
import top.dependability.TARAPackage;
import top.dependability.ThreatAgent;
import top.dependability.Vulnerability;
import top.dependability.VulnerableItem;
import top.failureLogic.SecurityViolation;

public class TARAThriftTranslater {
	
	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(TARAThriftTranslater.class);
	
	public static TDDITARAPackage transformTARAPackage(TARAPackage eTARAPackage) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eTARAPackage)){
			return (TDDITARAPackage) BaseThriftTranslater.emf2ThriftMap.get(eTARAPackage);
		}
		
		TDDITARAPackage tTARAPackage = new TDDITARAPackage();
		BaseThriftTranslater.emf2ThriftMap.put(eTARAPackage, tTARAPackage);
		ODE2ThriftTranslater.transformODEProductPackageContents(TTARAPackage.wrap(tTARAPackage), eTARAPackage);
		
		if(eTARAPackage.getConsideredAssets() != null){
			for(Asset eAbstractAsset : eTARAPackage.getConsideredAssets()){
				tTARAPackage.getConsideredAssets().add(transformAbstractAsset(eAbstractAsset));	
			}
		}
		
		if(eTARAPackage.getConsideredThreatAgents() != null){
			for(ThreatAgent eAbstractThreatAgent : eTARAPackage.getConsideredThreatAgents()){
				tTARAPackage.getConsideredThreatAgents().add(transformAbstractThreatAgent(eAbstractThreatAgent));	
			}
		}
		
		if(eTARAPackage.getControls() != null){
			for(SecurityControl eSecurityControl : eTARAPackage.getControls()){
				tTARAPackage.getControls().add(transformSecurityControl(eSecurityControl));	
			}
		}
		
		if(eTARAPackage.getIdentifiedRisks() != null){
			for(SecurityRisk eSecurityRisk : eTARAPackage.getIdentifiedRisks()){
				tTARAPackage.getIdentifiedRisks().add(transformSecurityRisk(eSecurityRisk));	
			}
		}
		
		return tTARAPackage;
	}

	public static TDDIAbstractAsset transformAbstractAsset(Asset eAbstractAsset) {
		TDDIAbstractAsset tAbstractAsset = new TDDIAbstractAsset();
		tAbstractAsset.UsedAsset = new TDDIAbstractAssetUnion();
		if(eAbstractAsset instanceof VulnerableItem){
			tAbstractAsset.UsedAssetType = TDDIAbstractAssetUnionType.AAUTVulnerableItem;
			tAbstractAsset.UsedAsset.setVulnerableItem(transformVulnerableItem((VulnerableItem) eAbstractAsset));
		}
		else if (eAbstractAsset instanceof Asset) {
			tAbstractAsset.UsedAssetType = TDDIAbstractAssetUnionType.AAUTAsset;
			tAbstractAsset.UsedAsset.setAsset(transformAsset((Asset) eAbstractAsset));
		}
		return tAbstractAsset;
	}

	private static TDDIVulnerableItem transformVulnerableItem(VulnerableItem eVulnerableItem) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eVulnerableItem)){
			return (TDDIVulnerableItem) BaseThriftTranslater.emf2ThriftMap.get(eVulnerableItem);
		}
		
		TDDIVulnerableItem tVulnerableItem = new TDDIVulnerableItem();
		BaseThriftTranslater.emf2ThriftMap.put(eVulnerableItem, tVulnerableItem);
		transformAssetContents(TVulnerableItem.wrap(tVulnerableItem), eVulnerableItem);
		
		if(eVulnerableItem.getVulnerabilities() != null){
			for(Vulnerability eVulnerability : eVulnerableItem.getVulnerabilities()){
				tVulnerableItem.getVulnerabilities().add(transformVulnerability(eVulnerability));
			}
		}
		
		return tVulnerableItem;
	}

	private static TDDIVulnerability transformVulnerability(Vulnerability eVulnerability) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eVulnerability)){
			return (TDDIVulnerability) BaseThriftTranslater.emf2ThriftMap.get(eVulnerability);
		}
		
		TDDIVulnerability tVulnerability = new TDDIVulnerability();
		BaseThriftTranslater.emf2ThriftMap.put(eVulnerability, tVulnerability);
		BaseThriftTranslater.transformBaseElementContents(TVulnerability.wrap(tVulnerability), eVulnerability);
		
		if(eVulnerability.getCategory() != null){
			tVulnerability.setCategory(eVulnerability.getCategory());
		}
		
		return tVulnerability;
	}

	private static TDDIAsset transformAsset(Asset eAsset) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eAsset)){
			return (TDDIAsset) BaseThriftTranslater.emf2ThriftMap.get(eAsset);
		}
		
		TDDIAsset tAsset = new TDDIAsset();
		BaseThriftTranslater.emf2ThriftMap.put(eAsset, tAsset);
		transformAssetContents(TAsset.wrap(tAsset), eAsset);
		return tAsset;
	}
	
	private static void transformAssetContents(IAsset tAsset, Asset eAsset){
		BaseThriftTranslater.transformBaseElementContents(tAsset, eAsset);
		
		tAsset.setFinancialValue(eAsset.getFinancialValue());
		tAsset.setOperationalCost(eAsset.getOperationalCost());
		
		if(eAsset.getOperationalCostType() != null){
			switch (eAsset.getOperationalCostType()){
			case WORKDAYS:
				tAsset.setOperationalCostType(TDDIOperationalCostType.OCTWorkdays);
				break;
			case WORKHOURS:
				tAsset.setOperationalCostType(TDDIOperationalCostType.OCTWorkhours);
				break;
			case WORKMONTHS:
				tAsset.setOperationalCostType(TDDIOperationalCostType.OCTWorkmonths);
				break;
			default:
				break;
			}
		}
		if(eAsset.getFinancialCostType() != null){
			tAsset.setFinancialCostType(transformFinancialCostType(eAsset.getFinancialCostType()));
		}
		
	}

	
	private static TDDIAbstractThreatAgent transformAbstractThreatAgent(ThreatAgent eAbstractThreatAgent) {
		TDDIAbstractThreatAgent tAbstractThreatAgent = new TDDIAbstractThreatAgent();
		tAbstractThreatAgent.UsedThreatAgent = new TDDIAbstractThreatAgentUnion();
		if(eAbstractThreatAgent instanceof Human){
			tAbstractThreatAgent.UsedThreatAgentType = TDDIAbstractThreatAgentUnionType.ATAUTHuman;
			tAbstractThreatAgent.UsedThreatAgent.setHuman(transformHuman((Human) eAbstractThreatAgent));
		}
		else if (eAbstractThreatAgent instanceof NonHuman) {
			tAbstractThreatAgent.UsedThreatAgentType = TDDIAbstractThreatAgentUnionType.ATAUTNonHuman;
			tAbstractThreatAgent.UsedThreatAgent.setNonHuman(transformNonHuman((NonHuman) eAbstractThreatAgent));
		}
		else if (eAbstractThreatAgent instanceof ThreatAgent) {
			tAbstractThreatAgent.UsedThreatAgentType = TDDIAbstractThreatAgentUnionType.ATAUTThreatAgent;
			tAbstractThreatAgent.UsedThreatAgent.setThreatAgent(transformThreatAgent((ThreatAgent) eAbstractThreatAgent));
		}
		return tAbstractThreatAgent;
	}
	
	

	private static TDDIHuman transformHuman(Human eHuman) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eHuman)){
			return (TDDIHuman) BaseThriftTranslater.emf2ThriftMap.get(eHuman);
		}
		
		TDDIHuman tHuman = new TDDIHuman();
		BaseThriftTranslater.emf2ThriftMap.put(eHuman, tHuman);
		transformThreatAgentContents(THuman.wrap(tHuman), eHuman);
		
		if(eHuman.getActions() != null){
			for(Action eAction : eHuman.getActions()){
				tHuman.getActions().add(new TDDIActionRef(transformAction(eAction)));
			}
		}
		
		return tHuman;
	}


	private static TDDINonHuman transformNonHuman(NonHuman eNonHuman) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eNonHuman)){
			return (TDDINonHuman) BaseThriftTranslater.emf2ThriftMap.get(eNonHuman);
		}
		
		TDDINonHuman tNonHuman = new TDDINonHuman();
		BaseThriftTranslater.emf2ThriftMap.put(eNonHuman, tNonHuman);
		transformThreatAgentContents(TNonHuman.wrap(tNonHuman), eNonHuman);
		
		if(eNonHuman.getPayloads() != null){
			for(Payload ePayload : eNonHuman.getPayloads()){
				tNonHuman.getPayloads().add(new TDDIPayloadRef(transformPayload(ePayload)));
			}
		}
		
		return tNonHuman;
	}


	private static TDDIThreatAgent transformThreatAgent(ThreatAgent eThreatAgent) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eThreatAgent)){
			return (TDDIThreatAgent) BaseThriftTranslater.emf2ThriftMap.get(eThreatAgent);
		}
		
		TDDIThreatAgent tThreatAgent = new TDDIThreatAgent();
		BaseThriftTranslater.emf2ThriftMap.put(eThreatAgent, tThreatAgent);
		transformThreatAgentContents(TThreatAgent.wrap(tThreatAgent), eThreatAgent);
			
		return tThreatAgent;
	}
	
	private static void transformThreatAgentContents(IThreatAgent tThreatAgent, ThreatAgent eThreatAgent){
		BaseThriftTranslater.transformBaseElementContents(tThreatAgent, eThreatAgent);
		
		if(eThreatAgent.getSkillLevel() != null){
			tThreatAgent.setSkillLevel(eThreatAgent.getSkillLevel());
		}
		
		if(eThreatAgent.getMotivation() != null){
			tThreatAgent.setMotivation(eThreatAgent.getMotivation());
		}
		
		if(eThreatAgent.getAnonymityDesire() != null){
			tThreatAgent.setAnonymityDesire(eThreatAgent.getAnonymityDesire());
		}
		
		if(eThreatAgent.getAttackerGoals() != null){
			for(AttackerGoal eAttackerGoal : eThreatAgent.getAttackerGoals()){
				tThreatAgent.getAttackerGoals().add(transformAttackerGoal(eAttackerGoal));
			}
		}
	}
	
	private static TDDIAbstractAttack transformAbstractAttack(Attack eAbstractAttack){
		TDDIAbstractAttack tAbstractAttack = new TDDIAbstractAttack();
		tAbstractAttack.UsedAttack = new TDDIAbstractAttackUnion();
		if(eAbstractAttack instanceof Action){
			tAbstractAttack.UsedAttackType = TDDIAbstractAttackUnionType.AAUTAction;
			tAbstractAttack.UsedAttack.setAction(transformAction((Action) eAbstractAttack));
		}
		else if (eAbstractAttack instanceof Payload) {
			tAbstractAttack.UsedAttackType = TDDIAbstractAttackUnionType.AAUTPayload;
			tAbstractAttack.UsedAttack.setPayload(transformPayload((Payload) eAbstractAttack));
		}
		else if (eAbstractAttack instanceof Attack) {
			tAbstractAttack.UsedAttackType = TDDIAbstractAttackUnionType.AAUTAttack;
			tAbstractAttack.UsedAttack.setAttack(transformAttack((Attack) eAbstractAttack));
		}
		
		return tAbstractAttack;
	}
	
	private static TDDIAction transformAction(Action eAction) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eAction)){
			return (TDDIAction) BaseThriftTranslater.emf2ThriftMap.get(eAction);
		}
		
		TDDIAction tAction = new TDDIAction();
		BaseThriftTranslater.emf2ThriftMap.put(eAction, tAction);
		transformAttackContents(TAction.wrap(tAction), eAction);
		
		return tAction;
	}
	
	private static TDDIPayload transformPayload(Payload ePayload) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(ePayload)){
			return (TDDIPayload) BaseThriftTranslater.emf2ThriftMap.get(ePayload);
		}
		
		TDDIPayload tPayload = new TDDIPayload();
		BaseThriftTranslater.emf2ThriftMap.put(ePayload, tPayload);
		transformAttackContents(TPayload.wrap(tPayload), ePayload);
		
		return tPayload;
	}
	
	private static TDDIAttack transformAttack(Attack eAttack) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eAttack)){
			return (TDDIAttack) BaseThriftTranslater.emf2ThriftMap.get(eAttack);
		}
		
		TDDIAttack tAttack = new TDDIAttack();
		BaseThriftTranslater.emf2ThriftMap.put(eAttack, tAttack);
		transformAttackContents(TAttack.wrap(tAttack), eAttack);
		
		return tAttack;
	}
	
	private static void transformAttackContents(IAttack tAttack, Attack eAttack){
		BaseThriftTranslater.transformBaseElementContents(tAttack, eAttack);
		
		tAttack.setFinancialCost(eAttack.getFinancialCost());
		tAttack.setFinancialCostType(transformFinancialCostType(eAttack.getFinancialCostType()));
		tAttack.setTimeRequired(eAttack.getTimeRequired());
		tAttack.setTimeUnit(BaseThriftTranslater.transformTimeUnit(eAttack.getTimeUnit()));
		
		if(eAttack.getCategory() != null){
			tAttack.setCategory(eAttack.getCategory());
		}
		if(eAttack.getDifficulty() != null){
			tAttack.setDifficulty(eAttack.getDifficulty());
		}
		if(eAttack.getDetectability() != null){
			tAttack.setDetectability(eAttack.getDetectability());
		}
		
		if(eAttack.getViolations() != null){
			for(SecurityViolation eViolation : eAttack.getViolations()){
				tAttack.getViolations().add(new TDDISecurityViolationRef(FailureLogicThriftTranslater.transformSecurityViolation(eViolation)));
			}
		}
		
		if(eAttack.getExploitedVulnerabilities() != null){
			for(Vulnerability eVulnerability : eAttack.getExploitedVulnerabilities()){
				tAttack.getExploitedVulnerabilities().add(new TDDIVulnerabilityRef(transformVulnerability(eVulnerability)));
			}
		}
		
	}

	private static TDDIAttackerGoal transformAttackerGoal(AttackerGoal eAttackerGoal) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eAttackerGoal)){
			return (TDDIAttackerGoal) BaseThriftTranslater.emf2ThriftMap.get(eAttackerGoal);
		}
		
		TDDIAttackerGoal tAttackerGoal = new TDDIAttackerGoal();
		BaseThriftTranslater.emf2ThriftMap.put(eAttackerGoal, tAttackerGoal);
		BaseThriftTranslater.transformBaseElementContents(TAttackerGoal.wrap(tAttackerGoal), eAttackerGoal);
		
		if(eAttackerGoal.getCategory() != null){
			tAttackerGoal.setCategory(eAttackerGoal.getCategory());
		}
		
		if(eAttackerGoal.getAttacks() != null){
			for(Attack eAbstractAttack : eAttackerGoal.getAttacks()){
				tAttackerGoal.getAttacks().add(transformAbstractAttack(eAbstractAttack));
			}
		}
		
		if(eAttackerGoal.getAddressedBy() != null){
			for(SecurityCapability eSecurityCapability : eAttackerGoal.getAddressedBy()){
				tAttackerGoal.getAddressedBy().add(transformSecurityCapability(eSecurityCapability));
			}
		}
		
		if(eAttackerGoal.getAttackedItems() != null){
			for(VulnerableItem eVulnerableItem : eAttackerGoal.getAttackedItems()){
				tAttackerGoal.getAttackedItems().add(new TDDIVulnerableItemRef(transformVulnerableItem(eVulnerableItem)));
			}
		}
		
		return tAttackerGoal;
	}

	public static TDDISecurityCapability transformSecurityCapability(SecurityCapability eSecurityCapability) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eSecurityCapability)){
			return (TDDISecurityCapability) BaseThriftTranslater.emf2ThriftMap.get(eSecurityCapability);
		}
		
		TDDISecurityCapability tSecurityCapability = new TDDISecurityCapability();
		BaseThriftTranslater.emf2ThriftMap.put(eSecurityCapability, tSecurityCapability);
		BaseThriftTranslater.transformBaseElementContents(TSecurityCapability.wrap(tSecurityCapability), eSecurityCapability);
		
		if(eSecurityCapability.getCategory() != null){
			tSecurityCapability.setCategory(eSecurityCapability.getCategory());
		}
		
		if(eSecurityCapability.getType() != null){
			tSecurityCapability.setType(transformSecurityApplicationType(eSecurityCapability.getType()));
		}
		
		if(eSecurityCapability.getImplementedBy() != null){
			for(SecurityControl eSecurityControl : eSecurityCapability.getImplementedBy()){
				tSecurityCapability.getImplementedBy().add(new TDDISecurityControlRef(transformSecurityControl(eSecurityControl)));
			}
		}
		
		return tSecurityCapability;
	}

	public static TDDISecurityControl transformSecurityControl(SecurityControl eSecurityControl) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eSecurityControl)){
			return (TDDISecurityControl) BaseThriftTranslater.emf2ThriftMap.get(eSecurityControl);
		}
		
		TDDISecurityControl tSecurityControl = new TDDISecurityControl();
		BaseThriftTranslater.emf2ThriftMap.put(eSecurityControl, tSecurityControl);
		DependabilityThriftTranslater. transformMeasureContents(TSecurityControl.wrap(tSecurityControl), eSecurityControl);
		
		if(eSecurityControl.getCategory() != null){
			tSecurityControl.setCategory(eSecurityControl.getCategory());
		}
		
		if(eSecurityControl.getType() != null){
			tSecurityControl.setType(transformSecurityApplicationType(eSecurityControl.getType()));
		}
		
		if(eSecurityControl.getVulnerabilities() != null){
			for(Vulnerability eVulnerability : eSecurityControl.getVulnerabilities()){
				tSecurityControl.getVulnerabilities().add(new TDDIVulnerabilityRef(transformVulnerability(eVulnerability)));
			}
		}
		
		return tSecurityControl;
	}
	
	private static TDDISecurityRisk transformSecurityRisk(SecurityRisk eSecurityRisk) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eSecurityRisk)){
			return (TDDISecurityRisk) BaseThriftTranslater.emf2ThriftMap.get(eSecurityRisk);
		}
		
		TDDISecurityRisk tSecurityRisk = new TDDISecurityRisk();
		BaseThriftTranslater.emf2ThriftMap.put(eSecurityRisk, tSecurityRisk);
		BaseThriftTranslater.transformBaseElementContents(TSecurityRisk.wrap(tSecurityRisk), eSecurityRisk);
		
		tSecurityRisk.setLikelihood(eSecurityRisk.getLikelihood());
		
		if(eSecurityRisk.getImpactAsset() != null){
			tSecurityRisk.setImpactAsset(eSecurityRisk.getImpactAsset());
		}
		
		if(eSecurityRisk.getImpactIndividuals() != null){
			tSecurityRisk.setImpactIndividuals(eSecurityRisk.getImpactIndividuals());
		}
		
		if(eSecurityRisk.getImpactBusiness() != null){
			tSecurityRisk.setImpactBusiness(eSecurityRisk.getImpactBusiness());
		}
				
		if(eSecurityRisk.getAttackerGoals() != null){
			for(AttackerGoal eAttackerGoal : eSecurityRisk.getAttackerGoals()){
				tSecurityRisk.getAttackerGoals().add(new TDDIAttackerGoalRef(transformAttackerGoal(eAttackerGoal)));
			}
		}
		
		return tSecurityRisk;
	}

	private static TDDIFinancialCostType transformFinancialCostType(FinancialCostType eFinancialCostType) {
		switch (eFinancialCostType){
		case EUR:
			return TDDIFinancialCostType.FCTEUR;
		case GBP:
			return TDDIFinancialCostType.FCTGBP;
		case USD:
			return TDDIFinancialCostType.FCTUSD;
		default:
			Log.warn("Transformation for financial cost type \"" + eFinancialCostType.getName() + "\" is not implemented yet. Changed value to USD.");
			return TDDIFinancialCostType.FCTUSD;
		
		}
	}

	private static TDDISecurityApplicationType transformSecurityApplicationType(SecurityApplicationType eSecurityApplicationType){
		switch(eSecurityApplicationType){
		case ACTIVE:
			return TDDISecurityApplicationType.SATActive;
		case PASSIVE:
			return TDDISecurityApplicationType.SATPassive;
		case PREVENTIVE:
			return TDDISecurityApplicationType.SATPreventive;
		default:
			Log.warn("Transformation for security application type \"" + eSecurityApplicationType.getName() + "\" is not implemented yet. Changed value to 'Active'.");
			return TDDISecurityApplicationType.SATActive;
		}
	}
}
