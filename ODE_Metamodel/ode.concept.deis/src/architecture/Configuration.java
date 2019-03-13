/**
 */
package architecture;

import odeBase.BaseElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecture.Configuration#getSubSystems <em>Sub Systems</em>}</li>
 * </ul>
 *
 * @see architecture.Architecture_Package#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Sub Systems</b></em>' reference list.
	 * The list contents are of type {@link architecture.System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Systems</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Systems</em>' reference list.
	 * @see architecture.Architecture_Package#getConfiguration_SubSystems()
	 * @model
	 * @generated
	 */
	EList<architecture.System> getSubSystems();

} // Configuration
