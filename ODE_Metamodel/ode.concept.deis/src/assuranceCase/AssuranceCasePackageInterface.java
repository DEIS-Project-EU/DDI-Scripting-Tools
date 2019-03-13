/**
 */
package assuranceCase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assurance Case Package Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assuranceCase.AssuranceCasePackageInterface#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see assuranceCase.AssuranceCase_Package#getAssuranceCasePackageInterface()
 * @model
 * @generated
 */
public interface AssuranceCasePackageInterface extends AssuranceCasePackage {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(AssuranceCasePackage)
	 * @see assuranceCase.AssuranceCase_Package#getAssuranceCasePackageInterface_Implements()
	 * @model required="true"
	 * @generated
	 */
	AssuranceCasePackage getImplements();

	/**
	 * Sets the value of the '{@link assuranceCase.AssuranceCasePackageInterface#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(AssuranceCasePackage value);

} // AssuranceCasePackageInterface
