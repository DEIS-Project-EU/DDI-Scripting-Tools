/**
 */
package dependability;

import odeBase.BaseElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dependability.SecurityCapability#getCategory <em>Category</em>}</li>
 *   <li>{@link dependability.SecurityCapability#getType <em>Type</em>}</li>
 *   <li>{@link dependability.SecurityCapability#getImplementedBy <em>Implemented By</em>}</li>
 * </ul>
 *
 * @see dependability.Dependability_Package#getSecurityCapability()
 * @model
 * @generated
 */
public interface SecurityCapability extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see dependability.Dependability_Package#getSecurityCapability_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link dependability.SecurityCapability#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dependability.SecurityApplicationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dependability.SecurityApplicationType
	 * @see #setType(SecurityApplicationType)
	 * @see dependability.Dependability_Package#getSecurityCapability_Type()
	 * @model
	 * @generated
	 */
	SecurityApplicationType getType();

	/**
	 * Sets the value of the '{@link dependability.SecurityCapability#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dependability.SecurityApplicationType
	 * @see #getType()
	 * @generated
	 */
	void setType(SecurityApplicationType value);

	/**
	 * Returns the value of the '<em><b>Implemented By</b></em>' reference list.
	 * The list contents are of type {@link dependability.SecurityControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implemented By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented By</em>' reference list.
	 * @see dependability.Dependability_Package#getSecurityCapability_ImplementedBy()
	 * @model
	 * @generated
	 */
	EList<SecurityControl> getImplementedBy();

} // SecurityCapability
