/**
 */
package assuranceCase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assurance Case Package Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assuranceCase.AssuranceCasePackageBinding#getParticipantPackage <em>Participant Package</em>}</li>
 * </ul>
 *
 * @see assuranceCase.AssuranceCase_Package#getAssuranceCasePackageBinding()
 * @model
 * @generated
 */
public interface AssuranceCasePackageBinding extends AssuranceCasePackage {
	/**
	 * Returns the value of the '<em><b>Participant Package</b></em>' reference list.
	 * The list contents are of type {@link assuranceCase.AssuranceCasePackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Package</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Package</em>' reference list.
	 * @see assuranceCase.AssuranceCase_Package#getAssuranceCasePackageBinding_ParticipantPackage()
	 * @model lower="2"
	 * @generated
	 */
	EList<AssuranceCasePackage> getParticipantPackage();

} // AssuranceCasePackageBinding
