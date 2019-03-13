/**
 */
package artifact;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Asset Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link artifact.ArtifactAssetRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link artifact.ArtifactAssetRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see artifact.Artifact_Package#getArtifactAssetRelationship()
 * @model
 * @generated
 */
public interface ArtifactAssetRelationship extends ArtifactAsset {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link artifact.ArtifactAsset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see artifact.Artifact_Package#getArtifactAssetRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	EList<ArtifactAsset> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link artifact.ArtifactAsset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see artifact.Artifact_Package#getArtifactAssetRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	EList<ArtifactAsset> getTarget();

} // ArtifactAssetRelationship
