/**
 */
package failureLogic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMEDA Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.FMEDAEntry#getDiagnosisRate <em>Diagnosis Rate</em>}</li>
 *   <li>{@link failureLogic.FMEDAEntry#getDiagnosisProbDistribution <em>Diagnosis Prob Distribution</em>}</li>
 * </ul>
 *
 * @see failureLogic.FailureLogic_Package#getFMEDAEntry()
 * @model
 * @generated
 */
public interface FMEDAEntry extends FMEAEntry {
	/**
	 * Returns the value of the '<em><b>Diagnosis Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnosis Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosis Rate</em>' attribute.
	 * @see #setDiagnosisRate(double)
	 * @see failureLogic.FailureLogic_Package#getFMEDAEntry_DiagnosisRate()
	 * @model
	 * @generated
	 */
	double getDiagnosisRate();

	/**
	 * Sets the value of the '{@link failureLogic.FMEDAEntry#getDiagnosisRate <em>Diagnosis Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnosis Rate</em>' attribute.
	 * @see #getDiagnosisRate()
	 * @generated
	 */
	void setDiagnosisRate(double value);

	/**
	 * Returns the value of the '<em><b>Diagnosis Prob Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnosis Prob Distribution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosis Prob Distribution</em>' containment reference.
	 * @see #setDiagnosisProbDistribution(ProbDist)
	 * @see failureLogic.FailureLogic_Package#getFMEDAEntry_DiagnosisProbDistribution()
	 * @model containment="true"
	 * @generated
	 */
	ProbDist getDiagnosisProbDistribution();

	/**
	 * Sets the value of the '{@link failureLogic.FMEDAEntry#getDiagnosisProbDistribution <em>Diagnosis Prob Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnosis Prob Distribution</em>' containment reference.
	 * @see #getDiagnosisProbDistribution()
	 * @generated
	 */
	void setDiagnosisProbDistribution(ProbDist value);

} // FMEDAEntry
