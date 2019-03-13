/**
 */
package failureLogic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.Gate#getGateType <em>Gate Type</em>}</li>
 *   <li>{@link failureLogic.Gate#getCauses <em>Causes</em>}</li>
 * </ul>
 *
 * @see failureLogic.FailureLogic_Package#getGate()
 * @model
 * @generated
 */
public interface Gate extends Cause {
	/**
	 * Returns the value of the '<em><b>Gate Type</b></em>' attribute.
	 * The literals are from the enumeration {@link failureLogic.GateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate Type</em>' attribute.
	 * @see failureLogic.GateType
	 * @see #setGateType(GateType)
	 * @see failureLogic.FailureLogic_Package#getGate_GateType()
	 * @model
	 * @generated
	 */
	GateType getGateType();

	/**
	 * Sets the value of the '{@link failureLogic.Gate#getGateType <em>Gate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gate Type</em>' attribute.
	 * @see failureLogic.GateType
	 * @see #getGateType()
	 * @generated
	 */
	void setGateType(GateType value);

	/**
	 * Returns the value of the '<em><b>Causes</b></em>' reference list.
	 * The list contents are of type {@link failureLogic.Cause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Causes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causes</em>' reference list.
	 * @see failureLogic.FailureLogic_Package#getGate_Causes()
	 * @model
	 * @generated
	 */
	EList<Cause> getCauses();

} // Gate
