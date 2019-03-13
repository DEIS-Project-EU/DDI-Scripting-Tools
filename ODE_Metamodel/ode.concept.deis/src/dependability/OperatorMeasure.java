/**
 */
package dependability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dependability.OperatorMeasure#getControlability <em>Controlability</em>}</li>
 * </ul>
 *
 * @see dependability.Dependability_Package#getOperatorMeasure()
 * @model
 * @generated
 */
public interface OperatorMeasure extends RiskParameter {
	/**
	 * Returns the value of the '<em><b>Controlability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlability</em>' attribute.
	 * @see #setControlability(String)
	 * @see dependability.Dependability_Package#getOperatorMeasure_Controlability()
	 * @model
	 * @generated
	 */
	String getControlability();

	/**
	 * Sets the value of the '{@link dependability.OperatorMeasure#getControlability <em>Controlability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlability</em>' attribute.
	 * @see #getControlability()
	 * @generated
	 */
	void setControlability(String value);

} // OperatorMeasure
