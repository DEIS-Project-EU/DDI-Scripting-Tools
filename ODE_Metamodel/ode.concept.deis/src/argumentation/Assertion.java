/**
 */
package argumentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.Assertion#getAssertionDeclaration <em>Assertion Declaration</em>}</li>
 *   <li>{@link argumentation.Assertion#getMetaClaim <em>Meta Claim</em>}</li>
 * </ul>
 *
 * @see argumentation.Argumentation_Package#getAssertion()
 * @model abstract="true"
 * @generated
 */
public interface Assertion extends ArgumentAsset {
	/**
	 * Returns the value of the '<em><b>Assertion Declaration</b></em>' attribute.
	 * The default value is <code>"asserted"</code>.
	 * The literals are from the enumeration {@link argumentation.AssertionDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertion Declaration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertion Declaration</em>' attribute.
	 * @see argumentation.AssertionDeclaration
	 * @see #setAssertionDeclaration(AssertionDeclaration)
	 * @see argumentation.Argumentation_Package#getAssertion_AssertionDeclaration()
	 * @model default="asserted" required="true"
	 * @generated
	 */
	AssertionDeclaration getAssertionDeclaration();

	/**
	 * Sets the value of the '{@link argumentation.Assertion#getAssertionDeclaration <em>Assertion Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion Declaration</em>' attribute.
	 * @see argumentation.AssertionDeclaration
	 * @see #getAssertionDeclaration()
	 * @generated
	 */
	void setAssertionDeclaration(AssertionDeclaration value);

	/**
	 * Returns the value of the '<em><b>Meta Claim</b></em>' reference list.
	 * The list contents are of type {@link argumentation.Claim}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Claim</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Claim</em>' reference list.
	 * @see argumentation.Argumentation_Package#getAssertion_MetaClaim()
	 * @model
	 * @generated
	 */
	EList<Claim> getMetaClaim();

} // Assertion
