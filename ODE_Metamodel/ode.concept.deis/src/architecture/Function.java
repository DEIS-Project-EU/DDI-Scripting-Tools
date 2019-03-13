/**
 */
package architecture;

import dependability.Asset;
import dependability.AssuranceLevel;
import dependability.DependabilityRequirement;
import dependability.Malfunction;

import failureLogic.FailureModel;

import odeBase.BaseElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecture.Function#getSignals <em>Signals</em>}</li>
 *   <li>{@link architecture.Function#getPorts <em>Ports</em>}</li>
 *   <li>{@link architecture.Function#getPerfChars <em>Perf Chars</em>}</li>
 *   <li>{@link architecture.Function#getSubFunctions <em>Sub Functions</em>}</li>
 *   <li>{@link architecture.Function#getAsAsset <em>As Asset</em>}</li>
 *   <li>{@link architecture.Function#getDependabilityRequirements <em>Dependability Requirements</em>}</li>
 *   <li>{@link architecture.Function#getAssuranceLevel <em>Assurance Level</em>}</li>
 *   <li>{@link architecture.Function#getFailureModels <em>Failure Models</em>}</li>
 *   <li>{@link architecture.Function#getMalfunctions <em>Malfunctions</em>}</li>
 * </ul>
 *
 * @see architecture.Architecture_Package#getFunction()
 * @model
 * @generated
 */
public interface Function extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
	 * The list contents are of type {@link architecture.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signals</em>' containment reference list.
	 * @see architecture.Architecture_Package#getFunction_Signals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signal> getSignals();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link architecture.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see architecture.Architecture_Package#getFunction_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Perf Chars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perf Chars</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perf Chars</em>' containment reference.
	 * @see #setPerfChars(PerfChars)
	 * @see architecture.Architecture_Package#getFunction_PerfChars()
	 * @model containment="true"
	 * @generated
	 */
	PerfChars getPerfChars();

	/**
	 * Sets the value of the '{@link architecture.Function#getPerfChars <em>Perf Chars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perf Chars</em>' containment reference.
	 * @see #getPerfChars()
	 * @generated
	 */
	void setPerfChars(PerfChars value);

	/**
	 * Returns the value of the '<em><b>Sub Functions</b></em>' reference list.
	 * The list contents are of type {@link architecture.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Functions</em>' reference list.
	 * @see architecture.Architecture_Package#getFunction_SubFunctions()
	 * @model
	 * @generated
	 */
	EList<Function> getSubFunctions();

	/**
	 * Returns the value of the '<em><b>As Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Asset</em>' reference.
	 * @see #setAsAsset(Asset)
	 * @see architecture.Architecture_Package#getFunction_AsAsset()
	 * @model
	 * @generated
	 */
	Asset getAsAsset();

	/**
	 * Sets the value of the '{@link architecture.Function#getAsAsset <em>As Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Asset</em>' reference.
	 * @see #getAsAsset()
	 * @generated
	 */
	void setAsAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>Dependability Requirements</b></em>' reference list.
	 * The list contents are of type {@link dependability.DependabilityRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependability Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependability Requirements</em>' reference list.
	 * @see architecture.Architecture_Package#getFunction_DependabilityRequirements()
	 * @model
	 * @generated
	 */
	EList<DependabilityRequirement> getDependabilityRequirements();

	/**
	 * Returns the value of the '<em><b>Assurance Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assurance Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assurance Level</em>' reference.
	 * @see #setAssuranceLevel(AssuranceLevel)
	 * @see architecture.Architecture_Package#getFunction_AssuranceLevel()
	 * @model
	 * @generated
	 */
	AssuranceLevel getAssuranceLevel();

	/**
	 * Sets the value of the '{@link architecture.Function#getAssuranceLevel <em>Assurance Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assurance Level</em>' reference.
	 * @see #getAssuranceLevel()
	 * @generated
	 */
	void setAssuranceLevel(AssuranceLevel value);

	/**
	 * Returns the value of the '<em><b>Failure Models</b></em>' reference list.
	 * The list contents are of type {@link failureLogic.FailureModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Models</em>' reference list.
	 * @see architecture.Architecture_Package#getFunction_FailureModels()
	 * @model
	 * @generated
	 */
	EList<FailureModel> getFailureModels();

	/**
	 * Returns the value of the '<em><b>Malfunctions</b></em>' reference list.
	 * The list contents are of type {@link dependability.Malfunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Malfunctions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Malfunctions</em>' reference list.
	 * @see architecture.Architecture_Package#getFunction_Malfunctions()
	 * @model
	 * @generated
	 */
	EList<Malfunction> getMalfunctions();

} // Function
