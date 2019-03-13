/**
 */
package artifact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Package Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link artifact.ArtifactPackageInterface#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see artifact.Artifact_Package#getArtifactPackageInterface()
 * @model
 * @generated
 */
public interface ArtifactPackageInterface extends ArtifactPackage {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(ArtifactPackage)
	 * @see artifact.Artifact_Package#getArtifactPackageInterface_Implements()
	 * @model required="true"
	 * @generated
	 */
	ArtifactPackage getImplements();

	/**
	 * Sets the value of the '{@link artifact.ArtifactPackageInterface#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(ArtifactPackage value);

} // ArtifactPackageInterface
