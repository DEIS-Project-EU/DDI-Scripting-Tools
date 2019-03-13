/**
 */
package terminology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terminology.TerminologyGroup#getTerminologyElement <em>Terminology Element</em>}</li>
 * </ul>
 *
 * @see terminology.Terminology_Package#getTerminologyGroup()
 * @model
 * @generated
 */
public interface TerminologyGroup extends TerminologyElement {
	/**
	 * Returns the value of the '<em><b>Terminology Element</b></em>' reference list.
	 * The list contents are of type {@link terminology.TerminologyElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminology Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminology Element</em>' reference list.
	 * @see terminology.Terminology_Package#getTerminologyGroup_TerminologyElement()
	 * @model
	 * @generated
	 */
	EList<TerminologyElement> getTerminologyElement();

} // TerminologyGroup
