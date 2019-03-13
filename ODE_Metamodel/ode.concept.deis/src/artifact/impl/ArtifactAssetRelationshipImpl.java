/**
 */
package artifact.impl;

import artifact.ArtifactAsset;
import artifact.ArtifactAssetRelationship;
import artifact.Artifact_Package;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Asset Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link artifact.impl.ArtifactAssetRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link artifact.impl.ArtifactAssetRelationshipImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactAssetRelationshipImpl extends ArtifactAssetImpl implements ArtifactAssetRelationship {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactAsset> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactAsset> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactAssetRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Artifact_Package.Literals.ARTIFACT_ASSET_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactAsset> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<ArtifactAsset>(ArtifactAsset.class, this, Artifact_Package.ARTIFACT_ASSET_RELATIONSHIP__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactAsset> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<ArtifactAsset>(ArtifactAsset.class, this, Artifact_Package.ARTIFACT_ASSET_RELATIONSHIP__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Artifact_Package.ARTIFACT_ASSET_RELATIONSHIP__SOURCE:
				return getSource();
			case Artifact_Package.ARTIFACT_ASSET_RELATIONSHIP__TARGET:
				return getTarget();
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
			case Artifact_Package.ARTIFACT_ASSET_RELATIONSHIP__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends ArtifactAsset>)newValue);
				return;
			case Artifact_Package.ARTIFACT_ASSET_RELATIONSHIP__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends ArtifactAsset>)newValue);
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
			case Artifact_Package.ARTIFACT_ASSET_RELATIONSHIP__SOURCE:
				getSource().clear();
				return;
			case Artifact_Package.ARTIFACT_ASSET_RELATIONSHIP__TARGET:
				getTarget().clear();
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
			case Artifact_Package.ARTIFACT_ASSET_RELATIONSHIP__SOURCE:
				return source != null && !source.isEmpty();
			case Artifact_Package.ARTIFACT_ASSET_RELATIONSHIP__TARGET:
				return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactAssetRelationshipImpl
