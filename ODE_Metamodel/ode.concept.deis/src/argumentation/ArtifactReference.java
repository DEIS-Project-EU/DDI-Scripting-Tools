/**
 */
package argumentation;

import base.ArtifactElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.ArtifactReference#getReferencedArtifactElement <em>Referenced Artifact Element</em>}</li>
 * </ul>
 *
 * @see argumentation.Argumentation_Package#getArtifactReference()
 * @model
 * @generated
 */
public interface ArtifactReference extends ArgumentAsset {
	/**
	 * Returns the value of the '<em><b>Referenced Artifact Element</b></em>' reference list.
	 * The list contents are of type {@link base.ArtifactElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Artifact Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Artifact Element</em>' reference list.
	 * @see argumentation.Argumentation_Package#getArtifactReference_ReferencedArtifactElement()
	 * @model
	 * @generated
	 */
	EList<ArtifactElement> getReferencedArtifactElement();

} // ArtifactReference
