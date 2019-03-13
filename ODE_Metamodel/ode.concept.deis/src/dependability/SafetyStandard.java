/**
 */
package dependability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Standard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dependability.SafetyStandard#getAssuranceLevels <em>Assurance Levels</em>}</li>
 * </ul>
 *
 * @see dependability.Dependability_Package#getSafetyStandard()
 * @model
 * @generated
 */
public interface SafetyStandard extends Standard {
	/**
	 * Returns the value of the '<em><b>Assurance Levels</b></em>' reference list.
	 * The list contents are of type {@link dependability.AssuranceLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assurance Levels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assurance Levels</em>' reference list.
	 * @see dependability.Dependability_Package#getSafetyStandard_AssuranceLevels()
	 * @model
	 * @generated
	 */
	EList<AssuranceLevel> getAssuranceLevels();

} // SafetyStandard
