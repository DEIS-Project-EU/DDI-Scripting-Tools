/**
 */
package dependability;

import integration.ODEProductPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TARA Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dependability.TARAPackage#getIdentifiedRisks <em>Identified Risks</em>}</li>
 *   <li>{@link dependability.TARAPackage#getControls <em>Controls</em>}</li>
 *   <li>{@link dependability.TARAPackage#getConsideredAssets <em>Considered Assets</em>}</li>
 *   <li>{@link dependability.TARAPackage#getConsideredThreatAgents <em>Considered Threat Agents</em>}</li>
 * </ul>
 *
 * @see dependability.Dependability_Package#getTARAPackage()
 * @model
 * @generated
 */
public interface TARAPackage extends ODEProductPackage {
	/**
	 * Returns the value of the '<em><b>Identified Risks</b></em>' containment reference list.
	 * The list contents are of type {@link dependability.SecurityRisk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identified Risks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identified Risks</em>' containment reference list.
	 * @see dependability.Dependability_Package#getTARAPackage_IdentifiedRisks()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityRisk> getIdentifiedRisks();

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link dependability.SecurityControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see dependability.Dependability_Package#getTARAPackage_Controls()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityControl> getControls();

	/**
	 * Returns the value of the '<em><b>Considered Assets</b></em>' containment reference list.
	 * The list contents are of type {@link dependability.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Considered Assets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Considered Assets</em>' containment reference list.
	 * @see dependability.Dependability_Package#getTARAPackage_ConsideredAssets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Asset> getConsideredAssets();

	/**
	 * Returns the value of the '<em><b>Considered Threat Agents</b></em>' containment reference list.
	 * The list contents are of type {@link dependability.ThreatAgent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Considered Threat Agents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Considered Threat Agents</em>' containment reference list.
	 * @see dependability.Dependability_Package#getTARAPackage_ConsideredThreatAgents()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThreatAgent> getConsideredThreatAgents();

} // TARAPackage
