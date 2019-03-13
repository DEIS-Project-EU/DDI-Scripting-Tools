/**
 */
package base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SACM Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.SACMElement#getGid <em>Gid</em>}</li>
 *   <li>{@link base.SACMElement#isIsCitation <em>Is Citation</em>}</li>
 *   <li>{@link base.SACMElement#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link base.SACMElement#getCitedElement <em>Cited Element</em>}</li>
 *   <li>{@link base.SACMElement#getAbstractForm <em>Abstract Form</em>}</li>
 * </ul>
 *
 * @see base.Base_Package#getSACMElement()
 * @model abstract="true"
 * @generated
 */
public interface SACMElement extends Element {
	/**
	 * Returns the value of the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gid</em>' attribute.
	 * @see #setGid(String)
	 * @see base.Base_Package#getSACMElement_Gid()
	 * @model
	 * @generated
	 */
	String getGid();

	/**
	 * Sets the value of the '{@link base.SACMElement#getGid <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gid</em>' attribute.
	 * @see #getGid()
	 * @generated
	 */
	void setGid(String value);

	/**
	 * Returns the value of the '<em><b>Is Citation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Citation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Citation</em>' attribute.
	 * @see #setIsCitation(boolean)
	 * @see base.Base_Package#getSACMElement_IsCitation()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsCitation();

	/**
	 * Sets the value of the '{@link base.SACMElement#isIsCitation <em>Is Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Citation</em>' attribute.
	 * @see #isIsCitation()
	 * @generated
	 */
	void setIsCitation(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see base.Base_Package#getSACMElement_IsAbstract()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link base.SACMElement#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cited Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cited Element</em>' reference.
	 * @see #setCitedElement(SACMElement)
	 * @see base.Base_Package#getSACMElement_CitedElement()
	 * @model
	 * @generated
	 */
	SACMElement getCitedElement();

	/**
	 * Sets the value of the '{@link base.SACMElement#getCitedElement <em>Cited Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cited Element</em>' reference.
	 * @see #getCitedElement()
	 * @generated
	 */
	void setCitedElement(SACMElement value);

	/**
	 * Returns the value of the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Form</em>' reference.
	 * @see #setAbstractForm(SACMElement)
	 * @see base.Base_Package#getSACMElement_AbstractForm()
	 * @model
	 * @generated
	 */
	SACMElement getAbstractForm();

	/**
	 * Sets the value of the '{@link base.SACMElement#getAbstractForm <em>Abstract Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Form</em>' reference.
	 * @see #getAbstractForm()
	 * @generated
	 */
	void setAbstractForm(SACMElement value);

} // SACMElement
