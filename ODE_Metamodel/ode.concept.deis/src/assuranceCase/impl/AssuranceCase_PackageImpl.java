/**
 */
package assuranceCase.impl;

import argumentation.Argumentation_Package;

import artifact.Artifact_Package;

import assuranceCase.AssuranceCasePackage;
import assuranceCase.AssuranceCasePackageBinding;
import assuranceCase.AssuranceCasePackageInterface;
import assuranceCase.AssuranceCase_Factory;
import assuranceCase.AssuranceCase_Package;

import base.Base_Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import terminology.Terminology_Package;

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
	 * @see assuranceCase.AssuranceCase_Package#eNS_URI
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

		// Initialize simple dependencies
		Argumentation_Package.eINSTANCE.eClass();
		Artifact_Package.eINSTANCE.eClass();
		Terminology_Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theAssuranceCase_Package.createPackageContents();

		// Initialize created meta-data
		theAssuranceCase_Package.initializePackageContents();

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
		Base_Package theBase_Package = (Base_Package)EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);
		Artifact_Package theArtifact_Package = (Artifact_Package)EPackage.Registry.INSTANCE.getEPackage(Artifact_Package.eNS_URI);
		Argumentation_Package theArgumentation_Package = (Argumentation_Package)EPackage.Registry.INSTANCE.getEPackage(Argumentation_Package.eNS_URI);
		Terminology_Package theTerminology_Package = (Terminology_Package)EPackage.Registry.INSTANCE.getEPackage(Terminology_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assuranceCasePackageEClass.getESuperTypes().add(theBase_Package.getArtifactElement());
		assuranceCasePackageBindingEClass.getESuperTypes().add(this.getAssuranceCasePackage());
		assuranceCasePackageInterfaceEClass.getESuperTypes().add(this.getAssuranceCasePackage());

		// Initialize classes, features, and operations; add parameters
		initEClass(assuranceCasePackageEClass, AssuranceCasePackage.class, "AssuranceCasePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssuranceCasePackage_AssuranceCasePackage(), this.getAssuranceCasePackage(), null, "assuranceCasePackage", null, 0, -1, AssuranceCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCasePackage_Interface(), this.getAssuranceCasePackageInterface(), null, "interface", null, 0, -1, AssuranceCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCasePackage_ArtifactPackage(), theArtifact_Package.getArtifactPackage(), null, "artifactPackage", null, 0, -1, AssuranceCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCasePackage_ArgumentPackage(), theArgumentation_Package.getArgumentPackage(), null, "argumentPackage", null, 0, -1, AssuranceCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCasePackage_TerminologyPackage(), theTerminology_Package.getTerminologyPackage(), null, "terminologyPackage", null, 0, -1, AssuranceCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assuranceCasePackageBindingEClass, AssuranceCasePackageBinding.class, "AssuranceCasePackageBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssuranceCasePackageBinding_ParticipantPackage(), this.getAssuranceCasePackage(), null, "participantPackage", null, 2, -1, AssuranceCasePackageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assuranceCasePackageInterfaceEClass, AssuranceCasePackageInterface.class, "AssuranceCasePackageInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssuranceCasePackageInterface_Implements(), this.getAssuranceCasePackage(), null, "implements", null, 1, 1, AssuranceCasePackageInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AssuranceCase_PackageImpl
