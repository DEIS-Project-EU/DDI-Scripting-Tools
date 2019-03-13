/**
 */
package integration.impl;

import assuranceCase.AssuranceCase_Package;

import integration.DDIPackage;
import integration.Integration_Factory;
import integration.Integration_Package;
import integration.ODEProductPackage;

import odeBase.OdeBasePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Integration_PackageImpl extends EPackageImpl implements Integration_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddiPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odeProductPackageEClass = null;

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
	 * @see integration.Integration_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Integration_PackageImpl() {
		super(eNS_URI, Integration_Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Integration_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Integration_Package init() {
		if (isInited) return (Integration_Package)EPackage.Registry.INSTANCE.getEPackage(Integration_Package.eNS_URI);

		// Obtain or create and register package
		Integration_PackageImpl theIntegration_Package = (Integration_PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Integration_PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Integration_PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AssuranceCase_Package.eINSTANCE.eClass();
		OdeBasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIntegration_Package.createPackageContents();

		// Initialize created meta-data
		theIntegration_Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegration_Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Integration_Package.eNS_URI, theIntegration_Package);
		return theIntegration_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDDIPackage() {
		return ddiPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDIPackage_OdeProductPackages() {
		return (EReference)ddiPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDIPackage_AssuranceCasePackages() {
		return (EReference)ddiPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODEProductPackage() {
		return odeProductPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integration_Factory getIntegration_Factory() {
		return (Integration_Factory)getEFactoryInstance();
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
		ddiPackageEClass = createEClass(DDI_PACKAGE);
		createEReference(ddiPackageEClass, DDI_PACKAGE__ODE_PRODUCT_PACKAGES);
		createEReference(ddiPackageEClass, DDI_PACKAGE__ASSURANCE_CASE_PACKAGES);

		odeProductPackageEClass = createEClass(ODE_PRODUCT_PACKAGE);
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
		AssuranceCase_Package theAssuranceCase_Package = (AssuranceCase_Package)EPackage.Registry.INSTANCE.getEPackage(AssuranceCase_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ddiPackageEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());
		odeProductPackageEClass.getESuperTypes().add(theOdeBasePackage.getBaseElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(ddiPackageEClass, DDIPackage.class, "DDIPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDDIPackage_OdeProductPackages(), this.getODEProductPackage(), null, "odeProductPackages", null, 0, -1, DDIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDIPackage_AssuranceCasePackages(), theAssuranceCase_Package.getAssuranceCasePackage(), null, "assuranceCasePackages", null, 0, -1, DDIPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odeProductPackageEClass, ODEProductPackage.class, "ODEProductPackage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Integration_PackageImpl
