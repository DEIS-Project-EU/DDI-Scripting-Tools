/**
 */
package top.dependability.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import top.dependability.AssuranceLevel;
import top.dependability.Dependability_Package;
import top.dependability.SafetyStandard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Standard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.impl.SafetyStandardImpl#getAssuranceLevels <em>Assurance Levels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyStandardImpl extends StandardImpl implements SafetyStandard {
	/**
	 * The cached value of the '{@link #getAssuranceLevels() <em>Assurance Levels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssuranceLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<AssuranceLevel> assuranceLevels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyStandardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.SAFETY_STANDARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssuranceLevel> getAssuranceLevels() {
		if (assuranceLevels == null) {
			assuranceLevels = new EObjectResolvingEList<AssuranceLevel>(AssuranceLevel.class, this, Dependability_Package.SAFETY_STANDARD__ASSURANCE_LEVELS);
		}
		return assuranceLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.SAFETY_STANDARD__ASSURANCE_LEVELS:
				return getAssuranceLevels();
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
			case Dependability_Package.SAFETY_STANDARD__ASSURANCE_LEVELS:
				getAssuranceLevels().clear();
				getAssuranceLevels().addAll((Collection<? extends AssuranceLevel>)newValue);
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
			case Dependability_Package.SAFETY_STANDARD__ASSURANCE_LEVELS:
				getAssuranceLevels().clear();
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
			case Dependability_Package.SAFETY_STANDARD__ASSURANCE_LEVELS:
				return assuranceLevels != null && !assuranceLevels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SafetyStandardImpl
