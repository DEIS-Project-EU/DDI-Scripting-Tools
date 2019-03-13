/**
 */
package architecture.impl;

import architecture.Architecture_Package;
import architecture.Configuration;

import java.util.Collection;

import odeBase.impl.BaseElementImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecture.impl.ConfigurationImpl#getSubSystems <em>Sub Systems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends BaseElementImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getSubSystems() <em>Sub Systems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<architecture.System> subSystems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Architecture_Package.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<architecture.System> getSubSystems() {
		if (subSystems == null) {
			subSystems = new EObjectResolvingEList<architecture.System>(architecture.System.class, this, Architecture_Package.CONFIGURATION__SUB_SYSTEMS);
		}
		return subSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Architecture_Package.CONFIGURATION__SUB_SYSTEMS:
				return getSubSystems();
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
			case Architecture_Package.CONFIGURATION__SUB_SYSTEMS:
				getSubSystems().clear();
				getSubSystems().addAll((Collection<? extends architecture.System>)newValue);
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
			case Architecture_Package.CONFIGURATION__SUB_SYSTEMS:
				getSubSystems().clear();
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
			case Architecture_Package.CONFIGURATION__SUB_SYSTEMS:
				return subSystems != null && !subSystems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
