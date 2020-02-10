package transformation.thrift2ode;

import java.util.stream.Collectors;

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
import thriftContract.TDDIAbstractAttack;
import thriftContract.TDDIAbstractThreatAgent;
import thriftContract.TDDIAction;
import thriftContract.TDDIAsset;
import thriftContract.TDDIAttack;
import thriftContract.TDDIAttackerGoal;
import thriftContract.TDDIFinancialCostType;
import thriftContract.TDDIHuman;
import thriftContract.TDDINonHuman;
import thriftContract.TDDIPayload;
import thriftContract.TDDISecurityApplicationType;
import thriftContract.TDDISecurityCapability;
import thriftContract.TDDISecurityControl;
import thriftContract.TDDISecurityRisk;
import thriftContract.TDDISecurityViolation;
import thriftContract.TDDITARAPackage;
import thriftContract.TDDIThreatAgent;
import thriftContract.TDDIVulnerability;
import thriftContract.TDDIVulnerableItem;
import top.dependability.Action;
import top.dependability.Asset;
import top.dependability.Attack;
import top.dependability.AttackerGoal;
import top.dependability.FinancialCostType;
import top.dependability.Human;
import top.dependability.NonHuman;
import top.dependability.OperationalCostType;
import top.dependability.Payload;
import top.dependability.SecurityApplicationType;
import top.dependability.SecurityCapability;
import top.dependability.SecurityControl;
import top.dependability.SecurityRisk;
import top.dependability.TARAPackage;
import top.dependability.ThreatAgent;
import top.dependability.Vulnerability;
import top.dependability.VulnerableItem;
import util.EMFFactory;

public class TaraEMFTranslater {

