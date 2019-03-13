/**
 */
package dependability;

import integration.ODEProductPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dependability.DomainPackage#getStandards <em>Standards</em>}</li>
 *   <li>{@link dependability.DomainPackage#getAssuranceLevels <em>Assurance Levels</em>}</li>
 * </ul>
 *
 * @see dependability.Dependability_Package#getDomainPackage()
 * @model
 * @generated
 */
public interface DomainPackage extends ODEProductPackage {
	/**
	 * Returns the value of the '<em><b>Standards</b></em>' containment reference list.
	 * The list contents are of type {@link dependability.Standard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standards</em>' containment reference list.
	 * @see dependability.Dependability_Package#getDomainPackage_Standards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Standard> getStandards();

	/**
	 * Returns the value of the '<em><b>Assurance Levels</b></em>' containment reference list.
	 * The list contents are of type {@link dependability.AssuranceLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assurance Levels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assurance Levels</em>' containment reference list.
	 * @see dependability.Dependability_Package#getDomainPackage_AssuranceLevels()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssuranceLevel> getAssuranceLevels();

} // DomainPackage
