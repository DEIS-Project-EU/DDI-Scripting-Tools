/**
 */
package dependability.impl;

import dependability.Dependability_Package;
import dependability.HazardType;
import dependability.HazardTypeSystem;

import java.util.Collection;

import odeBase.impl.BaseElementImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazard Type System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dependability.impl.HazardTypeSystemImpl#getHazardTypes <em>Hazard Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HazardTypeSystemImpl extends BaseElementImpl implements HazardTypeSystem {
	/**
	 * The cached value of the '{@link #getHazardTypes() <em>Hazard Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardType> hazardTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardTypeSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.HAZARD_TYPE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardType> getHazardTypes() {
		if (hazardTypes == null) {
			hazardTypes = new EObjectResolvingEList<HazardType>(HazardType.class, this, Dependability_Package.HAZARD_TYPE_SYSTEM__HAZARD_TYPES);
		}
		return hazardTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.HAZARD_TYPE_SYSTEM__HAZARD_TYPES:
				return getHazardTypes();
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
			case Dependability_Package.HAZARD_TYPE_SYSTEM__HAZARD_TYPES:
				getHazardTypes().clear();
				getHazardTypes().addAll((Collection<? extends HazardType>)newValue);
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
			case Dependability_Package.HAZARD_TYPE_SYSTEM__HAZARD_TYPES:
				getHazardTypes().clear();
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
			case Dependability_Package.HAZARD_TYPE_SYSTEM__HAZARD_TYPES:
				return hazardTypes != null && !hazardTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HazardTypeSystemImpl
