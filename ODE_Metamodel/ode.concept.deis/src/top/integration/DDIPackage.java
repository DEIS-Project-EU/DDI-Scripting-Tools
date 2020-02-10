/**
 */
package top.integration;

import org.eclipse.emf.common.util.EList;

import top.assuranceCase.AssuranceCasePackage;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DDI Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.integration.DDIPackage#getOdeProductPackages <em>Ode Product Packages</em>}</li>
 *   <li>{@link top.integration.DDIPackage#getAssuranceCasePackages <em>Assurance Case Packages</em>}</li>
 * </ul>
 *
 * @see top.integration.IntegrationPackage#getDDIPackage()
 * @model
 * @generated
 */
public interface DDIPackage extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Ode Product Packages</b></em>' containment reference list.
	 * The list contents are of type {@link top.integration.ODEProductPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ode Product Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ode Product Packages</em>' containment reference list.
	 * @see top.integration.IntegrationPackage#getDDIPackage_OdeProductPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODEProductPackage> getOdeProductPackages();

	/**
	 * Returns the value of the '<em><b>Assurance Case Packages</b></em>' containment reference list.
	 * The list contents are of type {@link top.assuranceCase.AssuranceCasePackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assurance Case Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assurance Case Packages</em>' containment reference list.
	 * @see top.integration.IntegrationPackage#getDDIPackage_AssuranceCasePackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssuranceCasePackage> getAssuranceCasePackages();

} // DDIPackage
