/**
 */
package terminology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Package Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terminology.TerminologyPackageInterface#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see terminology.Terminology_Package#getTerminologyPackageInterface()
 * @model
 * @generated
 */
public interface TerminologyPackageInterface extends TerminologyPackage {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(TerminologyPackage)
	 * @see terminology.Terminology_Package#getTerminologyPackageInterface_Implements()
	 * @model required="true"
	 * @generated
	 */
	TerminologyPackage getImplements();

	/**
	 * Sets the value of the '{@link terminology.TerminologyPackageInterface#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(TerminologyPackage value);

} // TerminologyPackageInterface
