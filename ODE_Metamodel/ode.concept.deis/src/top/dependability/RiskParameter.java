/**
 */
package top.dependability;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.RiskParameter#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getRiskParameter()
 * @model
 * @generated
 */
public interface RiskParameter extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' attribute.
	 * @see #setArgument(String)
	 * @see top.dependability.Dependability_Package#getRiskParameter_Argument()
	 * @model
	 * @generated
	 */
	String getArgument();

	/**
	 * Sets the value of the '{@link top.dependability.RiskParameter#getArgument <em>Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' attribute.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(String value);

} // RiskParameter
