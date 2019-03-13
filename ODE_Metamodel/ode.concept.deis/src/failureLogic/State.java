/**
 */
package failureLogic;

import odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.State#isIsInitialState <em>Is Initial State</em>}</li>
 *   <li>{@link failureLogic.State#isIsFailState <em>Is Fail State</em>}</li>
 *   <li>{@link failureLogic.State#getFailState <em>Fail State</em>}</li>
 * </ul>
 *
 * @see failureLogic.FailureLogic_Package#getState()
 * @model
 * @generated
 */
public interface State extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Is Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Initial State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial State</em>' attribute.
	 * @see #setIsInitialState(boolean)
	 * @see failureLogic.FailureLogic_Package#getState_IsInitialState()
	 * @model
	 * @generated
	 */
	boolean isIsInitialState();

	/**
	 * Sets the value of the '{@link failureLogic.State#isIsInitialState <em>Is Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial State</em>' attribute.
	 * @see #isIsInitialState()
	 * @generated
	 */
	void setIsInitialState(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Fail State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Fail State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Fail State</em>' attribute.
	 * @see #setIsFailState(boolean)
	 * @see failureLogic.FailureLogic_Package#getState_IsFailState()
	 * @model
	 * @generated
	 */
	boolean isIsFailState();

	/**
	 * Sets the value of the '{@link failureLogic.State#isIsFailState <em>Is Fail State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fail State</em>' attribute.
	 * @see #isIsFailState()
	 * @generated
	 */
	void setIsFailState(boolean value);

	/**
	 * Returns the value of the '<em><b>Fail State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail State</em>' reference.
	 * @see #setFailState(Failure)
	 * @see failureLogic.FailureLogic_Package#getState_FailState()
	 * @model
	 * @generated
	 */
	Failure getFailState();

	/**
	 * Sets the value of the '{@link failureLogic.State#getFailState <em>Fail State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail State</em>' reference.
	 * @see #getFailState()
	 * @generated
	 */
	void setFailState(Failure value);

} // State
