/**
 */
package top.architecture;

import org.eclipse.emf.common.util.EList;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.architecture.Configuration#getSubSystems <em>Sub Systems</em>}</li>
 * </ul>
 *
 * @see top.architecture.ArchitecturePackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Sub Systems</b></em>' reference list.
	 * The list contents are of type {@link top.architecture.System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Systems</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Systems</em>' reference list.
	 * @see top.architecture.ArchitecturePackage#getConfiguration_SubSystems()
	 * @model
	 * @generated
	 */
	EList<top.architecture.System> getSubSystems();

} // Configuration
