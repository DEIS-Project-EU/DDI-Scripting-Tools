/**
 */
package assuranceCase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see assuranceCase.AssuranceCase_Package
 * @generated
 */
public interface AssuranceCase_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssuranceCase_Factory eINSTANCE = assuranceCase.impl.AssuranceCase_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assurance Case Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assurance Case Package</em>'.
	 * @generated
	 */
	AssuranceCasePackage createAssuranceCasePackage();

	/**
	 * Returns a new object of class '<em>Assurance Case Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assurance Case Package Binding</em>'.
	 * @generated
	 */
	AssuranceCasePackageBinding createAssuranceCasePackageBinding();

	/**
	 * Returns a new object of class '<em>Assurance Case Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assurance Case Package Interface</em>'.
	 * @generated
	 */
	AssuranceCasePackageInterface createAssuranceCasePackageInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AssuranceCase_Package getAssuranceCase_Package();

} //AssuranceCase_Factory
