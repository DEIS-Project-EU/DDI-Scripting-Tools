/**
 */
package top.integration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import top.assuranceCase.AssuranceCasePackage;

import top.integration.DDIPackage;
import top.integration.IntegrationPackage;
import top.integration.ODEProductPackage;

import top.odeBase.impl.BaseElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DDI Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.integration.impl.DDIPackageImpl#getOdeProductPackages <em>Ode Product Packages</em>}</li>
 *   <li>{@link top.integration.impl.DDIPackageImpl#getAssuranceCasePackages <em>Assurance Case Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DDIPackageImpl extends BaseElementImpl implements DDIPackage {
	/**
	 * The cached value of the '{@link #getOdeProductPackages() <em>Ode Product Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdeProductPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ODEProductPackage> odeProductPackages;

	/**
	 * The cached value of the '{@link #getAssuranceCasePackages() <em>Assurance Case Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssuranceCasePackages()
	 * @generated
	 * @ordered
	 */
	protected EList<AssuranceCasePackage> assuranceCasePackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DDIPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntegrationPackage.Literals.DDI_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODEProductPackage> getOdeProductPackages() {
		if (odeProductPackages == null) {
			odeProductPackages = new EObjectContainmentEList<ODEProductPackage>(ODEProductPackage.class, this, IntegrationPackage.DDI_PACKAGE__ODE_PRODUCT_PACKAGES);
		}
		return odeProductPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssuranceCasePackage> getAssuranceCasePackages() {
		if (assuranceCasePackages == null) {
			assuranceCasePackages = new EObjectContainmentEList<AssuranceCasePackage>(AssuranceCasePackage.class, this, IntegrationPackage.DDI_PACKAGE__ASSURANCE_CASE_PACKAGES);
		}
		return assuranceCasePackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntegrationPackage.DDI_PACKAGE__ODE_PRODUCT_PACKAGES:
				return ((InternalEList<?>)getOdeProductPackages()).basicRemove(otherEnd, msgs);
			case IntegrationPackage.DDI_PACKAGE__ASSURANCE_CASE_PACKAGES:
				return ((InternalEList<?>)getAssuranceCasePackages()).basicRemove(otherEnd, msgs);
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
			case IntegrationPackage.DDI_PACKAGE__ODE_PRODUCT_PACKAGES:
				return getOdeProductPackages();
			case IntegrationPackage.DDI_PACKAGE__ASSURANCE_CASE_PACKAGES:
				return getAssuranceCasePackages();
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
			case IntegrationPackage.DDI_PACKAGE__ODE_PRODUCT_PACKAGES:
				getOdeProductPackages().clear();
				getOdeProductPackages().addAll((Collection<? extends ODEProductPackage>)newValue);
				return;
			case IntegrationPackage.DDI_PACKAGE__ASSURANCE_CASE_PACKAGES:
				getAssuranceCasePackages().clear();
				getAssuranceCasePackages().addAll((Collection<? extends AssuranceCasePackage>)newValue);
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
			case IntegrationPackage.DDI_PACKAGE__ODE_PRODUCT_PACKAGES:
				getOdeProductPackages().clear();
				return;
			case IntegrationPackage.DDI_PACKAGE__ASSURANCE_CASE_PACKAGES:
				getAssuranceCasePackages().clear();
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
			case IntegrationPackage.DDI_PACKAGE__ODE_PRODUCT_PACKAGES:
				return odeProductPackages != null && !odeProductPackages.isEmpty();
			case IntegrationPackage.DDI_PACKAGE__ASSURANCE_CASE_PACKAGES:
				return assuranceCasePackages != null && !assuranceCasePackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DDIPackageImpl
