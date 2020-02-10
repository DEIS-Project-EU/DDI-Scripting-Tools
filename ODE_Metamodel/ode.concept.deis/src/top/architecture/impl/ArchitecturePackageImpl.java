/**
 */
package top.architecture.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import top.architecture.ArchitectureFactory;
import top.architecture.ArchitecturePackage;
import top.architecture.Configuration;
import top.architecture.Context;
import top.architecture.DesignPackage;
import top.architecture.Function;
import top.architecture.LifecycleCondition;
import top.architecture.LogicalComponent;
import top.architecture.PerfChars;
import top.architecture.PhysicalComponent;
import top.architecture.Port;
import top.architecture.PortDirection;
import top.architecture.SafetyFunction;
import top.architecture.SafetyRelatedSystem;
import top.architecture.Signal;
import top.architecture.SystemBoundary;

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

import top.failureLogic.FailureLogic_Package;

import top.failureLogic.impl.FailureLogic_PackageImpl;

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
public class ArchitecturePackageImpl extends EPackageImpl implements ArchitecturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perfCharsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemBoundaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifecycleConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyRelatedSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portDirectionEEnum = null;

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
	 * @see top.architecture.ArchitecturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArchitecturePackageImpl() {
		super(eNS_URI, ArchitectureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArchitecturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArchitecturePackage init() {
		if (isInited) return (ArchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI);

		// Obtain or create and register package
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArchitecturePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		Artifact_PackageImpl theArtifact_Package = (Artifact_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Artifact_Package.eNS_URI) instanceof Artifact_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Artifact_Package.eNS_URI) : Artifact_Package.eINSTANCE);
		Terminology_PackageImpl theTerminology_Package = (Terminology_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Terminology_Package.eNS_URI) instanceof Terminology_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Terminology_Package.eNS_URI) : Terminology_Package.eINSTANCE);
		ArgumentationPackageImpl theArgumentationPackage = (ArgumentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI) instanceof ArgumentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI) : ArgumentationPackage.eINSTANCE);
		AssuranceCase_PackageImpl theAssuranceCase_Package = (AssuranceCase_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssuranceCase_Package.eNS_URI) instanceof AssuranceCase_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssuranceCase_Package.eNS_URI) : AssuranceCase_Package.eINSTANCE);
		OdeBasePackageImpl theOdeBasePackage = (OdeBasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OdeBasePackage.eNS_URI) instanceof OdeBasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OdeBasePackage.eNS_URI) : OdeBasePackage.eINSTANCE);
		IntegrationPackageImpl theIntegrationPackage = (IntegrationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI) instanceof IntegrationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI) : IntegrationPackage.eINSTANCE);
		FailureLogic_PackageImpl theFailureLogic_Package = (FailureLogic_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FailureLogic_Package.eNS_URI) instanceof FailureLogic_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FailureLogic_Package.eNS_URI) : FailureLogic_Package.eINSTANCE);
		Dependability_PackageImpl theDependability_Package = (Dependability_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Dependability_Package.eNS_URI) instanceof Dependability_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Dependability_Package.eNS_URI) : Dependability_Package.eINSTANCE);

		// Create package meta-data objects
		theArchitecturePackage.createPackageContents();
		theBasePackage.createPackageContents();
		theArtifact_Package.createPackageContents();
		theTerminology_Package.createPackageContents();
		theArgumentationPackage.createPackageContents();
		theAssuranceCase_Package.createPackageContents();
		theOdeBasePackage.createPackageContents();
		theIntegrationPackage.createPackageContents();
		theFailureLogic_Package.createPackageContents();
		theDependability_Package.createPackageContents();

		// Initialize created meta-data
		theArchitecturePackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theArtifact_Package.initializePackageContents();
		theTerminology_Package.initializePackageContents();
		theArgumentationPackage.initializePackageContents();
		theAssuranceCase_Package.initializePackageContents();
		theOdeBasePackage.initializePackageContents();
		theIntegrationPackage.initializePackageContents();
		theFailureLogic_Package.initializePackageContents();
		theDependability_Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArchitecturePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArchitecturePackage.eNS_URI, theArchitecturePackage);
		return theArchitecturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignPackage() {
		return designPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignPackage_Systems() {
		return (EReference)designPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignPackage_Functions() {
		return (EReference)designPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_OverallLifetime() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_OverallLifetimeTimeUnit() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_SystemBoundaries() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Contexts() {
		return (EReference)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Configurations() {
		return (EReference)systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Signals() {
		return (EReference)systemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Ports() {
		return (EReference)systemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_SubSystems() {
		return (EReference)systemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_RealisedFunctions() {
		return (EReference)systemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_AsAsset() {
		return (EReference)systemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_DependabilityRequirements() {
		return (EReference)systemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_AssuranceLevel() {
		return (EReference)systemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_AppliedStandards() {
		return (EReference)systemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_FailureModels() {
		return (EReference)systemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Signals() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Ports() {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_PerfChars() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_SubFunctions() {
		return (EReference)functionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_AsAsset() {
		return (EReference)functionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_DependabilityRequirements() {
		return (EReference)functionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_AssuranceLevel() {
		return (EReference)functionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_FailureModels() {
		return (EReference)functionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Malfunctions() {
		return (EReference)functionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSafetyFunction() {
		return safetyFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSafetyFunction_Object() {
		return (EAttribute)safetyFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSafetyFunction_Behavior() {
		return (EAttribute)safetyFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSafetyFunction_SafeState() {
		return (EAttribute)safetyFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_FlowType() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Direction() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_InterfaceFailures() {
		return (EReference)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_RefinedPorts() {
		return (EReference)portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_AssuranceLevel() {
		return (EReference)portEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_DependabilityRequirements() {
		return (EReference)portEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerfChars() {
		return perfCharsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerfChars_ResponseTime() {
		return (EAttribute)perfCharsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemBoundary() {
		return systemBoundaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemBoundary_Ports() {
		return (EReference)systemBoundaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContext_UsageHistory() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContext_MissionTime() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContext_MissionTimeTimeUnit() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalComponent() {
		return physicalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalComponent_Dimensions() {
		return (EAttribute)physicalComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalComponent_PricePerUnit() {
		return (EAttribute)physicalComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalComponent_Mass() {
		return (EAttribute)physicalComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalComponent_ProtectionCategory() {
		return (EAttribute)physicalComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalComponent_UsefulLifetime() {
		return (EAttribute)physicalComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalComponent_UsefulLifetimeTimeUnit() {
		return (EAttribute)physicalComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_LifecycleConditions() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_LogicalComponents() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_MaintenanceProcedure() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalComponent() {
		return logicalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifecycleCondition() {
		return lifecycleConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLifecycleCondition_Value() {
		return (EAttribute)lifecycleConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifecycleCondition_Conditions() {
		return (EReference)lifecycleConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_FromPort() {
		return (EReference)signalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_ToPort() {
		return (EReference)signalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSafetyRelatedSystem() {
		return safetyRelatedSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSafetyRelatedSystem_SafeState() {
		return (EAttribute)safetyRelatedSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_SubSystems() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortDirection() {
		return portDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureFactory getArchitectureFactory() {
		return (ArchitectureFactory)getEFactoryInstance();
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
		designPackageEClass = createEClass(DESIGN_PACKAGE);
		createEReference(designPackageEClass, DESIGN_PACKAGE__SYSTEMS);
		createEReference(designPackageEClass, DESIGN_PACKAGE__FUNCTIONS);

		systemEClass = createEClass(SYSTEM);
		createEAttribute(systemEClass, SYSTEM__OVERALL_LIFETIME);
		createEAttribute(systemEClass, SYSTEM__OVERALL_LIFETIME_TIME_UNIT);
		createEReference(systemEClass, SYSTEM__SYSTEM_BOUNDARIES);
		createEReference(systemEClass, SYSTEM__CONTEXTS);
		createEReference(systemEClass, SYSTEM__CONFIGURATIONS);
		createEReference(systemEClass, SYSTEM__SIGNALS);
		createEReference(systemEClass, SYSTEM__PORTS);
		createEReference(systemEClass, SYSTEM__SUB_SYSTEMS);
		createEReference(systemEClass, SYSTEM__REALISED_FUNCTIONS);
		createEReference(systemEClass, SYSTEM__AS_ASSET);
		createEReference(systemEClass, SYSTEM__DEPENDABILITY_REQUIREMENTS);
		createEReference(systemEClass, SYSTEM__ASSURANCE_LEVEL);
		createEReference(systemEClass, SYSTEM__APPLIED_STANDARDS);
		createEReference(systemEClass, SYSTEM__FAILURE_MODELS);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__SIGNALS);
		createEReference(functionEClass, FUNCTION__PORTS);
		createEReference(functionEClass, FUNCTION__PERF_CHARS);
		createEReference(functionEClass, FUNCTION__SUB_FUNCTIONS);
		createEReference(functionEClass, FUNCTION__AS_ASSET);
		createEReference(functionEClass, FUNCTION__DEPENDABILITY_REQUIREMENTS);
		createEReference(functionEClass, FUNCTION__ASSURANCE_LEVEL);
		createEReference(functionEClass, FUNCTION__FAILURE_MODELS);
		createEReference(functionEClass, FUNCTION__MALFUNCTIONS);

		safetyFunctionEClass = createEClass(SAFETY_FUNCTION);
		createEAttribute(safetyFunctionEClass, SAFETY_FUNCTION__OBJECT);
		createEAttribute(safetyFunctionEClass, SAFETY_FUNCTION__BEHAVIOR);
		createEAttribute(safetyFunctionEClass, SAFETY_FUNCTION__SAFE_STATE);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__FLOW_TYPE);
		createEAttribute(portEClass, PORT__DIRECTION);
		createEReference(portEClass, PORT__INTERFACE_FAILURES);
		createEReference(portEClass, PORT__REFINED_PORTS);
		createEReference(portEClass, PORT__ASSURANCE_LEVEL);
		createEReference(portEClass, PORT__DEPENDABILITY_REQUIREMENTS);

		perfCharsEClass = createEClass(PERF_CHARS);
		createEAttribute(perfCharsEClass, PERF_CHARS__RESPONSE_TIME);

		systemBoundaryEClass = createEClass(SYSTEM_BOUNDARY);
		createEReference(systemBoundaryEClass, SYSTEM_BOUNDARY__PORTS);

		contextEClass = createEClass(CONTEXT);
		createEAttribute(contextEClass, CONTEXT__USAGE_HISTORY);
		createEAttribute(contextEClass, CONTEXT__MISSION_TIME);
		createEAttribute(contextEClass, CONTEXT__MISSION_TIME_TIME_UNIT);

		physicalComponentEClass = createEClass(PHYSICAL_COMPONENT);
		createEAttribute(physicalComponentEClass, PHYSICAL_COMPONENT__DIMENSIONS);
		createEAttribute(physicalComponentEClass, PHYSICAL_COMPONENT__PRICE_PER_UNIT);
		createEAttribute(physicalComponentEClass, PHYSICAL_COMPONENT__MASS);
		createEAttribute(physicalComponentEClass, PHYSICAL_COMPONENT__PROTECTION_CATEGORY);
		createEAttribute(physicalComponentEClass, PHYSICAL_COMPONENT__USEFUL_LIFETIME);
		createEAttribute(physicalComponentEClass, PHYSICAL_COMPONENT__USEFUL_LIFETIME_TIME_UNIT);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__LIFECYCLE_CONDITIONS);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__LOGICAL_COMPONENTS);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__MAINTENANCE_PROCEDURE);

		logicalComponentEClass = createEClass(LOGICAL_COMPONENT);

		lifecycleConditionEClass = createEClass(LIFECYCLE_CONDITION);
		createEAttribute(lifecycleConditionEClass, LIFECYCLE_CONDITION__VALUE);
		createEReference(lifecycleConditionEClass, LIFECYCLE_CONDITION__CONDITIONS);

		signalEClass = createEClass(SIGNAL);
		createEReference(signalEClass, SIGNAL__FROM_PORT);
		createEReference(signalEClass, SIGNAL__TO_PORT);

		safetyRelatedSystemEClass = createEClass(SAFETY_RELATED_SYSTEM);
		createEAttribute(safetyRelatedSystemEClass, SAFETY_RELATED_SYSTEM__SAFE_STATE);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__SUB_SYSTEMS);

		// Create enums
		portDirectionEEnum = createEEnum(PORT_DIRECTION);
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
		Dependability_Package theDependability_Package = (Dependability_Package)EPackage.Registry.INSTANCE.getEPackage(Dependability_Package.eNS_URI);
		FailureLogic_Package theFailureLogic_Package = (FailureLogic_Package)EPackage.Registry.INSTANCE.getEPackage(FailureLogic_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		designPackageEClass.getESuperTypes().add(theIntegrationPackage.getODEProductPackage());
		systemEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		functionEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		safetyFunctionEClass.getESuperTypes().add(this.getFunction());
		portEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		perfCharsEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		systemBoundaryEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		contextEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		physicalComponentEClass.getESuperTypes().add(this.getSystem());
		logicalComponentEClass.getESuperTypes().add(this.getSystem());
		lifecycleConditionEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		signalEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		safetyRelatedSystemEClass.getESuperTypes().add(this.getSystem());
		configurationEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(designPackageEClass, DesignPackage.class, "DesignPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesignPackage_Systems(), this.getSystem(), null, "systems", null, 0, -1, DesignPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignPackage_Functions(), this.getFunction(), null, "functions", null, 0, -1, DesignPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, top.architecture.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystem_OverallLifetime(), ecorePackage.getEDouble(), "overallLifetime", null, 0, 1, top.architecture.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_OverallLifetimeTimeUnit(), theOdeBasePackage.getTimeUnit(), "overallLifetimeTimeUnit", "Hour", 0, 1, top.architecture.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_SystemBoundaries(), this.getSystemBoundary(), null, "systemBoundaries", null, 1, -1, top.architecture.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Contexts(), this.getContext(), null, "contexts", null, 0, -1, top.architecture.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Configurations(), this.getConfiguration(), null, "configurations", null, 0, -1, top.architecture.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Signals(), this.getSignal(), null, "signals", null, 0, -1, top.architecture.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Ports(), this.getPort(), null, "ports", null, 0, -1, top.architecture.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_SubSystems(), this.getSystem(), null, "subSystems", null, 0, -1, top.architecture.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_RealisedFunctions(), this.getFunction(), null, "realisedFunctions", null, 0, -1, top.architecture.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_AsAsset(), theDependability_Package.getAsset(), null, "asAsset", null, 0, 1, top.architecture.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_DependabilityRequirements(), theDependability_Package.getDependabilityRequirement(), null, "dependabilityRequirements", null, 0, -1, top.architecture.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_AssuranceLevel(), theDependability_Package.getAssuranceLevel(), null, "assuranceLevel", null, 0, 1, top.architecture.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_AppliedStandards(), theDependability_Package.getStandard(), null, "appliedStandards", null, 0, -1, top.architecture.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_FailureModels(), theFailureLogic_Package.getFailureModel(), null, "failureModels", null, 0, -1, top.architecture.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Signals(), this.getSignal(), null, "signals", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Ports(), this.getPort(), null, "ports", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_PerfChars(), this.getPerfChars(), null, "perfChars", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_SubFunctions(), this.getFunction(), null, "subFunctions", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_AsAsset(), theDependability_Package.getAsset(), null, "asAsset", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_DependabilityRequirements(), theDependability_Package.getDependabilityRequirement(), null, "dependabilityRequirements", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_AssuranceLevel(), theDependability_Package.getAssuranceLevel(), null, "assuranceLevel", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_FailureModels(), theFailureLogic_Package.getFailureModel(), null, "failureModels", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Malfunctions(), theDependability_Package.getMalfunction(), null, "malfunctions", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(safetyFunctionEClass, SafetyFunction.class, "SafetyFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSafetyFunction_Object(), ecorePackage.getEString(), "object", null, 0, 1, SafetyFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafetyFunction_Behavior(), ecorePackage.getEString(), "behavior", null, 0, 1, SafetyFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafetyFunction_SafeState(), ecorePackage.getEString(), "safeState", null, 0, 1, SafetyFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_FlowType(), ecorePackage.getEString(), "flowType", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Direction(), this.getPortDirection(), "direction", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_InterfaceFailures(), theFailureLogic_Package.getFailure(), null, "interfaceFailures", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_RefinedPorts(), this.getPort(), null, "refinedPorts", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_AssuranceLevel(), theDependability_Package.getAssuranceLevel(), null, "assuranceLevel", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_DependabilityRequirements(), theDependability_Package.getDependabilityRequirement(), null, "dependabilityRequirements", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(perfCharsEClass, PerfChars.class, "PerfChars", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerfChars_ResponseTime(), ecorePackage.getEDouble(), "responseTime", null, 0, 1, PerfChars.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemBoundaryEClass, SystemBoundary.class, "SystemBoundary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemBoundary_Ports(), this.getPort(), null, "ports", null, 0, -1, SystemBoundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContext_UsageHistory(), ecorePackage.getEString(), "usageHistory", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContext_MissionTime(), ecorePackage.getEDouble(), "missionTime", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContext_MissionTimeTimeUnit(), theOdeBasePackage.getTimeUnit(), "missionTimeTimeUnit", "Hour", 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalComponentEClass, PhysicalComponent.class, "PhysicalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalComponent_Dimensions(), ecorePackage.getEString(), "dimensions", null, 0, 1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalComponent_PricePerUnit(), ecorePackage.getEInt(), "pricePerUnit", null, 0, 1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalComponent_Mass(), ecorePackage.getEDouble(), "mass", null, 0, 1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalComponent_ProtectionCategory(), ecorePackage.getEInt(), "protectionCategory", null, 0, 1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalComponent_UsefulLifetime(), ecorePackage.getEDouble(), "usefulLifetime", null, 0, 1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalComponent_UsefulLifetimeTimeUnit(), theOdeBasePackage.getTimeUnit(), "usefulLifetimeTimeUnit", null, 0, 1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_LifecycleConditions(), this.getLifecycleCondition(), null, "lifecycleConditions", null, 0, -1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_LogicalComponents(), this.getLogicalComponent(), null, "logicalComponents", null, 0, -1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_MaintenanceProcedure(), theDependability_Package.getMaintenanceProcedure(), null, "maintenanceProcedure", null, 0, 1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalComponentEClass, LogicalComponent.class, "LogicalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lifecycleConditionEClass, LifecycleCondition.class, "LifecycleCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLifecycleCondition_Value(), ecorePackage.getEString(), "value", null, 0, 1, LifecycleCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLifecycleCondition_Conditions(), this.getLifecycleCondition(), null, "conditions", null, 0, -1, LifecycleCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_FromPort(), this.getPort(), null, "fromPort", null, 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignal_ToPort(), this.getPort(), null, "toPort", null, 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(safetyRelatedSystemEClass, SafetyRelatedSystem.class, "SafetyRelatedSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSafetyRelatedSystem_SafeState(), ecorePackage.getEString(), "safeState", null, 0, 1, SafetyRelatedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_SubSystems(), this.getSystem(), null, "subSystems", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(portDirectionEEnum, PortDirection.class, "PortDirection");
		addEEnumLiteral(portDirectionEEnum, PortDirection.IN);
		addEEnumLiteral(portDirectionEEnum, PortDirection.OUT);
		addEEnumLiteral(portDirectionEEnum, PortDirection.INOUT);

		// Create resource
		createResource(eNS_URI);
	}

} //ArchitecturePackageImpl
