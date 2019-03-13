/**
 */
package failureLogic;

import odeBase.BaseElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.Transition#getTransition <em>Transition</em>}</li>
 *   <li>{@link failureLogic.Transition#getTransitionProbDistribution <em>Transition Prob Distribution</em>}</li>
 *   <li>{@link failureLogic.Transition#getFromStates <em>From States</em>}</li>
 *   <li>{@link failureLogic.Transition#getToStates <em>To States</em>}</li>
 * </ul>
 *
 * @see failureLogic.FailureLogic_Package#getTransition()
 * @model
 * @generated
 */
public interface Transition extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' attribute.
	 * @see #setTransition(double)
	 * @see failureLogic.FailureLogic_Package#getTransition_Transition()
	 * @model
	 * @generated
	 */
	double getTransition();

	/**
	 * Sets the value of the '{@link failureLogic.Transition#getTransition <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' attribute.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(double value);

	/**
	 * Returns the value of the '<em><b>Transition Prob Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Prob Distribution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Prob Distribution</em>' containment reference.
	 * @see #setTransitionProbDistribution(ProbDist)
	 * @see failureLogic.FailureLogic_Package#getTransition_TransitionProbDistribution()
	 * @model containment="true"
	 * @generated
	 */
	ProbDist getTransitionProbDistribution();

	/**
	 * Sets the value of the '{@link failureLogic.Transition#getTransitionProbDistribution <em>Transition Prob Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Prob Distribution</em>' containment reference.
	 * @see #getTransitionProbDistribution()
	 * @generated
	 */
	void setTransitionProbDistribution(ProbDist value);

	/**
	 * Returns the value of the '<em><b>From States</b></em>' reference list.
	 * The list contents are of type {@link failureLogic.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From States</em>' reference list.
	 * @see failureLogic.FailureLogic_Package#getTransition_FromStates()
	 * @model
	 * @generated
	 */
	EList<State> getFromStates();

	/**
	 * Returns the value of the '<em><b>To States</b></em>' reference list.
	 * The list contents are of type {@link failureLogic.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To States</em>' reference list.
	 * @see failureLogic.FailureLogic_Package#getTransition_ToStates()
	 * @model
	 * @generated
	 */
	EList<State> getToStates();

} // Transition
