/**
 */
package top.failureLogic.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import top.architecture.ArchitecturePackage;

import top.architecture.impl.ArchitecturePackageImpl;

import top.argumentation.ArgumentationPackage;

import top.argumentation.impl.ArgumentationPackageImpl;

import top.artifact.Artifact_Package;

import top.artifact.impl.Artifact_PackageImpl;

import top.assuranceCase.AssuranceCase_Package;

import top.assuranceCase.impl.AssuranceCase_PackageImpl;

import top.base.BasePackage;

import top.base.impl.BasePackageImpl;

import top.dependability.Dependability_Package;

import top.dependability.impl.Dependability_PackageImpl;

import top.failureLogic.Cause;
import top.failureLogic.CauseType;
import top.failureLogic.FMEAEntry;
import top.failureLogic.FMEAType;
import top.failureLogic.FMEDAEntry;
import top.failureLogic.Failure;
import top.failureLogic.FailureLogicPackage;
import top.failureLogic.FailureLogic_Factory;
import top.failureLogic.FailureLogic_Package;
import top.failureLogic.FailureModel;
import top.failureLogic.FailureOriginType;
import top.failureLogic.FaultTree;
import top.failureLogic.Gate;
import top.failureLogic.GateType;
import top.failureLogic.MarkovChain;
import top.failureLogic.MinimalCutSets;
import top.failureLogic.MinimalCutset;
import top.failureLogic.ProbDist;
import top.failureLogic.ProbDistParam;
import top.failureLogic.SecurityViolation;
import top.failureLogic.State;
import top.failureLogic.Transition;

import top.integration.IntegrationPackage;

import top.integration.impl.IntegrationPackageImpl;

import top.odeBase.OdeBasePackage;

import top.odeBase.impl.OdeBasePackageImpl;

import top.terminology.Terminology_Package;

import top.terminology.impl.Terminology_PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureLogic_PackageImpl extends EPackageImpl implements FailureLogic_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureLogicPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityViolationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minimalCutSetsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minimalCutsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probDistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probDistParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultTreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass causeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markovChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmeaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmeaEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmedaEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum failureOriginTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum causeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fmeaTypeEEnum = null;

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
	 * @see top.failureLogic.FailureLogic_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FailureLogic_PackageImpl() {
		super(eNS_URI, FailureLogic_Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FailureLogic_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FailureLogic_Package init() {
		if (isInited) return (FailureLogic_Package)EPackage.Registry.INSTANCE.getEPackage(FailureLogic_Package.eNS_URI);

		// Obtain or create and register package
		FailureLogic_PackageImpl theFailureLogic_Package = (FailureLogic_PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FailureLogic_PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FailureLogic_PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		Artifact_PackageImpl theArtifact_Package = (Artifact_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Artifact_Package.eNS_URI) instanceof Artifact_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Artifact_Package.eNS_URI) : Artifact_Package.eINSTANCE);
		Terminology_PackageImpl theTerminology_Package = (Terminology_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Terminology_Package.eNS_URI) instanceof Terminology_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Terminology_Package.eNS_URI) : Terminology_Package.eINSTANCE);
		ArgumentationPackageImpl theArgumentationPackage = (ArgumentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI) instanceof ArgumentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI) : ArgumentationPackage.eINSTANCE);
		AssuranceCase_PackageImpl theAssuranceCase_Package = (AssuranceCase_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssuranceCase_Package.eNS_URI) instanceof AssuranceCase_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssuranceCase_Package.eNS_URI) : AssuranceCase_Package.eINSTANCE);
		OdeBasePackageImpl theOdeBasePackage = (OdeBasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OdeBasePackage.eNS_URI) instanceof OdeBasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OdeBasePackage.eNS_URI) : OdeBasePackage.eINSTANCE);
		IntegrationPackageImpl theIntegrationPackage = (IntegrationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI) instanceof IntegrationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI) : IntegrationPackage.eINSTANCE);
		Dependability_PackageImpl theDependability_Package = (Dependability_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Dependability_Package.eNS_URI) instanceof Dependability_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Dependability_Package.eNS_URI) : Dependability_Package.eINSTANCE);
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);

		// Create package meta-data objects
		theFailureLogic_Package.createPackageContents();
		theBasePackage.createPackageContents();
		theArtifact_Package.createPackageContents();
		theTerminology_Package.createPackageContents();
		theArgumentationPackage.createPackageContents();
		theAssuranceCase_Package.createPackageContents();
		theOdeBasePackage.createPackageContents();
		theIntegrationPackage.createPackageContents();
		theDependability_Package.createPackageContents();
		theArchitecturePackage.createPackageContents();

		// Initialize created meta-data
		theFailureLogic_Package.initializePackageContents();
		theBasePackage.initializePackageContents();
		theArtifact_Package.initializePackageContents();
		theTerminology_Package.initializePackageContents();
		theArgumentationPackage.initializePackageContents();
		theAssuranceCase_Package.initializePackageContents();
		theOdeBasePackage.initializePackageContents();
		theIntegrationPackage.initializePackageContents();
		theDependability_Package.initializePackageContents();
		theArchitecturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFailureLogic_Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FailureLogic_Package.eNS_URI, theFailureLogic_Package);
		return theFailureLogic_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureLogicPackage() {
		return failureLogicPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureLogicPackage_FailureModels() {
		return (EReference)failureLogicPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailure() {
		return failureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailure_OriginType() {
		return (EAttribute)failureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailure_FailureClass() {
		return (EAttribute)failureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailure_FailureRate() {
		return (EAttribute)failureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailure_IsCcf() {
		return (EAttribute)failureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailure_FailureProbDistribution() {
		return (EReference)failureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailure_CcfFailures() {
		return (EReference)failureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityViolation() {
		return securityViolationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureModel() {
		return failureModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModel_MinimalCutsets() {
		return (EReference)failureModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModel_Failures() {
		return (EReference)failureModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureModel_SubModels() {
		return (EReference)failureModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinimalCutSets() {
		return minimalCutSetsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinimalCutSets_Cutsets() {
		return (EReference)minimalCutSetsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinimalCutSets_Failures() {
		return (EReference)minimalCutSetsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinimalCutset() {
		return minimalCutsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinimalCutset_Failures() {
		return (EReference)minimalCutsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbDist() {
		return probDistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProbDist_Type() {
		return (EAttribute)probDistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProbDist_Parameters() {
		return (EReference)probDistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbDistParam() {
		return probDistParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProbDistParam_Value() {
		return (EAttribute)probDistParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaultTree() {
		return faultTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultTree_Causes() {
		return (EReference)faultTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCause() {
		return causeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCause_CauseType() {
		return (EAttribute)causeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCause_Failure() {
		return (EReference)causeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGate_GateType() {
		return (EAttribute)gateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGate_Causes() {
		return (EReference)gateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkovChain() {
		return markovChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarkovChain_Transitions() {
		return (EReference)markovChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarkovChain_States() {
		return (EReference)markovChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsInitialState() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsFailState() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_FailState() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Transition() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_TransitionProbDistribution() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_FromStates() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_ToStates() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFMEA() {
		return fmeaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFMEA_Type() {
		return (EAttribute)fmeaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMEA_Entries() {
		return (EReference)fmeaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFMEAEntry() {
		return fmeaEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMEAEntry_Effect() {
		return (EReference)fmeaEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMEAEntry_Mode() {
		return (EReference)fmeaEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFMEDAEntry() {
		return fmedaEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFMEDAEntry_DiagnosisRate() {
		return (EAttribute)fmedaEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMEDAEntry_DiagnosisProbDistribution() {
		return (EReference)fmedaEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFailureOriginType() {
		return failureOriginTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGateType() {
		return gateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCauseType() {
		return causeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFMEAType() {
		return fmeaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureLogic_Factory getFailureLogic_Factory() {
		return (FailureLogic_Factory)getEFactoryInstance();
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
		failureLogicPackageEClass = createEClass(FAILURE_LOGIC_PACKAGE);
		createEReference(failureLogicPackageEClass, FAILURE_LOGIC_PACKAGE__FAILURE_MODELS);

		failureEClass = createEClass(FAILURE);
		createEAttribute(failureEClass, FAILURE__ORIGIN_TYPE);
		createEAttribute(failureEClass, FAILURE__FAILURE_CLASS);
		createEAttribute(failureEClass, FAILURE__FAILURE_RATE);
		createEAttribute(failureEClass, FAILURE__IS_CCF);
		createEReference(failureEClass, FAILURE__FAILURE_PROB_DISTRIBUTION);
		createEReference(failureEClass, FAILURE__CCF_FAILURES);

		securityViolationEClass = createEClass(SECURITY_VIOLATION);

		failureModelEClass = createEClass(FAILURE_MODEL);
		createEReference(failureModelEClass, FAILURE_MODEL__MINIMAL_CUTSETS);
		createEReference(failureModelEClass, FAILURE_MODEL__FAILURES);
		createEReference(failureModelEClass, FAILURE_MODEL__SUB_MODELS);

		minimalCutSetsEClass = createEClass(MINIMAL_CUT_SETS);
		createEReference(minimalCutSetsEClass, MINIMAL_CUT_SETS__CUTSETS);
		createEReference(minimalCutSetsEClass, MINIMAL_CUT_SETS__FAILURES);

		minimalCutsetEClass = createEClass(MINIMAL_CUTSET);
		createEReference(minimalCutsetEClass, MINIMAL_CUTSET__FAILURES);

		probDistEClass = createEClass(PROB_DIST);
		createEAttribute(probDistEClass, PROB_DIST__TYPE);
		createEReference(probDistEClass, PROB_DIST__PARAMETERS);

		probDistParamEClass = createEClass(PROB_DIST_PARAM);
		createEAttribute(probDistParamEClass, PROB_DIST_PARAM__VALUE);

		faultTreeEClass = createEClass(FAULT_TREE);
		createEReference(faultTreeEClass, FAULT_TREE__CAUSES);

		causeEClass = createEClass(CAUSE);
		createEAttribute(causeEClass, CAUSE__CAUSE_TYPE);
		createEReference(causeEClass, CAUSE__FAILURE);

		gateEClass = createEClass(GATE);
		createEAttribute(gateEClass, GATE__GATE_TYPE);
		createEReference(gateEClass, GATE__CAUSES);

		markovChainEClass = createEClass(MARKOV_CHAIN);
		createEReference(markovChainEClass, MARKOV_CHAIN__TRANSITIONS);
		createEReference(markovChainEClass, MARKOV_CHAIN__STATES);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__IS_INITIAL_STATE);
		createEAttribute(stateEClass, STATE__IS_FAIL_STATE);
		createEReference(stateEClass, STATE__FAIL_STATE);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__TRANSITION);
		createEReference(transitionEClass, TRANSITION__TRANSITION_PROB_DISTRIBUTION);
		createEReference(transitionEClass, TRANSITION__FROM_STATES);
		createEReference(transitionEClass, TRANSITION__TO_STATES);

		fmeaEClass = createEClass(FMEA);
		createEAttribute(fmeaEClass, FMEA__TYPE);
		createEReference(fmeaEClass, FMEA__ENTRIES);

		fmeaEntryEClass = createEClass(FMEA_ENTRY);
		createEReference(fmeaEntryEClass, FMEA_ENTRY__EFFECT);
		createEReference(fmeaEntryEClass, FMEA_ENTRY__MODE);

		fmedaEntryEClass = createEClass(FMEDA_ENTRY);
		createEAttribute(fmedaEntryEClass, FMEDA_ENTRY__DIAGNOSIS_RATE);
		createEReference(fmedaEntryEClass, FMEDA_ENTRY__DIAGNOSIS_PROB_DISTRIBUTION);

		// Create enums
		failureOriginTypeEEnum = createEEnum(FAILURE_ORIGIN_TYPE);
		gateTypeEEnum = createEEnum(GATE_TYPE);
		causeTypeEEnum = createEEnum(CAUSE_TYPE);
		fmeaTypeEEnum = createEEnum(FMEA_TYPE);
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
		IntegrationPackage theIntegrationPackage = (IntegrationPackage)EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI);
		OdeBasePackage theOdeBasePackage = (OdeBasePackage)EPackage.Registry.INSTANCE.getEPackage(OdeBasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		failureLogicPackageEClass.getESuperTypes().add(theIntegrationPackage.getODEProductPackage());
		failureEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		securityViolationEClass.getESuperTypes().add(this.getFailure());
		failureModelEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		minimalCutSetsEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		minimalCutsetEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		probDistEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		probDistParamEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		faultTreeEClass.getESuperTypes().add(this.getFailureModel());
		causeEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		gateEClass.getESuperTypes().add(this.getCause());
		markovChainEClass.getESuperTypes().add(this.getFailureModel());
		stateEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		transitionEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		fmeaEClass.getESuperTypes().add(this.getFailureModel());
		fmeaEntryEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		fmedaEntryEClass.getESuperTypes().add(this.getFMEAEntry());

		// Initialize classes, features, and operations; add parameters
		initEClass(failureLogicPackageEClass, FailureLogicPackage.class, "FailureLogicPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureLogicPackage_FailureModels(), this.getFailureModel(), null, "failureModels", null, 0, -1, FailureLogicPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureEClass, Failure.class, "Failure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFailure_OriginType(), this.getFailureOriginType(), "originType", null, 0, 1, Failure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailure_FailureClass(), ecorePackage.getEString(), "failureClass", null, 0, 1, Failure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailure_FailureRate(), ecorePackage.getEDouble(), "failureRate", null, 0, 1, Failure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailure_IsCcf(), ecorePackage.getEBoolean(), "isCcf", null, 0, 1, Failure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailure_FailureProbDistribution(), this.getProbDist(), null, "failureProbDistribution", null, 0, 1, Failure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailure_CcfFailures(), this.getFailure(), null, "ccfFailures", null, 0, -1, Failure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityViolationEClass, SecurityViolation.class, "SecurityViolation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(failureModelEClass, FailureModel.class, "FailureModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureModel_MinimalCutsets(), this.getMinimalCutSets(), null, "minimalCutsets", null, 0, -1, FailureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureModel_Failures(), this.getFailure(), null, "failures", null, 0, -1, FailureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureModel_SubModels(), this.getFailureModel(), null, "subModels", null, 0, -1, FailureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minimalCutSetsEClass, MinimalCutSets.class, "MinimalCutSets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMinimalCutSets_Cutsets(), this.getMinimalCutset(), null, "cutsets", null, 0, -1, MinimalCutSets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMinimalCutSets_Failures(), this.getFailure(), null, "failures", null, 0, -1, MinimalCutSets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minimalCutsetEClass, MinimalCutset.class, "MinimalCutset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMinimalCutset_Failures(), this.getFailure(), null, "failures", null, 0, -1, MinimalCutset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probDistEClass, ProbDist.class, "ProbDist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProbDist_Type(), ecorePackage.getEString(), "type", null, 0, 1, ProbDist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProbDist_Parameters(), this.getProbDistParam(), null, "parameters", null, 0, -1, ProbDist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probDistParamEClass, ProbDistParam.class, "ProbDistParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProbDistParam_Value(), ecorePackage.getEString(), "value", null, 0, 1, ProbDistParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(faultTreeEClass, FaultTree.class, "FaultTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFaultTree_Causes(), this.getCause(), null, "causes", null, 0, -1, FaultTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(causeEClass, Cause.class, "Cause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCause_CauseType(), this.getCauseType(), "causeType", null, 0, 1, Cause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCause_Failure(), this.getFailure(), null, "failure", null, 0, 1, Cause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGate_GateType(), this.getGateType(), "gateType", null, 0, 1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGate_Causes(), this.getCause(), null, "causes", null, 0, -1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markovChainEClass, MarkovChain.class, "MarkovChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkovChain_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, MarkovChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarkovChain_States(), this.getState(), null, "states", null, 0, -1, MarkovChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_IsInitialState(), ecorePackage.getEBoolean(), "isInitialState", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_IsFailState(), ecorePackage.getEBoolean(), "isFailState", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_FailState(), this.getFailure(), null, "failState", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Transition(), ecorePackage.getEDouble(), "transition", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_TransitionProbDistribution(), this.getProbDist(), null, "transitionProbDistribution", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_FromStates(), this.getState(), null, "fromStates", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_ToStates(), this.getState(), null, "toStates", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmeaEClass, top.failureLogic.FMEA.class, "FMEA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMEA_Type(), this.getFMEAType(), "type", null, 0, 1, top.failureLogic.FMEA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMEA_Entries(), this.getFMEAEntry(), null, "entries", null, 0, -1, top.failureLogic.FMEA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmeaEntryEClass, FMEAEntry.class, "FMEAEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFMEAEntry_Effect(), this.getFailure(), null, "effect", null, 0, 1, FMEAEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMEAEntry_Mode(), this.getFailure(), null, "mode", null, 0, 1, FMEAEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmedaEntryEClass, FMEDAEntry.class, "FMEDAEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMEDAEntry_DiagnosisRate(), ecorePackage.getEDouble(), "diagnosisRate", null, 0, 1, FMEDAEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMEDAEntry_DiagnosisProbDistribution(), this.getProbDist(), null, "diagnosisProbDistribution", null, 0, 1, FMEDAEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(failureOriginTypeEEnum, FailureOriginType.class, "FailureOriginType");
		addEEnumLiteral(failureOriginTypeEEnum, FailureOriginType.INPUT);
		addEEnumLiteral(failureOriginTypeEEnum, FailureOriginType.OUTPUT);
		addEEnumLiteral(failureOriginTypeEEnum, FailureOriginType.INTERNAL);

		initEEnum(gateTypeEEnum, GateType.class, "GateType");
		addEEnumLiteral(gateTypeEEnum, GateType.OR);
		addEEnumLiteral(gateTypeEEnum, GateType.AND);
		addEEnumLiteral(gateTypeEEnum, GateType.NOT);
		addEEnumLiteral(gateTypeEEnum, GateType.XOR);
		addEEnumLiteral(gateTypeEEnum, GateType.VOTE);
		addEEnumLiteral(gateTypeEEnum, GateType.PAND);
		addEEnumLiteral(gateTypeEEnum, GateType.POR);
		addEEnumLiteral(gateTypeEEnum, GateType.SAND);
		addEEnumLiteral(gateTypeEEnum, GateType.INPUT_EVENT);
		addEEnumLiteral(gateTypeEEnum, GateType.OUTPUT_EVENT);

		initEEnum(causeTypeEEnum, CauseType.class, "CauseType");
		addEEnumLiteral(causeTypeEEnum, CauseType.INPUT_EVENT);
		addEEnumLiteral(causeTypeEEnum, CauseType.OUTPUT_EVENT);
		addEEnumLiteral(causeTypeEEnum, CauseType.BASIC_EVENT);
		addEEnumLiteral(causeTypeEEnum, CauseType.GATE);

		initEEnum(fmeaTypeEEnum, FMEAType.class, "FMEAType");
		addEEnumLiteral(fmeaTypeEEnum, FMEAType.FMEA);
		addEEnumLiteral(fmeaTypeEEnum, FMEAType.FMEDA);

		// Create resource
		createResource(eNS_URI);
	}

} //FailureLogic_PackageImpl
