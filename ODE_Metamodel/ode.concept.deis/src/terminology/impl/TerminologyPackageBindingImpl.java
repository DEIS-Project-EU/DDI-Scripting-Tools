/**
 */
package terminology.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import terminology.TerminologyPackage;
import terminology.TerminologyPackageBinding;
import terminology.Terminology_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Package Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link terminology.impl.TerminologyPackageBindingImpl#getParticipantPackage <em>Participant Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyPackageBindingImpl extends TerminologyPackageImpl implements TerminologyPackageBinding {
	/**
	 * The cached value of the '{@link #getParticipantPackage() <em>Participant Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyPackage> participantPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyPackageBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Terminology_Package.Literals.TERMINOLOGY_PACKAGE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyPackage> getParticipantPackage() {
		if (participantPackage == null) {
			participantPackage = new EObjectResolvingEList<TerminologyPackage>(TerminologyPackage.class, this, Terminology_Package.TERMINOLOGY_PACKAGE_BINDING__PARTICIPANT_PACKAGE);
		}
		return participantPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Terminology_Package.TERMINOLOGY_PACKAGE_BINDING__PARTICIPANT_PACKAGE:
				return getParticipantPackage();
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
			case Terminology_Package.TERMINOLOGY_PACKAGE_BINDING__PARTICIPANT_PACKAGE:
				getParticipantPackage().clear();
				getParticipantPackage().addAll((Collection<? extends TerminologyPackage>)newValue);
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
			case Terminology_Package.TERMINOLOGY_PACKAGE_BINDING__PARTICIPANT_PACKAGE:
				getParticipantPackage().clear();
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
			case Terminology_Package.TERMINOLOGY_PACKAGE_BINDING__PARTICIPANT_PACKAGE:
				return participantPackage != null && !participantPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TerminologyPackageBindingImpl
