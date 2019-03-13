/**
 */
package failureLogic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMEA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.FMEA#getType <em>Type</em>}</li>
 *   <li>{@link failureLogic.FMEA#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see failureLogic.FailureLogic_Package#getFMEA()
 * @model
 * @generated
 */
public interface FMEA extends FailureModel {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link failureLogic.FMEAType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see failureLogic.FMEAType
	 * @see #setType(FMEAType)
	 * @see failureLogic.FailureLogic_Package#getFMEA_Type()
	 * @model
	 * @generated
	 */
	FMEAType getType();

	/**
	 * Sets the value of the '{@link failureLogic.FMEA#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see failureLogic.FMEAType
	 * @see #getType()
	 * @generated
	 */
	void setType(FMEAType value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link failureLogic.FMEAEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see failureLogic.FailureLogic_Package#getFMEA_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<FMEAEntry> getEntries();

} // FMEA
