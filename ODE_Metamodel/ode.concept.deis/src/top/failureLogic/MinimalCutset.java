/**
 */
package top.failureLogic;

import org.eclipse.emf.common.util.EList;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minimal Cutset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.failureLogic.MinimalCutset#getFailures <em>Failures</em>}</li>
 * </ul>
 *
 * @see top.failureLogic.FailureLogic_Package#getMinimalCutset()
 * @model
 * @generated
 */
public interface MinimalCutset extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Failures</b></em>' reference list.
	 * The list contents are of type {@link top.failureLogic.Failure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failures</em>' reference list.
	 * @see top.failureLogic.FailureLogic_Package#getMinimalCutset_Failures()
	 * @model
	 * @generated
	 */
	EList<Failure> getFailures();

} // MinimalCutset
