/**
 */
package artifact;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link artifact.Event#getOccurence <em>Occurence</em>}</li>
 * </ul>
 *
 * @see artifact.Artifact_Package#getEvent()
 * @model
 * @generated
 */
public interface Event extends ArtifactAsset {
	/**
	 * Returns the value of the '<em><b>Occurence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurence</em>' attribute.
	 * @see #setOccurence(Date)
	 * @see artifact.Artifact_Package#getEvent_Occurence()
	 * @model
	 * @generated
	 */
	Date getOccurence();

	/**
	 * Sets the value of the '{@link artifact.Event#getOccurence <em>Occurence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurence</em>' attribute.
	 * @see #getOccurence()
	 * @generated
	 */
	void setOccurence(Date value);

} // Event
