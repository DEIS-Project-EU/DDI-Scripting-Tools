/**
 */
package top.failureLogic;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.failureLogic.Cause#getCauseType <em>Cause Type</em>}</li>
 *   <li>{@link top.failureLogic.Cause#getFailure <em>Failure</em>}</li>
 * </ul>
 *
 * @see top.failureLogic.FailureLogic_Package#getCause()
 * @model
 * @generated
 */
public interface Cause extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Cause Type</b></em>' attribute.
	 * The literals are from the enumeration {@link top.failureLogic.CauseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause Type</em>' attribute.
	 * @see top.failureLogic.CauseType
	 * @see #setCauseType(CauseType)
	 * @see top.failureLogic.FailureLogic_Package#getCause_CauseType()
	 * @model
	 * @generated
	 */
	CauseType getCauseType();

	/**
	 * Sets the value of the '{@link top.failureLogic.Cause#getCauseType <em>Cause Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause Type</em>' attribute.
	 * @see top.failureLogic.CauseType
	 * @see #getCauseType()
	 * @generated
	 */
	void setCauseType(CauseType value);

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' reference.
	 * @see #setFailure(Failure)
	 * @see top.failureLogic.FailureLogic_Package#getCause_Failure()
	 * @model
	 * @generated
	 */
	Failure getFailure();

	/**
	 * Sets the value of the '{@link top.failureLogic.Cause#getFailure <em>Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' reference.
	 * @see #getFailure()
	 * @generated
	 */
	void setFailure(Failure value);

} // Cause
