/**
 */
package assuranceCase.impl;

import assuranceCase.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssuranceCase_FactoryImpl extends EFactoryImpl implements AssuranceCase_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssuranceCase_Factory init() {
		try {
			AssuranceCase_Factory theAssuranceCase_Factory = (AssuranceCase_Factory)EPackage.Registry.INSTANCE.getEFactory(AssuranceCase_Package.eNS_URI);
			if (theAssuranceCase_Factory != null) {
				return theAssuranceCase_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssuranceCase_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceCase_FactoryImpl() {
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
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE: return createAssuranceCasePackage();
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE_BINDING: return createAssuranceCasePackageBinding();
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE_INTERFACE: return createAssuranceCasePackageInterface();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceCasePackage createAssuranceCasePackage() {
		AssuranceCasePackageImpl assuranceCasePackage = new AssuranceCasePackageImpl();
		return assuranceCasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceCasePackageBinding createAssuranceCasePackageBinding() {
		AssuranceCasePackageBindingImpl assuranceCasePackageBinding = new AssuranceCasePackageBindingImpl();
		return assuranceCasePackageBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceCasePackageInterface createAssuranceCasePackageInterface() {
		AssuranceCasePackageInterfaceImpl assuranceCasePackageInterface = new AssuranceCasePackageInterfaceImpl();
		return assuranceCasePackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceCase_Package getAssuranceCase_Package() {
		return (AssuranceCase_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssuranceCase_Package getPackage() {
		return AssuranceCase_Package.eINSTANCE;
	}

} //AssuranceCase_FactoryImpl
