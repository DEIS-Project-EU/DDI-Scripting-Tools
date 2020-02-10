/**
 */
package top.dependability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import top.dependability.DependabilityRequirement;
import top.dependability.Dependability_Package;
import top.dependability.RequirementPackage;
import top.dependability.RequirementSource;

import top.integration.impl.ODEProductPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.impl.RequirementPackageImpl#getRequirementSources <em>Requirement Sources</em>}</li>
 *   <li>{@link top.dependability.impl.RequirementPackageImpl#getDependabilityRequirements <em>Dependability Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementPackageImpl extends ODEProductPackageImpl implements RequirementPackage {
	/**
	 * The cached value of the '{@link #getRequirementSources() <em>Requirement Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementSources()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementSource> requirementSources;

	/**
	 * The cached value of the '{@link #getDependabilityRequirements() <em>Dependability Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependabilityRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<DependabilityRequirement> dependabilityRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.REQUIREMENT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementSource> getRequirementSources() {
		if (requirementSources == null) {
			requirementSources = new EObjectContainmentEList<RequirementSource>(RequirementSource.class, this, Dependability_Package.REQUIREMENT_PACKAGE__REQUIREMENT_SOURCES);
		}
		return requirementSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependabilityRequirement> getDependabilityRequirements() {
		if (dependabilityRequirements == null) {
			dependabilityRequirements = new EObjectContainmentEList<DependabilityRequirement>(DependabilityRequirement.class, this, Dependability_Package.REQUIREMENT_PACKAGE__DEPENDABILITY_REQUIREMENTS);
		}
		return dependabilityRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dependability_Package.REQUIREMENT_PACKAGE__REQUIREMENT_SOURCES:
				return ((InternalEList<?>)getRequirementSources()).basicRemove(otherEnd, msgs);
			case Dependability_Package.REQUIREMENT_PACKAGE__DEPENDABILITY_REQUIREMENTS:
				return ((InternalEList<?>)getDependabilityRequirements()).basicRemove(otherEnd, msgs);
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
			case Dependability_Package.REQUIREMENT_PACKAGE__REQUIREMENT_SOURCES:
				return getRequirementSources();
			case Dependability_Package.REQUIREMENT_PACKAGE__DEPENDABILITY_REQUIREMENTS:
				return getDependabilityRequirements();
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
			case Dependability_Package.REQUIREMENT_PACKAGE__REQUIREMENT_SOURCES:
				getRequirementSources().clear();
				getRequirementSources().addAll((Collection<? extends RequirementSource>)newValue);
				return;
			case Dependability_Package.REQUIREMENT_PACKAGE__DEPENDABILITY_REQUIREMENTS:
				getDependabilityRequirements().clear();
				getDependabilityRequirements().addAll((Collection<? extends DependabilityRequirement>)newValue);
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
			case Dependability_Package.REQUIREMENT_PACKAGE__REQUIREMENT_SOURCES:
				getRequirementSources().clear();
				return;
			case Dependability_Package.REQUIREMENT_PACKAGE__DEPENDABILITY_REQUIREMENTS:
				getDependabilityRequirements().clear();
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
			case Dependability_Package.REQUIREMENT_PACKAGE__REQUIREMENT_SOURCES:
				return requirementSources != null && !requirementSources.isEmpty();
			case Dependability_Package.REQUIREMENT_PACKAGE__DEPENDABILITY_REQUIREMENTS:
				return dependabilityRequirements != null && !dependabilityRequirements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementPackageImpl
