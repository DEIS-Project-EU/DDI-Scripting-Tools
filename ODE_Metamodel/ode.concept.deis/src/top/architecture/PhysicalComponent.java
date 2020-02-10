/**
 */
package top.architecture;

import org.eclipse.emf.common.util.EList;

import top.dependability.MaintenanceProcedure;

import top.odeBase.TimeUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.architecture.PhysicalComponent#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link top.architecture.PhysicalComponent#getPricePerUnit <em>Price Per Unit</em>}</li>
 *   <li>{@link top.architecture.PhysicalComponent#getMass <em>Mass</em>}</li>
 *   <li>{@link top.architecture.PhysicalComponent#getProtectionCategory <em>Protection Category</em>}</li>
 *   <li>{@link top.architecture.PhysicalComponent#getUsefulLifetime <em>Useful Lifetime</em>}</li>
 *   <li>{@link top.architecture.PhysicalComponent#getUsefulLifetimeTimeUnit <em>Useful Lifetime Time Unit</em>}</li>
 *   <li>{@link top.architecture.PhysicalComponent#getLifecycleConditions <em>Lifecycle Conditions</em>}</li>
 *   <li>{@link top.architecture.PhysicalComponent#getLogicalComponents <em>Logical Components</em>}</li>
 *   <li>{@link top.architecture.PhysicalComponent#getMaintenanceProcedure <em>Maintenance Procedure</em>}</li>
 * </ul>
 *
 * @see top.architecture.ArchitecturePackage#getPhysicalComponent()
 * @model
 * @generated
 */
public interface PhysicalComponent extends top.architecture.System {
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
	 * @see top.architecture.ArchitecturePackage#getPhysicalComponent_Dimensions()
	 * @model
	 * @generated
	 */
	String getDimensions();

	/**
	 * Sets the value of the '{@link top.architecture.PhysicalComponent#getDimensions <em>Dimensions</em>}' attribute.
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
	 * @see top.architecture.ArchitecturePackage#getPhysicalComponent_PricePerUnit()
	 * @model
	 * @generated
	 */
	int getPricePerUnit();

	/**
	 * Sets the value of the '{@link top.architecture.PhysicalComponent#getPricePerUnit <em>Price Per Unit</em>}' attribute.
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
	 * @see top.architecture.ArchitecturePackage#getPhysicalComponent_Mass()
	 * @model
	 * @generated
	 */
	double getMass();

	/**
	 * Sets the value of the '{@link top.architecture.PhysicalComponent#getMass <em>Mass</em>}' attribute.
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
	 * @see top.architecture.ArchitecturePackage#getPhysicalComponent_ProtectionCategory()
	 * @model
	 * @generated
	 */
	int getProtectionCategory();

	/**
	 * Sets the value of the '{@link top.architecture.PhysicalComponent#getProtectionCategory <em>Protection Category</em>}' attribute.
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
	 * @see top.architecture.ArchitecturePackage#getPhysicalComponent_UsefulLifetime()
	 * @model
	 * @generated
	 */
	double getUsefulLifetime();

	/**
	 * Sets the value of the '{@link top.architecture.PhysicalComponent#getUsefulLifetime <em>Useful Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Useful Lifetime</em>' attribute.
	 * @see #getUsefulLifetime()
	 * @generated
	 */
	void setUsefulLifetime(double value);

	/**
	 * Returns the value of the '<em><b>Useful Lifetime Time Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link top.odeBase.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Useful Lifetime Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Useful Lifetime Time Unit</em>' attribute.
	 * @see top.odeBase.TimeUnit
	 * @see #setUsefulLifetimeTimeUnit(TimeUnit)
	 * @see top.architecture.ArchitecturePackage#getPhysicalComponent_UsefulLifetimeTimeUnit()
	 * @model
	 * @generated
	 */
	TimeUnit getUsefulLifetimeTimeUnit();

	/**
	 * Sets the value of the '{@link top.architecture.PhysicalComponent#getUsefulLifetimeTimeUnit <em>Useful Lifetime Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Useful Lifetime Time Unit</em>' attribute.
	 * @see top.odeBase.TimeUnit
	 * @see #getUsefulLifetimeTimeUnit()
	 * @generated
	 */
	void setUsefulLifetimeTimeUnit(TimeUnit value);

	/**
	 * Returns the value of the '<em><b>Lifecycle Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link top.architecture.LifecycleCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifecycle Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle Conditions</em>' containment reference list.
	 * @see top.architecture.ArchitecturePackage#getPhysicalComponent_LifecycleConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<LifecycleCondition> getLifecycleConditions();

	/**
	 * Returns the value of the '<em><b>Logical Components</b></em>' reference list.
	 * The list contents are of type {@link top.architecture.LogicalComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Components</em>' reference list.
	 * @see top.architecture.ArchitecturePackage#getPhysicalComponent_LogicalComponents()
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
	 * @see top.architecture.ArchitecturePackage#getPhysicalComponent_MaintenanceProcedure()
	 * @model
	 * @generated
	 */
	MaintenanceProcedure getMaintenanceProcedure();

	/**
	 * Sets the value of the '{@link top.architecture.PhysicalComponent#getMaintenanceProcedure <em>Maintenance Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintenance Procedure</em>' reference.
	 * @see #getMaintenanceProcedure()
	 * @generated
	 */
	void setMaintenanceProcedure(MaintenanceProcedure value);

} // PhysicalComponent
