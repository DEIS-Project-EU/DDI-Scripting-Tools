/**
 */
package argumentation;

import base.MultiLangString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.ArgumentAsset#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see argumentation.Argumentation_Package#getArgumentAsset()
 * @model abstract="true"
 * @generated
 */
public interface ArgumentAsset extends ArgumentationElement {
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
	 * @see argumentation.Argumentation_Package#getArgumentAsset_Content()
	 * @model containment="true"
	 * @generated
	 */
	MultiLangString getContent();

	/**
	 * Sets the value of the '{@link argumentation.ArgumentAsset#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(MultiLangString value);

} // ArgumentAsset
