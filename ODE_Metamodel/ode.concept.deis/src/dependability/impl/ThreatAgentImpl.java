/**
 */
package dependability.impl;

import dependability.AttackerGoal;
import dependability.Dependability_Package;
import dependability.ThreatAgent;

import java.util.Collection;

import odeBase.impl.BaseElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dependability.impl.ThreatAgentImpl#getSkillLevel <em>Skill Level</em>}</li>
 *   <li>{@link dependability.impl.ThreatAgentImpl#getMotivation <em>Motivation</em>}</li>
 *   <li>{@link dependability.impl.ThreatAgentImpl#getAnonymityDesire <em>Anonymity Desire</em>}</li>
 *   <li>{@link dependability.impl.ThreatAgentImpl#getAttackerGoals <em>Attacker Goals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatAgentImpl extends BaseElementImpl implements ThreatAgent {
	/**
	 * The default value of the '{@link #getSkillLevel() <em>Skill Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String SKILL_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkillLevel() <em>Skill Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillLevel()
	 * @generated
	 * @ordered
	 */
	protected String skillLevel = SKILL_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotivation() <em>Motivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotivation()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotivation() <em>Motivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotivation()
	 * @generated
	 * @ordered
	 */
	protected String motivation = MOTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnonymityDesire() <em>Anonymity Desire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymityDesire()
	 * @generated
	 * @ordered
	 */
	protected static final String ANONYMITY_DESIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnonymityDesire() <em>Anonymity Desire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymityDesire()
	 * @generated
	 * @ordered
	 */
	protected String anonymityDesire = ANONYMITY_DESIRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttackerGoals() <em>Attacker Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackerGoal> attackerGoals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.THREAT_AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSkillLevel() {
		return skillLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkillLevel(String newSkillLevel) {
		String oldSkillLevel = skillLevel;
		skillLevel = newSkillLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.THREAT_AGENT__SKILL_LEVEL, oldSkillLevel, skillLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMotivation() {
		return motivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotivation(String newMotivation) {
		String oldMotivation = motivation;
		motivation = newMotivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.THREAT_AGENT__MOTIVATION, oldMotivation, motivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnonymityDesire() {
		return anonymityDesire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymityDesire(String newAnonymityDesire) {
		String oldAnonymityDesire = anonymityDesire;
		anonymityDesire = newAnonymityDesire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.THREAT_AGENT__ANONYMITY_DESIRE, oldAnonymityDesire, anonymityDesire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttackerGoal> getAttackerGoals() {
		if (attackerGoals == null) {
			attackerGoals = new EObjectContainmentEList<AttackerGoal>(AttackerGoal.class, this, Dependability_Package.THREAT_AGENT__ATTACKER_GOALS);
		}
		return attackerGoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dependability_Package.THREAT_AGENT__ATTACKER_GOALS:
				return ((InternalEList<?>)getAttackerGoals()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.THREAT_AGENT__SKILL_LEVEL:
				return getSkillLevel();
			case Dependability_Package.THREAT_AGENT__MOTIVATION:
				return getMotivation();
			case Dependability_Package.THREAT_AGENT__ANONYMITY_DESIRE:
				return getAnonymityDesire();
			case Dependability_Package.THREAT_AGENT__ATTACKER_GOALS:
				return getAttackerGoals();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Dependability_Package.THREAT_AGENT__SKILL_LEVEL:
				setSkillLevel((String)newValue);
				return;
			case Dependability_Package.THREAT_AGENT__MOTIVATION:
				setMotivation((String)newValue);
				return;
			case Dependability_Package.THREAT_AGENT__ANONYMITY_DESIRE:
				setAnonymityDesire((String)newValue);
				return;
			case Dependability_Package.THREAT_AGENT__ATTACKER_GOALS:
				getAttackerGoals().clear();
				getAttackerGoals().addAll((Collection<? extends AttackerGoal>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Dependability_Package.THREAT_AGENT__SKILL_LEVEL:
				setSkillLevel(SKILL_LEVEL_EDEFAULT);
				return;
			case Dependability_Package.THREAT_AGENT__MOTIVATION:
				setMotivation(MOTIVATION_EDEFAULT);
				return;
			case Dependability_Package.THREAT_AGENT__ANONYMITY_DESIRE:
				setAnonymityDesire(ANONYMITY_DESIRE_EDEFAULT);
				return;
			case Dependability_Package.THREAT_AGENT__ATTACKER_GOALS:
				getAttackerGoals().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Dependability_Package.THREAT_AGENT__SKILL_LEVEL:
				return SKILL_LEVEL_EDEFAULT == null ? skillLevel != null : !SKILL_LEVEL_EDEFAULT.equals(skillLevel);
			case Dependability_Package.THREAT_AGENT__MOTIVATION:
				return MOTIVATION_EDEFAULT == null ? motivation != null : !MOTIVATION_EDEFAULT.equals(motivation);
			case Dependability_Package.THREAT_AGENT__ANONYMITY_DESIRE:
				return ANONYMITY_DESIRE_EDEFAULT == null ? anonymityDesire != null : !ANONYMITY_DESIRE_EDEFAULT.equals(anonymityDesire);
			case Dependability_Package.THREAT_AGENT__ATTACKER_GOALS:
				return attackerGoals != null && !attackerGoals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (skillLevel: ");
		result.append(skillLevel);
		result.append(", motivation: ");
		result.append(motivation);
		result.append(", anonymityDesire: ");
		result.append(anonymityDesire);
		result.append(')');
		return result.toString();
	}

} //ThreatAgentImpl
