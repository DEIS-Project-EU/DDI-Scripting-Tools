/**
 */
package terminology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Package Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terminology.TerminologyPackageBinding#getParticipantPackage <em>Participant Package</em>}</li>
 * </ul>
 *
 * @see terminology.Terminology_Package#getTerminologyPackageBinding()
 * @model
 * @generated
 */
public interface TerminologyPackageBinding extends TerminologyPackage {
	/**
	 * Returns the value of the '<em><b>Participant Package</b></em>' reference list.
	 * The list contents are of type {@link terminology.TerminologyPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Package</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Package</em>' reference list.
	 * @see terminology.Terminology_Package#getTerminologyPackageBinding_ParticipantPackage()
	 * @model lower="2"
	 * @generated
	 */
	EList<TerminologyPackage> getParticipantPackage();

} // TerminologyPackageBinding
