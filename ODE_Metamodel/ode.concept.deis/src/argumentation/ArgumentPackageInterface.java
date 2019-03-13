/**
 */
package argumentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Package Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.ArgumentPackageInterface#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see argumentation.Argumentation_Package#getArgumentPackageInterface()
 * @model
 * @generated
 */
public interface ArgumentPackageInterface extends ArgumentPackage {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(ArgumentPackage)
	 * @see argumentation.Argumentation_Package#getArgumentPackageInterface_Implements()
	 * @model required="true"
	 * @generated
	 */
	ArgumentPackage getImplements();

	/**
	 * Sets the value of the '{@link argumentation.ArgumentPackageInterface#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(ArgumentPackage value);

} // ArgumentPackageInterface
