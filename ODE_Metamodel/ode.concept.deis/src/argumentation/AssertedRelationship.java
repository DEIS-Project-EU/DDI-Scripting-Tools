/**
 */
package argumentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asserted Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.AssertedRelationship#isIsCounter <em>Is Counter</em>}</li>
 *   <li>{@link argumentation.AssertedRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link argumentation.AssertedRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link argumentation.AssertedRelationship#getReasoning <em>Reasoning</em>}</li>
 *   <li>{@link argumentation.AssertedRelationship#getRequies <em>Requies</em>}</li>
 * </ul>
 *
 * @see argumentation.Argumentation_Package#getAssertedRelationship()
 * @model abstract="true"
 * @generated
 */
public interface AssertedRelationship extends Assertion {
	/**
	 * Returns the value of the '<em><b>Is Counter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Counter</em>' attribute.
	 * @see #setIsCounter(boolean)
	 * @see argumentation.Argumentation_Package#getAssertedRelationship_IsCounter()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsCounter();

	/**
	 * Sets the value of the '{@link argumentation.AssertedRelationship#isIsCounter <em>Is Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Counter</em>' attribute.
	 * @see #isIsCounter()
	 * @generated
	 */
	void setIsCounter(boolean value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link argumentation.ArgumentAsset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see argumentation.Argumentation_Package#getAssertedRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	EList<ArgumentAsset> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link argumentation.ArgumentAsset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see argumentation.Argumentation_Package#getAssertedRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	EList<ArgumentAsset> getTarget();

	/**
	 * Returns the value of the '<em><b>Reasoning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reasoning</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reasoning</em>' reference.
	 * @see #setReasoning(ArgumentReasoning)
	 * @see argumentation.Argumentation_Package#getAssertedRelationship_Reasoning()
	 * @model
	 * @generated
	 */
	ArgumentReasoning getReasoning();

	/**
	 * Sets the value of the '{@link argumentation.AssertedRelationship#getReasoning <em>Reasoning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reasoning</em>' reference.
	 * @see #getReasoning()
	 * @generated
	 */
	void setReasoning(ArgumentReasoning value);

	/**
	 * Returns the value of the '<em><b>Requies</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requies</em>' attribute.
	 * @see #setRequies(int)
	 * @see argumentation.Argumentation_Package#getAssertedRelationship_Requies()
	 * @model default="0"
	 * @generated
	 */
	int getRequies();

	/**
	 * Sets the value of the '{@link argumentation.AssertedRelationship#getRequies <em>Requies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requies</em>' attribute.
	 * @see #getRequies()
	 * @generated
	 */
	void setRequies(int value);

} // AssertedRelationship
