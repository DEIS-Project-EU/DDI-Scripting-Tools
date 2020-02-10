/**
 */
package top.failureLogic;

import org.eclipse.emf.common.util.EList;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prob Dist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.failureLogic.ProbDist#getType <em>Type</em>}</li>
 *   <li>{@link top.failureLogic.ProbDist#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see top.failureLogic.FailureLogic_Package#getProbDist()
 * @model
 * @generated
 */
public interface ProbDist extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see top.failureLogic.FailureLogic_Package#getProbDist_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link top.failureLogic.ProbDist#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link top.failureLogic.ProbDistParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see top.failureLogic.FailureLogic_Package#getProbDist_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProbDistParam> getParameters();

} // ProbDist
