/**
 */
package artifact.impl;

import artifact.ArtifactPackage;
import artifact.Artifact_Package;

import base.ArtifactElement;

import base.impl.ArtifactElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link artifact.impl.ArtifactPackageImpl#getArtifactElement <em>Artifact Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactPackageImpl extends ArtifactElementImpl implements ArtifactPackage {
	/**
	 * The cached value of the '{@link #getArtifactElement() <em>Artifact Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactElement> artifactElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Artifact_Package.Literals.ARTIFACT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactElement> getArtifactElement() {
		if (artifactElement == null) {
			artifactElement = new EObjectContainmentEList<ArtifactElement>(ArtifactElement.class, this, Artifact_Package.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT);
		}
		return artifactElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Artifact_Package.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT:
				return ((InternalEList<?>)getArtifactElement()).basicRemove(otherEnd, msgs);
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
			case Artifact_Package.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT:
				return getArtifactElement();
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
			case Artifact_Package.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT:
				getArtifactElement().clear();
				getArtifactElement().addAll((Collection<? extends ArtifactElement>)newValue);
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
			case Artifact_Package.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT:
				getArtifactElement().clear();
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
			case Artifact_Package.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT:
				return artifactElement != null && !artifactElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactPackageImpl
