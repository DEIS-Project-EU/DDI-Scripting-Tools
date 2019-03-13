/**
 */
package dependability.impl;

import dependability.Asset;
import dependability.Dependability_Package;
import dependability.SecurityControl;
import dependability.SecurityRisk;
import dependability.TARAPackage;
import dependability.ThreatAgent;

import integration.impl.ODEProductPackageImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TARA Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dependability.impl.TARAPackageImpl#getIdentifiedRisks <em>Identified Risks</em>}</li>
 *   <li>{@link dependability.impl.TARAPackageImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link dependability.impl.TARAPackageImpl#getConsideredAssets <em>Considered Assets</em>}</li>
 *   <li>{@link dependability.impl.TARAPackageImpl#getConsideredThreatAgents <em>Considered Threat Agents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TARAPackageImpl extends ODEProductPackageImpl implements TARAPackage {
	/**
	 * The cached value of the '{@link #getIdentifiedRisks() <em>Identified Risks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiedRisks()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRisk> identifiedRisks;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityControl> controls;

	/**
	 * The cached value of the '{@link #getConsideredAssets() <em>Considered Assets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsideredAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> consideredAssets;

	/**
	 * The cached value of the '{@link #getConsideredThreatAgents() <em>Considered Threat Agents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsideredThreatAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreatAgent> consideredThreatAgents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TARAPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.TARA_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRisk> getIdentifiedRisks() {
		if (identifiedRisks == null) {
			identifiedRisks = new EObjectContainmentEList<SecurityRisk>(SecurityRisk.class, this, Dependability_Package.TARA_PACKAGE__IDENTIFIED_RISKS);
		}
		return identifiedRisks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityControl> getControls() {
		if (controls == null) {
			controls = new EObjectContainmentEList<SecurityControl>(SecurityControl.class, this, Dependability_Package.TARA_PACKAGE__CONTROLS);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getConsideredAssets() {
		if (consideredAssets == null) {
			consideredAssets = new EObjectContainmentEList<Asset>(Asset.class, this, Dependability_Package.TARA_PACKAGE__CONSIDERED_ASSETS);
		}
		return consideredAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThreatAgent> getConsideredThreatAgents() {
		if (consideredThreatAgents == null) {
			consideredThreatAgents = new EObjectContainmentEList<ThreatAgent>(ThreatAgent.class, this, Dependability_Package.TARA_PACKAGE__CONSIDERED_THREAT_AGENTS);
		}
		return consideredThreatAgents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dependability_Package.TARA_PACKAGE__IDENTIFIED_RISKS:
				return ((InternalEList<?>)getIdentifiedRisks()).basicRemove(otherEnd, msgs);
			case Dependability_Package.TARA_PACKAGE__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case Dependability_Package.TARA_PACKAGE__CONSIDERED_ASSETS:
				return ((InternalEList<?>)getConsideredAssets()).basicRemove(otherEnd, msgs);
			case Dependability_Package.TARA_PACKAGE__CONSIDERED_THREAT_AGENTS:
				return ((InternalEList<?>)getConsideredThreatAgents()).basicRemove(otherEnd, msgs);
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
			case Dependability_Package.TARA_PACKAGE__IDENTIFIED_RISKS:
				return getIdentifiedRisks();
			case Dependability_Package.TARA_PACKAGE__CONTROLS:
				return getControls();
			case Dependability_Package.TARA_PACKAGE__CONSIDERED_ASSETS:
				return getConsideredAssets();
			case Dependability_Package.TARA_PACKAGE__CONSIDERED_THREAT_AGENTS:
				return getConsideredThreatAgents();
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
			case Dependability_Package.TARA_PACKAGE__IDENTIFIED_RISKS:
				getIdentifiedRisks().clear();
				getIdentifiedRisks().addAll((Collection<? extends SecurityRisk>)newValue);
				return;
			case Dependability_Package.TARA_PACKAGE__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends SecurityControl>)newValue);
				return;
			case Dependability_Package.TARA_PACKAGE__CONSIDERED_ASSETS:
				getConsideredAssets().clear();
				getConsideredAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case Dependability_Package.TARA_PACKAGE__CONSIDERED_THREAT_AGENTS:
				getConsideredThreatAgents().clear();
				getConsideredThreatAgents().addAll((Collection<? extends ThreatAgent>)newValue);
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
			case Dependability_Package.TARA_PACKAGE__IDENTIFIED_RISKS:
				getIdentifiedRisks().clear();
				return;
			case Dependability_Package.TARA_PACKAGE__CONTROLS:
				getControls().clear();
				return;
			case Dependability_Package.TARA_PACKAGE__CONSIDERED_ASSETS:
				getConsideredAssets().clear();
				return;
			case Dependability_Package.TARA_PACKAGE__CONSIDERED_THREAT_AGENTS:
				getConsideredThreatAgents().clear();
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
			case Dependability_Package.TARA_PACKAGE__IDENTIFIED_RISKS:
				return identifiedRisks != null && !identifiedRisks.isEmpty();
			case Dependability_Package.TARA_PACKAGE__CONTROLS:
				return controls != null && !controls.isEmpty();
			case Dependability_Package.TARA_PACKAGE__CONSIDERED_ASSETS:
				return consideredAssets != null && !consideredAssets.isEmpty();
			case Dependability_Package.TARA_PACKAGE__CONSIDERED_THREAT_AGENTS:
				return consideredThreatAgents != null && !consideredThreatAgents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TARAPackageImpl
