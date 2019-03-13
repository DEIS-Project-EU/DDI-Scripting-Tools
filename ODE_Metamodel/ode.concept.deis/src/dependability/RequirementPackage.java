/**
 */
package dependability;

import integration.ODEProductPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dependability.RequirementPackage#getRequirementSources <em>Requirement Sources</em>}</li>
 *   <li>{@link dependability.RequirementPackage#getDependabilityRequirements <em>Dependability Requirements</em>}</li>
 * </ul>
 *
 * @see dependability.Dependability_Package#getRequirementPackage()
 * @model
 * @generated
 */
public interface RequirementPackage extends ODEProductPackage {
	/**
	 * Returns the value of the '<em><b>Requirement Sources</b></em>' containment reference list.
	 * The list contents are of type {@link dependability.RequirementSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Sources</em>' containment reference list.
	 * @see dependability.Dependability_Package#getRequirementPackage_RequirementSources()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementSource> getRequirementSources();

	/**
	 * Returns the value of the '<em><b>Dependability Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link dependability.DependabilityRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependability Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependability Requirements</em>' containment reference list.
	 * @see dependability.Dependability_Package#getRequirementPackage_DependabilityRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DependabilityRequirement> getDependabilityRequirements();

} // RequirementPackage
