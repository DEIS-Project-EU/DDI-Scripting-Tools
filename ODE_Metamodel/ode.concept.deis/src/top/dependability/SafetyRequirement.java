/**
 */
package top.dependability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.SafetyRequirement#getFailureReactionTime <em>Failure Reaction Time</em>}</li>
 *   <li>{@link top.dependability.SafetyRequirement#getFailureDetectionTime <em>Failure Detection Time</em>}</li>
 *   <li>{@link top.dependability.SafetyRequirement#getFailureLatencyTime <em>Failure Latency Time</em>}</li>
 *   <li>{@link top.dependability.SafetyRequirement#isIsSafetyGoal <em>Is Safety Goal</em>}</li>
 *   <li>{@link top.dependability.SafetyRequirement#getHazards <em>Hazards</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getSafetyRequirement()
 * @model
 * @generated
 */
public interface SafetyRequirement extends DependabilityRequirement {
	/**
	 * Returns the value of the '<em><b>Failure Reaction Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Reaction Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Reaction Time</em>' attribute.
	 * @see #setFailureReactionTime(double)
	 * @see top.dependability.Dependability_Package#getSafetyRequirement_FailureReactionTime()
	 * @model
	 * @generated
	 */
	double getFailureReactionTime();

	/**
	 * Sets the value of the '{@link top.dependability.SafetyRequirement#getFailureReactionTime <em>Failure Reaction Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Reaction Time</em>' attribute.
	 * @see #getFailureReactionTime()
	 * @generated
	 */
	void setFailureReactionTime(double value);

	/**
	 * Returns the value of the '<em><b>Failure Detection Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Detection Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Detection Time</em>' attribute.
	 * @see #setFailureDetectionTime(double)
	 * @see top.dependability.Dependability_Package#getSafetyRequirement_FailureDetectionTime()
	 * @model
	 * @generated
	 */
	double getFailureDetectionTime();

	/**
	 * Sets the value of the '{@link top.dependability.SafetyRequirement#getFailureDetectionTime <em>Failure Detection Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Detection Time</em>' attribute.
	 * @see #getFailureDetectionTime()
	 * @generated
	 */
	void setFailureDetectionTime(double value);

	/**
	 * Returns the value of the '<em><b>Failure Latency Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Latency Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Latency Time</em>' attribute.
	 * @see #setFailureLatencyTime(double)
	 * @see top.dependability.Dependability_Package#getSafetyRequirement_FailureLatencyTime()
	 * @model
	 * @generated
	 */
	double getFailureLatencyTime();

	/**
	 * Sets the value of the '{@link top.dependability.SafetyRequirement#getFailureLatencyTime <em>Failure Latency Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Latency Time</em>' attribute.
	 * @see #getFailureLatencyTime()
	 * @generated
	 */
	void setFailureLatencyTime(double value);

	/**
	 * Returns the value of the '<em><b>Is Safety Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Safety Goal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Safety Goal</em>' attribute.
	 * @see #setIsSafetyGoal(boolean)
	 * @see top.dependability.Dependability_Package#getSafetyRequirement_IsSafetyGoal()
	 * @model
	 * @generated
	 */
	boolean isIsSafetyGoal();

	/**
	 * Sets the value of the '{@link top.dependability.SafetyRequirement#isIsSafetyGoal <em>Is Safety Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Safety Goal</em>' attribute.
	 * @see #isIsSafetyGoal()
	 * @generated
	 */
	void setIsSafetyGoal(boolean value);

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
	 * @see top.dependability.Dependability_Package#getSafetyRequirement_Hazards()
	 * @model
	 * @generated
	 */
	EList<Hazard> getHazards();

} // SafetyRequirement
