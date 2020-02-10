/**
 */
package top.dependability;

import org.eclipse.emf.common.util.EList;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.ThreatAgent#getSkillLevel <em>Skill Level</em>}</li>
 *   <li>{@link top.dependability.ThreatAgent#getMotivation <em>Motivation</em>}</li>
 *   <li>{@link top.dependability.ThreatAgent#getAnonymityDesire <em>Anonymity Desire</em>}</li>
 *   <li>{@link top.dependability.ThreatAgent#getAttackerGoals <em>Attacker Goals</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getThreatAgent()
 * @model
 * @generated
 */
public interface ThreatAgent extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Skill Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Level</em>' attribute.
	 * @see #setSkillLevel(String)
	 * @see top.dependability.Dependability_Package#getThreatAgent_SkillLevel()
	 * @model
	 * @generated
	 */
	String getSkillLevel();

	/**
	 * Sets the value of the '{@link top.dependability.ThreatAgent#getSkillLevel <em>Skill Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Level</em>' attribute.
	 * @see #getSkillLevel()
	 * @generated
	 */
	void setSkillLevel(String value);

	/**
	 * Returns the value of the '<em><b>Motivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motivation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motivation</em>' attribute.
	 * @see #setMotivation(String)
	 * @see top.dependability.Dependability_Package#getThreatAgent_Motivation()
	 * @model
	 * @generated
	 */
	String getMotivation();

	/**
	 * Sets the value of the '{@link top.dependability.ThreatAgent#getMotivation <em>Motivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motivation</em>' attribute.
	 * @see #getMotivation()
	 * @generated
	 */
	void setMotivation(String value);

	/**
	 * Returns the value of the '<em><b>Anonymity Desire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymity Desire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymity Desire</em>' attribute.
	 * @see #setAnonymityDesire(String)
	 * @see top.dependability.Dependability_Package#getThreatAgent_AnonymityDesire()
	 * @model
	 * @generated
	 */
	String getAnonymityDesire();

	/**
	 * Sets the value of the '{@link top.dependability.ThreatAgent#getAnonymityDesire <em>Anonymity Desire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymity Desire</em>' attribute.
	 * @see #getAnonymityDesire()
	 * @generated
	 */
	void setAnonymityDesire(String value);

	/**
	 * Returns the value of the '<em><b>Attacker Goals</b></em>' containment reference list.
	 * The list contents are of type {@link top.dependability.AttackerGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker Goals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker Goals</em>' containment reference list.
	 * @see top.dependability.Dependability_Package#getThreatAgent_AttackerGoals()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttackerGoal> getAttackerGoals();

} // ThreatAgent
