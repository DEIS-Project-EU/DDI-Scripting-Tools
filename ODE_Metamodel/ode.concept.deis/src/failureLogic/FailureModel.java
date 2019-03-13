/**
 */
package failureLogic;

import odeBase.BaseElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.FailureModel#getMinimalCutsets <em>Minimal Cutsets</em>}</li>
 *   <li>{@link failureLogic.FailureModel#getFailures <em>Failures</em>}</li>
 *   <li>{@link failureLogic.FailureModel#getSubModels <em>Sub Models</em>}</li>
 * </ul>
 *
 * @see failureLogic.FailureLogic_Package#getFailureModel()
 * @model
 * @generated
 */
public interface FailureModel extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Minimal Cutsets</b></em>' containment reference list.
	 * The list contents are of type {@link failureLogic.MinimalCutSets}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimal Cutsets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimal Cutsets</em>' containment reference list.
	 * @see failureLogic.FailureLogic_Package#getFailureModel_MinimalCutsets()
	 * @model containment="true"
	 * @generated
	 */
	EList<MinimalCutSets> getMinimalCutsets();

	/**
	 * Returns the value of the '<em><b>Failures</b></em>' containment reference list.
	 * The list contents are of type {@link failureLogic.Failure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failures</em>' containment reference list.
	 * @see failureLogic.FailureLogic_Package#getFailureModel_Failures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Failure> getFailures();

	/**
	 * Returns the value of the '<em><b>Sub Models</b></em>' reference list.
	 * The list contents are of type {@link failureLogic.FailureModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Models</em>' reference list.
	 * @see failureLogic.FailureLogic_Package#getFailureModel_SubModels()
	 * @model
	 * @generated
	 */
	EList<FailureModel> getSubModels();

} // FailureModel
