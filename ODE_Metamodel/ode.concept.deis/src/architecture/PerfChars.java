/**
 */
package architecture;

import odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perf Chars</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecture.PerfChars#getResponseTime <em>Response Time</em>}</li>
 * </ul>
 *
 * @see architecture.Architecture_Package#getPerfChars()
 * @model
 * @generated
 */
public interface PerfChars extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Time</em>' attribute.
	 * @see #setResponseTime(double)
	 * @see architecture.Architecture_Package#getPerfChars_ResponseTime()
	 * @model
	 * @generated
	 */
	double getResponseTime();

	/**
	 * Sets the value of the '{@link architecture.PerfChars#getResponseTime <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Time</em>' attribute.
	 * @see #getResponseTime()
	 * @generated
	 */
	void setResponseTime(double value);

} // PerfChars
