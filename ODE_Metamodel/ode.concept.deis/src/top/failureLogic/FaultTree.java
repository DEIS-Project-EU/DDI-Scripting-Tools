/**
 */
package top.failureLogic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.failureLogic.FaultTree#getCauses <em>Causes</em>}</li>
 * </ul>
 *
 * @see top.failureLogic.FailureLogic_Package#getFaultTree()
 * @model
 * @generated
 */
public interface FaultTree extends FailureModel {
	/**
	 * Returns the value of the '<em><b>Causes</b></em>' containment reference list.
	 * The list contents are of type {@link top.failureLogic.Cause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Causes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causes</em>' containment reference list.
	 * @see top.failureLogic.FailureLogic_Package#getFaultTree_Causes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cause> getCauses();

} // FaultTree
