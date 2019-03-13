/**
 */
package dependability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dependability.SecurityRequirement#getSecurityCapabilities <em>Security Capabilities</em>}</li>
 * </ul>
 *
 * @see dependability.Dependability_Package#getSecurityRequirement()
 * @model
 * @generated
 */
public interface SecurityRequirement extends DependabilityRequirement {
	/**
	 * Returns the value of the '<em><b>Security Capabilities</b></em>' reference list.
	 * The list contents are of type {@link dependability.SecurityCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Capabilities</em>' reference list.
	 * @see dependability.Dependability_Package#getSecurityRequirement_SecurityCapabilities()
	 * @model
	 * @generated
	 */
	EList<SecurityCapability> getSecurityCapabilities();

} // SecurityRequirement
