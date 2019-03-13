/**
 */
package architecture;

import dependability.MaintenanceProcedure;

import odeBase.TimeUnit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecture.PhysicalComponent#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link architecture.PhysicalComponent#getPricePerUnit <em>Price Per Unit</em>}</li>
 *   <li>{@link architecture.PhysicalComponent#getMass <em>Mass</em>}</li>
 *   <li>{@link architecture.PhysicalComponent#getProtectionCategory <em>Protection Category</em>}</li>
 *   <li>{@link architecture.PhysicalComponent#getUsefulLifetime <em>Useful Lifetime</em>}</li>
 *   <li>{@link architecture.PhysicalComponent#getUsefulLifetimeTimeUnit <em>Useful Lifetime Time Unit</em>}</li>
 *   <li>{@link architecture.PhysicalComponent#getLifecycleConditions <em>Lifecycle Conditions</em>}</li>
 *   <li>{@link architecture.PhysicalComponent#getLogicalComponents <em>Logical Components</em>}</li>
 *   <li>{@link architecture.PhysicalComponent#getMaintenanceProcedure <em>Maintenance Procedure</em>}</li>
 * </ul>
 *
 * @see architecture.Architecture_Package#getPhysicalComponent()
 * @model
 * @generated
 */
public interface PhysicalComponent extends architecture.System {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' attribute.
	 * @see #setDimensions(String)
	 * @see architecture.Architecture_Package#getPhysicalComponent_Dimensions()
	 * @model
	 * @generated
	 */
	String getDimensions();

	/**
	 * Sets the value of the '{@link architecture.PhysicalComponent#getDimensions <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' attribute.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(String value);

	/**
	 * Returns the value of the '<em><b>Price Per Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Per Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Per Unit</em>' attribute.
	 * @see #setPricePerUnit(int)
	 * @see architecture.Architecture_Package#getPhysicalComponent_PricePerUnit()
	 * @model
	 * @generated
	 */
	int getPricePerUnit();

	/**
	 * Sets the value of the '{@link architecture.PhysicalComponent#getPricePerUnit <em>Price Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Per Unit</em>' attribute.
	 * @see #getPricePerUnit()
	 * @generated
	 */
	void setPricePerUnit(int value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' attribute.
	 * @see #setMass(double)
	 * @see architecture.Architecture_Package#getPhysicalComponent_Mass()
	 * @model
	 * @generated
	 */
	double getMass();

	/**
	 * Sets the value of the '{@link architecture.PhysicalComponent#getMass <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' attribute.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(double value);

	/**
	 * Returns the value of the '<em><b>Protection Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Category</em>' attribute.
	 * @see #setProtectionCategory(int)
	 * @see architecture.Architecture_Package#getPhysicalComponent_ProtectionCategory()
	 * @model
	 * @generated
	 */
	int getProtectionCategory();

	/**
	 * Sets the value of the '{@link architecture.PhysicalComponent#getProtectionCategory <em>Protection Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection Category</em>' attribute.
	 * @see #getProtectionCategory()
	 * @generated
	 */
	void setProtectionCategory(int value);

	/**
	 * Returns the value of the '<em><b>Useful Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Useful Lifetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Useful Lifetime</em>' attribute.
	 * @see #setUsefulLifetime(double)
	 * @see architecture.Architecture_Package#getPhysicalComponent_UsefulLifetime()
	 * @model
	 * @generated
	 */
	double getUsefulLifetime();

	/**
	 * Sets the value of the '{@link architecture.PhysicalComponent#getUsefulLifetime <em>Useful Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Useful Lifetime</em>' attribute.
	 * @see #getUsefulLifetime()
	 * @generated
	 */
	void setUsefulLifetime(double value);

	/**
	 * Returns the value of the '<em><b>Useful Lifetime Time Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link odeBase.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Useful Lifetime Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Useful Lifetime Time Unit</em>' attribute.
	 * @see odeBase.TimeUnit
	 * @see #setUsefulLifetimeTimeUnit(TimeUnit)
	 * @see architecture.Architecture_Package#getPhysicalComponent_UsefulLifetimeTimeUnit()
	 * @model
	 * @generated
	 */
	TimeUnit getUsefulLifetimeTimeUnit();

	/**
	 * Sets the value of the '{@link architecture.PhysicalComponent#getUsefulLifetimeTimeUnit <em>Useful Lifetime Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Useful Lifetime Time Unit</em>' attribute.
	 * @see odeBase.TimeUnit
	 * @see #getUsefulLifetimeTimeUnit()
	 * @generated
	 */
	void setUsefulLifetimeTimeUnit(TimeUnit value);

	/**
	 * Returns the value of the '<em><b>Lifecycle Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link architecture.LifecycleCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifecycle Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle Conditions</em>' containment reference list.
	 * @see architecture.Architecture_Package#getPhysicalComponent_LifecycleConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<LifecycleCondition> getLifecycleConditions();

	/**
	 * Returns the value of the '<em><b>Logical Components</b></em>' reference list.
	 * The list contents are of type {@link architecture.LogicalComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Components</em>' reference list.
	 * @see architecture.Architecture_Package#getPhysicalComponent_LogicalComponents()
	 * @model
	 * @generated
	 */
	EList<LogicalComponent> getLogicalComponents();

	/**
	 * Returns the value of the '<em><b>Maintenance Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintenance Procedure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintenance Procedure</em>' reference.
	 * @see #setMaintenanceProcedure(MaintenanceProcedure)
	 * @see architecture.Architecture_Package#getPhysicalComponent_MaintenanceProcedure()
	 * @model
	 * @generated
	 */
	MaintenanceProcedure getMaintenanceProcedure();

	/**
	 * Sets the value of the '{@link architecture.PhysicalComponent#getMaintenanceProcedure <em>Maintenance Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintenance Procedure</em>' reference.
	 * @see #getMaintenanceProcedure()
	 * @generated
	 */
	void setMaintenanceProcedure(MaintenanceProcedure value);

} // PhysicalComponent
