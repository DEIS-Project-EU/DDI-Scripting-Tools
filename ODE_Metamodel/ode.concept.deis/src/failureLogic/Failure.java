/**
 */
package failureLogic;

import odeBase.BaseElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.Failure#getOriginType <em>Origin Type</em>}</li>
 *   <li>{@link failureLogic.Failure#getFailureClass <em>Failure Class</em>}</li>
 *   <li>{@link failureLogic.Failure#getFailureRate <em>Failure Rate</em>}</li>
 *   <li>{@link failureLogic.Failure#isIsCcf <em>Is Ccf</em>}</li>
 *   <li>{@link failureLogic.Failure#getFailureProbDistribution <em>Failure Prob Distribution</em>}</li>
 *   <li>{@link failureLogic.Failure#getCcfFailures <em>Ccf Failures</em>}</li>
 * </ul>
 *
 * @see failureLogic.FailureLogic_Package#getFailure()
 * @model
 * @generated
 */
public interface Failure extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Origin Type</b></em>' attribute.
	 * The literals are from the enumeration {@link failureLogic.FailureOriginType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Type</em>' attribute.
	 * @see failureLogic.FailureOriginType
	 * @see #setOriginType(FailureOriginType)
	 * @see failureLogic.FailureLogic_Package#getFailure_OriginType()
	 * @model
	 * @generated
	 */
	FailureOriginType getOriginType();

	/**
	 * Sets the value of the '{@link failureLogic.Failure#getOriginType <em>Origin Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Type</em>' attribute.
	 * @see failureLogic.FailureOriginType
	 * @see #getOriginType()
	 * @generated
	 */
	void setOriginType(FailureOriginType value);

	/**
	 * Returns the value of the '<em><b>Failure Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Class</em>' attribute.
	 * @see #setFailureClass(String)
	 * @see failureLogic.FailureLogic_Package#getFailure_FailureClass()
	 * @model
	 * @generated
	 */
	String getFailureClass();

	/**
	 * Sets the value of the '{@link failureLogic.Failure#getFailureClass <em>Failure Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Class</em>' attribute.
	 * @see #getFailureClass()
	 * @generated
	 */
	void setFailureClass(String value);

	/**
	 * Returns the value of the '<em><b>Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Rate</em>' attribute.
	 * @see #setFailureRate(double)
	 * @see failureLogic.FailureLogic_Package#getFailure_FailureRate()
	 * @model
	 * @generated
	 */
	double getFailureRate();

	/**
	 * Sets the value of the '{@link failureLogic.Failure#getFailureRate <em>Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Rate</em>' attribute.
	 * @see #getFailureRate()
	 * @generated
	 */
	void setFailureRate(double value);

	/**
	 * Returns the value of the '<em><b>Is Ccf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ccf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ccf</em>' attribute.
	 * @see #setIsCcf(boolean)
	 * @see failureLogic.FailureLogic_Package#getFailure_IsCcf()
	 * @model
	 * @generated
	 */
	boolean isIsCcf();

	/**
	 * Sets the value of the '{@link failureLogic.Failure#isIsCcf <em>Is Ccf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ccf</em>' attribute.
	 * @see #isIsCcf()
	 * @generated
	 */
	void setIsCcf(boolean value);

	/**
	 * Returns the value of the '<em><b>Failure Prob Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Prob Distribution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Prob Distribution</em>' containment reference.
	 * @see #setFailureProbDistribution(ProbDist)
	 * @see failureLogic.FailureLogic_Package#getFailure_FailureProbDistribution()
	 * @model containment="true"
	 * @generated
	 */
	ProbDist getFailureProbDistribution();

	/**
	 * Sets the value of the '{@link failureLogic.Failure#getFailureProbDistribution <em>Failure Prob Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Prob Distribution</em>' containment reference.
	 * @see #getFailureProbDistribution()
	 * @generated
	 */
	void setFailureProbDistribution(ProbDist value);

	/**
	 * Returns the value of the '<em><b>Ccf Failures</b></em>' reference list.
	 * The list contents are of type {@link failureLogic.Failure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ccf Failures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ccf Failures</em>' reference list.
	 * @see failureLogic.FailureLogic_Package#getFailure_CcfFailures()
	 * @model
	 * @generated
	 */
	EList<Failure> getCcfFailures();

} // Failure
