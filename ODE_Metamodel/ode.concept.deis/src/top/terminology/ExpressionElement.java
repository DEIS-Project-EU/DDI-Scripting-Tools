/**
 */
package top.terminology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.terminology.ExpressionElement#getValue <em>Value</em>}</li>
 *   <li>{@link top.terminology.ExpressionElement#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see top.terminology.Terminology_Package#getExpressionElement()
 * @model abstract="true"
 * @generated
 */
public interface ExpressionElement extends TerminologyAsset {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see top.terminology.Terminology_Package#getExpressionElement_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link top.terminology.ExpressionElement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link top.terminology.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see top.terminology.Terminology_Package#getExpressionElement_Category()
	 * @model
	 * @generated
	 */
	EList<Category> getCategory();

} // ExpressionElement
