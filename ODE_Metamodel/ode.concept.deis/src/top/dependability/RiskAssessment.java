/**
 */
package top.dependability;

import org.eclipse.emf.common.util.EList;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.RiskAssessment#getRelatedStandard <em>Related Standard</em>}</li>
 *   <li>{@link top.dependability.RiskAssessment#getRiskParameters <em>Risk Parameters</em>}</li>
 *   <li>{@link top.dependability.RiskAssessment#getHazard <em>Hazard</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getRiskAssessment()
 * @model
 * @generated
 */
public interface RiskAssessment extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Related Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Standard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Standard</em>' attribute.
	 * @see #setRelatedStandard(String)
	 * @see top.dependability.Dependability_Package#getRiskAssessment_RelatedStandard()
	 * @model
	 * @generated
	 */
	String getRelatedStandard();

	/**
	 * Sets the value of the '{@link top.dependability.RiskAssessment#getRelatedStandard <em>Related Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Standard</em>' attribute.
	 * @see #getRelatedStandard()
	 * @generated
	 */
	void setRelatedStandard(String value);

	/**
	 * Returns the value of the '<em><b>Risk Parameters</b></em>' reference list.
	 * The list contents are of type {@link top.dependability.RiskParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Parameters</em>' reference list.
	 * @see top.dependability.Dependability_Package#getRiskAssessment_RiskParameters()
	 * @model
	 * @generated
	 */
	EList<RiskParameter> getRiskParameters();

	/**
	 * Returns the value of the '<em><b>Hazard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard</em>' reference.
	 * @see #setHazard(Hazard)
	 * @see top.dependability.Dependability_Package#getRiskAssessment_Hazard()
	 * @model
	 * @generated
	 */
	Hazard getHazard();

	/**
	 * Sets the value of the '{@link top.dependability.RiskAssessment#getHazard <em>Hazard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard</em>' reference.
	 * @see #getHazard()
	 * @generated
	 */
	void setHazard(Hazard value);

} // RiskAssessment
