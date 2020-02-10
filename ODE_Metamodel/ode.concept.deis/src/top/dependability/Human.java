/**
 */
package top.dependability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Human</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.Human#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getHuman()
 * @model
 * @generated
 */
public interface Human extends ThreatAgent {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link top.dependability.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see top.dependability.Dependability_Package#getHuman_Actions()
	 * @model
	 * @generated
	 */
	EList<Action> getActions();

} // Human
