/**
 */
package terminology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terminology.TerminologyPackage#getTerminologyElement <em>Terminology Element</em>}</li>
 * </ul>
 *
 * @see terminology.Terminology_Package#getTerminologyPackage()
 * @model
 * @generated
 */
public interface TerminologyPackage extends TerminologyElement {
	/**
	 * Returns the value of the '<em><b>Terminology Element</b></em>' containment reference list.
	 * The list contents are of type {@link terminology.TerminologyElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminology Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminology Element</em>' containment reference list.
	 * @see terminology.Terminology_Package#getTerminologyPackage_TerminologyElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<TerminologyElement> getTerminologyElement();

} // TerminologyPackage
