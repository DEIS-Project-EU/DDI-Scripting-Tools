/**
 */
package artifact;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Package Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link artifact.ArtifactPackageBinding#getParticipantPackage <em>Participant Package</em>}</li>
 * </ul>
 *
 * @see artifact.Artifact_Package#getArtifactPackageBinding()
 * @model
 * @generated
 */
public interface ArtifactPackageBinding extends ArtifactPackage {
	/**
	 * Returns the value of the '<em><b>Participant Package</b></em>' reference list.
	 * The list contents are of type {@link artifact.ArtifactPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Package</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Package</em>' reference list.
	 * @see artifact.Artifact_Package#getArtifactPackageBinding_ParticipantPackage()
	 * @model lower="2"
	 * @generated
	 */
	EList<ArtifactPackage> getParticipantPackage();

} // ArtifactPackageBinding
