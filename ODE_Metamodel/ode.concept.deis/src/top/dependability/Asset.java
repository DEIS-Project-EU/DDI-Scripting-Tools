/**
 */
package top.dependability;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.Asset#getFinancialValue <em>Financial Value</em>}</li>
 *   <li>{@link top.dependability.Asset#getFinancialCostType <em>Financial Cost Type</em>}</li>
 *   <li>{@link top.dependability.Asset#getOperationalCost <em>Operational Cost</em>}</li>
 *   <li>{@link top.dependability.Asset#getOperationalCostType <em>Operational Cost Type</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getAsset()
 * @model
 * @generated
 */
public interface Asset extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Financial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Financial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Financial Value</em>' attribute.
	 * @see #setFinancialValue(double)
	 * @see top.dependability.Dependability_Package#getAsset_FinancialValue()
	 * @model
	 * @generated
	 */
	double getFinancialValue();

	/**
	 * Sets the value of the '{@link top.dependability.Asset#getFinancialValue <em>Financial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Financial Value</em>' attribute.
	 * @see #getFinancialValue()
	 * @generated
	 */
	void setFinancialValue(double value);

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
	 * @see top.dependability.Dependability_Package#getAsset_FinancialCostType()
	 * @model
	 * @generated
	 */
	FinancialCostType getFinancialCostType();

	/**
	 * Sets the value of the '{@link top.dependability.Asset#getFinancialCostType <em>Financial Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Financial Cost Type</em>' attribute.
	 * @see top.dependability.FinancialCostType
	 * @see #getFinancialCostType()
	 * @generated
	 */
	void setFinancialCostType(FinancialCostType value);

	/**
	 * Returns the value of the '<em><b>Operational Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Cost</em>' attribute.
	 * @see #setOperationalCost(double)
	 * @see top.dependability.Dependability_Package#getAsset_OperationalCost()
	 * @model
	 * @generated
	 */
	double getOperationalCost();

	/**
	 * Sets the value of the '{@link top.dependability.Asset#getOperationalCost <em>Operational Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Cost</em>' attribute.
	 * @see #getOperationalCost()
	 * @generated
	 */
	void setOperationalCost(double value);

	/**
	 * Returns the value of the '<em><b>Operational Cost Type</b></em>' attribute.
	 * The literals are from the enumeration {@link top.dependability.OperationalCostType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Cost Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Cost Type</em>' attribute.
	 * @see top.dependability.OperationalCostType
	 * @see #setOperationalCostType(OperationalCostType)
	 * @see top.dependability.Dependability_Package#getAsset_OperationalCostType()
	 * @model
	 * @generated
	 */
	OperationalCostType getOperationalCostType();

	/**
	 * Sets the value of the '{@link top.dependability.Asset#getOperationalCostType <em>Operational Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Cost Type</em>' attribute.
	 * @see top.dependability.OperationalCostType
	 * @see #getOperationalCostType()
	 * @generated
	 */
	void setOperationalCostType(OperationalCostType value);

} // Asset
