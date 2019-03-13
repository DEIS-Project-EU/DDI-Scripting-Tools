/**
 */
package dependability;

import failureLogic.Failure;

import odeBase.BaseElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dependability.Hazard#getCondition <em>Condition</em>}</li>
 *   <li>{@link dependability.Hazard#getFailures <em>Failures</em>}</li>
 *   <li>{@link dependability.Hazard#getMeasures <em>Measures</em>}</li>
 *   <li>{@link dependability.Hazard#getHazardType <em>Hazard Type</em>}</li>
 * </ul>
 *
 * @see dependability.Dependability_Package#getHazard()
 * @model
 * @generated
 */
public interface Hazard extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see dependability.Dependability_Package#getHazard_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link dependability.Hazard#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Failures</b></em>' reference list.
	 * The list contents are of type {@link failureLogic.Failure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failures</em>' reference list.
	 * @see dependability.Dependability_Package#getHazard_Failures()
	 * @model
	 * @generated
	 */
	EList<Failure> getFailures();

	/**
	 * Returns the value of the '<em><b>Measures</b></em>' reference list.
	 * The list contents are of type {@link dependability.Measure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measures</em>' reference list.
	 * @see dependability.Dependability_Package#getHazard_Measures()
	 * @model
	 * @generated
	 */
	EList<Measure> getMeasures();

	/**
	 * Returns the value of the '<em><b>Hazard Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Type</em>' reference.
	 * @see #setHazardType(HazardType)
	 * @see dependability.Dependability_Package#getHazard_HazardType()
	 * @model
	 * @generated
	 */
	HazardType getHazardType();

	/**
	 * Sets the value of the '{@link dependability.Hazard#getHazardType <em>Hazard Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard Type</em>' reference.
	 * @see #getHazardType()
	 * @generated
	 */
	void setHazardType(HazardType value);

} // Hazard
