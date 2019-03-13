/**
 */
package base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.ModelElement#getName <em>Name</em>}</li>
 *   <li>{@link base.ModelElement#getDescription <em>Description</em>}</li>
 *   <li>{@link base.ModelElement#getImplementationConstraint <em>Implementation Constraint</em>}</li>
 *   <li>{@link base.ModelElement#getNote <em>Note</em>}</li>
 *   <li>{@link base.ModelElement#getTaggedValue <em>Tagged Value</em>}</li>
 * </ul>
 *
 * @see base.Base_Package#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends SACMElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(LangString)
	 * @see base.Base_Package#getModelElement_Name()
	 * @model containment="true"
	 * @generated
	 */
	LangString getName();

	/**
	 * Sets the value of the '{@link base.ModelElement#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(LangString value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Description)
	 * @see base.Base_Package#getModelElement_Description()
	 * @model containment="true"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link base.ModelElement#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link base.ImplementationConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Constraint</em>' containment reference list.
	 * @see base.Base_Package#getModelElement_ImplementationConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationConstraint> getImplementationConstraint();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link base.Note}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see base.Base_Package#getModelElement_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Note> getNote();

	/**
	 * Returns the value of the '<em><b>Tagged Value</b></em>' containment reference list.
	 * The list contents are of type {@link base.TaggedValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Value</em>' containment reference list.
	 * @see base.Base_Package#getModelElement_TaggedValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaggedValue> getTaggedValue();

} // ModelElement
