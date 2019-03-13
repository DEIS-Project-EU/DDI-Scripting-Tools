/**
 */
package base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utility Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.UtilityElement#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see base.Base_Package#getUtilityElement()
 * @model abstract="true"
 * @generated
 */
public interface UtilityElement extends SACMElement {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(MultiLangString)
	 * @see base.Base_Package#getUtilityElement_Content()
	 * @model containment="true"
	 * @generated
	 */
	MultiLangString getContent();

	/**
	 * Sets the value of the '{@link base.UtilityElement#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(MultiLangString value);

} // UtilityElement
