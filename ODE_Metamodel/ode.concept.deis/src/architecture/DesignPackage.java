/**
 */
package architecture;

import integration.ODEProductPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecture.DesignPackage#getSystems <em>Systems</em>}</li>
 *   <li>{@link architecture.DesignPackage#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see architecture.Architecture_Package#getDesignPackage()
 * @model
 * @generated
 */
public interface DesignPackage extends ODEProductPackage {
	/**
	 * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
	 * The list contents are of type {@link architecture.System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systems</em>' containment reference list.
	 * @see architecture.Architecture_Package#getDesignPackage_Systems()
	 * @model containment="true"
	 * @generated
	 */
	EList<architecture.System> getSystems();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link architecture.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see architecture.Architecture_Package#getDesignPackage_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunctions();

} // DesignPackage
