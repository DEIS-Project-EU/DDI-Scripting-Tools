/**
 */
package argumentation.impl;

import argumentation.ArgumentPackage;
import argumentation.ArgumentPackageBinding;
import argumentation.Argumentation_Package;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Package Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link argumentation.impl.ArgumentPackageBindingImpl#getParticipantPackage <em>Participant Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentPackageBindingImpl extends ArgumentPackageImpl implements ArgumentPackageBinding {
	/**
	 * The cached value of the '{@link #getParticipantPackage() <em>Participant Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentPackage> participantPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentPackageBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Argumentation_Package.Literals.ARGUMENT_PACKAGE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentPackage> getParticipantPackage() {
		if (participantPackage == null) {
			participantPackage = new EObjectResolvingEList<ArgumentPackage>(ArgumentPackage.class, this, Argumentation_Package.ARGUMENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE);
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
			case Argumentation_Package.ARGUMENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE:
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
			case Argumentation_Package.ARGUMENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE:
				getParticipantPackage().clear();
				getParticipantPackage().addAll((Collection<? extends ArgumentPackage>)newValue);
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
			case Argumentation_Package.ARGUMENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE:
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
			case Argumentation_Package.ARGUMENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE:
				return participantPackage != null && !participantPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentPackageBindingImpl
