/**
 */
package failureLogic;

import odeBase.BaseElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minimal Cut Sets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.MinimalCutSets#getCutsets <em>Cutsets</em>}</li>
 *   <li>{@link failureLogic.MinimalCutSets#getFailures <em>Failures</em>}</li>
 * </ul>
 *
 * @see failureLogic.FailureLogic_Package#getMinimalCutSets()
 * @model
 * @generated
 */
public interface MinimalCutSets extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Cutsets</b></em>' containment reference list.
	 * The list contents are of type {@link failureLogic.MinimalCutset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cutsets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cutsets</em>' containment reference list.
	 * @see failureLogic.FailureLogic_Package#getMinimalCutSets_Cutsets()
	 * @model containment="true"
	 * @generated
	 */
	EList<MinimalCutset> getCutsets();

	/**
	 * Returns the value of the '<em><b>Failures</b></em>' reference list.
	 * The list contents are of type {@link failureLogic.Failure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failures</em>' reference list.
	 * @see failureLogic.FailureLogic_Package#getMinimalCutSets_Failures()
	 * @model
	 * @generated
	 */
	EList<Failure> getFailures();

} // MinimalCutSets
