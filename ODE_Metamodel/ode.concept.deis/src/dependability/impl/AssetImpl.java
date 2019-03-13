/**
 */
package dependability.impl;

import dependability.Asset;
import dependability.Dependability_Package;
import dependability.FinancialCostType;
import dependability.OperationalCostType;

import odeBase.impl.BaseElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dependability.impl.AssetImpl#getFinancialValue <em>Financial Value</em>}</li>
 *   <li>{@link dependability.impl.AssetImpl#getFinancialCostType <em>Financial Cost Type</em>}</li>
 *   <li>{@link dependability.impl.AssetImpl#getOperationalCost <em>Operational Cost</em>}</li>
 *   <li>{@link dependability.impl.AssetImpl#getOperationalCostType <em>Operational Cost Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetImpl extends BaseElementImpl implements Asset {
	/**
	 * The default value of the '{@link #getFinancialValue() <em>Financial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancialValue()
	 * @generated
	 * @ordered
	 */
	protected static final double FINANCIAL_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFinancialValue() <em>Financial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancialValue()
	 * @generated
	 * @ordered
	 */
	protected double financialValue = FINANCIAL_VALUE_EDEFAULT;

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
	 * The default value of the '{@link #getOperationalCost() <em>Operational Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalCost()
	 * @generated
	 * @ordered
	 */
	protected static final double OPERATIONAL_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOperationalCost() <em>Operational Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalCost()
	 * @generated
	 * @ordered
	 */
	protected double operationalCost = OPERATIONAL_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationalCostType() <em>Operational Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalCostType()
	 * @generated
	 * @ordered
	 */
	protected static final OperationalCostType OPERATIONAL_COST_TYPE_EDEFAULT = OperationalCostType.WORKHOURS;

	/**
	 * The cached value of the '{@link #getOperationalCostType() <em>Operational Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalCostType()
	 * @generated
	 * @ordered
	 */
	protected OperationalCostType operationalCostType = OPERATIONAL_COST_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFinancialValue() {
		return financialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinancialValue(double newFinancialValue) {
		double oldFinancialValue = financialValue;
		financialValue = newFinancialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.ASSET__FINANCIAL_VALUE, oldFinancialValue, financialValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.ASSET__FINANCIAL_COST_TYPE, oldFinancialCostType, financialCostType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOperationalCost() {
		return operationalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationalCost(double newOperationalCost) {
		double oldOperationalCost = operationalCost;
		operationalCost = newOperationalCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.ASSET__OPERATIONAL_COST, oldOperationalCost, operationalCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCostType getOperationalCostType() {
		return operationalCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationalCostType(OperationalCostType newOperationalCostType) {
		OperationalCostType oldOperationalCostType = operationalCostType;
		operationalCostType = newOperationalCostType == null ? OPERATIONAL_COST_TYPE_EDEFAULT : newOperationalCostType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.ASSET__OPERATIONAL_COST_TYPE, oldOperationalCostType, operationalCostType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.ASSET__FINANCIAL_VALUE:
				return getFinancialValue();
			case Dependability_Package.ASSET__FINANCIAL_COST_TYPE:
				return getFinancialCostType();
			case Dependability_Package.ASSET__OPERATIONAL_COST:
				return getOperationalCost();
			case Dependability_Package.ASSET__OPERATIONAL_COST_TYPE:
				return getOperationalCostType();
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
			case Dependability_Package.ASSET__FINANCIAL_VALUE:
				setFinancialValue((Double)newValue);
				return;
			case Dependability_Package.ASSET__FINANCIAL_COST_TYPE:
				setFinancialCostType((FinancialCostType)newValue);
				return;
			case Dependability_Package.ASSET__OPERATIONAL_COST:
				setOperationalCost((Double)newValue);
				return;
			case Dependability_Package.ASSET__OPERATIONAL_COST_TYPE:
				setOperationalCostType((OperationalCostType)newValue);
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
			case Dependability_Package.ASSET__FINANCIAL_VALUE:
				setFinancialValue(FINANCIAL_VALUE_EDEFAULT);
				return;
			case Dependability_Package.ASSET__FINANCIAL_COST_TYPE:
				setFinancialCostType(FINANCIAL_COST_TYPE_EDEFAULT);
				return;
			case Dependability_Package.ASSET__OPERATIONAL_COST:
				setOperationalCost(OPERATIONAL_COST_EDEFAULT);
				return;
			case Dependability_Package.ASSET__OPERATIONAL_COST_TYPE:
				setOperationalCostType(OPERATIONAL_COST_TYPE_EDEFAULT);
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
			case Dependability_Package.ASSET__FINANCIAL_VALUE:
				return financialValue != FINANCIAL_VALUE_EDEFAULT;
			case Dependability_Package.ASSET__FINANCIAL_COST_TYPE:
				return financialCostType != FINANCIAL_COST_TYPE_EDEFAULT;
			case Dependability_Package.ASSET__OPERATIONAL_COST:
				return operationalCost != OPERATIONAL_COST_EDEFAULT;
			case Dependability_Package.ASSET__OPERATIONAL_COST_TYPE:
				return operationalCostType != OPERATIONAL_COST_TYPE_EDEFAULT;
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
		result.append(" (financialValue: ");
		result.append(financialValue);
		result.append(", financialCostType: ");
		result.append(financialCostType);
		result.append(", operationalCost: ");
		result.append(operationalCost);
		result.append(", operationalCostType: ");
		result.append(operationalCostType);
		result.append(')');
		return result.toString();
	}

} //AssetImpl
