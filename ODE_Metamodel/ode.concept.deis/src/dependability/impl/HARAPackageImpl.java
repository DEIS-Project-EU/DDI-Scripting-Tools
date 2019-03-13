/**
 */
package dependability.impl;

import dependability.Dependability_Package;
import dependability.HARAPackage;
import dependability.Hazard;
import dependability.HazardType;
import dependability.HazardTypeSystem;
import dependability.Malfunction;
import dependability.RiskAssessment;
import dependability.RiskParameter;

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
 * An implementation of the model object '<em><b>HARA Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dependability.impl.HARAPackageImpl#getHazards <em>Hazards</em>}</li>
 *   <li>{@link dependability.impl.HARAPackageImpl#getHazardTypes <em>Hazard Types</em>}</li>
 *   <li>{@link dependability.impl.HARAPackageImpl#getHazardTypeSystems <em>Hazard Type Systems</em>}</li>
 *   <li>{@link dependability.impl.HARAPackageImpl#getMalfunctions <em>Malfunctions</em>}</li>
 *   <li>{@link dependability.impl.HARAPackageImpl#getRiskAssessments <em>Risk Assessments</em>}</li>
 *   <li>{@link dependability.impl.HARAPackageImpl#getRiskParameters <em>Risk Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HARAPackageImpl extends ODEProductPackageImpl implements HARAPackage {
	/**
	 * The cached value of the '{@link #getHazards() <em>Hazards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazards()
	 * @generated
	 * @ordered
	 */
	protected EList<Hazard> hazards;

	/**
	 * The cached value of the '{@link #getHazardTypes() <em>Hazard Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardType> hazardTypes;

	/**
	 * The cached value of the '{@link #getHazardTypeSystems() <em>Hazard Type Systems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardTypeSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardTypeSystem> hazardTypeSystems;

	/**
	 * The cached value of the '{@link #getMalfunctions() <em>Malfunctions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMalfunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Malfunction> malfunctions;

	/**
	 * The cached value of the '{@link #getRiskAssessments() <em>Risk Assessments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskAssessments()
	 * @generated
	 * @ordered
	 */
	protected EList<RiskAssessment> riskAssessments;

	/**
	 * The cached value of the '{@link #getRiskParameters() <em>Risk Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<RiskParameter> riskParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HARAPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.HARA_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hazard> getHazards() {
		if (hazards == null) {
			hazards = new EObjectContainmentEList<Hazard>(Hazard.class, this, Dependability_Package.HARA_PACKAGE__HAZARDS);
		}
		return hazards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardType> getHazardTypes() {
		if (hazardTypes == null) {
			hazardTypes = new EObjectContainmentEList<HazardType>(HazardType.class, this, Dependability_Package.HARA_PACKAGE__HAZARD_TYPES);
		}
		return hazardTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardTypeSystem> getHazardTypeSystems() {
		if (hazardTypeSystems == null) {
			hazardTypeSystems = new EObjectContainmentEList<HazardTypeSystem>(HazardTypeSystem.class, this, Dependability_Package.HARA_PACKAGE__HAZARD_TYPE_SYSTEMS);
		}
		return hazardTypeSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Malfunction> getMalfunctions() {
		if (malfunctions == null) {
			malfunctions = new EObjectContainmentEList<Malfunction>(Malfunction.class, this, Dependability_Package.HARA_PACKAGE__MALFUNCTIONS);
		}
		return malfunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RiskAssessment> getRiskAssessments() {
		if (riskAssessments == null) {
			riskAssessments = new EObjectContainmentEList<RiskAssessment>(RiskAssessment.class, this, Dependability_Package.HARA_PACKAGE__RISK_ASSESSMENTS);
		}
		return riskAssessments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RiskParameter> getRiskParameters() {
		if (riskParameters == null) {
			riskParameters = new EObjectContainmentEList<RiskParameter>(RiskParameter.class, this, Dependability_Package.HARA_PACKAGE__RISK_PARAMETERS);
		}
		return riskParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dependability_Package.HARA_PACKAGE__HAZARDS:
				return ((InternalEList<?>)getHazards()).basicRemove(otherEnd, msgs);
			case Dependability_Package.HARA_PACKAGE__HAZARD_TYPES:
				return ((InternalEList<?>)getHazardTypes()).basicRemove(otherEnd, msgs);
			case Dependability_Package.HARA_PACKAGE__HAZARD_TYPE_SYSTEMS:
				return ((InternalEList<?>)getHazardTypeSystems()).basicRemove(otherEnd, msgs);
			case Dependability_Package.HARA_PACKAGE__MALFUNCTIONS:
				return ((InternalEList<?>)getMalfunctions()).basicRemove(otherEnd, msgs);
			case Dependability_Package.HARA_PACKAGE__RISK_ASSESSMENTS:
				return ((InternalEList<?>)getRiskAssessments()).basicRemove(otherEnd, msgs);
			case Dependability_Package.HARA_PACKAGE__RISK_PARAMETERS:
				return ((InternalEList<?>)getRiskParameters()).basicRemove(otherEnd, msgs);
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
			case Dependability_Package.HARA_PACKAGE__HAZARDS:
				return getHazards();
			case Dependability_Package.HARA_PACKAGE__HAZARD_TYPES:
				return getHazardTypes();
			case Dependability_Package.HARA_PACKAGE__HAZARD_TYPE_SYSTEMS:
				return getHazardTypeSystems();
			case Dependability_Package.HARA_PACKAGE__MALFUNCTIONS:
				return getMalfunctions();
			case Dependability_Package.HARA_PACKAGE__RISK_ASSESSMENTS:
				return getRiskAssessments();
			case Dependability_Package.HARA_PACKAGE__RISK_PARAMETERS:
				return getRiskParameters();
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
			case Dependability_Package.HARA_PACKAGE__HAZARDS:
				getHazards().clear();
				getHazards().addAll((Collection<? extends Hazard>)newValue);
				return;
			case Dependability_Package.HARA_PACKAGE__HAZARD_TYPES:
				getHazardTypes().clear();
				getHazardTypes().addAll((Collection<? extends HazardType>)newValue);
				return;
			case Dependability_Package.HARA_PACKAGE__HAZARD_TYPE_SYSTEMS:
				getHazardTypeSystems().clear();
				getHazardTypeSystems().addAll((Collection<? extends HazardTypeSystem>)newValue);
				return;
			case Dependability_Package.HARA_PACKAGE__MALFUNCTIONS:
				getMalfunctions().clear();
				getMalfunctions().addAll((Collection<? extends Malfunction>)newValue);
				return;
			case Dependability_Package.HARA_PACKAGE__RISK_ASSESSMENTS:
				getRiskAssessments().clear();
				getRiskAssessments().addAll((Collection<? extends RiskAssessment>)newValue);
				return;
			case Dependability_Package.HARA_PACKAGE__RISK_PARAMETERS:
				getRiskParameters().clear();
				getRiskParameters().addAll((Collection<? extends RiskParameter>)newValue);
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
			case Dependability_Package.HARA_PACKAGE__HAZARDS:
				getHazards().clear();
				return;
			case Dependability_Package.HARA_PACKAGE__HAZARD_TYPES:
				getHazardTypes().clear();
				return;
			case Dependability_Package.HARA_PACKAGE__HAZARD_TYPE_SYSTEMS:
				getHazardTypeSystems().clear();
				return;
			case Dependability_Package.HARA_PACKAGE__MALFUNCTIONS:
				getMalfunctions().clear();
				return;
			case Dependability_Package.HARA_PACKAGE__RISK_ASSESSMENTS:
				getRiskAssessments().clear();
				return;
			case Dependability_Package.HARA_PACKAGE__RISK_PARAMETERS:
				getRiskParameters().clear();
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
			case Dependability_Package.HARA_PACKAGE__HAZARDS:
				return hazards != null && !hazards.isEmpty();
			case Dependability_Package.HARA_PACKAGE__HAZARD_TYPES:
				return hazardTypes != null && !hazardTypes.isEmpty();
			case Dependability_Package.HARA_PACKAGE__HAZARD_TYPE_SYSTEMS:
				return hazardTypeSystems != null && !hazardTypeSystems.isEmpty();
			case Dependability_Package.HARA_PACKAGE__MALFUNCTIONS:
				return malfunctions != null && !malfunctions.isEmpty();
			case Dependability_Package.HARA_PACKAGE__RISK_ASSESSMENTS:
				return riskAssessments != null && !riskAssessments.isEmpty();
			case Dependability_Package.HARA_PACKAGE__RISK_PARAMETERS:
				return riskParameters != null && !riskParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HARAPackageImpl
