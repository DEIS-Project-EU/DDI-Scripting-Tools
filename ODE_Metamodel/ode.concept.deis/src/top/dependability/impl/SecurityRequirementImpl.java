/**
 */
package top.dependability.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import top.dependability.Dependability_Package;
import top.dependability.SecurityCapability;
import top.dependability.SecurityRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.impl.SecurityRequirementImpl#getSecurityCapabilities <em>Security Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityRequirementImpl extends DependabilityRequirementImpl implements SecurityRequirement {
	/**
	 * The cached value of the '{@link #getSecurityCapabilities() <em>Security Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityCapability> securityCapabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.SECURITY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityCapability> getSecurityCapabilities() {
		if (securityCapabilities == null) {
			securityCapabilities = new EObjectResolvingEList<SecurityCapability>(SecurityCapability.class, this, Dependability_Package.SECURITY_REQUIREMENT__SECURITY_CAPABILITIES);
		}
		return securityCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.SECURITY_REQUIREMENT__SECURITY_CAPABILITIES:
				return getSecurityCapabilities();
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
			case Dependability_Package.SECURITY_REQUIREMENT__SECURITY_CAPABILITIES:
				getSecurityCapabilities().clear();
				getSecurityCapabilities().addAll((Collection<? extends SecurityCapability>)newValue);
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
			case Dependability_Package.SECURITY_REQUIREMENT__SECURITY_CAPABILITIES:
				getSecurityCapabilities().clear();
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
			case Dependability_Package.SECURITY_REQUIREMENT__SECURITY_CAPABILITIES:
				return securityCapabilities != null && !securityCapabilities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecurityRequirementImpl
