/**
 */
package artifact.impl;

import artifact.ArtifactPackage;
import artifact.ArtifactPackageBinding;
import artifact.Artifact_Package;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Package Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link artifact.impl.ArtifactPackageBindingImpl#getParticipantPackage <em>Participant Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactPackageBindingImpl extends ArtifactPackageImpl implements ArtifactPackageBinding {
	/**
	 * The cached value of the '{@link #getParticipantPackage() <em>Participant Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactPackage> participantPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactPackageBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Artifact_Package.Literals.ARTIFACT_PACKAGE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactPackage> getParticipantPackage() {
		if (participantPackage == null) {
			participantPackage = new EObjectResolvingEList<ArtifactPackage>(ArtifactPackage.class, this, Artifact_Package.ARTIFACT_PACKAGE_BINDING__PARTICIPANT_PACKAGE);
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
			case Artifact_Package.ARTIFACT_PACKAGE_BINDING__PARTICIPANT_PACKAGE:
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
			case Artifact_Package.ARTIFACT_PACKAGE_BINDING__PARTICIPANT_PACKAGE:
				getParticipantPackage().clear();
				getParticipantPackage().addAll((Collection<? extends ArtifactPackage>)newValue);
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
			case Artifact_Package.ARTIFACT_PACKAGE_BINDING__PARTICIPANT_PACKAGE:
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
			case Artifact_Package.ARTIFACT_PACKAGE_BINDING__PARTICIPANT_PACKAGE:
				return participantPackage != null && !participantPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactPackageBindingImpl
