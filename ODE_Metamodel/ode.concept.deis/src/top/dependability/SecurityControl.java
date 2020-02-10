/**
 */
package top.dependability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.SecurityControl#getCategory <em>Category</em>}</li>
 *   <li>{@link top.dependability.SecurityControl#getType <em>Type</em>}</li>
 *   <li>{@link top.dependability.SecurityControl#getVulnerabilities <em>Vulnerabilities</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getSecurityControl()
 * @model
 * @generated
 */
public interface SecurityControl extends Measure {
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
	 * @see top.dependability.Dependability_Package#getSecurityControl_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link top.dependability.SecurityControl#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link top.dependability.SecurityApplicationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see top.dependability.SecurityApplicationType
	 * @see #setType(SecurityApplicationType)
	 * @see top.dependability.Dependability_Package#getSecurityControl_Type()
	 * @model
	 * @generated
	 */
	SecurityApplicationType getType();

	/**
	 * Sets the value of the '{@link top.dependability.SecurityControl#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see top.dependability.SecurityApplicationType
	 * @see #getType()
	 * @generated
	 */
	void setType(SecurityApplicationType value);

	/**
	 * Returns the value of the '<em><b>Vulnerabilities</b></em>' reference list.
	 * The list contents are of type {@link top.dependability.Vulnerability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vulnerabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vulnerabilities</em>' reference list.
	 * @see top.dependability.Dependability_Package#getSecurityControl_Vulnerabilities()
	 * @model
	 * @generated
	 */
	EList<Vulnerability> getVulnerabilities();

} // SecurityControl
