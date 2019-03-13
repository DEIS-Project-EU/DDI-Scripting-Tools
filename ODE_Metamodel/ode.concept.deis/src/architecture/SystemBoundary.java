/**
 */
package architecture;

import odeBase.BaseElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Boundary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecture.SystemBoundary#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see architecture.Architecture_Package#getSystemBoundary()
 * @model
 * @generated
 */
public interface SystemBoundary extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link architecture.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see architecture.Architecture_Package#getSystemBoundary_Ports()
	 * @model
	 * @generated
	 */
	EList<Port> getPorts();

} // SystemBoundary
