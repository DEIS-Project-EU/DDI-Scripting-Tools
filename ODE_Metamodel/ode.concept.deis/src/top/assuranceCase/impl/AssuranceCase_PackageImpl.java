/**
 */
package top.assuranceCase.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import top.architecture.ArchitecturePackage;

import top.architecture.impl.ArchitecturePackageImpl;

import top.argumentation.ArgumentationPackage;

import top.argumentation.impl.ArgumentationPackageImpl;

import top.artifact.Artifact_Package;

import top.artifact.impl.Artifact_PackageImpl;

import top.assuranceCase.AssuranceCasePackage;
import top.assuranceCase.AssuranceCasePackageBinding;
import top.assuranceCase.AssuranceCasePackageInterface;
import top.assuranceCase.AssuranceCase_Factory;
import top.assuranceCase.AssuranceCase_Package;

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
public class AssuranceCase_PackageImpl extends EPackageImpl implements AssuranceCase_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assuranceCasePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assuranceCasePackageBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assuranceCasePackageInterfaceEClass = null;

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
	 * @see top.assuranceCase.AssuranceCase_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssuranceCase_PackageImpl() {
		super(eNS_URI, AssuranceCase_Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AssuranceCase_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AssuranceCase_Package init() {
		if (isInited) return (AssuranceCase_Package)EPackage.Registry.INSTANCE.getEPackage(AssuranceCase_Package.eNS_URI);

		// Obtain or create and register package
		AssuranceCase_PackageImpl theAssuranceCase_Package = (AssuranceCase_PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AssuranceCase_PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AssuranceCase_PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		Artifact_PackageImpl theArtifact_Package = (Artifact_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Artifact_Package.eNS_URI) instanceof Artifact_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Artifact_Package.eNS_URI) : Artifact_Package.eINSTANCE);
		Terminology_PackageImpl theTerminology_Package = (Terminology_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Terminology_Package.eNS_URI) instanceof Terminology_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Terminology_Package.eNS_URI) : Terminology_Package.eINSTANCE);
		ArgumentationPackageImpl theArgumentationPackage = (ArgumentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI) instanceof ArgumentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI) : ArgumentationPackage.eINSTANCE);
		OdeBasePackageImpl theOdeBasePackage = (OdeBasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OdeBasePackage.eNS_URI) instanceof OdeBasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OdeBasePackage.eNS_URI) : OdeBasePackage.eINSTANCE);
		IntegrationPackageImpl theIntegrationPackage = (IntegrationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI) instanceof IntegrationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI) : IntegrationPackage.eINSTANCE);
		FailureLogic_PackageImpl theFailureLogic_Package = (FailureLogic_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FailureLogic_Package.eNS_URI) instanceof FailureLogic_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FailureLogic_Package.eNS_URI) : FailureLogic_Package.eINSTANCE);
		Dependability_PackageImpl theDependability_Package = (Dependability_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Dependability_Package.eNS_URI) instanceof Dependability_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Dependability_Package.eNS_URI) : Dependability_Package.eINSTANCE);
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);

		// Create package meta-data objects
		theAssuranceCase_Package.createPackageContents();
		theBasePackage.createPackageContents();
		theArtifact_Package.createPackageContents();
		theTerminology_Package.createPackageContents();
		theArgumentationPackage.createPackageContents();
		theOdeBasePackage.createPackageContents();
		theIntegrationPackage.createPackageContents();
		theFailureLogic_Package.createPackageContents();
		theDependability_Package.createPackageContents();
		theArchitecturePackage.createPackageContents();

		// Initialize created meta-data
		theAssuranceCase_Package.initializePackageContents();
		theBasePackage.initializePackageContents();
		theArtifact_Package.initializePackageContents();
		theTerminology_Package.initializePackageContents();
		theArgumentationPackage.initializePackageContents();
		theOdeBasePackage.initializePackageContents();
		theIntegrationPackage.initializePackageContents();
		theFailureLogic_Package.initializePackageContents();
		theDependability_Package.initializePackageContents();
		theArchitecturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAssuranceCase_Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssuranceCase_Package.eNS_URI, theAssuranceCase_Package);
		return theAssuranceCase_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssuranceCasePackage() {
		return assuranceCasePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCasePackage_AssuranceCasePackage() {
		return (EReference)assuranceCasePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCasePackage_Interface() {
		return (EReference)assuranceCasePackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCasePackage_ArtifactPackage() {
		return (EReference)assuranceCasePackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCasePackage_ArgumentPackage() {
		return (EReference)assuranceCasePackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCasePackage_TerminologyPackage() {
		return (EReference)assuranceCasePackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssuranceCasePackageBinding() {
		return assuranceCasePackageBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCasePackageBinding_ParticipantPackage() {
		return (EReference)assuranceCasePackageBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssuranceCasePackageInterface() {
		return assuranceCasePackageInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCasePackageInterface_Implements() {
		return (EReference)assuranceCasePackageInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceCase_Factory getAssuranceCase_Factory() {
		return (AssuranceCase_Factory)getEFactoryInstance();
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
		assuranceCasePackageEClass = createEClass(ASSURANCE_CASE_PACKAGE);
		createEReference(assuranceCasePackageEClass, ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE);
		createEReference(assuranceCasePackageEClass, ASSURANCE_CASE_PACKAGE__INTERFACE);
		createEReference(assuranceCasePackageEClass, ASSURANCE_CASE_PACKAGE__ARTIFACT_PACKAGE);
		createEReference(assuranceCasePackageEClass, ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE);
		createEReference(assuranceCasePackageEClass, ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE);

		assuranceCasePackageBindingEClass = createEClass(ASSURANCE_CASE_PACKAGE_BINDING);
		createEReference(assuranceCasePackageBindingEClass, ASSURANCE_CASE_PACKAGE_BINDING__PARTICIPANT_PACKAGE);

		assuranceCasePackageInterfaceEClass = createEClass(ASSURANCE_CASE_PACKAGE_INTERFACE);
		createEReference(assuranceCasePackageInterfaceEClass, ASSURANCE_CASE_PACKAGE_INTERFACE__IMPLEMENTS);
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
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		Artifact_Package theArtifact_Package = (Artifact_Package)EPackage.Registry.INSTANCE.getEPackage(Artifact_Package.eNS_URI);
		ArgumentationPackage theArgumentationPackage = (ArgumentationPackage)EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI);
		Terminology_Package theTerminology_Package = (Terminology_Package)EPackage.Registry.INSTANCE.getEPackage(Terminology_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assuranceCasePackageEClass.getESuperTypes().add(theBasePackage.getArtifactElement());
		assuranceCasePackageBindingEClass.getESuperTypes().add(this.getAssuranceCasePackage());
		assuranceCasePackageInterfaceEClass.getESuperTypes().add(this.getAssuranceCasePackage());

		// Initialize classes, features, and operations; add parameters
		initEClass(assuranceCasePackageEClass, AssuranceCasePackage.class, "AssuranceCasePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssuranceCasePackage_AssuranceCasePackage(), this.getAssuranceCasePackage(), null, "assuranceCasePackage", null, 0, -1, AssuranceCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCasePackage_Interface(), this.getAssuranceCasePackageInterface(), null, "interface", null, 0, -1, AssuranceCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCasePackage_ArtifactPackage(), theArtifact_Package.getArtifactPackage(), null, "artifactPackage", null, 0, -1, AssuranceCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCasePackage_ArgumentPackage(), theArgumentationPackage.getArgumentPackage(), null, "argumentPackage", null, 0, -1, AssuranceCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCasePackage_TerminologyPackage(), theTerminology_Package.getTerminologyPackage(), null, "terminologyPackage", null, 0, -1, AssuranceCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assuranceCasePackageBindingEClass, AssuranceCasePackageBinding.class, "AssuranceCasePackageBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssuranceCasePackageBinding_ParticipantPackage(), this.getAssuranceCasePackage(), null, "participantPackage", null, 2, -1, AssuranceCasePackageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assuranceCasePackageInterfaceEClass, AssuranceCasePackageInterface.class, "AssuranceCasePackageInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssuranceCasePackageInterface_Implements(), this.getAssuranceCasePackage(), null, "implements", null, 1, 1, AssuranceCasePackageInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AssuranceCase_PackageImpl
