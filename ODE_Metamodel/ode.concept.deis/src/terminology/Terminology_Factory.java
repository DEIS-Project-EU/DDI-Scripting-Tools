/**
 */
package terminology;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see terminology.Terminology_Package
 * @generated
 */
public interface Terminology_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Terminology_Factory eINSTANCE = terminology.impl.Terminology_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Terminology Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Group</em>'.
	 * @generated
	 */
	TerminologyGroup createTerminologyGroup();

	/**
	 * Returns a new object of class '<em>Terminology Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Package</em>'.
	 * @generated
	 */
	TerminologyPackage createTerminologyPackage();

	/**
	 * Returns a new object of class '<em>Terminology Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Package Binding</em>'.
	 * @generated
	 */
	TerminologyPackageBinding createTerminologyPackageBinding();

	/**
	 * Returns a new object of class '<em>Terminology Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Package Interface</em>'.
	 * @generated
	 */
	TerminologyPackageInterface createTerminologyPackageInterface();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term</em>'.
	 * @generated
	 */
	Term createTerm();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Terminology_Package getTerminology_Package();

} //Terminology_Factory
