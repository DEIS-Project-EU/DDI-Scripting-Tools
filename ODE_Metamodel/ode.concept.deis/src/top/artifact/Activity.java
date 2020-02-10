/**
 */
package top.artifact;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.artifact.Activity#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link top.artifact.Activity#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @see top.artifact.Artifact_Package#getActivity()
 * @model
 * @generated
 */
public interface Activity extends ArtifactAsset {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see top.artifact.Artifact_Package#getActivity_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link top.artifact.Activity#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @see top.artifact.Artifact_Package#getActivity_EndTime()
	 * @model
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link top.artifact.Activity#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

} // Activity
