/**
 */
package top.argumentation;

import org.eclipse.emf.common.util.EList;

import top.base.ArtifactElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.argumentation.ArtifactReference#getReferencedArtifactElement <em>Referenced Artifact Element</em>}</li>
 * </ul>
 *
 * @see top.argumentation.ArgumentationPackage#getArtifactReference()
 * @model
 * @generated
 */
public interface ArtifactReference extends ArgumentAsset {
	/**
	 * Returns the value of the '<em><b>Referenced Artifact Element</b></em>' reference list.
	 * The list contents are of type {@link top.base.ArtifactElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Artifact Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Artifact Element</em>' reference list.
	 * @see top.argumentation.ArgumentationPackage#getArtifactReference_ReferencedArtifactElement()
	 * @model
	 * @generated
	 */
	EList<ArtifactElement> getReferencedArtifactElement();

} // ArtifactReference
