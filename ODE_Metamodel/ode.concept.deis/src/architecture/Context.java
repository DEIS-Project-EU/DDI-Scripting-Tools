/**
 */
package architecture;

import odeBase.BaseElement;
import odeBase.TimeUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecture.Context#getUsageHistory <em>Usage History</em>}</li>
 *   <li>{@link architecture.Context#getMissionTime <em>Mission Time</em>}</li>
 *   <li>{@link architecture.Context#getMissionTimeTimeUnit <em>Mission Time Time Unit</em>}</li>
 * </ul>
 *
 * @see architecture.Architecture_Package#getContext()
 * @model
 * @generated
 */
public interface Context extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Usage History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage History</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage History</em>' attribute.
	 * @see #setUsageHistory(String)
	 * @see architecture.Architecture_Package#getContext_UsageHistory()
	 * @model
	 * @generated
	 */
	String getUsageHistory();

	/**
	 * Sets the value of the '{@link architecture.Context#getUsageHistory <em>Usage History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage History</em>' attribute.
	 * @see #getUsageHistory()
	 * @generated
	 */
	void setUsageHistory(String value);

	/**
	 * Returns the value of the '<em><b>Mission Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Time</em>' attribute.
	 * @see #setMissionTime(double)
	 * @see architecture.Architecture_Package#getContext_MissionTime()
	 * @model
	 * @generated
	 */
	double getMissionTime();

	/**
	 * Sets the value of the '{@link architecture.Context#getMissionTime <em>Mission Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission Time</em>' attribute.
	 * @see #getMissionTime()
	 * @generated
	 */
	void setMissionTime(double value);

	/**
	 * Returns the value of the '<em><b>Mission Time Time Unit</b></em>' attribute.
	 * The default value is <code>"Hour"</code>.
	 * The literals are from the enumeration {@link odeBase.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Time Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Time Time Unit</em>' attribute.
	 * @see odeBase.TimeUnit
	 * @see #setMissionTimeTimeUnit(TimeUnit)
	 * @see architecture.Architecture_Package#getContext_MissionTimeTimeUnit()
	 * @model default="Hour"
	 * @generated
	 */
	TimeUnit getMissionTimeTimeUnit();

	/**
	 * Sets the value of the '{@link architecture.Context#getMissionTimeTimeUnit <em>Mission Time Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission Time Time Unit</em>' attribute.
	 * @see odeBase.TimeUnit
	 * @see #getMissionTimeTimeUnit()
	 * @generated
	 */
	void setMissionTimeTimeUnit(TimeUnit value);

} // Context
