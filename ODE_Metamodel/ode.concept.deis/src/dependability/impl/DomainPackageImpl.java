/**
 */
package dependability.impl;

import dependability.AssuranceLevel;
import dependability.Dependability_Package;
import dependability.DomainPackage;
import dependability.Standard;

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
 * An implementation of the model object '<em><b>Domain Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dependability.impl.DomainPackageImpl#getStandards <em>Standards</em>}</li>
 *   <li>{@link dependability.impl.DomainPackageImpl#getAssuranceLevels <em>Assurance Levels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainPackageImpl extends ODEProductPackageImpl implements DomainPackage {
	/**
	 * The cached value of the '{@link #getStandards() <em>Standards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandards()
	 * @generated
	 * @ordered
	 */
	protected EList<Standard> standards;

	/**
	 * The cached value of the '{@link #getAssuranceLevels() <em>Assurance Levels</em>}' containment reference list.
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
	protected DomainPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.DOMAIN_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Standard> getStandards() {
		if (standards == null) {
			standards = new EObjectContainmentEList<Standard>(Standard.class, this, Dependability_Package.DOMAIN_PACKAGE__STANDARDS);
		}
		return standards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssuranceLevel> getAssuranceLevels() {
		if (assuranceLevels == null) {
			assuranceLevels = new EObjectContainmentEList<AssuranceLevel>(AssuranceLevel.class, this, Dependability_Package.DOMAIN_PACKAGE__ASSURANCE_LEVELS);
		}
		return assuranceLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dependability_Package.DOMAIN_PACKAGE__STANDARDS:
				return ((InternalEList<?>)getStandards()).basicRemove(otherEnd, msgs);
			case Dependability_Package.DOMAIN_PACKAGE__ASSURANCE_LEVELS:
				return ((InternalEList<?>)getAssuranceLevels()).basicRemove(otherEnd, msgs);
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
			case Dependability_Package.DOMAIN_PACKAGE__STANDARDS:
				return getStandards();
			case Dependability_Package.DOMAIN_PACKAGE__ASSURANCE_LEVELS:
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
			case Dependability_Package.DOMAIN_PACKAGE__STANDARDS:
				getStandards().clear();
				getStandards().addAll((Collection<? extends Standard>)newValue);
				return;
			case Dependability_Package.DOMAIN_PACKAGE__ASSURANCE_LEVELS:
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
			case Dependability_Package.DOMAIN_PACKAGE__STANDARDS:
				getStandards().clear();
				return;
			case Dependability_Package.DOMAIN_PACKAGE__ASSURANCE_LEVELS:
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
			case Dependability_Package.DOMAIN_PACKAGE__STANDARDS:
				return standards != null && !standards.isEmpty();
			case Dependability_Package.DOMAIN_PACKAGE__ASSURANCE_LEVELS:
				return assuranceLevels != null && !assuranceLevels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainPackageImpl
