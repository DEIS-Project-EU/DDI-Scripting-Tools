/**
 */
package assuranceCase.impl;

import argumentation.ArgumentPackage;

import artifact.ArtifactPackage;

import assuranceCase.AssuranceCasePackage;
import assuranceCase.AssuranceCasePackageInterface;
import assuranceCase.AssuranceCase_Package;

import base.impl.ArtifactElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import terminology.TerminologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assurance Case Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assuranceCase.impl.AssuranceCasePackageImpl#getAssuranceCasePackage <em>Assurance Case Package</em>}</li>
 *   <li>{@link assuranceCase.impl.AssuranceCasePackageImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link assuranceCase.impl.AssuranceCasePackageImpl#getArtifactPackage <em>Artifact Package</em>}</li>
 *   <li>{@link assuranceCase.impl.AssuranceCasePackageImpl#getArgumentPackage <em>Argument Package</em>}</li>
 *   <li>{@link assuranceCase.impl.AssuranceCasePackageImpl#getTerminologyPackage <em>Terminology Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssuranceCasePackageImpl extends ArtifactElementImpl implements AssuranceCasePackage {
	/**
	 * The cached value of the '{@link #getAssuranceCasePackage() <em>Assurance Case Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssuranceCasePackage()
	 * @generated
	 * @ordered
	 */
	protected EList<AssuranceCasePackage> assuranceCasePackage;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<AssuranceCasePackageInterface> interface_;

	/**
	 * The cached value of the '{@link #getArtifactPackage() <em>Artifact Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactPackage> artifactPackage;

	/**
	 * The cached value of the '{@link #getArgumentPackage() <em>Argument Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentPackage> argumentPackage;

	/**
	 * The cached value of the '{@link #getTerminologyPackage() <em>Terminology Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminologyPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyPackage> terminologyPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssuranceCasePackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssuranceCasePackage> getAssuranceCasePackage() {
		if (assuranceCasePackage == null) {
			assuranceCasePackage = new EObjectContainmentEList<AssuranceCasePackage>(AssuranceCasePackage.class, this, AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE);
		}
		return assuranceCasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssuranceCasePackageInterface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectResolvingEList<AssuranceCasePackageInterface>(AssuranceCasePackageInterface.class, this, AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactPackage> getArtifactPackage() {
		if (artifactPackage == null) {
			artifactPackage = new EObjectContainmentEList<ArtifactPackage>(ArtifactPackage.class, this, AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ARTIFACT_PACKAGE);
		}
		return artifactPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentPackage> getArgumentPackage() {
		if (argumentPackage == null) {
			argumentPackage = new EObjectContainmentEList<ArgumentPackage>(ArgumentPackage.class, this, AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE);
		}
		return argumentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyPackage> getTerminologyPackage() {
		if (terminologyPackage == null) {
			terminologyPackage = new EObjectContainmentEList<TerminologyPackage>(TerminologyPackage.class, this, AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE);
		}
		return terminologyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE:
				return ((InternalEList<?>)getAssuranceCasePackage()).basicRemove(otherEnd, msgs);
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ARTIFACT_PACKAGE:
				return ((InternalEList<?>)getArtifactPackage()).basicRemove(otherEnd, msgs);
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE:
				return ((InternalEList<?>)getArgumentPackage()).basicRemove(otherEnd, msgs);
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE:
				return ((InternalEList<?>)getTerminologyPackage()).basicRemove(otherEnd, msgs);
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
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE:
				return getAssuranceCasePackage();
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__INTERFACE:
				return getInterface();
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ARTIFACT_PACKAGE:
				return getArtifactPackage();
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE:
				return getArgumentPackage();
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE:
				return getTerminologyPackage();
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
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE:
				getAssuranceCasePackage().clear();
				getAssuranceCasePackage().addAll((Collection<? extends AssuranceCasePackage>)newValue);
				return;
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends AssuranceCasePackageInterface>)newValue);
				return;
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ARTIFACT_PACKAGE:
				getArtifactPackage().clear();
				getArtifactPackage().addAll((Collection<? extends ArtifactPackage>)newValue);
				return;
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE:
				getArgumentPackage().clear();
				getArgumentPackage().addAll((Collection<? extends ArgumentPackage>)newValue);
				return;
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE:
				getTerminologyPackage().clear();
				getTerminologyPackage().addAll((Collection<? extends TerminologyPackage>)newValue);
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
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE:
				getAssuranceCasePackage().clear();
				return;
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__INTERFACE:
				getInterface().clear();
				return;
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ARTIFACT_PACKAGE:
				getArtifactPackage().clear();
				return;
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE:
				getArgumentPackage().clear();
				return;
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE:
				getTerminologyPackage().clear();
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
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE:
				return assuranceCasePackage != null && !assuranceCasePackage.isEmpty();
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ARTIFACT_PACKAGE:
				return artifactPackage != null && !artifactPackage.isEmpty();
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE:
				return argumentPackage != null && !argumentPackage.isEmpty();
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE:
				return terminologyPackage != null && !terminologyPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssuranceCasePackageImpl
