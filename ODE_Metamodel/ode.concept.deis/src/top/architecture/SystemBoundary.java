/**
 */
package top.architecture;

import org.eclipse.emf.common.util.EList;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Boundary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.architecture.SystemBoundary#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see top.architecture.ArchitecturePackage#getSystemBoundary()
 * @model
 * @generated
 */
public interface SystemBoundary extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link top.architecture.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see top.architecture.ArchitecturePackage#getSystemBoundary_Ports()
	 * @model
	 * @generated
	 */
	EList<Port> getPorts();

} // SystemBoundary
