/**
 */
package top.failureLogic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markov Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.failureLogic.MarkovChain#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link top.failureLogic.MarkovChain#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see top.failureLogic.FailureLogic_Package#getMarkovChain()
 * @model
 * @generated
 */
public interface MarkovChain extends FailureModel {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link top.failureLogic.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see top.failureLogic.FailureLogic_Package#getMarkovChain_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link top.failureLogic.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see top.failureLogic.FailureLogic_Package#getMarkovChain_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

} // MarkovChain
