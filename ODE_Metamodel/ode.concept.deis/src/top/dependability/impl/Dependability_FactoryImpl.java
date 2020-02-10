/**
 */
package top.dependability.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import top.dependability.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dependability_FactoryImpl extends EFactoryImpl implements Dependability_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Dependability_Factory init() {
		try {
			Dependability_Factory theDependability_Factory = (Dependability_Factory)EPackage.Registry.INSTANCE.getEFactory(Dependability_Package.eNS_URI);
			if (theDependability_Factory != null) {
				return theDependability_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Dependability_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependability_FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Dependability_Package.MAINTENANCE_PROCEDURE: return createMaintenanceProcedure();
			case Dependability_Package.MEASURE_TYPE: return createMeasureType();
			case Dependability_Package.MEASURE: return createMeasure();
			case Dependability_Package.FAULT_TOLERANCE_MEASURE: return createFaultToleranceMeasure();
			case Dependability_Package.DEPENDABILITY_PACKAGE: return createDependabilityPackage();
			case Dependability_Package.HARA_PACKAGE: return createHARAPackage();
			case Dependability_Package.HAZARD: return createHazard();
			case Dependability_Package.HAZARD_TYPE_SYSTEM: return createHazardTypeSystem();
			case Dependability_Package.HAZARD_TYPE: return createHazardType();
			case Dependability_Package.MALFUNCTION: return createMalfunction();
			case Dependability_Package.RISK_ASSESSMENT: return createRiskAssessment();
			case Dependability_Package.RISK_PARAMETER: return createRiskParameter();
			case Dependability_Package.SITUATION: return createSituation();
			case Dependability_Package.ACCIDENT: return createAccident();
			case Dependability_Package.OPERATOR_MEASURE: return createOperatorMeasure();
			case Dependability_Package.REQUIREMENT_PACKAGE: return createRequirementPackage();
			case Dependability_Package.LEGAL_CONTRACT: return createLegalContract();
			case Dependability_Package.SAFETY_REQUIREMENT: return createSafetyRequirement();
			case Dependability_Package.SECURITY_REQUIREMENT: return createSecurityRequirement();
			case Dependability_Package.DOMAIN_PACKAGE: return createDomainPackage();
			case Dependability_Package.STANDARD: return createStandard();
			case Dependability_Package.ASSURANCE_LEVEL: return createAssuranceLevel();
			case Dependability_Package.SAFETY_STANDARD: return createSafetyStandard();
			case Dependability_Package.TARA_PACKAGE: return createTARAPackage();
			case Dependability_Package.ASSET: return createAsset();
			case Dependability_Package.SECURITY_CONTROL: return createSecurityControl();
			case Dependability_Package.SECURITY_CAPABILITY: return createSecurityCapability();
			case Dependability_Package.VULNERABILITY: return createVulnerability();
			case Dependability_Package.VULNERABLE_ITEM: return createVulnerableItem();
			case Dependability_Package.ATTACKER_GOAL: return createAttackerGoal();
			case Dependability_Package.SECURITY_RISK: return createSecurityRisk();
			case Dependability_Package.ATTACK: return createAttack();
			case Dependability_Package.PAYLOAD: return createPayload();
			case Dependability_Package.ACTION: return createAction();
			case Dependability_Package.THREAT_AGENT: return createThreatAgent();
			case Dependability_Package.HUMAN: return createHuman();
			case Dependability_Package.NON_HUMAN: return createNonHuman();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Dependability_Package.SECURITY_APPLICATION_TYPE:
				return createSecurityApplicationTypeFromString(eDataType, initialValue);
			case Dependability_Package.FINANCIAL_COST_TYPE:
				return createFinancialCostTypeFromString(eDataType, initialValue);
			case Dependability_Package.OPERATIONAL_COST_TYPE:
				return createOperationalCostTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Dependability_Package.SECURITY_APPLICATION_TYPE:
				return convertSecurityApplicationTypeToString(eDataType, instanceValue);
			case Dependability_Package.FINANCIAL_COST_TYPE:
				return convertFinancialCostTypeToString(eDataType, instanceValue);
			case Dependability_Package.OPERATIONAL_COST_TYPE:
				return convertOperationalCostTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceProcedure createMaintenanceProcedure() {
		MaintenanceProcedureImpl maintenanceProcedure = new MaintenanceProcedureImpl();
		return maintenanceProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType createMeasureType() {
		MeasureTypeImpl measureType = new MeasureTypeImpl();
		return measureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultToleranceMeasure createFaultToleranceMeasure() {
		FaultToleranceMeasureImpl faultToleranceMeasure = new FaultToleranceMeasureImpl();
		return faultToleranceMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependabilityPackage createDependabilityPackage() {
		DependabilityPackageImpl dependabilityPackage = new DependabilityPackageImpl();
		return dependabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HARAPackage createHARAPackage() {
		HARAPackageImpl haraPackage = new HARAPackageImpl();
		return haraPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hazard createHazard() {
		HazardImpl hazard = new HazardImpl();
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardTypeSystem createHazardTypeSystem() {
		HazardTypeSystemImpl hazardTypeSystem = new HazardTypeSystemImpl();
		return hazardTypeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardType createHazardType() {
		HazardTypeImpl hazardType = new HazardTypeImpl();
		return hazardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Malfunction createMalfunction() {
		MalfunctionImpl malfunction = new MalfunctionImpl();
		return malfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessment createRiskAssessment() {
		RiskAssessmentImpl riskAssessment = new RiskAssessmentImpl();
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskParameter createRiskParameter() {
		RiskParameterImpl riskParameter = new RiskParameterImpl();
		return riskParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Situation createSituation() {
		SituationImpl situation = new SituationImpl();
		return situation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accident createAccident() {
		AccidentImpl accident = new AccidentImpl();
		return accident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorMeasure createOperatorMeasure() {
		OperatorMeasureImpl operatorMeasure = new OperatorMeasureImpl();
		return operatorMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementPackage createRequirementPackage() {
		RequirementPackageImpl requirementPackage = new RequirementPackageImpl();
		return requirementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalContract createLegalContract() {
		LegalContractImpl legalContract = new LegalContractImpl();
		return legalContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyRequirement createSafetyRequirement() {
		SafetyRequirementImpl safetyRequirement = new SafetyRequirementImpl();
		return safetyRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRequirement createSecurityRequirement() {
		SecurityRequirementImpl securityRequirement = new SecurityRequirementImpl();
		return securityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainPackage createDomainPackage() {
		DomainPackageImpl domainPackage = new DomainPackageImpl();
		return domainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Standard createStandard() {
		StandardImpl standard = new StandardImpl();
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceLevel createAssuranceLevel() {
		AssuranceLevelImpl assuranceLevel = new AssuranceLevelImpl();
		return assuranceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyStandard createSafetyStandard() {
		SafetyStandardImpl safetyStandard = new SafetyStandardImpl();
		return safetyStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TARAPackage createTARAPackage() {
		TARAPackageImpl taraPackage = new TARAPackageImpl();
		return taraPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityControl createSecurityControl() {
		SecurityControlImpl securityControl = new SecurityControlImpl();
		return securityControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityCapability createSecurityCapability() {
		SecurityCapabilityImpl securityCapability = new SecurityCapabilityImpl();
		return securityCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vulnerability createVulnerability() {
		VulnerabilityImpl vulnerability = new VulnerabilityImpl();
		return vulnerability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VulnerableItem createVulnerableItem() {
		VulnerableItemImpl vulnerableItem = new VulnerableItemImpl();
		return vulnerableItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerGoal createAttackerGoal() {
		AttackerGoalImpl attackerGoal = new AttackerGoalImpl();
		return attackerGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRisk createSecurityRisk() {
		SecurityRiskImpl securityRisk = new SecurityRiskImpl();
		return securityRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attack createAttack() {
		AttackImpl attack = new AttackImpl();
		return attack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payload createPayload() {
		PayloadImpl payload = new PayloadImpl();
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatAgent createThreatAgent() {
		ThreatAgentImpl threatAgent = new ThreatAgentImpl();
		return threatAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Human createHuman() {
		HumanImpl human = new HumanImpl();
		return human;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonHuman createNonHuman() {
		NonHumanImpl nonHuman = new NonHumanImpl();
		return nonHuman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityApplicationType createSecurityApplicationTypeFromString(EDataType eDataType, String initialValue) {
		SecurityApplicationType result = SecurityApplicationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityApplicationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialCostType createFinancialCostTypeFromString(EDataType eDataType, String initialValue) {
		FinancialCostType result = FinancialCostType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFinancialCostTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCostType createOperationalCostTypeFromString(EDataType eDataType, String initialValue) {
		OperationalCostType result = OperationalCostType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationalCostTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependability_Package getDependability_Package() {
		return (Dependability_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Dependability_Package getPackage() {
		return Dependability_Package.eINSTANCE;
	}

} //Dependability_FactoryImpl
