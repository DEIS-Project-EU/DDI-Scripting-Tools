/**
 */
package base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tagged Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.TaggedValue#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see base.Base_Package#getTaggedValue()
 * @model
 * @generated
 */
public interface TaggedValue extends UtilityElement {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(MultiLangString)
	 * @see base.Base_Package#getTaggedValue_Key()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultiLangString getKey();

	/**
	 * Sets the value of the '{@link base.TaggedValue#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(MultiLangString value);

} // TaggedValue
