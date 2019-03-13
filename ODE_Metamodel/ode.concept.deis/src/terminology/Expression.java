/**
 */
package terminology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terminology.Expression#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see terminology.Terminology_Package#getExpression()
 * @model
 * @generated
 */
public interface Expression extends ExpressionElement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference list.
	 * The list contents are of type {@link terminology.ExpressionElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference list.
	 * @see terminology.Terminology_Package#getExpression_Element()
	 * @model
	 * @generated
	 */
	EList<ExpressionElement> getElement();

} // Expression
