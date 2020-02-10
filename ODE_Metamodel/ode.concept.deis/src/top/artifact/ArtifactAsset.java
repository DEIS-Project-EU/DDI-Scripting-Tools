/**
 */
package top.artifact;

import org.eclipse.emf.common.util.EList;

import top.base.ArtifactElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.artifact.ArtifactAsset#getArtifactProperty <em>Artifact Property</em>}</li>
 * </ul>
 *
 * @see top.artifact.Artifact_Package#getArtifactAsset()
 * @model abstract="true"
 * @generated
 */
public interface ArtifactAsset extends ArtifactElement {
	/**
	 * Returns the value of the '<em><b>Artifact Property</b></em>' reference list.
	 * The list contents are of type {@link top.artifact.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Property</em>' reference list.
	 * @see top.artifact.Artifact_Package#getArtifactAsset_ArtifactProperty()
	 * @model
	 * @generated
	 */
	EList<Property> getArtifactProperty();

} // ArtifactAsset
