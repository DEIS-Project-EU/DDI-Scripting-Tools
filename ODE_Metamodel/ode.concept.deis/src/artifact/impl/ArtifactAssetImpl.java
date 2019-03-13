/**
 */
package artifact.impl;

import artifact.ArtifactAsset;
import artifact.Artifact_Package;
import artifact.Property;

import base.impl.ArtifactElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link artifact.impl.ArtifactAssetImpl#getArtifactProperty <em>Artifact Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArtifactAssetImpl extends ArtifactElementImpl implements ArtifactAsset {
	/**
	 * The cached value of the '{@link #getArtifactProperty() <em>Artifact Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> artifactProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Artifact_Package.Literals.ARTIFACT_ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getArtifactProperty() {
		if (artifactProperty == null) {
			artifactProperty = new EObjectResolvingEList<Property>(Property.class, this, Artifact_Package.ARTIFACT_ASSET__ARTIFACT_PROPERTY);
		}
		return artifactProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Artifact_Package.ARTIFACT_ASSET__ARTIFACT_PROPERTY:
				return getArtifactProperty();
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
			case Artifact_Package.ARTIFACT_ASSET__ARTIFACT_PROPERTY:
				getArtifactProperty().clear();
				getArtifactProperty().addAll((Collection<? extends Property>)newValue);
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
			case Artifact_Package.ARTIFACT_ASSET__ARTIFACT_PROPERTY:
				getArtifactProperty().clear();
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
			case Artifact_Package.ARTIFACT_ASSET__ARTIFACT_PROPERTY:
				return artifactProperty != null && !artifactProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactAssetImpl
