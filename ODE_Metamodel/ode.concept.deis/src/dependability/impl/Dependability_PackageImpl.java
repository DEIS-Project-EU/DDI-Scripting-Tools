/**
 */
package dependability.impl;

import dependability.Accident;
import dependability.Action;
import dependability.Asset;
import dependability.AssuranceLevel;
import dependability.Attack;
import dependability.AttackerGoal;
import dependability.DependabilityPackage;
import dependability.DependabilityRequirement;
import dependability.Dependability_Factory;
import dependability.Dependability_Package;
import dependability.DomainPackage;
import dependability.FaultToleranceMeasure;
import dependability.FinancialCostType;
import dependability.HARAPackage;
import dependability.Hazard;
import dependability.HazardType;
import dependability.HazardTypeSystem;
import dependability.Human;
import dependability.LegalContract;
import dependability.MaintenanceProcedure;
import dependability.Malfunction;
import dependability.Measure;
import dependability.MeasureType;
import dependability.NonHuman;
import dependability.OperationalCostType;
import dependability.OperatorMeasure;
import dependability.Payload;
import dependability.RequirementPackage;
import dependability.RequirementSource;
import dependability.RiskAssessment;
import dependability.RiskParameter;
import dependability.SafetyRequirement;
import dependability.SafetyStandard;
import dependability.SecurityApplicationType;
import dependability.SecurityCapability;
import dependability.SecurityControl;
import dependability.SecurityRequirement;
import dependability.SecurityRisk;
import dependability.Situation;
import dependability.Standard;
import dependability.TARAPackage;
import dependability.ThreatAgent;
import dependability.Vulnerability;
import dependability.VulnerableItem;

import failureLogic.FailureLogic_Package;

import integration.Integration_Package;

