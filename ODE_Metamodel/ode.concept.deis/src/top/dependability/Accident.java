/**
 */
package top.dependability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accident</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.Accident#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getAccident()
 * @model
 * @generated
 */
public interface Accident extends RiskParameter {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(String)
	 * @see top.dependability.Dependability_Package#getAccident_Severity()
	 * @model
	 * @generated
	 */
	String getSeverity();

	/**
	 * Sets the value of the '{@link top.dependability.Accident#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(String value);

} // Accident
