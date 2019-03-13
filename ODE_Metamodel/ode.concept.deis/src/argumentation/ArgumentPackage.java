/**
 */
package argumentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.ArgumentPackage#getArgumentationElement <em>Argumentation Element</em>}</li>
 * </ul>
 *
 * @see argumentation.Argumentation_Package#getArgumentPackage()
 * @model
 * @generated
 */
public interface ArgumentPackage extends ArgumentationElement {
	/**
	 * Returns the value of the '<em><b>Argumentation Element</b></em>' containment reference list.
	 * The list contents are of type {@link argumentation.ArgumentationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argumentation Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argumentation Element</em>' containment reference list.
	 * @see argumentation.Argumentation_Package#getArgumentPackage_ArgumentationElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentationElement> getArgumentationElement();

} // ArgumentPackage
