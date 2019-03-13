/**
 */
package failureLogic;

import odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMEA Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.FMEAEntry#getEffect <em>Effect</em>}</li>
 *   <li>{@link failureLogic.FMEAEntry#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see failureLogic.FailureLogic_Package#getFMEAEntry()
 * @model
 * @generated
 */
public interface FMEAEntry extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' reference.
	 * @see #setEffect(Failure)
	 * @see failureLogic.FailureLogic_Package#getFMEAEntry_Effect()
	 * @model
	 * @generated
	 */
	Failure getEffect();

	/**
	 * Sets the value of the '{@link failureLogic.FMEAEntry#getEffect <em>Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(Failure value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference.
	 * @see #setMode(Failure)
	 * @see failureLogic.FailureLogic_Package#getFMEAEntry_Mode()
	 * @model
	 * @generated
	 */
	Failure getMode();

	/**
	 * Sets the value of the '{@link failureLogic.FMEAEntry#getMode <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Failure value);

} // FMEAEntry
