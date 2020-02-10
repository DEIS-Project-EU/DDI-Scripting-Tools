/**
 */
package top.architecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import top.architecture.ArchitecturePackage;
import top.architecture.LifecycleCondition;
import top.architecture.LogicalComponent;
import top.architecture.PhysicalComponent;

import top.dependability.MaintenanceProcedure;

import top.odeBase.TimeUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.architecture.impl.PhysicalComponentImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link top.architecture.impl.PhysicalComponentImpl#getPricePerUnit <em>Price Per Unit</em>}</li>
 *   <li>{@link top.architecture.impl.PhysicalComponentImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link top.architecture.impl.PhysicalComponentImpl#getProtectionCategory <em>Protection Category</em>}</li>
 *   <li>{@link top.architecture.impl.PhysicalComponentImpl#getUsefulLifetime <em>Useful Lifetime</em>}</li>
 *   <li>{@link top.architecture.impl.PhysicalComponentImpl#getUsefulLifetimeTimeUnit <em>Useful Lifetime Time Unit</em>}</li>
 *   <li>{@link top.architecture.impl.PhysicalComponentImpl#getLifecycleConditions <em>Lifecycle Conditions</em>}</li>
 *   <li>{@link top.architecture.impl.PhysicalComponentImpl#getLogicalComponents <em>Logical Components</em>}</li>
 *   <li>{@link top.architecture.impl.PhysicalComponentImpl#getMaintenanceProcedure <em>Maintenance Procedure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalComponentImpl extends SystemImpl implements PhysicalComponent {
	/**
	 * The default value of the '{@link #getDimensions() <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final String DIMENSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected String dimensions = DIMENSIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPricePerUnit() <em>Price Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricePerUnit()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_PER_UNIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPricePerUnit() <em>Price Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricePerUnit()
	 * @generated
	 * @ordered
	 */
	protected int pricePerUnit = PRICE_PER_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMass() <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected static final double MASS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMass() <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected double mass = MASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtectionCategory() <em>Protection Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionCategory()
	 * @generated
	 * @ordered
	 */
	protected static final int PROTECTION_CATEGORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProtectionCategory() <em>Protection Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionCategory()
	 * @generated
	 * @ordered
	 */
	protected int protectionCategory = PROTECTION_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsefulLifetime() <em>Useful Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsefulLifetime()
	 * @generated
	 * @ordered
	 */
	protected static final double USEFUL_LIFETIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUsefulLifetime() <em>Useful Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsefulLifetime()
	 * @generated
	 * @ordered
	 */
	protected double usefulLifetime = USEFUL_LIFETIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsefulLifetimeTimeUnit() <em>Useful Lifetime Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsefulLifetimeTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit USEFUL_LIFETIME_TIME_UNIT_EDEFAULT = TimeUnit.MILLISECOND;

	/**
	 * The cached value of the '{@link #getUsefulLifetimeTimeUnit() <em>Useful Lifetime Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsefulLifetimeTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit usefulLifetimeTimeUnit = USEFUL_LIFETIME_TIME_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLifecycleConditions() <em>Lifecycle Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycleConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<LifecycleCondition> lifecycleConditions;

	/**
	 * The cached value of the '{@link #getLogicalComponents() <em>Logical Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComponent> logicalComponents;

	/**
	 * The cached value of the '{@link #getMaintenanceProcedure() <em>Maintenance Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintenanceProcedure()
	 * @generated
	 * @ordered
	 */
	protected MaintenanceProcedure maintenanceProcedure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.PHYSICAL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDimensions() {
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(String newDimensions) {
		String oldDimensions = dimensions;
		dimensions = newDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PHYSICAL_COMPONENT__DIMENSIONS, oldDimensions, dimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPricePerUnit() {
		return pricePerUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPricePerUnit(int newPricePerUnit) {
		int oldPricePerUnit = pricePerUnit;
		pricePerUnit = newPricePerUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PHYSICAL_COMPONENT__PRICE_PER_UNIT, oldPricePerUnit, pricePerUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMass() {
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMass(double newMass) {
		double oldMass = mass;
		mass = newMass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PHYSICAL_COMPONENT__MASS, oldMass, mass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProtectionCategory() {
		return protectionCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectionCategory(int newProtectionCategory) {
		int oldProtectionCategory = protectionCategory;
		protectionCategory = newProtectionCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PHYSICAL_COMPONENT__PROTECTION_CATEGORY, oldProtectionCategory, protectionCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUsefulLifetime() {
		return usefulLifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsefulLifetime(double newUsefulLifetime) {
		double oldUsefulLifetime = usefulLifetime;
		usefulLifetime = newUsefulLifetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PHYSICAL_COMPONENT__USEFUL_LIFETIME, oldUsefulLifetime, usefulLifetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getUsefulLifetimeTimeUnit() {
		return usefulLifetimeTimeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsefulLifetimeTimeUnit(TimeUnit newUsefulLifetimeTimeUnit) {
		TimeUnit oldUsefulLifetimeTimeUnit = usefulLifetimeTimeUnit;
		usefulLifetimeTimeUnit = newUsefulLifetimeTimeUnit == null ? USEFUL_LIFETIME_TIME_UNIT_EDEFAULT : newUsefulLifetimeTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PHYSICAL_COMPONENT__USEFUL_LIFETIME_TIME_UNIT, oldUsefulLifetimeTimeUnit, usefulLifetimeTimeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LifecycleCondition> getLifecycleConditions() {
		if (lifecycleConditions == null) {
			lifecycleConditions = new EObjectContainmentEList<LifecycleCondition>(LifecycleCondition.class, this, ArchitecturePackage.PHYSICAL_COMPONENT__LIFECYCLE_CONDITIONS);
		}
		return lifecycleConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalComponent> getLogicalComponents() {
		if (logicalComponents == null) {
			logicalComponents = new EObjectResolvingEList<LogicalComponent>(LogicalComponent.class, this, ArchitecturePackage.PHYSICAL_COMPONENT__LOGICAL_COMPONENTS);
		}
		return logicalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceProcedure getMaintenanceProcedure() {
		if (maintenanceProcedure != null && maintenanceProcedure.eIsProxy()) {
			InternalEObject oldMaintenanceProcedure = (InternalEObject)maintenanceProcedure;
			maintenanceProcedure = (MaintenanceProcedure)eResolveProxy(oldMaintenanceProcedure);
			if (maintenanceProcedure != oldMaintenanceProcedure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.PHYSICAL_COMPONENT__MAINTENANCE_PROCEDURE, oldMaintenanceProcedure, maintenanceProcedure));
			}
		}
		return maintenanceProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceProcedure basicGetMaintenanceProcedure() {
		return maintenanceProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintenanceProcedure(MaintenanceProcedure newMaintenanceProcedure) {
		MaintenanceProcedure oldMaintenanceProcedure = maintenanceProcedure;
		maintenanceProcedure = newMaintenanceProcedure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PHYSICAL_COMPONENT__MAINTENANCE_PROCEDURE, oldMaintenanceProcedure, maintenanceProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.PHYSICAL_COMPONENT__LIFECYCLE_CONDITIONS:
				return ((InternalEList<?>)getLifecycleConditions()).basicRemove(otherEnd, msgs);
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
			case ArchitecturePackage.PHYSICAL_COMPONENT__DIMENSIONS:
				return getDimensions();
			case ArchitecturePackage.PHYSICAL_COMPONENT__PRICE_PER_UNIT:
				return getPricePerUnit();
			case ArchitecturePackage.PHYSICAL_COMPONENT__MASS:
				return getMass();
			case ArchitecturePackage.PHYSICAL_COMPONENT__PROTECTION_CATEGORY:
				return getProtectionCategory();
			case ArchitecturePackage.PHYSICAL_COMPONENT__USEFUL_LIFETIME:
				return getUsefulLifetime();
			case ArchitecturePackage.PHYSICAL_COMPONENT__USEFUL_LIFETIME_TIME_UNIT:
				return getUsefulLifetimeTimeUnit();
			case ArchitecturePackage.PHYSICAL_COMPONENT__LIFECYCLE_CONDITIONS:
				return getLifecycleConditions();
			case ArchitecturePackage.PHYSICAL_COMPONENT__LOGICAL_COMPONENTS:
				return getLogicalComponents();
			case ArchitecturePackage.PHYSICAL_COMPONENT__MAINTENANCE_PROCEDURE:
				if (resolve) return getMaintenanceProcedure();
				return basicGetMaintenanceProcedure();
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
			case ArchitecturePackage.PHYSICAL_COMPONENT__DIMENSIONS:
				setDimensions((String)newValue);
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__PRICE_PER_UNIT:
				setPricePerUnit((Integer)newValue);
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__MASS:
				setMass((Double)newValue);
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__PROTECTION_CATEGORY:
				setProtectionCategory((Integer)newValue);
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__USEFUL_LIFETIME:
				setUsefulLifetime((Double)newValue);
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__USEFUL_LIFETIME_TIME_UNIT:
				setUsefulLifetimeTimeUnit((TimeUnit)newValue);
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__LIFECYCLE_CONDITIONS:
				getLifecycleConditions().clear();
				getLifecycleConditions().addAll((Collection<? extends LifecycleCondition>)newValue);
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__LOGICAL_COMPONENTS:
				getLogicalComponents().clear();
				getLogicalComponents().addAll((Collection<? extends LogicalComponent>)newValue);
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__MAINTENANCE_PROCEDURE:
				setMaintenanceProcedure((MaintenanceProcedure)newValue);
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
			case ArchitecturePackage.PHYSICAL_COMPONENT__DIMENSIONS:
				setDimensions(DIMENSIONS_EDEFAULT);
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__PRICE_PER_UNIT:
				setPricePerUnit(PRICE_PER_UNIT_EDEFAULT);
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__MASS:
				setMass(MASS_EDEFAULT);
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__PROTECTION_CATEGORY:
				setProtectionCategory(PROTECTION_CATEGORY_EDEFAULT);
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__USEFUL_LIFETIME:
				setUsefulLifetime(USEFUL_LIFETIME_EDEFAULT);
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__USEFUL_LIFETIME_TIME_UNIT:
				setUsefulLifetimeTimeUnit(USEFUL_LIFETIME_TIME_UNIT_EDEFAULT);
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__LIFECYCLE_CONDITIONS:
				getLifecycleConditions().clear();
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__LOGICAL_COMPONENTS:
				getLogicalComponents().clear();
				return;
			case ArchitecturePackage.PHYSICAL_COMPONENT__MAINTENANCE_PROCEDURE:
				setMaintenanceProcedure((MaintenanceProcedure)null);
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
			case ArchitecturePackage.PHYSICAL_COMPONENT__DIMENSIONS:
				return DIMENSIONS_EDEFAULT == null ? dimensions != null : !DIMENSIONS_EDEFAULT.equals(dimensions);
			case ArchitecturePackage.PHYSICAL_COMPONENT__PRICE_PER_UNIT:
				return pricePerUnit != PRICE_PER_UNIT_EDEFAULT;
			case ArchitecturePackage.PHYSICAL_COMPONENT__MASS:
				return mass != MASS_EDEFAULT;
			case ArchitecturePackage.PHYSICAL_COMPONENT__PROTECTION_CATEGORY:
				return protectionCategory != PROTECTION_CATEGORY_EDEFAULT;
			case ArchitecturePackage.PHYSICAL_COMPONENT__USEFUL_LIFETIME:
				return usefulLifetime != USEFUL_LIFETIME_EDEFAULT;
			case ArchitecturePackage.PHYSICAL_COMPONENT__USEFUL_LIFETIME_TIME_UNIT:
				return usefulLifetimeTimeUnit != USEFUL_LIFETIME_TIME_UNIT_EDEFAULT;
			case ArchitecturePackage.PHYSICAL_COMPONENT__LIFECYCLE_CONDITIONS:
				return lifecycleConditions != null && !lifecycleConditions.isEmpty();
			case ArchitecturePackage.PHYSICAL_COMPONENT__LOGICAL_COMPONENTS:
				return logicalComponents != null && !logicalComponents.isEmpty();
			case ArchitecturePackage.PHYSICAL_COMPONENT__MAINTENANCE_PROCEDURE:
				return maintenanceProcedure != null;
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
		result.append(" (dimensions: ");
		result.append(dimensions);
		result.append(", pricePerUnit: ");
		result.append(pricePerUnit);
		result.append(", mass: ");
		result.append(mass);
		result.append(", protectionCategory: ");
		result.append(protectionCategory);
		result.append(", usefulLifetime: ");
		result.append(usefulLifetime);
		result.append(", usefulLifetimeTimeUnit: ");
		result.append(usefulLifetimeTimeUnit);
		result.append(')');
		return result.toString();
	}

} //PhysicalComponentImpl
