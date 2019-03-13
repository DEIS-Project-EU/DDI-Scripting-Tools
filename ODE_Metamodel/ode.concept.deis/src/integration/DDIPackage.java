/**
 */
package integration;

import assuranceCase.AssuranceCasePackage;

import odeBase.BaseElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DDI Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link integration.DDIPackage#getOdeProductPackages <em>Ode Product Packages</em>}</li>
 *   <li>{@link integration.DDIPackage#getAssuranceCasePackages <em>Assurance Case Packages</em>}</li>
 * </ul>
 *
 * @see integration.Integration_Package#getDDIPackage()
 * @model
 * @generated
 */
public interface DDIPackage extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Ode Product Packages</b></em>' containment reference list.
	 * The list contents are of type {@link integration.ODEProductPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ode Product Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ode Product Packages</em>' containment reference list.
	 * @see integration.Integration_Package#getDDIPackage_OdeProductPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODEProductPackage> getOdeProductPackages();

	/**
	 * Returns the value of the '<em><b>Assurance Case Packages</b></em>' containment reference list.
	 * The list contents are of type {@link assuranceCase.AssuranceCasePackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assurance Case Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assurance Case Packages</em>' containment reference list.
	 * @see integration.Integration_Package#getDDIPackage_AssuranceCasePackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssuranceCasePackage> getAssuranceCasePackages();

} // DDIPackage
