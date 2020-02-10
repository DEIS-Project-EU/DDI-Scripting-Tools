/**
 */
package top.dependability;

import org.eclipse.emf.common.util.EList;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Malfunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.Malfunction#getHazards <em>Hazards</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getMalfunction()
 * @model
 * @generated
 */
public interface Malfunction extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Hazards</b></em>' reference list.
	 * The list contents are of type {@link top.dependability.Hazard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazards</em>' reference list.
	 * @see top.dependability.Dependability_Package#getMalfunction_Hazards()
	 * @model
	 * @generated
	 */
	EList<Hazard> getHazards();

} // Malfunction
