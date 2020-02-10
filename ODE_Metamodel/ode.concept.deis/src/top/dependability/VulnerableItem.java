/**
 */
package top.dependability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vulnerable Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.VulnerableItem#getVulnerabilities <em>Vulnerabilities</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getVulnerableItem()
 * @model
 * @generated
 */
public interface VulnerableItem extends Asset {
	/**
	 * Returns the value of the '<em><b>Vulnerabilities</b></em>' containment reference list.
	 * The list contents are of type {@link top.dependability.Vulnerability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vulnerabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vulnerabilities</em>' containment reference list.
	 * @see top.dependability.Dependability_Package#getVulnerableItem_Vulnerabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vulnerability> getVulnerabilities();

} // VulnerableItem
