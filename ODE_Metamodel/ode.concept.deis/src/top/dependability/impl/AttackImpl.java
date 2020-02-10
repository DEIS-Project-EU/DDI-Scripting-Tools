/**
 */
package top.dependability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import top.dependability.Attack;
import top.dependability.Dependability_Package;
import top.dependability.FinancialCostType;
import top.dependability.Vulnerability;

import top.failureLogic.SecurityViolation;

import top.odeBase.TimeUnit;

import top.odeBase.impl.BaseElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.impl.AttackImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link top.dependability.impl.AttackImpl#getFinancialCost <em>Financial Cost</em>}</li>
 *   <li>{@link top.dependability.impl.AttackImpl#getFinancialCostType <em>Financial Cost Type</em>}</li>
 *   <li>{@link top.dependability.impl.AttackImpl#getTimeRequired <em>Time Required</em>}</li>
 *   <li>{@link top.dependability.impl.AttackImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link top.dependability.impl.AttackImpl#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link top.dependability.impl.AttackImpl#getDetectability <em>Detectability</em>}</li>
 *   <li>{@link top.dependability.impl.AttackImpl#getViolations <em>Violations</em>}</li>
 *   <li>{@link top.dependability.impl.AttackImpl#getExploitedVulnerabilities <em>Exploited Vulnerabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackImpl extends BaseElementImpl implements Attack {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinancialCost() <em>Financial Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancialCost()
	 * @generated
	 * @ordered
	 */
	protected static final double FINANCIAL_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFinancialCost() <em>Financial Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancialCost()
	 * @generated
	 * @ordered
	 */
	protected double financialCost = FINANCIAL_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinancialCostType() <em>Financial Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancialCostType()
	 * @generated
	 * @ordered
	 */
	protected static final FinancialCostType FINANCIAL_COST_TYPE_EDEFAULT = FinancialCostType.USD;

	/**
	 * The cached value of the '{@link #getFinancialCostType() <em>Financial Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancialCostType()
	 * @generated
	 * @ordered
	 */
	protected FinancialCostType financialCostType = FINANCIAL_COST_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeRequired() <em>Time Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeRequired()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_REQUIRED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimeRequired() <em>Time Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeRequired()
	 * @generated
	 * @ordered
	 */
	protected double timeRequired = TIME_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit TIME_UNIT_EDEFAULT = TimeUnit.MILLISECOND;

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit timeUnit = TIME_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected static final String DIFFICULTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected String difficulty = DIFFICULTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetectability() <em>Detectability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectability()
	 * @generated
	 * @ordered
	 */
	protected static final String DETECTABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetectability() <em>Detectability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectability()
	 * @generated
	 * @ordered
	 */
	protected String detectability = DETECTABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViolations() <em>Violations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolations()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityViolation> violations;

	/**
	 * The cached value of the '{@link #getExploitedVulnerabilities() <em>Exploited Vulnerabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExploitedVulnerabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Vulnerability> exploitedVulnerabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.ATTACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.ATTACK__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFinancialCost() {
		return financialCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinancialCost(double newFinancialCost) {
		double oldFinancialCost = financialCost;
		financialCost = newFinancialCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.ATTACK__FINANCIAL_COST, oldFinancialCost, financialCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialCostType getFinancialCostType() {
		return financialCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinancialCostType(FinancialCostType newFinancialCostType) {
		FinancialCostType oldFinancialCostType = financialCostType;
		financialCostType = newFinancialCostType == null ? FINANCIAL_COST_TYPE_EDEFAULT : newFinancialCostType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.ATTACK__FINANCIAL_COST_TYPE, oldFinancialCostType, financialCostType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimeRequired() {
		return timeRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeRequired(double newTimeRequired) {
		double oldTimeRequired = timeRequired;
		timeRequired = newTimeRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.ATTACK__TIME_REQUIRED, oldTimeRequired, timeRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getTimeUnit() {
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnit(TimeUnit newTimeUnit) {
		TimeUnit oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit == null ? TIME_UNIT_EDEFAULT : newTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.ATTACK__TIME_UNIT, oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDifficulty() {
		return difficulty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifficulty(String newDifficulty) {
		String oldDifficulty = difficulty;
		difficulty = newDifficulty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.ATTACK__DIFFICULTY, oldDifficulty, difficulty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetectability() {
		return detectability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetectability(String newDetectability) {
		String oldDetectability = detectability;
		detectability = newDetectability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.ATTACK__DETECTABILITY, oldDetectability, detectability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityViolation> getViolations() {
		if (violations == null) {
			violations = new EObjectResolvingEList<SecurityViolation>(SecurityViolation.class, this, Dependability_Package.ATTACK__VIOLATIONS);
		}
		return violations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vulnerability> getExploitedVulnerabilities() {
		if (exploitedVulnerabilities == null) {
			exploitedVulnerabilities = new EObjectResolvingEList<Vulnerability>(Vulnerability.class, this, Dependability_Package.ATTACK__EXPLOITED_VULNERABILITIES);
		}
		return exploitedVulnerabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.ATTACK__CATEGORY:
				return getCategory();
			case Dependability_Package.ATTACK__FINANCIAL_COST:
				return getFinancialCost();
			case Dependability_Package.ATTACK__FINANCIAL_COST_TYPE:
				return getFinancialCostType();
			case Dependability_Package.ATTACK__TIME_REQUIRED:
				return getTimeRequired();
			case Dependability_Package.ATTACK__TIME_UNIT:
				return getTimeUnit();
			case Dependability_Package.ATTACK__DIFFICULTY:
				return getDifficulty();
			case Dependability_Package.ATTACK__DETECTABILITY:
				return getDetectability();
			case Dependability_Package.ATTACK__VIOLATIONS:
				return getViolations();
			case Dependability_Package.ATTACK__EXPLOITED_VULNERABILITIES:
				return getExploitedVulnerabilities();
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
			case Dependability_Package.ATTACK__CATEGORY:
				setCategory((String)newValue);
				return;
			case Dependability_Package.ATTACK__FINANCIAL_COST:
				setFinancialCost((Double)newValue);
				return;
			case Dependability_Package.ATTACK__FINANCIAL_COST_TYPE:
				setFinancialCostType((FinancialCostType)newValue);
				return;
			case Dependability_Package.ATTACK__TIME_REQUIRED:
				setTimeRequired((Double)newValue);
				return;
			case Dependability_Package.ATTACK__TIME_UNIT:
				setTimeUnit((TimeUnit)newValue);
				return;
			case Dependability_Package.ATTACK__DIFFICULTY:
				setDifficulty((String)newValue);
				return;
			case Dependability_Package.ATTACK__DETECTABILITY:
				setDetectability((String)newValue);
				return;
			case Dependability_Package.ATTACK__VIOLATIONS:
				getViolations().clear();
				getViolations().addAll((Collection<? extends SecurityViolation>)newValue);
				return;
			case Dependability_Package.ATTACK__EXPLOITED_VULNERABILITIES:
				getExploitedVulnerabilities().clear();
				getExploitedVulnerabilities().addAll((Collection<? extends Vulnerability>)newValue);
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
			case Dependability_Package.ATTACK__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case Dependability_Package.ATTACK__FINANCIAL_COST:
				setFinancialCost(FINANCIAL_COST_EDEFAULT);
				return;
			case Dependability_Package.ATTACK__FINANCIAL_COST_TYPE:
				setFinancialCostType(FINANCIAL_COST_TYPE_EDEFAULT);
				return;
			case Dependability_Package.ATTACK__TIME_REQUIRED:
				setTimeRequired(TIME_REQUIRED_EDEFAULT);
				return;
			case Dependability_Package.ATTACK__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
				return;
			case Dependability_Package.ATTACK__DIFFICULTY:
				setDifficulty(DIFFICULTY_EDEFAULT);
				return;
			case Dependability_Package.ATTACK__DETECTABILITY:
				setDetectability(DETECTABILITY_EDEFAULT);
				return;
			case Dependability_Package.ATTACK__VIOLATIONS:
				getViolations().clear();
				return;
			case Dependability_Package.ATTACK__EXPLOITED_VULNERABILITIES:
				getExploitedVulnerabilities().clear();
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
			case Dependability_Package.ATTACK__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case Dependability_Package.ATTACK__FINANCIAL_COST:
				return financialCost != FINANCIAL_COST_EDEFAULT;
			case Dependability_Package.ATTACK__FINANCIAL_COST_TYPE:
				return financialCostType != FINANCIAL_COST_TYPE_EDEFAULT;
			case Dependability_Package.ATTACK__TIME_REQUIRED:
				return timeRequired != TIME_REQUIRED_EDEFAULT;
			case Dependability_Package.ATTACK__TIME_UNIT:
				return timeUnit != TIME_UNIT_EDEFAULT;
			case Dependability_Package.ATTACK__DIFFICULTY:
				return DIFFICULTY_EDEFAULT == null ? difficulty != null : !DIFFICULTY_EDEFAULT.equals(difficulty);
			case Dependability_Package.ATTACK__DETECTABILITY:
				return DETECTABILITY_EDEFAULT == null ? detectability != null : !DETECTABILITY_EDEFAULT.equals(detectability);
			case Dependability_Package.ATTACK__VIOLATIONS:
				return violations != null && !violations.isEmpty();
			case Dependability_Package.ATTACK__EXPLOITED_VULNERABILITIES:
				return exploitedVulnerabilities != null && !exploitedVulnerabilities.isEmpty();
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
		result.append(" (category: ");
		result.append(category);
		result.append(", financialCost: ");
		result.append(financialCost);
		result.append(", financialCostType: ");
		result.append(financialCostType);
		result.append(", timeRequired: ");
		result.append(timeRequired);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(", difficulty: ");
		result.append(difficulty);
		result.append(", detectability: ");
		result.append(detectability);
		result.append(')');
		return result.toString();
	}

} //AttackImpl
