/**
 */
package top.artifact;

import org.eclipse.emf.common.util.EList;

import top.base.ArtifactElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.artifact.ArtifactPackage#getArtifactElement <em>Artifact Element</em>}</li>
 * </ul>
 *
 * @see top.artifact.Artifact_Package#getArtifactPackage()
 * @model
 * @generated
 */
public interface ArtifactPackage extends ArtifactElement {
	/**
	 * Returns the value of the '<em><b>Artifact Element</b></em>' containment reference list.
	 * The list contents are of type {@link top.base.ArtifactElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Element</em>' containment reference list.
	 * @see top.artifact.Artifact_Package#getArtifactPackage_ArtifactElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtifactElement> getArtifactElement();

} // ArtifactPackage
