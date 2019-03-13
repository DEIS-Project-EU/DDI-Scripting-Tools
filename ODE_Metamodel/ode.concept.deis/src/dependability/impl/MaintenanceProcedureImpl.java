/**
 */
package dependability.impl;

import dependability.Dependability_Package;
import dependability.MaintenanceProcedure;

import odeBase.impl.BaseElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maintenance Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dependability.impl.MaintenanceProcedureImpl#getActivityDescription <em>Activity Description</em>}</li>
 *   <li>{@link dependability.impl.MaintenanceProcedureImpl#getTechnicalDescription <em>Technical Description</em>}</li>
 *   <li>{@link dependability.impl.MaintenanceProcedureImpl#getToolSpecification <em>Tool Specification</em>}</li>
 *   <li>{@link dependability.impl.MaintenanceProcedureImpl#getStaffNumber <em>Staff Number</em>}</li>
 *   <li>{@link dependability.impl.MaintenanceProcedureImpl#getStaffSkillLevel <em>Staff Skill Level</em>}</li>
 *   <li>{@link dependability.impl.MaintenanceProcedureImpl#getStaffTrainingDescription <em>Staff Training Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaintenanceProcedureImpl extends BaseElementImpl implements MaintenanceProcedure {
	/**
	 * The default value of the '{@link #getActivityDescription() <em>Activity Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityDescription() <em>Activity Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityDescription()
	 * @generated
	 * @ordered
	 */
	protected String activityDescription = ACTIVITY_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTechnicalDescription() <em>Technical Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNICAL_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnicalDescription() <em>Technical Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalDescription()
	 * @generated
	 * @ordered
	 */
	protected String technicalDescription = TECHNICAL_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getToolSpecification() <em>Tool Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOL_SPECIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToolSpecification() <em>Tool Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolSpecification()
	 * @generated
	 * @ordered
	 */
	protected String toolSpecification = TOOL_SPECIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStaffNumber() <em>Staff Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int STAFF_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStaffNumber() <em>Staff Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffNumber()
	 * @generated
	 * @ordered
	 */
	protected int staffNumber = STAFF_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStaffSkillLevel() <em>Staff Skill Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffSkillLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String STAFF_SKILL_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaffSkillLevel() <em>Staff Skill Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffSkillLevel()
	 * @generated
	 * @ordered
	 */
	protected String staffSkillLevel = STAFF_SKILL_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStaffTrainingDescription() <em>Staff Training Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffTrainingDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String STAFF_TRAINING_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaffTrainingDescription() <em>Staff Training Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffTrainingDescription()
	 * @generated
	 * @ordered
	 */
	protected String staffTrainingDescription = STAFF_TRAINING_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaintenanceProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.MAINTENANCE_PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivityDescription() {
		return activityDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityDescription(String newActivityDescription) {
		String oldActivityDescription = activityDescription;
		activityDescription = newActivityDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.MAINTENANCE_PROCEDURE__ACTIVITY_DESCRIPTION, oldActivityDescription, activityDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTechnicalDescription() {
		return technicalDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnicalDescription(String newTechnicalDescription) {
		String oldTechnicalDescription = technicalDescription;
		technicalDescription = newTechnicalDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.MAINTENANCE_PROCEDURE__TECHNICAL_DESCRIPTION, oldTechnicalDescription, technicalDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToolSpecification() {
		return toolSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolSpecification(String newToolSpecification) {
		String oldToolSpecification = toolSpecification;
		toolSpecification = newToolSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.MAINTENANCE_PROCEDURE__TOOL_SPECIFICATION, oldToolSpecification, toolSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStaffNumber() {
		return staffNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaffNumber(int newStaffNumber) {
		int oldStaffNumber = staffNumber;
		staffNumber = newStaffNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.MAINTENANCE_PROCEDURE__STAFF_NUMBER, oldStaffNumber, staffNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStaffSkillLevel() {
		return staffSkillLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaffSkillLevel(String newStaffSkillLevel) {
		String oldStaffSkillLevel = staffSkillLevel;
		staffSkillLevel = newStaffSkillLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.MAINTENANCE_PROCEDURE__STAFF_SKILL_LEVEL, oldStaffSkillLevel, staffSkillLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStaffTrainingDescription() {
		return staffTrainingDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaffTrainingDescription(String newStaffTrainingDescription) {
		String oldStaffTrainingDescription = staffTrainingDescription;
		staffTrainingDescription = newStaffTrainingDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.MAINTENANCE_PROCEDURE__STAFF_TRAINING_DESCRIPTION, oldStaffTrainingDescription, staffTrainingDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.MAINTENANCE_PROCEDURE__ACTIVITY_DESCRIPTION:
				return getActivityDescription();
			case Dependability_Package.MAINTENANCE_PROCEDURE__TECHNICAL_DESCRIPTION:
				return getTechnicalDescription();
			case Dependability_Package.MAINTENANCE_PROCEDURE__TOOL_SPECIFICATION:
				return getToolSpecification();
			case Dependability_Package.MAINTENANCE_PROCEDURE__STAFF_NUMBER:
				return getStaffNumber();
			case Dependability_Package.MAINTENANCE_PROCEDURE__STAFF_SKILL_LEVEL:
				return getStaffSkillLevel();
			case Dependability_Package.MAINTENANCE_PROCEDURE__STAFF_TRAINING_DESCRIPTION:
				return getStaffTrainingDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Dependability_Package.MAINTENANCE_PROCEDURE__ACTIVITY_DESCRIPTION:
				setActivityDescription((String)newValue);
				return;
			case Dependability_Package.MAINTENANCE_PROCEDURE__TECHNICAL_DESCRIPTION:
				setTechnicalDescription((String)newValue);
				return;
			case Dependability_Package.MAINTENANCE_PROCEDURE__TOOL_SPECIFICATION:
				setToolSpecification((String)newValue);
				return;
			case Dependability_Package.MAINTENANCE_PROCEDURE__STAFF_NUMBER:
				setStaffNumber((Integer)newValue);
				return;
			case Dependability_Package.MAINTENANCE_PROCEDURE__STAFF_SKILL_LEVEL:
				setStaffSkillLevel((String)newValue);
				return;
			case Dependability_Package.MAINTENANCE_PROCEDURE__STAFF_TRAINING_DESCRIPTION:
				setStaffTrainingDescription((String)newValue);
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
			case Dependability_Package.MAINTENANCE_PROCEDURE__ACTIVITY_DESCRIPTION:
				setActivityDescription(ACTIVITY_DESCRIPTION_EDEFAULT);
				return;
			case Dependability_Package.MAINTENANCE_PROCEDURE__TECHNICAL_DESCRIPTION:
				setTechnicalDescription(TECHNICAL_DESCRIPTION_EDEFAULT);
				return;
			case Dependability_Package.MAINTENANCE_PROCEDURE__TOOL_SPECIFICATION:
				setToolSpecification(TOOL_SPECIFICATION_EDEFAULT);
				return;
			case Dependability_Package.MAINTENANCE_PROCEDURE__STAFF_NUMBER:
				setStaffNumber(STAFF_NUMBER_EDEFAULT);
				return;
			case Dependability_Package.MAINTENANCE_PROCEDURE__STAFF_SKILL_LEVEL:
				setStaffSkillLevel(STAFF_SKILL_LEVEL_EDEFAULT);
				return;
			case Dependability_Package.MAINTENANCE_PROCEDURE__STAFF_TRAINING_DESCRIPTION:
				setStaffTrainingDescription(STAFF_TRAINING_DESCRIPTION_EDEFAULT);
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
			case Dependability_Package.MAINTENANCE_PROCEDURE__ACTIVITY_DESCRIPTION:
				return ACTIVITY_DESCRIPTION_EDEFAULT == null ? activityDescription != null : !ACTIVITY_DESCRIPTION_EDEFAULT.equals(activityDescription);
			case Dependability_Package.MAINTENANCE_PROCEDURE__TECHNICAL_DESCRIPTION:
				return TECHNICAL_DESCRIPTION_EDEFAULT == null ? technicalDescription != null : !TECHNICAL_DESCRIPTION_EDEFAULT.equals(technicalDescription);
			case Dependability_Package.MAINTENANCE_PROCEDURE__TOOL_SPECIFICATION:
				return TOOL_SPECIFICATION_EDEFAULT == null ? toolSpecification != null : !TOOL_SPECIFICATION_EDEFAULT.equals(toolSpecification);
			case Dependability_Package.MAINTENANCE_PROCEDURE__STAFF_NUMBER:
				return staffNumber != STAFF_NUMBER_EDEFAULT;
			case Dependability_Package.MAINTENANCE_PROCEDURE__STAFF_SKILL_LEVEL:
				return STAFF_SKILL_LEVEL_EDEFAULT == null ? staffSkillLevel != null : !STAFF_SKILL_LEVEL_EDEFAULT.equals(staffSkillLevel);
			case Dependability_Package.MAINTENANCE_PROCEDURE__STAFF_TRAINING_DESCRIPTION:
				return STAFF_TRAINING_DESCRIPTION_EDEFAULT == null ? staffTrainingDescription != null : !STAFF_TRAINING_DESCRIPTION_EDEFAULT.equals(staffTrainingDescription);
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
		result.append(" (activityDescription: ");
		result.append(activityDescription);
		result.append(", technicalDescription: ");
		result.append(technicalDescription);
		result.append(", toolSpecification: ");
		result.append(toolSpecification);
		result.append(", staffNumber: ");
		result.append(staffNumber);
		result.append(", staffSkillLevel: ");
		result.append(staffSkillLevel);
		result.append(", staffTrainingDescription: ");
		result.append(staffTrainingDescription);
		result.append(')');
		return result.toString();
	}

} //MaintenanceProcedureImpl
