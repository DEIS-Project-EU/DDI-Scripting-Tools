/**
 */
package top.argumentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Reasoning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.argumentation.ArgumentReasoning#getStructure <em>Structure</em>}</li>
 * </ul>
 *
 * @see top.argumentation.ArgumentationPackage#getArgumentReasoning()
 * @model
 * @generated
 */
public interface ArgumentReasoning extends ArgumentAsset {
	/**
	 * Returns the value of the '<em><b>Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' reference.
	 * @see #setStructure(ArgumentPackage)
	 * @see top.argumentation.ArgumentationPackage#getArgumentReasoning_Structure()
	 * @model
	 * @generated
	 */
	ArgumentPackage getStructure();

	/**
	 * Sets the value of the '{@link top.argumentation.ArgumentReasoning#getStructure <em>Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(ArgumentPackage value);

} // ArgumentReasoning
