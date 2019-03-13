/**
 */
package dependability;

import odeBase.BaseElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard Type System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dependability.HazardTypeSystem#getHazardTypes <em>Hazard Types</em>}</li>
 * </ul>
 *
 * @see dependability.Dependability_Package#getHazardTypeSystem()
 * @model
 * @generated
 */
public interface HazardTypeSystem extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Hazard Types</b></em>' reference list.
	 * The list contents are of type {@link dependability.HazardType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Types</em>' reference list.
	 * @see dependability.Dependability_Package#getHazardTypeSystem_HazardTypes()
	 * @model
	 * @generated
	 */
	EList<HazardType> getHazardTypes();

} // HazardTypeSystem
