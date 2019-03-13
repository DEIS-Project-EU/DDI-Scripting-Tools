/**
 */
package architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecture.SafetyFunction#getObject <em>Object</em>}</li>
 *   <li>{@link architecture.SafetyFunction#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link architecture.SafetyFunction#getSafeState <em>Safe State</em>}</li>
 * </ul>
 *
 * @see architecture.Architecture_Package#getSafetyFunction()
 * @model
 * @generated
 */
public interface SafetyFunction extends Function {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(String)
	 * @see architecture.Architecture_Package#getSafetyFunction_Object()
	 * @model
	 * @generated
	 */
	String getObject();

	/**
	 * Sets the value of the '{@link architecture.SafetyFunction#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(String value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' attribute.
	 * @see #setBehavior(String)
	 * @see architecture.Architecture_Package#getSafetyFunction_Behavior()
	 * @model
	 * @generated
	 */
	String getBehavior();

	/**
	 * Sets the value of the '{@link architecture.SafetyFunction#getBehavior <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' attribute.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(String value);

	/**
	 * Returns the value of the '<em><b>Safe State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safe State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safe State</em>' attribute.
	 * @see #setSafeState(String)
	 * @see architecture.Architecture_Package#getSafetyFunction_SafeState()
	 * @model
	 * @generated
	 */
	String getSafeState();

	/**
	 * Sets the value of the '{@link architecture.SafetyFunction#getSafeState <em>Safe State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safe State</em>' attribute.
	 * @see #getSafeState()
	 * @generated
	 */
	void setSafeState(String value);

} // SafetyFunction