import odeBase.OdeBasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dependability_PackageImpl extends EPackageImpl implements Dependability_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintenanceProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultToleranceMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependabilityPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass haraPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardTypeSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass malfunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass situationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accidentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legalContractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependabilityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assuranceLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyStandardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taraPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vulnerabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vulnerableItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackerGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityRiskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonHumanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securityApplicationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum financialCostTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationalCostTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dependability.Dependability_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Dependability_PackageImpl() {
		super(eNS_URI, Dependability_Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Dependability_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Dependability_Package init() {
		if (isInited) return (Dependability_Package)EPackage.Registry.INSTANCE.getEPackage(Dependability_Package.eNS_URI);

		// Obtain or create and register package
		Dependability_PackageImpl theDependability_Package = (Dependability_PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Dependability_PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Dependability_PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FailureLogic_Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theDependability_Package.createPackageContents();

		// Initialize created meta-data
		theDependability_Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDependability_Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Dependability_Package.eNS_URI, theDependability_Package);
		return theDependability_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaintenanceProcedure() {
		return maintenanceProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenanceProcedure_ActivityDescription() {
		return (EAttribute)maintenanceProcedureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenanceProcedure_TechnicalDescription() {
		return (EAttribute)maintenanceProcedureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenanceProcedure_ToolSpecification() {
		return (EAttribute)maintenanceProcedureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenanceProcedure_StaffNumber() {
		return (EAttribute)maintenanceProcedureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenanceProcedure_StaffSkillLevel() {
		return (EAttribute)maintenanceProcedureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenanceProcedure_StaffTrainingDescription() {
		return (EAttribute)maintenanceProcedureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureType() {
		return measureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasure() {
		return measureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_IntrinsicSafety() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_SafeGuard() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_ApplierInformation() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_RiskAcceptability() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_FurtherAction() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_Source() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_MeasureType() {
		return (EReference)measureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_AssuranceLevel() {
		return (EReference)measureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaultToleranceMeasure() {
		return faultToleranceMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependabilityPackage() {
		return dependabilityPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependabilityPackage_Measures() {
		return (EReference)dependabilityPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependabilityPackage_MeasureTypes() {
		return (EReference)dependabilityPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependabilityPackage_MaintenanceProcedures() {
		return (EReference)dependabilityPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependabilityPackage_HARAPackages() {
		return (EReference)dependabilityPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependabilityPackage_RequirementPackages() {
		return (EReference)dependabilityPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependabilityPackage_DomainPackages() {
		return (EReference)dependabilityPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependabilityPackage_TARAPackages() {
		return (EReference)dependabilityPackageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHARAPackage() {
		return haraPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHARAPackage_Hazards() {
		return (EReference)haraPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHARAPackage_HazardTypes() {
		return (EReference)haraPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHARAPackage_HazardTypeSystems() {
		return (EReference)haraPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHARAPackage_Malfunctions() {
		return (EReference)haraPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHARAPackage_RiskAssessments() {
		return (EReference)haraPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHARAPackage_RiskParameters() {
		return (EReference)haraPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHazard() {
		return hazardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazard_Condition() {
		return (EAttribute)hazardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazard_Failures() {
		return (EReference)hazardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazard_Measures() {
		return (EReference)hazardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazard_HazardType() {
		return (EReference)hazardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHazardTypeSystem() {
		return hazardTypeSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardTypeSystem_HazardTypes() {
		return (EReference)hazardTypeSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHazardType() {
		return hazardTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMalfunction() {
		return malfunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMalfunction_Hazards() {
		return (EReference)malfunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRiskAssessment() {
		return riskAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRiskAssessment_RelatedStandard() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_RiskParameters() {
		return (EReference)riskAssessmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Hazard() {
		return (EReference)riskAssessmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRiskParameter() {
		return riskParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRiskParameter_Argument() {
		return (EAttribute)riskParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSituation() {
		return situationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSituation_Likelihood() {
		return (EAttribute)situationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccident() {
		return accidentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccident_Severity() {
		return (EAttribute)accidentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorMeasure() {
		return operatorMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatorMeasure_Controlability() {
		return (EAttribute)operatorMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementPackage() {
		return requirementPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementPackage_RequirementSources() {
		return (EReference)requirementPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementPackage_DependabilityRequirements() {
		return (EReference)requirementPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementSource() {
		return requirementSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegalContract() {
		return legalContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependabilityRequirement() {
		return dependabilityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependabilityRequirement_DecompositionArgument() {
		return (EAttribute)dependabilityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependabilityRequirement_RefinedRequirements() {
		return (EReference)dependabilityRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependabilityRequirement_RequirementSource() {
		return (EReference)dependabilityRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependabilityRequirement_Measures() {
		return (EReference)dependabilityRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependabilityRequirement_Failures() {
		return (EReference)dependabilityRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependabilityRequirement_AssuranceLevel() {
		return (EReference)dependabilityRequirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependabilityRequirement_MaintenanceProcedures() {
		return (EReference)dependabilityRequirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSafetyRequirement() {
		return safetyRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSafetyRequirement_FailureReactionTime() {
		return (EAttribute)safetyRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSafetyRequirement_FailureDetectionTime() {
		return (EAttribute)safetyRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSafetyRequirement_FailureLatencyTime() {
		return (EAttribute)safetyRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSafetyRequirement_IsSafetyGoal() {
		return (EAttribute)safetyRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSafetyRequirement_Hazards() {
		return (EReference)safetyRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRequirement() {
		return securityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRequirement_SecurityCapabilities() {
		return (EReference)securityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainPackage() {
		return domainPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainPackage_Standards() {
		return (EReference)domainPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainPackage_AssuranceLevels() {
		return (EReference)domainPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandard() {
		return standardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssuranceLevel() {
		return assuranceLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSafetyStandard() {
		return safetyStandardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSafetyStandard_AssuranceLevels() {
		return (EReference)safetyStandardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTARAPackage() {
		return taraPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTARAPackage_IdentifiedRisks() {
		return (EReference)taraPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTARAPackage_Controls() {
		return (EReference)taraPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTARAPackage_ConsideredAssets() {
		return (EReference)taraPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTARAPackage_ConsideredThreatAgents() {
		return (EReference)taraPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_FinancialValue() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_FinancialCostType() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_OperationalCost() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_OperationalCostType() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityControl() {
		return securityControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityControl_Category() {
		return (EAttribute)securityControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityControl_Type() {
		return (EAttribute)securityControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityControl_Vulnerabilities() {
		return (EReference)securityControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityCapability() {
		return securityCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityCapability_Category() {
		return (EAttribute)securityCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityCapability_Type() {
		return (EAttribute)securityCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityCapability_ImplementedBy() {
		return (EReference)securityCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVulnerability() {
		return vulnerabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVulnerability_Category() {
		return (EAttribute)vulnerabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVulnerableItem() {
		return vulnerableItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVulnerableItem_Vulnerabilities() {
		return (EReference)vulnerableItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttackerGoal() {
		return attackerGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackerGoal_Category() {
		return (EAttribute)attackerGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttackerGoal_AddressedBy() {
		return (EReference)attackerGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttackerGoal_Attacks() {
		return (EReference)attackerGoalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttackerGoal_AttackedItems() {
		return (EReference)attackerGoalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRisk() {
		return securityRiskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRisk_Likelihood() {
		return (EAttribute)securityRiskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRisk_ImpactAsset() {
		return (EAttribute)securityRiskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRisk_ImpactIndividuals() {
		return (EAttribute)securityRiskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRisk_ImpactBusiness() {
		return (EAttribute)securityRiskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRisk_AttackerGoals() {
		return (EReference)securityRiskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttack() {
		return attackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttack_Category() {
		return (EAttribute)attackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttack_FinancialCost() {
		return (EAttribute)attackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttack_FinancialCostType() {
		return (EAttribute)attackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttack_TimeRequired() {
		return (EAttribute)attackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttack_TimeUnit() {
		return (EAttribute)attackEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttack_Difficulty() {
		return (EAttribute)attackEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttack_Detectability() {
		return (EAttribute)attackEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttack_Violations() {
		return (EReference)attackEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttack_ExploitedVulnerabilities() {
		return (EReference)attackEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayload() {
		return payloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreatAgent() {
		return threatAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreatAgent_SkillLevel() {
		return (EAttribute)threatAgentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreatAgent_Motivation() {
		return (EAttribute)threatAgentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreatAgent_AnonymityDesire() {
		return (EAttribute)threatAgentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreatAgent_AttackerGoals() {
		return (EReference)threatAgentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHuman() {
		return humanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHuman_Actions() {
		return (EReference)humanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonHuman() {
		return nonHumanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonHuman_Payloads() {
		return (EReference)nonHumanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecurityApplicationType() {
		return securityApplicationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFinancialCostType() {
		return financialCostTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationalCostType() {
		return operationalCostTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependability_Factory getDependability_Factory() {
		return (Dependability_Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		maintenanceProcedureEClass = createEClass(MAINTENANCE_PROCEDURE);
		createEAttribute(maintenanceProcedureEClass, MAINTENANCE_PROCEDURE__ACTIVITY_DESCRIPTION);
		createEAttribute(maintenanceProcedureEClass, MAINTENANCE_PROCEDURE__TECHNICAL_DESCRIPTION);
		createEAttribute(maintenanceProcedureEClass, MAINTENANCE_PROCEDURE__TOOL_SPECIFICATION);
		createEAttribute(maintenanceProcedureEClass, MAINTENANCE_PROCEDURE__STAFF_NUMBER);
		createEAttribute(maintenanceProcedureEClass, MAINTENANCE_PROCEDURE__STAFF_SKILL_LEVEL);
		createEAttribute(maintenanceProcedureEClass, MAINTENANCE_PROCEDURE__STAFF_TRAINING_DESCRIPTION);

		measureTypeEClass = createEClass(MEASURE_TYPE);

		measureEClass = createEClass(MEASURE);
		createEAttribute(measureEClass, MEASURE__INTRINSIC_SAFETY);
		createEAttribute(measureEClass, MEASURE__SAFE_GUARD);
		createEAttribute(measureEClass, MEASURE__APPLIER_INFORMATION);
		createEAttribute(measureEClass, MEASURE__RISK_ACCEPTABILITY);
		createEAttribute(measureEClass, MEASURE__FURTHER_ACTION);
		createEAttribute(measureEClass, MEASURE__SOURCE);
		createEReference(measureEClass, MEASURE__MEASURE_TYPE);
		createEReference(measureEClass, MEASURE__ASSURANCE_LEVEL);

		faultToleranceMeasureEClass = createEClass(FAULT_TOLERANCE_MEASURE);

		dependabilityPackageEClass = createEClass(DEPENDABILITY_PACKAGE);
		createEReference(dependabilityPackageEClass, DEPENDABILITY_PACKAGE__MEASURES);
		createEReference(dependabilityPackageEClass, DEPENDABILITY_PACKAGE__MEASURE_TYPES);
		createEReference(dependabilityPackageEClass, DEPENDABILITY_PACKAGE__MAINTENANCE_PROCEDURES);
		createEReference(dependabilityPackageEClass, DEPENDABILITY_PACKAGE__HARA_PACKAGES);
		createEReference(dependabilityPackageEClass, DEPENDABILITY_PACKAGE__REQUIREMENT_PACKAGES);
		createEReference(dependabilityPackageEClass, DEPENDABILITY_PACKAGE__DOMAIN_PACKAGES);
		createEReference(dependabilityPackageEClass, DEPENDABILITY_PACKAGE__TARA_PACKAGES);

		haraPackageEClass = createEClass(HARA_PACKAGE);
		createEReference(haraPackageEClass, HARA_PACKAGE__HAZARDS);
		createEReference(haraPackageEClass, HARA_PACKAGE__HAZARD_TYPES);
		createEReference(haraPackageEClass, HARA_PACKAGE__HAZARD_TYPE_SYSTEMS);
		createEReference(haraPackageEClass, HARA_PACKAGE__MALFUNCTIONS);
		createEReference(haraPackageEClass, HARA_PACKAGE__RISK_ASSESSMENTS);
		createEReference(haraPackageEClass, HARA_PACKAGE__RISK_PARAMETERS);

		hazardEClass = createEClass(HAZARD);
		createEAttribute(hazardEClass, HAZARD__CONDITION);
		createEReference(hazardEClass, HAZARD__FAILURES);
		createEReference(hazardEClass, HAZARD__MEASURES);
		createEReference(hazardEClass, HAZARD__HAZARD_TYPE);

		hazardTypeSystemEClass = createEClass(HAZARD_TYPE_SYSTEM);
		createEReference(hazardTypeSystemEClass, HAZARD_TYPE_SYSTEM__HAZARD_TYPES);

		hazardTypeEClass = createEClass(HAZARD_TYPE);

		malfunctionEClass = createEClass(MALFUNCTION);
		createEReference(malfunctionEClass, MALFUNCTION__HAZARDS);

		riskAssessmentEClass = createEClass(RISK_ASSESSMENT);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__RELATED_STANDARD);
		createEReference(riskAssessmentEClass, RISK_ASSESSMENT__RISK_PARAMETERS);
		createEReference(riskAssessmentEClass, RISK_ASSESSMENT__HAZARD);

		riskParameterEClass = createEClass(RISK_PARAMETER);
		createEAttribute(riskParameterEClass, RISK_PARAMETER__ARGUMENT);

		situationEClass = createEClass(SITUATION);
		createEAttribute(situationEClass, SITUATION__LIKELIHOOD);

		accidentEClass = createEClass(ACCIDENT);
		createEAttribute(accidentEClass, ACCIDENT__SEVERITY);

		operatorMeasureEClass = createEClass(OPERATOR_MEASURE);
		createEAttribute(operatorMeasureEClass, OPERATOR_MEASURE__CONTROLABILITY);

		requirementPackageEClass = createEClass(REQUIREMENT_PACKAGE);
		createEReference(requirementPackageEClass, REQUIREMENT_PACKAGE__REQUIREMENT_SOURCES);
		createEReference(requirementPackageEClass, REQUIREMENT_PACKAGE__DEPENDABILITY_REQUIREMENTS);

		requirementSourceEClass = createEClass(REQUIREMENT_SOURCE);

		legalContractEClass = createEClass(LEGAL_CONTRACT);

		dependabilityRequirementEClass = createEClass(DEPENDABILITY_REQUIREMENT);
		createEAttribute(dependabilityRequirementEClass, DEPENDABILITY_REQUIREMENT__DECOMPOSITION_ARGUMENT);
		createEReference(dependabilityRequirementEClass, DEPENDABILITY_REQUIREMENT__REFINED_REQUIREMENTS);
		createEReference(dependabilityRequirementEClass, DEPENDABILITY_REQUIREMENT__REQUIREMENT_SOURCE);
		createEReference(dependabilityRequirementEClass, DEPENDABILITY_REQUIREMENT__MEASURES);
		createEReference(dependabilityRequirementEClass, DEPENDABILITY_REQUIREMENT__FAILURES);
		createEReference(dependabilityRequirementEClass, DEPENDABILITY_REQUIREMENT__ASSURANCE_LEVEL);
		createEReference(dependabilityRequirementEClass, DEPENDABILITY_REQUIREMENT__MAINTENANCE_PROCEDURES);

		safetyRequirementEClass = createEClass(SAFETY_REQUIREMENT);
		createEAttribute(safetyRequirementEClass, SAFETY_REQUIREMENT__FAILURE_REACTION_TIME);
		createEAttribute(safetyRequirementEClass, SAFETY_REQUIREMENT__FAILURE_DETECTION_TIME);
		createEAttribute(safetyRequirementEClass, SAFETY_REQUIREMENT__FAILURE_LATENCY_TIME);
		createEAttribute(safetyRequirementEClass, SAFETY_REQUIREMENT__IS_SAFETY_GOAL);
		createEReference(safetyRequirementEClass, SAFETY_REQUIREMENT__HAZARDS);

		securityRequirementEClass = createEClass(SECURITY_REQUIREMENT);
		createEReference(securityRequirementEClass, SECURITY_REQUIREMENT__SECURITY_CAPABILITIES);

		domainPackageEClass = createEClass(DOMAIN_PACKAGE);
		createEReference(domainPackageEClass, DOMAIN_PACKAGE__STANDARDS);
		createEReference(domainPackageEClass, DOMAIN_PACKAGE__ASSURANCE_LEVELS);

		standardEClass = createEClass(STANDARD);

		assuranceLevelEClass = createEClass(ASSURANCE_LEVEL);

		safetyStandardEClass = createEClass(SAFETY_STANDARD);
		createEReference(safetyStandardEClass, SAFETY_STANDARD__ASSURANCE_LEVELS);

		taraPackageEClass = createEClass(TARA_PACKAGE);
		createEReference(taraPackageEClass, TARA_PACKAGE__IDENTIFIED_RISKS);
		createEReference(taraPackageEClass, TARA_PACKAGE__CONTROLS);
		createEReference(taraPackageEClass, TARA_PACKAGE__CONSIDERED_ASSETS);
		createEReference(taraPackageEClass, TARA_PACKAGE__CONSIDERED_THREAT_AGENTS);

		assetEClass = createEClass(ASSET);
		createEAttribute(assetEClass, ASSET__FINANCIAL_VALUE);
		createEAttribute(assetEClass, ASSET__FINANCIAL_COST_TYPE);
		createEAttribute(assetEClass, ASSET__OPERATIONAL_COST);
		createEAttribute(assetEClass, ASSET__OPERATIONAL_COST_TYPE);

		securityControlEClass = createEClass(SECURITY_CONTROL);
		createEAttribute(securityControlEClass, SECURITY_CONTROL__CATEGORY);
		createEAttribute(securityControlEClass, SECURITY_CONTROL__TYPE);
		createEReference(securityControlEClass, SECURITY_CONTROL__VULNERABILITIES);

		securityCapabilityEClass = createEClass(SECURITY_CAPABILITY);
		createEAttribute(securityCapabilityEClass, SECURITY_CAPABILITY__CATEGORY);
		createEAttribute(securityCapabilityEClass, SECURITY_CAPABILITY__TYPE);
		createEReference(securityCapabilityEClass, SECURITY_CAPABILITY__IMPLEMENTED_BY);

		vulnerabilityEClass = createEClass(VULNERABILITY);
		createEAttribute(vulnerabilityEClass, VULNERABILITY__CATEGORY);

		vulnerableItemEClass = createEClass(VULNERABLE_ITEM);
		createEReference(vulnerableItemEClass, VULNERABLE_ITEM__VULNERABILITIES);

		attackerGoalEClass = createEClass(ATTACKER_GOAL);
		createEAttribute(attackerGoalEClass, ATTACKER_GOAL__CATEGORY);
		createEReference(attackerGoalEClass, ATTACKER_GOAL__ADDRESSED_BY);
		createEReference(attackerGoalEClass, ATTACKER_GOAL__ATTACKS);
		createEReference(attackerGoalEClass, ATTACKER_GOAL__ATTACKED_ITEMS);

		securityRiskEClass = createEClass(SECURITY_RISK);
		createEAttribute(securityRiskEClass, SECURITY_RISK__LIKELIHOOD);
		createEAttribute(securityRiskEClass, SECURITY_RISK__IMPACT_ASSET);
		createEAttribute(securityRiskEClass, SECURITY_RISK__IMPACT_INDIVIDUALS);
		createEAttribute(securityRiskEClass, SECURITY_RISK__IMPACT_BUSINESS);
		createEReference(securityRiskEClass, SECURITY_RISK__ATTACKER_GOALS);

		attackEClass = createEClass(ATTACK);
		createEAttribute(attackEClass, ATTACK__CATEGORY);
		createEAttribute(attackEClass, ATTACK__FINANCIAL_COST);
		createEAttribute(attackEClass, ATTACK__FINANCIAL_COST_TYPE);
		createEAttribute(attackEClass, ATTACK__TIME_REQUIRED);
		createEAttribute(attackEClass, ATTACK__TIME_UNIT);
		createEAttribute(attackEClass, ATTACK__DIFFICULTY);
		createEAttribute(attackEClass, ATTACK__DETECTABILITY);
		createEReference(attackEClass, ATTACK__VIOLATIONS);
		createEReference(attackEClass, ATTACK__EXPLOITED_VULNERABILITIES);

		payloadEClass = createEClass(PAYLOAD);

		actionEClass = createEClass(ACTION);

		threatAgentEClass = createEClass(THREAT_AGENT);
		createEAttribute(threatAgentEClass, THREAT_AGENT__SKILL_LEVEL);
		createEAttribute(threatAgentEClass, THREAT_AGENT__MOTIVATION);
		createEAttribute(threatAgentEClass, THREAT_AGENT__ANONYMITY_DESIRE);
		createEReference(threatAgentEClass, THREAT_AGENT__ATTACKER_GOALS);

		humanEClass = createEClass(HUMAN);
		createEReference(humanEClass, HUMAN__ACTIONS);

		nonHumanEClass = createEClass(NON_HUMAN);
		createEReference(nonHumanEClass, NON_HUMAN__PAYLOADS);

		// Create enums
		securityApplicationTypeEEnum = createEEnum(SECURITY_APPLICATION_TYPE);
		financialCostTypeEEnum = createEEnum(FINANCIAL_COST_TYPE);
		operationalCostTypeEEnum = createEEnum(OPERATIONAL_COST_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OdeBasePackage theOdeBasePackage = (OdeBasePackage)EPackage.Registry.INSTANCE.getEPackage(OdeBasePackage.eNS_URI);
		Integration_Package theIntegration_Package = (Integration_Package)EPackage.Registry.INSTANCE.getEPackage(Integration_Package.eNS_URI);
		FailureLogic_Package theFailureLogic_Package = (FailureLogic_Package)EPackage.Registry.INSTANCE.getEPackage(FailureLogic_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		maintenanceProcedureEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		measureTypeEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		measureEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		faultToleranceMeasureEClass.getESuperTypes().add(this.getMeasure());
		dependabilityPackageEClass.getESuperTypes().add(theIntegration_Package.getODEProductPackage());
		haraPackageEClass.getESuperTypes().add(theIntegration_Package.getODEProductPackage());
		hazardEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		hazardTypeSystemEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		hazardTypeEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		malfunctionEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		riskAssessmentEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		riskParameterEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		situationEClass.getESuperTypes().add(this.getRiskParameter());
		accidentEClass.getESuperTypes().add(this.getRiskParameter());
		operatorMeasureEClass.getESuperTypes().add(this.getRiskParameter());
		requirementPackageEClass.getESuperTypes().add(theIntegration_Package.getODEProductPackage());
		requirementSourceEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		legalContractEClass.getESuperTypes().add(this.getRequirementSource());
		dependabilityRequirementEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		safetyRequirementEClass.getESuperTypes().add(this.getDependabilityRequirement());
		securityRequirementEClass.getESuperTypes().add(this.getDependabilityRequirement());
		domainPackageEClass.getESuperTypes().add(theIntegration_Package.getODEProductPackage());
		standardEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		assuranceLevelEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		safetyStandardEClass.getESuperTypes().add(this.getStandard());
		taraPackageEClass.getESuperTypes().add(theIntegration_Package.getODEProductPackage());
		assetEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		securityControlEClass.getESuperTypes().add(this.getMeasure());
		securityCapabilityEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		vulnerabilityEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		vulnerableItemEClass.getESuperTypes().add(this.getAsset());
		attackerGoalEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		securityRiskEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		attackEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		payloadEClass.getESuperTypes().add(this.getAttack());
		actionEClass.getESuperTypes().add(this.getAttack());
		threatAgentEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		humanEClass.getESuperTypes().add(this.getThreatAgent());
		nonHumanEClass.getESuperTypes().add(this.getThreatAgent());

		// Initialize classes, features, and operations; add parameters
		initEClass(maintenanceProcedureEClass, MaintenanceProcedure.class, "MaintenanceProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaintenanceProcedure_ActivityDescription(), ecorePackage.getEString(), "activityDescription", null, 0, 1, MaintenanceProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintenanceProcedure_TechnicalDescription(), ecorePackage.getEString(), "technicalDescription", null, 0, 1, MaintenanceProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintenanceProcedure_ToolSpecification(), ecorePackage.getEString(), "toolSpecification", null, 0, 1, MaintenanceProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintenanceProcedure_StaffNumber(), ecorePackage.getEInt(), "staffNumber", null, 0, 1, MaintenanceProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintenanceProcedure_StaffSkillLevel(), ecorePackage.getEString(), "staffSkillLevel", null, 0, 1, MaintenanceProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintenanceProcedure_StaffTrainingDescription(), ecorePackage.getEString(), "staffTrainingDescription", null, 0, 1, MaintenanceProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureTypeEClass, MeasureType.class, "MeasureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measureEClass, Measure.class, "Measure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasure_IntrinsicSafety(), ecorePackage.getEString(), "intrinsicSafety", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_SafeGuard(), ecorePackage.getEString(), "safeGuard", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_ApplierInformation(), ecorePackage.getEString(), "applierInformation", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_RiskAcceptability(), ecorePackage.getEBoolean(), "riskAcceptability", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_FurtherAction(), ecorePackage.getEString(), "furtherAction", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_Source(), ecorePackage.getEString(), "source", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_MeasureType(), this.getMeasureType(), null, "measureType", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_AssuranceLevel(), this.getAssuranceLevel(), null, "assuranceLevel", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(faultToleranceMeasureEClass, FaultToleranceMeasure.class, "FaultToleranceMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependabilityPackageEClass, DependabilityPackage.class, "DependabilityPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependabilityPackage_Measures(), this.getMeasure(), null, "measures", null, 0, -1, DependabilityPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependabilityPackage_MeasureTypes(), this.getMeasureType(), null, "measureTypes", null, 0, -1, DependabilityPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependabilityPackage_MaintenanceProcedures(), this.getMaintenanceProcedure(), null, "maintenanceProcedures", null, 0, -1, DependabilityPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependabilityPackage_HARAPackages(), this.getHARAPackage(), null, "HARAPackages", null, 0, -1, DependabilityPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependabilityPackage_RequirementPackages(), this.getRequirementPackage(), null, "requirementPackages", null, 0, -1, DependabilityPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependabilityPackage_DomainPackages(), this.getDomainPackage(), null, "domainPackages", null, 0, -1, DependabilityPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependabilityPackage_TARAPackages(), this.getTARAPackage(), null, "TARAPackages", null, 0, -1, DependabilityPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(haraPackageEClass, HARAPackage.class, "HARAPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHARAPackage_Hazards(), this.getHazard(), null, "hazards", null, 0, -1, HARAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHARAPackage_HazardTypes(), this.getHazardType(), null, "hazardTypes", null, 0, -1, HARAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHARAPackage_HazardTypeSystems(), this.getHazardTypeSystem(), null, "hazardTypeSystems", null, 0, -1, HARAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHARAPackage_Malfunctions(), this.getMalfunction(), null, "malfunctions", null, 0, -1, HARAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHARAPackage_RiskAssessments(), this.getRiskAssessment(), null, "riskAssessments", null, 0, -1, HARAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHARAPackage_RiskParameters(), this.getRiskParameter(), null, "riskParameters", null, 0, -1, HARAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hazardEClass, Hazard.class, "Hazard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHazard_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Hazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazard_Failures(), theFailureLogic_Package.getFailure(), null, "failures", null, 0, -1, Hazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazard_Measures(), this.getMeasure(), null, "measures", null, 0, -1, Hazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazard_HazardType(), this.getHazardType(), null, "hazardType", null, 0, 1, Hazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hazardTypeSystemEClass, HazardTypeSystem.class, "HazardTypeSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHazardTypeSystem_HazardTypes(), this.getHazardType(), null, "hazardTypes", null, 0, -1, HazardTypeSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hazardTypeEClass, HazardType.class, "HazardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(malfunctionEClass, Malfunction.class, "Malfunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMalfunction_Hazards(), this.getHazard(), null, "hazards", null, 0, -1, Malfunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskAssessmentEClass, RiskAssessment.class, "RiskAssessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRiskAssessment_RelatedStandard(), ecorePackage.getEString(), "relatedStandard", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskAssessment_RiskParameters(), this.getRiskParameter(), null, "riskParameters", null, 0, -1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskAssessment_Hazard(), this.getHazard(), null, "hazard", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskParameterEClass, RiskParameter.class, "RiskParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRiskParameter_Argument(), ecorePackage.getEString(), "argument", null, 0, 1, RiskParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(situationEClass, Situation.class, "Situation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSituation_Likelihood(), ecorePackage.getEString(), "likelihood", null, 0, 1, Situation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accidentEClass, Accident.class, "Accident", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccident_Severity(), ecorePackage.getEString(), "severity", null, 0, 1, Accident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorMeasureEClass, OperatorMeasure.class, "OperatorMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperatorMeasure_Controlability(), ecorePackage.getEString(), "controlability", null, 0, 1, OperatorMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementPackageEClass, RequirementPackage.class, "RequirementPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementPackage_RequirementSources(), this.getRequirementSource(), null, "requirementSources", null, 0, -1, RequirementPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementPackage_DependabilityRequirements(), this.getDependabilityRequirement(), null, "dependabilityRequirements", null, 0, -1, RequirementPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementSourceEClass, RequirementSource.class, "RequirementSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(legalContractEClass, LegalContract.class, "LegalContract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependabilityRequirementEClass, DependabilityRequirement.class, "DependabilityRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependabilityRequirement_DecompositionArgument(), ecorePackage.getEString(), "decompositionArgument", null, 0, 1, DependabilityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependabilityRequirement_RefinedRequirements(), this.getDependabilityRequirement(), null, "refinedRequirements", null, 0, -1, DependabilityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependabilityRequirement_RequirementSource(), this.getRequirementSource(), null, "requirementSource", null, 0, 1, DependabilityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependabilityRequirement_Measures(), this.getMeasure(), null, "measures", null, 0, -1, DependabilityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependabilityRequirement_Failures(), theFailureLogic_Package.getFailure(), null, "failures", null, 0, -1, DependabilityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependabilityRequirement_AssuranceLevel(), this.getAssuranceLevel(), null, "assuranceLevel", null, 0, 1, DependabilityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependabilityRequirement_MaintenanceProcedures(), this.getMaintenanceProcedure(), null, "maintenanceProcedures", null, 0, -1, DependabilityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(safetyRequirementEClass, SafetyRequirement.class, "SafetyRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSafetyRequirement_FailureReactionTime(), ecorePackage.getEDouble(), "failureReactionTime", null, 0, 1, SafetyRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafetyRequirement_FailureDetectionTime(), ecorePackage.getEDouble(), "failureDetectionTime", null, 0, 1, SafetyRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafetyRequirement_FailureLatencyTime(), ecorePackage.getEDouble(), "failureLatencyTime", null, 0, 1, SafetyRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafetyRequirement_IsSafetyGoal(), ecorePackage.getEBoolean(), "isSafetyGoal", null, 0, 1, SafetyRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSafetyRequirement_Hazards(), this.getHazard(), null, "hazards", null, 0, -1, SafetyRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityRequirementEClass, SecurityRequirement.class, "SecurityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityRequirement_SecurityCapabilities(), this.getSecurityCapability(), null, "securityCapabilities", null, 0, -1, SecurityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainPackageEClass, DomainPackage.class, "DomainPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainPackage_Standards(), this.getStandard(), null, "standards", null, 0, -1, DomainPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainPackage_AssuranceLevels(), this.getAssuranceLevel(), null, "assuranceLevels", null, 0, -1, DomainPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardEClass, Standard.class, "Standard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assuranceLevelEClass, AssuranceLevel.class, "AssuranceLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(safetyStandardEClass, SafetyStandard.class, "SafetyStandard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSafetyStandard_AssuranceLevels(), this.getAssuranceLevel(), null, "assuranceLevels", null, 0, -1, SafetyStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taraPackageEClass, TARAPackage.class, "TARAPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTARAPackage_IdentifiedRisks(), this.getSecurityRisk(), null, "identifiedRisks", null, 0, -1, TARAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTARAPackage_Controls(), this.getSecurityControl(), null, "controls", null, 0, -1, TARAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTARAPackage_ConsideredAssets(), this.getAsset(), null, "consideredAssets", null, 0, -1, TARAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTARAPackage_ConsideredThreatAgents(), this.getThreatAgent(), null, "consideredThreatAgents", null, 0, -1, TARAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_FinancialValue(), ecorePackage.getEDouble(), "financialValue", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_FinancialCostType(), this.getFinancialCostType(), "financialCostType", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_OperationalCost(), ecorePackage.getEDouble(), "operationalCost", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_OperationalCostType(), this.getOperationalCostType(), "operationalCostType", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityControlEClass, SecurityControl.class, "SecurityControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityControl_Category(), ecorePackage.getEString(), "category", null, 0, 1, SecurityControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityControl_Type(), this.getSecurityApplicationType(), "type", null, 0, 1, SecurityControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityControl_Vulnerabilities(), this.getVulnerability(), null, "vulnerabilities", null, 0, -1, SecurityControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityCapabilityEClass, SecurityCapability.class, "SecurityCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityCapability_Category(), ecorePackage.getEString(), "category", null, 0, 1, SecurityCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityCapability_Type(), this.getSecurityApplicationType(), "type", null, 0, 1, SecurityCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityCapability_ImplementedBy(), this.getSecurityControl(), null, "implementedBy", null, 0, -1, SecurityCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vulnerabilityEClass, Vulnerability.class, "Vulnerability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVulnerability_Category(), ecorePackage.getEString(), "category", null, 0, 1, Vulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vulnerableItemEClass, VulnerableItem.class, "VulnerableItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVulnerableItem_Vulnerabilities(), this.getVulnerability(), null, "vulnerabilities", null, 0, -1, VulnerableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attackerGoalEClass, AttackerGoal.class, "AttackerGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttackerGoal_Category(), ecorePackage.getEString(), "category", null, 0, 1, AttackerGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttackerGoal_AddressedBy(), this.getSecurityCapability(), null, "addressedBy", null, 0, -1, AttackerGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttackerGoal_Attacks(), this.getAttack(), null, "attacks", null, 0, -1, AttackerGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttackerGoal_AttackedItems(), this.getVulnerableItem(), null, "attackedItems", null, 0, -1, AttackerGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityRiskEClass, SecurityRisk.class, "SecurityRisk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityRisk_Likelihood(), ecorePackage.getEDouble(), "likelihood", null, 0, 1, SecurityRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityRisk_ImpactAsset(), ecorePackage.getEString(), "impactAsset", null, 0, 1, SecurityRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityRisk_ImpactIndividuals(), ecorePackage.getEString(), "impactIndividuals", null, 0, 1, SecurityRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityRisk_ImpactBusiness(), ecorePackage.getEString(), "impactBusiness", null, 0, 1, SecurityRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityRisk_AttackerGoals(), this.getAttackerGoal(), null, "attackerGoals", null, 0, -1, SecurityRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attackEClass, Attack.class, "Attack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttack_Category(), ecorePackage.getEString(), "category", null, 0, 1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttack_FinancialCost(), ecorePackage.getEDouble(), "financialCost", null, 0, 1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttack_FinancialCostType(), this.getFinancialCostType(), "financialCostType", null, 0, 1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttack_TimeRequired(), ecorePackage.getEDouble(), "timeRequired", null, 0, 1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttack_TimeUnit(), theOdeBasePackage.getTimeUnit(), "timeUnit", null, 0, 1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttack_Difficulty(), ecorePackage.getEString(), "difficulty", null, 0, 1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttack_Detectability(), ecorePackage.getEString(), "detectability", null, 0, 1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttack_Violations(), theFailureLogic_Package.getSecurityViolation(), null, "violations", null, 0, -1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttack_ExploitedVulnerabilities(), this.getVulnerability(), null, "exploitedVulnerabilities", null, 0, -1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(payloadEClass, Payload.class, "Payload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(threatAgentEClass, ThreatAgent.class, "ThreatAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreatAgent_SkillLevel(), ecorePackage.getEString(), "skillLevel", null, 0, 1, ThreatAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreatAgent_Motivation(), ecorePackage.getEString(), "motivation", null, 0, 1, ThreatAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreatAgent_AnonymityDesire(), ecorePackage.getEString(), "anonymityDesire", null, 0, 1, ThreatAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatAgent_AttackerGoals(), this.getAttackerGoal(), null, "attackerGoals", null, 0, -1, ThreatAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(humanEClass, Human.class, "Human", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHuman_Actions(), this.getAction(), null, "actions", null, 0, -1, Human.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonHumanEClass, NonHuman.class, "NonHuman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonHuman_Payloads(), this.getPayload(), null, "payloads", null, 0, -1, NonHuman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(securityApplicationTypeEEnum, SecurityApplicationType.class, "SecurityApplicationType");
		addEEnumLiteral(securityApplicationTypeEEnum, SecurityApplicationType.PREVENTIVE);
		addEEnumLiteral(securityApplicationTypeEEnum, SecurityApplicationType.ACTIVE);
		addEEnumLiteral(securityApplicationTypeEEnum, SecurityApplicationType.PASSIVE);

		initEEnum(financialCostTypeEEnum, FinancialCostType.class, "FinancialCostType");
		addEEnumLiteral(financialCostTypeEEnum, FinancialCostType.USD);
		addEEnumLiteral(financialCostTypeEEnum, FinancialCostType.EUR);
		addEEnumLiteral(financialCostTypeEEnum, FinancialCostType.GBP);

		initEEnum(operationalCostTypeEEnum, OperationalCostType.class, "OperationalCostType");
		addEEnumLiteral(operationalCostTypeEEnum, OperationalCostType.WORKHOURS);
		addEEnumLiteral(operationalCostTypeEEnum, OperationalCostType.WORKDAYS);
		addEEnumLiteral(operationalCostTypeEEnum, OperationalCostType.WORKMONTHS);

		// Create resource
		createResource(eNS_URI);
	}

} //Dependability_PackageImpl
