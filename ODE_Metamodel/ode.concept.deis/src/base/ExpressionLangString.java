/**
 */
package base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Lang String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.ExpressionLangString#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see base.Base_Package#getExpressionLangString()
 * @model
 * @generated
 */
public interface ExpressionLangString extends LangString {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ArtifactElement)
	 * @see base.Base_Package#getExpressionLangString_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArtifactElement getExpression();

	/**
	 * Sets the value of the '{@link base.ExpressionLangString#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ArtifactElement value);

} // ExpressionLangString
