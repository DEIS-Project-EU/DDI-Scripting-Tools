/**
 */
package top.dependability.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import top.dependability.Dependability_Package;
import top.dependability.NonHuman;
import top.dependability.Payload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Human</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.impl.NonHumanImpl#getPayloads <em>Payloads</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonHumanImpl extends ThreatAgentImpl implements NonHuman {
	/**
	 * The cached value of the '{@link #getPayloads() <em>Payloads</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloads()
	 * @generated
	 * @ordered
	 */
	protected EList<Payload> payloads;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonHumanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.NON_HUMAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Payload> getPayloads() {
		if (payloads == null) {
			payloads = new EObjectResolvingEList<Payload>(Payload.class, this, Dependability_Package.NON_HUMAN__PAYLOADS);
		}
		return payloads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.NON_HUMAN__PAYLOADS:
				return getPayloads();
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
			case Dependability_Package.NON_HUMAN__PAYLOADS:
				getPayloads().clear();
				getPayloads().addAll((Collection<? extends Payload>)newValue);
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
			case Dependability_Package.NON_HUMAN__PAYLOADS:
				getPayloads().clear();
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
			case Dependability_Package.NON_HUMAN__PAYLOADS:
				return payloads != null && !payloads.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NonHumanImpl
