/**
 */
package base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Lang String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.MultiLangString#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see base.Base_Package#getMultiLangString()
 * @model
 * @generated
 */
public interface MultiLangString extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link base.LangString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see base.Base_Package#getMultiLangString_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LangString> getValue();

} // MultiLangString
