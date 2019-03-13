/**
 */
package terminology.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import terminology.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Terminology_FactoryImpl extends EFactoryImpl implements Terminology_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Terminology_Factory init() {
		try {
			Terminology_Factory theTerminology_Factory = (Terminology_Factory)EPackage.Registry.INSTANCE.getEFactory(Terminology_Package.eNS_URI);
			if (theTerminology_Factory != null) {
				return theTerminology_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Terminology_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminology_FactoryImpl() {
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
			case Terminology_Package.TERMINOLOGY_GROUP: return createTerminologyGroup();
			case Terminology_Package.TERMINOLOGY_PACKAGE: return createTerminologyPackage();
			case Terminology_Package.TERMINOLOGY_PACKAGE_BINDING: return createTerminologyPackageBinding();
			case Terminology_Package.TERMINOLOGY_PACKAGE_INTERFACE: return createTerminologyPackageInterface();
			case Terminology_Package.CATEGORY: return createCategory();
			case Terminology_Package.EXPRESSION: return createExpression();
			case Terminology_Package.TERM: return createTerm();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyGroup createTerminologyGroup() {
		TerminologyGroupImpl terminologyGroup = new TerminologyGroupImpl();
		return terminologyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyPackage createTerminologyPackage() {
		TerminologyPackageImpl terminologyPackage = new TerminologyPackageImpl();
		return terminologyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyPackageBinding createTerminologyPackageBinding() {
		TerminologyPackageBindingImpl terminologyPackageBinding = new TerminologyPackageBindingImpl();
		return terminologyPackageBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyPackageInterface createTerminologyPackageInterface() {
		TerminologyPackageInterfaceImpl terminologyPackageInterface = new TerminologyPackageInterfaceImpl();
		return terminologyPackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term createTerm() {
		TermImpl term = new TermImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminology_Package getTerminology_Package() {
		return (Terminology_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Terminology_Package getPackage() {
		return Terminology_Package.eINSTANCE;
	}

} //Terminology_FactoryImpl
