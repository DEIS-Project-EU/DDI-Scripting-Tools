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

import top.dependability.DependabilityPackage;
import top.dependability.Dependability_Package;
import top.dependability.DomainPackage;
import top.dependability.HARAPackage;
import top.dependability.MaintenanceProcedure;
import top.dependability.Measure;
import top.dependability.MeasureType;
import top.dependability.RequirementPackage;
import top.dependability.TARAPackage;

import top.integration.impl.ODEProductPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependability Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.impl.DependabilityPackageImpl#getMeasures <em>Measures</em>}</li>
 *   <li>{@link top.dependability.impl.DependabilityPackageImpl#getMeasureTypes <em>Measure Types</em>}</li>
 *   <li>{@link top.dependability.impl.DependabilityPackageImpl#getMaintenanceProcedures <em>Maintenance Procedures</em>}</li>
 *   <li>{@link top.dependability.impl.DependabilityPackageImpl#getHARAPackages <em>HARA Packages</em>}</li>
 *   <li>{@link top.dependability.impl.DependabilityPackageImpl#getRequirementPackages <em>Requirement Packages</em>}</li>
 *   <li>{@link top.dependability.impl.DependabilityPackageImpl#getDomainPackages <em>Domain Packages</em>}</li>
 *   <li>{@link top.dependability.impl.DependabilityPackageImpl#getTARAPackages <em>TARA Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependabilityPackageImpl extends ODEProductPackageImpl implements DependabilityPackage {
	/**
	 * The cached value of the '{@link #getMeasures() <em>Measures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measures;

	/**
	 * The cached value of the '{@link #getMeasureTypes() <em>Measure Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> measureTypes;

	/**
	 * The cached value of the '{@link #getMaintenanceProcedures() <em>Maintenance Procedures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintenanceProcedures()
	 * @generated
	 * @ordered
	 */
	protected EList<MaintenanceProcedure> maintenanceProcedures;

	/**
	 * The cached value of the '{@link #getHARAPackages() <em>HARA Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHARAPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<HARAPackage> haraPackages;

	/**
	 * The cached value of the '{@link #getRequirementPackages() <em>Requirement Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementPackage> requirementPackages;

	/**
	 * The cached value of the '{@link #getDomainPackages() <em>Domain Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainPackage> domainPackages;

	/**
	 * The cached value of the '{@link #getTARAPackages() <em>TARA Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTARAPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<TARAPackage> taraPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependabilityPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.DEPENDABILITY_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getMeasures() {
		if (measures == null) {
			measures = new EObjectContainmentEList<Measure>(Measure.class, this, Dependability_Package.DEPENDABILITY_PACKAGE__MEASURES);
		}
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasureTypes() {
		if (measureTypes == null) {
			measureTypes = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, Dependability_Package.DEPENDABILITY_PACKAGE__MEASURE_TYPES);
		}
		return measureTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaintenanceProcedure> getMaintenanceProcedures() {
		if (maintenanceProcedures == null) {
			maintenanceProcedures = new EObjectContainmentEList<MaintenanceProcedure>(MaintenanceProcedure.class, this, Dependability_Package.DEPENDABILITY_PACKAGE__MAINTENANCE_PROCEDURES);
		}
		return maintenanceProcedures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HARAPackage> getHARAPackages() {
		if (haraPackages == null) {
			haraPackages = new EObjectContainmentEList<HARAPackage>(HARAPackage.class, this, Dependability_Package.DEPENDABILITY_PACKAGE__HARA_PACKAGES);
		}
		return haraPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementPackage> getRequirementPackages() {
		if (requirementPackages == null) {
			requirementPackages = new EObjectContainmentEList<RequirementPackage>(RequirementPackage.class, this, Dependability_Package.DEPENDABILITY_PACKAGE__REQUIREMENT_PACKAGES);
		}
		return requirementPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainPackage> getDomainPackages() {
		if (domainPackages == null) {
			domainPackages = new EObjectContainmentEList<DomainPackage>(DomainPackage.class, this, Dependability_Package.DEPENDABILITY_PACKAGE__DOMAIN_PACKAGES);
		}
		return domainPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TARAPackage> getTARAPackages() {
		if (taraPackages == null) {
			taraPackages = new EObjectContainmentEList<TARAPackage>(TARAPackage.class, this, Dependability_Package.DEPENDABILITY_PACKAGE__TARA_PACKAGES);
		}
		return taraPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dependability_Package.DEPENDABILITY_PACKAGE__MEASURES:
				return ((InternalEList<?>)getMeasures()).basicRemove(otherEnd, msgs);
			case Dependability_Package.DEPENDABILITY_PACKAGE__MEASURE_TYPES:
				return ((InternalEList<?>)getMeasureTypes()).basicRemove(otherEnd, msgs);
			case Dependability_Package.DEPENDABILITY_PACKAGE__MAINTENANCE_PROCEDURES:
				return ((InternalEList<?>)getMaintenanceProcedures()).basicRemove(otherEnd, msgs);
			case Dependability_Package.DEPENDABILITY_PACKAGE__HARA_PACKAGES:
				return ((InternalEList<?>)getHARAPackages()).basicRemove(otherEnd, msgs);
			case Dependability_Package.DEPENDABILITY_PACKAGE__REQUIREMENT_PACKAGES:
				return ((InternalEList<?>)getRequirementPackages()).basicRemove(otherEnd, msgs);
			case Dependability_Package.DEPENDABILITY_PACKAGE__DOMAIN_PACKAGES:
				return ((InternalEList<?>)getDomainPackages()).basicRemove(otherEnd, msgs);
			case Dependability_Package.DEPENDABILITY_PACKAGE__TARA_PACKAGES:
				return ((InternalEList<?>)getTARAPackages()).basicRemove(otherEnd, msgs);
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
			case Dependability_Package.DEPENDABILITY_PACKAGE__MEASURES:
				return getMeasures();
			case Dependability_Package.DEPENDABILITY_PACKAGE__MEASURE_TYPES:
				return getMeasureTypes();
			case Dependability_Package.DEPENDABILITY_PACKAGE__MAINTENANCE_PROCEDURES:
				return getMaintenanceProcedures();
			case Dependability_Package.DEPENDABILITY_PACKAGE__HARA_PACKAGES:
				return getHARAPackages();
			case Dependability_Package.DEPENDABILITY_PACKAGE__REQUIREMENT_PACKAGES:
				return getRequirementPackages();
			case Dependability_Package.DEPENDABILITY_PACKAGE__DOMAIN_PACKAGES:
				return getDomainPackages();
			case Dependability_Package.DEPENDABILITY_PACKAGE__TARA_PACKAGES:
				return getTARAPackages();
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
			case Dependability_Package.DEPENDABILITY_PACKAGE__MEASURES:
				getMeasures().clear();
				getMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
			case Dependability_Package.DEPENDABILITY_PACKAGE__MEASURE_TYPES:
				getMeasureTypes().clear();
				getMeasureTypes().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case Dependability_Package.DEPENDABILITY_PACKAGE__MAINTENANCE_PROCEDURES:
				getMaintenanceProcedures().clear();
				getMaintenanceProcedures().addAll((Collection<? extends MaintenanceProcedure>)newValue);
				return;
			case Dependability_Package.DEPENDABILITY_PACKAGE__HARA_PACKAGES:
				getHARAPackages().clear();
				getHARAPackages().addAll((Collection<? extends HARAPackage>)newValue);
				return;
			case Dependability_Package.DEPENDABILITY_PACKAGE__REQUIREMENT_PACKAGES:
				getRequirementPackages().clear();
				getRequirementPackages().addAll((Collection<? extends RequirementPackage>)newValue);
				return;
			case Dependability_Package.DEPENDABILITY_PACKAGE__DOMAIN_PACKAGES:
				getDomainPackages().clear();
				getDomainPackages().addAll((Collection<? extends DomainPackage>)newValue);
				return;
			case Dependability_Package.DEPENDABILITY_PACKAGE__TARA_PACKAGES:
				getTARAPackages().clear();
				getTARAPackages().addAll((Collection<? extends TARAPackage>)newValue);
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
			case Dependability_Package.DEPENDABILITY_PACKAGE__MEASURES:
				getMeasures().clear();
				return;
			case Dependability_Package.DEPENDABILITY_PACKAGE__MEASURE_TYPES:
				getMeasureTypes().clear();
				return;
			case Dependability_Package.DEPENDABILITY_PACKAGE__MAINTENANCE_PROCEDURES:
				getMaintenanceProcedures().clear();
				return;
			case Dependability_Package.DEPENDABILITY_PACKAGE__HARA_PACKAGES:
				getHARAPackages().clear();
				return;
			case Dependability_Package.DEPENDABILITY_PACKAGE__REQUIREMENT_PACKAGES:
				getRequirementPackages().clear();
				return;
			case Dependability_Package.DEPENDABILITY_PACKAGE__DOMAIN_PACKAGES:
				getDomainPackages().clear();
				return;
			case Dependability_Package.DEPENDABILITY_PACKAGE__TARA_PACKAGES:
				getTARAPackages().clear();
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
			case Dependability_Package.DEPENDABILITY_PACKAGE__MEASURES:
				return measures != null && !measures.isEmpty();
			case Dependability_Package.DEPENDABILITY_PACKAGE__MEASURE_TYPES:
				return measureTypes != null && !measureTypes.isEmpty();
			case Dependability_Package.DEPENDABILITY_PACKAGE__MAINTENANCE_PROCEDURES:
				return maintenanceProcedures != null && !maintenanceProcedures.isEmpty();
			case Dependability_Package.DEPENDABILITY_PACKAGE__HARA_PACKAGES:
				return haraPackages != null && !haraPackages.isEmpty();
			case Dependability_Package.DEPENDABILITY_PACKAGE__REQUIREMENT_PACKAGES:
				return requirementPackages != null && !requirementPackages.isEmpty();
			case Dependability_Package.DEPENDABILITY_PACKAGE__DOMAIN_PACKAGES:
				return domainPackages != null && !domainPackages.isEmpty();
			case Dependability_Package.DEPENDABILITY_PACKAGE__TARA_PACKAGES:
				return taraPackages != null && !taraPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DependabilityPackageImpl
