/**
 */
package top.dependability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Situation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.Situation#getLikelihood <em>Likelihood</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getSituation()
 * @model
 * @generated
 */
public interface Situation extends RiskParameter {
	/**
	 * Returns the value of the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Likelihood</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likelihood</em>' attribute.
	 * @see #setLikelihood(String)
	 * @see top.dependability.Dependability_Package#getSituation_Likelihood()
	 * @model
	 * @generated
	 */
	String getLikelihood();

	/**
	 * Sets the value of the '{@link top.dependability.Situation#getLikelihood <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Likelihood</em>' attribute.
	 * @see #getLikelihood()
	 * @generated
	 */
	void setLikelihood(String value);

} // Situation
