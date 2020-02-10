/**
 */
package top.dependability;

import org.eclipse.emf.common.util.EList;

import top.failureLogic.SecurityViolation;

import top.odeBase.BaseElement;
import top.odeBase.TimeUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.Attack#getCategory <em>Category</em>}</li>
 *   <li>{@link top.dependability.Attack#getFinancialCost <em>Financial Cost</em>}</li>
 *   <li>{@link top.dependability.Attack#getFinancialCostType <em>Financial Cost Type</em>}</li>
 *   <li>{@link top.dependability.Attack#getTimeRequired <em>Time Required</em>}</li>
 *   <li>{@link top.dependability.Attack#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link top.dependability.Attack#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link top.dependability.Attack#getDetectability <em>Detectability</em>}</li>
 *   <li>{@link top.dependability.Attack#getViolations <em>Violations</em>}</li>
 *   <li>{@link top.dependability.Attack#getExploitedVulnerabilities <em>Exploited Vulnerabilities</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getAttack()
 * @model
 * @generated
 */
public interface Attack extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see top.dependability.Dependability_Package#getAttack_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link top.dependability.Attack#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Financial Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Financial Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Financial Cost</em>' attribute.
	 * @see #setFinancialCost(double)
	 * @see top.dependability.Dependability_Package#getAttack_FinancialCost()
	 * @model
	 * @generated
	 */
	double getFinancialCost();

	/**
	 * Sets the value of the '{@link top.dependability.Attack#getFinancialCost <em>Financial Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Financial Cost</em>' attribute.
	 * @see #getFinancialCost()
	 * @generated
	 */
	void setFinancialCost(double value);

	/**
	 * Returns the value of the '<em><b>Financial Cost Type</b></em>' attribute.
	 * The literals are from the enumeration {@link top.dependability.FinancialCostType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Financial Cost Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Financial Cost Type</em>' attribute.
	 * @see top.dependability.FinancialCostType
	 * @see #setFinancialCostType(FinancialCostType)
	 * @see top.dependability.Dependability_Package#getAttack_FinancialCostType()
	 * @model
	 * @generated
	 */
	FinancialCostType getFinancialCostType();

	/**
	 * Sets the value of the '{@link top.dependability.Attack#getFinancialCostType <em>Financial Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Financial Cost Type</em>' attribute.
	 * @see top.dependability.FinancialCostType
	 * @see #getFinancialCostType()
	 * @generated
	 */
	void setFinancialCostType(FinancialCostType value);

	/**
	 * Returns the value of the '<em><b>Time Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Required</em>' attribute.
	 * @see #setTimeRequired(double)
	 * @see top.dependability.Dependability_Package#getAttack_TimeRequired()
	 * @model
	 * @generated
	 */
	double getTimeRequired();

	/**
	 * Sets the value of the '{@link top.dependability.Attack#getTimeRequired <em>Time Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Required</em>' attribute.
	 * @see #getTimeRequired()
	 * @generated
	 */
	void setTimeRequired(double value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link top.odeBase.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see top.odeBase.TimeUnit
	 * @see #setTimeUnit(TimeUnit)
	 * @see top.dependability.Dependability_Package#getAttack_TimeUnit()
	 * @model
	 * @generated
	 */
	TimeUnit getTimeUnit();

	/**
	 * Sets the value of the '{@link top.dependability.Attack#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see top.odeBase.TimeUnit
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(TimeUnit value);

	/**
	 * Returns the value of the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difficulty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty</em>' attribute.
	 * @see #setDifficulty(String)
	 * @see top.dependability.Dependability_Package#getAttack_Difficulty()
	 * @model
	 * @generated
	 */
	String getDifficulty();

	/**
	 * Sets the value of the '{@link top.dependability.Attack#getDifficulty <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' attribute.
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(String value);

	/**
	 * Returns the value of the '<em><b>Detectability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detectability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detectability</em>' attribute.
	 * @see #setDetectability(String)
	 * @see top.dependability.Dependability_Package#getAttack_Detectability()
	 * @model
	 * @generated
	 */
	String getDetectability();

	/**
	 * Sets the value of the '{@link top.dependability.Attack#getDetectability <em>Detectability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detectability</em>' attribute.
	 * @see #getDetectability()
	 * @generated
	 */
	void setDetectability(String value);

	/**
	 * Returns the value of the '<em><b>Violations</b></em>' reference list.
	 * The list contents are of type {@link top.failureLogic.SecurityViolation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Violations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violations</em>' reference list.
	 * @see top.dependability.Dependability_Package#getAttack_Violations()
	 * @model
	 * @generated
	 */
	EList<SecurityViolation> getViolations();

	/**
	 * Returns the value of the '<em><b>Exploited Vulnerabilities</b></em>' reference list.
	 * The list contents are of type {@link top.dependability.Vulnerability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exploited Vulnerabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exploited Vulnerabilities</em>' reference list.
	 * @see top.dependability.Dependability_Package#getAttack_ExploitedVulnerabilities()
	 * @model
	 * @generated
	 */
	EList<Vulnerability> getExploitedVulnerabilities();

} // Attack
