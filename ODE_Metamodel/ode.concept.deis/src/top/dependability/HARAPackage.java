/**
 */
package top.dependability;

import org.eclipse.emf.common.util.EList;

import top.integration.ODEProductPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HARA Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.HARAPackage#getHazards <em>Hazards</em>}</li>
 *   <li>{@link top.dependability.HARAPackage#getHazardTypes <em>Hazard Types</em>}</li>
 *   <li>{@link top.dependability.HARAPackage#getHazardTypeSystems <em>Hazard Type Systems</em>}</li>
 *   <li>{@link top.dependability.HARAPackage#getMalfunctions <em>Malfunctions</em>}</li>
 *   <li>{@link top.dependability.HARAPackage#getRiskAssessments <em>Risk Assessments</em>}</li>
 *   <li>{@link top.dependability.HARAPackage#getRiskParameters <em>Risk Parameters</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getHARAPackage()
 * @model
 * @generated
 */
public interface HARAPackage extends ODEProductPackage {
	/**
	 * Returns the value of the '<em><b>Hazards</b></em>' containment reference list.
	 * The list contents are of type {@link top.dependability.Hazard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazards</em>' containment reference list.
	 * @see top.dependability.Dependability_Package#getHARAPackage_Hazards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hazard> getHazards();

	/**
	 * Returns the value of the '<em><b>Hazard Types</b></em>' containment reference list.
	 * The list contents are of type {@link top.dependability.HazardType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Types</em>' containment reference list.
	 * @see top.dependability.Dependability_Package#getHARAPackage_HazardTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<HazardType> getHazardTypes();

	/**
	 * Returns the value of the '<em><b>Hazard Type Systems</b></em>' containment reference list.
	 * The list contents are of type {@link top.dependability.HazardTypeSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Type Systems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Type Systems</em>' containment reference list.
	 * @see top.dependability.Dependability_Package#getHARAPackage_HazardTypeSystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<HazardTypeSystem> getHazardTypeSystems();

	/**
	 * Returns the value of the '<em><b>Malfunctions</b></em>' containment reference list.
	 * The list contents are of type {@link top.dependability.Malfunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Malfunctions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Malfunctions</em>' containment reference list.
	 * @see top.dependability.Dependability_Package#getHARAPackage_Malfunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Malfunction> getMalfunctions();

	/**
	 * Returns the value of the '<em><b>Risk Assessments</b></em>' containment reference list.
	 * The list contents are of type {@link top.dependability.RiskAssessment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Assessments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Assessments</em>' containment reference list.
	 * @see top.dependability.Dependability_Package#getHARAPackage_RiskAssessments()
	 * @model containment="true"
	 * @generated
	 */
	EList<RiskAssessment> getRiskAssessments();

	/**
	 * Returns the value of the '<em><b>Risk Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link top.dependability.RiskParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Parameters</em>' containment reference list.
	 * @see top.dependability.Dependability_Package#getHARAPackage_RiskParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<RiskParameter> getRiskParameters();

} // HARAPackage
