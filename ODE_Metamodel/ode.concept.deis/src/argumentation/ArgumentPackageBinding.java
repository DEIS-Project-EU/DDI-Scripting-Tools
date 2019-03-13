/**
 */
package argumentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Package Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.ArgumentPackageBinding#getParticipantPackage <em>Participant Package</em>}</li>
 * </ul>
 *
 * @see argumentation.Argumentation_Package#getArgumentPackageBinding()
 * @model
 * @generated
 */
public interface ArgumentPackageBinding extends ArgumentPackage {
	/**
	 * Returns the value of the '<em><b>Participant Package</b></em>' reference list.
	 * The list contents are of type {@link argumentation.ArgumentPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Package</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Package</em>' reference list.
	 * @see argumentation.Argumentation_Package#getArgumentPackageBinding_ParticipantPackage()
	 * @model lower="2"
	 * @generated
	 */
	EList<ArgumentPackage> getParticipantPackage();

} // ArgumentPackageBinding