	public static TARAPackage transformTARAPackage(TDDITARAPackage tTARAPackage){
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tTARAPackage)){
			return (TARAPackage) BaseEMFTranslater.thrift2EmfMap.get(tTARAPackage);
		}
		
		TARAPackage emfTARAPackage = EMFFactory.dependabilityFactory.createTARAPackage();
		BaseEMFTranslater.thrift2EmfMap.put(tTARAPackage, emfTARAPackage);
		BaseEMFTranslater.transformBaseElementContents(TTARAPackage.wrap(tTARAPackage), emfTARAPackage);
		
		if(tTARAPackage.isSetConsideredAssets()){
			for(TDDIAbstractAsset tAbstractAsset : tTARAPackage.getConsideredAssets()){
				emfTARAPackage.getConsideredAssets().add(transformAbstractAsset(tAbstractAsset));
			}
		}
		
		if(tTARAPackage.isSetControls()){
			for(TDDISecurityControl tSecurityControl : tTARAPackage.getControls()){
				emfTARAPackage.getControls().add(transformSecurityControl(tSecurityControl));
			}
		}
		
		if(tTARAPackage.isSetConsideredThreatAgents()){
			for(TDDIAbstractThreatAgent tAbstractThreatAgent : tTARAPackage.getConsideredThreatAgents()){
				emfTARAPackage.getConsideredThreatAgents().add(transformAbstractThreatAgent(tAbstractThreatAgent));
			}
		}
		
		if(tTARAPackage.isSetIdentifiedRisks()){
			for(TDDISecurityRisk tSecurityRisk : tTARAPackage.getIdentifiedRisks()){
				emfTARAPackage.getIdentifiedRisks().add(transformSecurityRisk(tSecurityRisk));
			}
		}
		return emfTARAPackage;
	}

	public static Asset transformAbstractAsset(TDDIAbstractAsset tAbstractAsset) {
		if(tAbstractAsset.isSetUsedAssetType()){
			switch(tAbstractAsset.UsedAssetType){
			case AAUTAsset:
				return transformAsset(tAbstractAsset.UsedAsset.getAsset());
			case AAUTVulnerableItem:
				return transformVulnerableItem(tAbstractAsset.UsedAsset.getVulnerableItem());
			default:
				break;
			}
		}
		return EMFFactory.dependabilityFactory.createAsset();
	}

	private static Asset transformAsset(TDDIAsset tAsset) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tAsset)){
			return (Asset) BaseEMFTranslater.thrift2EmfMap.get(tAsset);
		}
		
		Asset emfAsset = EMFFactory.dependabilityFactory.createAsset();
		BaseEMFTranslater.thrift2EmfMap.put(tAsset, emfAsset);
		transformAssetContents(TAsset.wrap(tAsset), emfAsset);
		
		return emfAsset;
	}

	private static VulnerableItem transformVulnerableItem(TDDIVulnerableItem tVulnerableItem) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tVulnerableItem)){
			return (VulnerableItem) BaseEMFTranslater.thrift2EmfMap.get(tVulnerableItem);
		}
		
		VulnerableItem emfVulnerableItem = EMFFactory.dependabilityFactory.createVulnerableItem();
		BaseEMFTranslater.thrift2EmfMap.put(tVulnerableItem, emfVulnerableItem);
		transformAssetContents(TVulnerableItem.wrap(tVulnerableItem), emfVulnerableItem);
		
		if(tVulnerableItem.isSetVulnerabilities()){
			for(TDDIVulnerability tVulnerability : tVulnerableItem.getVulnerabilities()){
				emfVulnerableItem.getVulnerabilities().add(transformVulnerability(tVulnerability));
			}
		}
		
		return emfVulnerableItem;
	}

	private static void transformAssetContents(IAsset tAsset, Asset emfAsset){
		BaseEMFTranslater.transformBaseElementContents(tAsset, emfAsset);
		
		if(tAsset.isSetFinancialValue()){
			emfAsset.setFinancialValue(tAsset.getFinancialValue());
		}
		
		if(tAsset.isSetFinancialCostType()){
			emfAsset.setFinancialCostType(transformFinancialCostType(tAsset.getFinancialCostType()));
		}
		
		if(tAsset.isSetOperationalCost()){
			emfAsset.setOperationalCost(tAsset.getOperationalCost());
		}
		
		if(tAsset.isSetOperationalCostType()){
			switch(tAsset.getOperationalCostType()){
			case OCTWorkdays:
				emfAsset.setOperationalCostType(OperationalCostType.WORKDAYS);
				break;
			case OCTWorkhours:
				emfAsset.setOperationalCostType(OperationalCostType.WORKHOURS);
				break;
			case OCTWorkmonths:
				emfAsset.setOperationalCostType(OperationalCostType.WORKMONTHS);
				break;
			default:
				break;
			}
		}
	}
	
	private static Vulnerability transformVulnerability(TDDIVulnerability tVulnerability) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tVulnerability)){
			return (Vulnerability) BaseEMFTranslater.thrift2EmfMap.get(tVulnerability);
		}
		
		Vulnerability emfVulnerability = EMFFactory.dependabilityFactory.createVulnerability();
		BaseEMFTranslater.thrift2EmfMap.put(tVulnerability, emfVulnerability);
		BaseEMFTranslater.transformBaseElementContents(TVulnerability.wrap(tVulnerability), emfVulnerability);
		
		if(tVulnerability.isSetCategory()){
			emfVulnerability.setCategory(tVulnerability.getCategory());
		}
		
		return emfVulnerability;
	}

	public static SecurityControl transformSecurityControl(TDDISecurityControl tSecurityControl) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tSecurityControl)){
			return (SecurityControl) BaseEMFTranslater.thrift2EmfMap.get(tSecurityControl);
		}
		
		SecurityControl emfSecurityControl = EMFFactory.dependabilityFactory.createSecurityControl();
		BaseEMFTranslater.thrift2EmfMap.put(tSecurityControl, emfSecurityControl);
		DependabilityEMFTranslater.transformMeasureContents(TSecurityControl.wrap(tSecurityControl), emfSecurityControl);
		
		if(tSecurityControl.isSetCategory()){
			emfSecurityControl.setCategory(tSecurityControl.getCategory());
		}

		if(tSecurityControl.isSetType()){
			emfSecurityControl.setType(transformSecurityApplicationType(tSecurityControl.getType()));
		}
		
		if(tSecurityControl.isSetVulnerabilities()){
			for(TDDIVulnerability tVulnerability : tSecurityControl.getVulnerabilities().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfSecurityControl.getVulnerabilities().add(transformVulnerability(tVulnerability));
			}
		}
		return emfSecurityControl;
	}

	private static ThreatAgent transformAbstractThreatAgent(TDDIAbstractThreatAgent tAbstractThreatAgent) {
		if(tAbstractThreatAgent.isSetUsedThreatAgentType()){
			switch(tAbstractThreatAgent.UsedThreatAgentType){
			case ATAUTHuman:
				return transformHuman(tAbstractThreatAgent.UsedThreatAgent.getHuman());
			case ATAUTNonHuman:
				return transformNonHuman(tAbstractThreatAgent.UsedThreatAgent.getNonHuman());
			case ATAUTThreatAgent:
				return transformThreatAgent(tAbstractThreatAgent.UsedThreatAgent.getThreatAgent());
			default:
				break;
			}
		}
		return EMFFactory.dependabilityFactory.createThreatAgent();
	}

	private static Human transformHuman(TDDIHuman tHuman) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tHuman)){
			return (Human) BaseEMFTranslater.thrift2EmfMap.get(tHuman);
		}
		
		Human emfHuman = EMFFactory.dependabilityFactory.createHuman();
		BaseEMFTranslater.thrift2EmfMap.put(tHuman, emfHuman);
		transformThreatAgentContents(THuman.wrap(tHuman), emfHuman);
		
		if(tHuman.isSetActions()){
			for(TDDIAction tAction : tHuman.getActions().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfHuman.getActions().add(transformAction(tAction));
			}
		}
		return emfHuman;
	}

	

	private static NonHuman transformNonHuman(TDDINonHuman tNonHuman) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tNonHuman)){
			return (NonHuman) BaseEMFTranslater.thrift2EmfMap.get(tNonHuman);
		}
		
		NonHuman emfNonHuman = EMFFactory.dependabilityFactory.createNonHuman();
		BaseEMFTranslater.thrift2EmfMap.put(tNonHuman, emfNonHuman);
		transformThreatAgentContents(TNonHuman.wrap(tNonHuman), emfNonHuman);
		
		if(tNonHuman.isSetPayloads()){
			for(TDDIPayload tPayload : tNonHuman.getPayloads().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfNonHuman.getPayloads().add(transformPayload(tPayload));
			}
		}
		return emfNonHuman;
	}

	private static ThreatAgent transformThreatAgent(TDDIThreatAgent tThreatAgent) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tThreatAgent)){
			return (ThreatAgent) BaseEMFTranslater.thrift2EmfMap.get(tThreatAgent);
		}
		
		ThreatAgent emfThreatAgent = EMFFactory.dependabilityFactory.createThreatAgent();
		BaseEMFTranslater.thrift2EmfMap.put(tThreatAgent, emfThreatAgent);
		transformThreatAgentContents(TThreatAgent.wrap(tThreatAgent), emfThreatAgent);
		
		return emfThreatAgent;
	}
	
	private static void transformThreatAgentContents(IThreatAgent tThreatAgent, ThreatAgent emfThreatAgent){
		BaseEMFTranslater.transformBaseElementContents(tThreatAgent, emfThreatAgent);
		
		if(tThreatAgent.isSetSkillLevel()){
			emfThreatAgent.setSkillLevel(tThreatAgent.getSkillLevel());
		}
		
		if(tThreatAgent.isSetMotivation()){
			emfThreatAgent.setMotivation(tThreatAgent.getMotivation());
		}
		
		if(tThreatAgent.isSetAnonymityDesire()){
			emfThreatAgent.setAnonymityDesire(tThreatAgent.getAnonymityDesire());
		}
		
		if(tThreatAgent.isSetAttackerGoals()){
			for(TDDIAttackerGoal tAttackerGoal : tThreatAgent.getAttackerGoals()){
				emfThreatAgent.getAttackerGoals().add(transformAttackerGoal(tAttackerGoal));
			}
		}
	}

	private static AttackerGoal transformAttackerGoal(TDDIAttackerGoal tAttackerGoal) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tAttackerGoal)){
			return (AttackerGoal) BaseEMFTranslater.thrift2EmfMap.get(tAttackerGoal);
		}
		
		AttackerGoal emfAttackerGoal = EMFFactory.dependabilityFactory.createAttackerGoal();
		BaseEMFTranslater.thrift2EmfMap.put(tAttackerGoal, emfAttackerGoal);
		BaseEMFTranslater.transformBaseElementContents(TAttackerGoal.wrap(tAttackerGoal), emfAttackerGoal);
		
		if(tAttackerGoal.isSetCategory()){
			emfAttackerGoal.setCategory(tAttackerGoal.getCategory());
		}
		
		if(tAttackerGoal.isSetAttackedItems()){
			for(TDDIVulnerableItem tVulnerableItem : tAttackerGoal.getAttackedItems().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfAttackerGoal.getAttackedItems().add(transformVulnerableItem(tVulnerableItem));
			}
		}
		
		if(tAttackerGoal.isSetAddressedBy()){
			for(TDDISecurityCapability tSecurityCapability : tAttackerGoal.getAddressedBy()){
				emfAttackerGoal.getAddressedBy().add(transformSecurityCapability(tSecurityCapability));
			}
		}
		
		if(tAttackerGoal.isSetAttacks()){
			for(TDDIAbstractAttack tAbstractAttack : tAttackerGoal.getAttacks()){
				emfAttackerGoal.getAttacks().add(transformAbstractAttack(tAbstractAttack));
			}
		}
		
		return emfAttackerGoal;
	}

	public static SecurityCapability transformSecurityCapability(TDDISecurityCapability tSecurityCapability) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tSecurityCapability)){
			return (SecurityCapability) BaseEMFTranslater.thrift2EmfMap.get(tSecurityCapability);
		}
		
		SecurityCapability emfSecurityCapability = EMFFactory.dependabilityFactory.createSecurityCapability();
		BaseEMFTranslater.thrift2EmfMap.put(tSecurityCapability, emfSecurityCapability);
		BaseEMFTranslater.transformBaseElementContents(TSecurityCapability.wrap(tSecurityCapability), emfSecurityCapability);
		
		if(tSecurityCapability.isSetCategory()){
			emfSecurityCapability.setCategory(tSecurityCapability.getCategory());
		}
		
		if(tSecurityCapability.isSetType()){
			emfSecurityCapability.setType(transformSecurityApplicationType(tSecurityCapability.getType()));
		}
		
		if(tSecurityCapability.isSetImplementedBy()){
			for(TDDISecurityControl tSecurityControl : tSecurityCapability.getImplementedBy().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfSecurityCapability.getImplementedBy().add(transformSecurityControl(tSecurityControl));
			}
		}
		return emfSecurityCapability;
	}
	
	private static Attack transformAbstractAttack(TDDIAbstractAttack tAbstractAttack) {
		if(tAbstractAttack.isSetUsedAttackType()){
			switch(tAbstractAttack.UsedAttackType){
			case AAUTAction:
				return transformAction(tAbstractAttack.UsedAttack.getAction());
			case AAUTAttack:
				return transformAttack(tAbstractAttack.UsedAttack.getAttack());
			case AAUTPayload:
				return transformPayload(tAbstractAttack.UsedAttack.getPayload());
			default:
				break;
			}
		}
		
		return EMFFactory.dependabilityFactory.createAttack();
	}
	
	private static Payload transformPayload(TDDIPayload tPayload) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tPayload)){
			return (Payload) BaseEMFTranslater.thrift2EmfMap.get(tPayload);
		}
		
		Payload emfPayload = EMFFactory.dependabilityFactory.createPayload();
		BaseEMFTranslater.thrift2EmfMap.put(tPayload, emfPayload);
		transformAttackContents(TPayload.wrap(tPayload), emfPayload);
		return emfPayload;
	}

	private static Action transformAction(TDDIAction tAction) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tAction)){
			return (Action) BaseEMFTranslater.thrift2EmfMap.get(tAction);
		}
		
		Action emfAction = EMFFactory.dependabilityFactory.createAction();
		BaseEMFTranslater.thrift2EmfMap.put(tAction, emfAction);
		transformAttackContents(TAction.wrap(tAction), emfAction);
		return emfAction;
	}
	
	private static Attack transformAttack(TDDIAttack tAttack){
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tAttack)){
			return (Attack) BaseEMFTranslater.thrift2EmfMap.get(tAttack);
		}
		
		Attack emfAttack = EMFFactory.dependabilityFactory.createAttack();
		BaseEMFTranslater.thrift2EmfMap.put(tAttack, emfAttack);
		transformAttackContents(TAttack.wrap(tAttack), emfAttack);
		return emfAttack;
	}
	
	private static void transformAttackContents(IAttack tAttack, Attack emfAttack){
		BaseEMFTranslater.transformBaseElementContents(tAttack, emfAttack);
		
		if(tAttack.isSetCategory()){
			emfAttack.setCategory(tAttack.getCategory());
		}
		if(tAttack.isSetFinancialCost()){
			emfAttack.setFinancialCost(tAttack.getFinancialCost());
		}
		if(tAttack.isSetFinancialCostType()){
			emfAttack.setFinancialCostType(transformFinancialCostType(tAttack.getFinancialCostType()));
		}
		if(tAttack.isSetTimeRequired()){
			emfAttack.setTimeRequired(tAttack.getTimeRequired());
		}
		if(tAttack.isSetTimeUnit()){
			emfAttack.setTimeUnit(BaseEMFTranslater.transformTimeUnit(tAttack.getTimeUnit()));
		}
		if(tAttack.isSetDifficulty()){
			emfAttack.setDifficulty(tAttack.getDifficulty());
		}
		if(tAttack.isSetDetectability()){
			emfAttack.setDetectability(tAttack.getDetectability());
		}
		if(tAttack.isSetExploitedVulnerabilities()){
			for(TDDIVulnerability tVulnerability : tAttack.getExploitedVulnerabilities().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfAttack.getExploitedVulnerabilities().add(transformVulnerability(tVulnerability));
			}
		}
		if(tAttack.isSetViolations()){
			for(TDDISecurityViolation tSecurityViolation : tAttack.getViolations().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfAttack.getViolations().add(FailureLogicEMFTranslater.transformSecurityViolation(tSecurityViolation));
			}
		}
	}
	

	private static SecurityRisk transformSecurityRisk(TDDISecurityRisk tSecurityRisk) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tSecurityRisk)){
			return (SecurityRisk) BaseEMFTranslater.thrift2EmfMap.get(tSecurityRisk);
		}
		
		SecurityRisk emfSecurityRisk = EMFFactory.dependabilityFactory.createSecurityRisk();
		BaseEMFTranslater.thrift2EmfMap.put(tSecurityRisk, emfSecurityRisk);
		BaseEMFTranslater.transformBaseElementContents(TSecurityRisk.wrap(tSecurityRisk), emfSecurityRisk);
		
		if(tSecurityRisk.isSetLikelihood()){
			emfSecurityRisk.setLikelihood(tSecurityRisk.getLikelihood());
		}
		if(tSecurityRisk.isSetImpactAsset()){
			emfSecurityRisk.setImpactAsset(tSecurityRisk.getImpactAsset());
		}
		if(tSecurityRisk.isSetImpactIndividuals()){
			emfSecurityRisk.setImpactIndividuals(tSecurityRisk.getImpactIndividuals());
		}
		if(tSecurityRisk.isSetImpactBusiness()){
			emfSecurityRisk.setImpactBusiness(tSecurityRisk.getImpactBusiness());
		}
		if(tSecurityRisk.isSetAttackerGoals()){
			for(TDDIAttackerGoal tAttackerGoal : tSecurityRisk.getAttackerGoals().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfSecurityRisk.getAttackerGoals().add(transformAttackerGoal(tAttackerGoal));
			}
		}
		return emfSecurityRisk;
	}
		
	private static FinancialCostType transformFinancialCostType(TDDIFinancialCostType tFinancialCostType){
		switch(tFinancialCostType){
		case FCTEUR:
			return FinancialCostType.EUR;
		case FCTGBP:
			return FinancialCostType.GBP;
		case FCTUSD:
			return FinancialCostType.USD;
		default:
			return FinancialCostType.USD;
		}
	}
	
	private static SecurityApplicationType transformSecurityApplicationType(TDDISecurityApplicationType tSecurityApplicationType){
		switch(tSecurityApplicationType){
		case SATActive:
			return SecurityApplicationType.ACTIVE;
		case SATPassive:
			return SecurityApplicationType.PASSIVE;
		case SATPreventive:
			return SecurityApplicationType.PREVENTIVE;
		default:
			return SecurityApplicationType.ACTIVE;
		}
	}
}
