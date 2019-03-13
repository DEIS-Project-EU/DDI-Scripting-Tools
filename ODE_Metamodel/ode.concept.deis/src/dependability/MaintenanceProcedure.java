/**
 */
package dependability;

import odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maintenance Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dependability.MaintenanceProcedure#getActivityDescription <em>Activity Description</em>}</li>
 *   <li>{@link dependability.MaintenanceProcedure#getTechnicalDescription <em>Technical Description</em>}</li>
 *   <li>{@link dependability.MaintenanceProcedure#getToolSpecification <em>Tool Specification</em>}</li>
 *   <li>{@link dependability.MaintenanceProcedure#getStaffNumber <em>Staff Number</em>}</li>
 *   <li>{@link dependability.MaintenanceProcedure#getStaffSkillLevel <em>Staff Skill Level</em>}</li>
 *   <li>{@link dependability.MaintenanceProcedure#getStaffTrainingDescription <em>Staff Training Description</em>}</li>
 * </ul>
 *
 * @see dependability.Dependability_Package#getMaintenanceProcedure()
 * @model
 * @generated
 */
public interface MaintenanceProcedure extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Activity Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Description</em>' attribute.
	 * @see #setActivityDescription(String)
	 * @see dependability.Dependability_Package#getMaintenanceProcedure_ActivityDescription()
	 * @model
	 * @generated
	 */
	String getActivityDescription();

	/**
	 * Sets the value of the '{@link dependability.MaintenanceProcedure#getActivityDescription <em>Activity Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Description</em>' attribute.
	 * @see #getActivityDescription()
	 * @generated
	 */
	void setActivityDescription(String value);

	/**
	 * Returns the value of the '<em><b>Technical Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technical Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technical Description</em>' attribute.
	 * @see #setTechnicalDescription(String)
	 * @see dependability.Dependability_Package#getMaintenanceProcedure_TechnicalDescription()
	 * @model
	 * @generated
	 */
	String getTechnicalDescription();

	/**
	 * Sets the value of the '{@link dependability.MaintenanceProcedure#getTechnicalDescription <em>Technical Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technical Description</em>' attribute.
	 * @see #getTechnicalDescription()
	 * @generated
	 */
	void setTechnicalDescription(String value);

	/**
	 * Returns the value of the '<em><b>Tool Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Specification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Specification</em>' attribute.
	 * @see #setToolSpecification(String)
	 * @see dependability.Dependability_Package#getMaintenanceProcedure_ToolSpecification()
	 * @model
	 * @generated
	 */
	String getToolSpecification();

	/**
	 * Sets the value of the '{@link dependability.MaintenanceProcedure#getToolSpecification <em>Tool Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Specification</em>' attribute.
	 * @see #getToolSpecification()
	 * @generated
	 */
	void setToolSpecification(String value);

	/**
	 * Returns the value of the '<em><b>Staff Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff Number</em>' attribute.
	 * @see #setStaffNumber(int)
	 * @see dependability.Dependability_Package#getMaintenanceProcedure_StaffNumber()
	 * @model
	 * @generated
	 */
	int getStaffNumber();

	/**
	 * Sets the value of the '{@link dependability.MaintenanceProcedure#getStaffNumber <em>Staff Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff Number</em>' attribute.
	 * @see #getStaffNumber()
	 * @generated
	 */
	void setStaffNumber(int value);

	/**
	 * Returns the value of the '<em><b>Staff Skill Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff Skill Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff Skill Level</em>' attribute.
	 * @see #setStaffSkillLevel(String)
	 * @see dependability.Dependability_Package#getMaintenanceProcedure_StaffSkillLevel()
	 * @model
	 * @generated
	 */
	String getStaffSkillLevel();

	/**
	 * Sets the value of the '{@link dependability.MaintenanceProcedure#getStaffSkillLevel <em>Staff Skill Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff Skill Level</em>' attribute.
	 * @see #getStaffSkillLevel()
	 * @generated
	 */
	void setStaffSkillLevel(String value);

	/**
	 * Returns the value of the '<em><b>Staff Training Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff Training Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff Training Description</em>' attribute.
	 * @see #setStaffTrainingDescription(String)
	 * @see dependability.Dependability_Package#getMaintenanceProcedure_StaffTrainingDescription()
	 * @model
	 * @generated
	 */
	String getStaffTrainingDescription();

	/**
	 * Sets the value of the '{@link dependability.MaintenanceProcedure#getStaffTrainingDescription <em>Staff Training Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff Training Description</em>' attribute.
	 * @see #getStaffTrainingDescription()
	 * @generated
	 */
	void setStaffTrainingDescription(String value);

} // MaintenanceProcedure
