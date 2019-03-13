/**
 */
package integration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see integration.Integration_Package
 * @generated
 */
public interface Integration_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Integration_Factory eINSTANCE = integration.impl.Integration_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DDI Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DDI Package</em>'.
	 * @generated
	 */
	DDIPackage createDDIPackage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Integration_Package getIntegration_Package();

} //Integration_Factory
