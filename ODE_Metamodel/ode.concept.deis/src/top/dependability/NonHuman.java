/**
 */
package top.dependability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Human</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.NonHuman#getPayloads <em>Payloads</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getNonHuman()
 * @model
 * @generated
 */
public interface NonHuman extends ThreatAgent {
	/**
	 * Returns the value of the '<em><b>Payloads</b></em>' reference list.
	 * The list contents are of type {@link top.dependability.Payload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payloads</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payloads</em>' reference list.
	 * @see top.dependability.Dependability_Package#getNonHuman_Payloads()
	 * @model
	 * @generated
	 */
	EList<Payload> getPayloads();

} // NonHuman
