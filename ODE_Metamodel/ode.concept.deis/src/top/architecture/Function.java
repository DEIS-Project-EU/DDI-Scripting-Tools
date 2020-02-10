/**
 */
package top.architecture;

import org.eclipse.emf.common.util.EList;

import top.dependability.Asset;
import top.dependability.AssuranceLevel;
import top.dependability.DependabilityRequirement;
import top.dependability.Malfunction;

import top.failureLogic.FailureModel;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.architecture.Function#getSignals <em>Signals</em>}</li>
 *   <li>{@link top.architecture.Function#getPorts <em>Ports</em>}</li>
 *   <li>{@link top.architecture.Function#getPerfChars <em>Perf Chars</em>}</li>
 *   <li>{@link top.architecture.Function#getSubFunctions <em>Sub Functions</em>}</li>
 *   <li>{@link top.architecture.Function#getAsAsset <em>As Asset</em>}</li>
 *   <li>{@link top.architecture.Function#getDependabilityRequirements <em>Dependability Requirements</em>}</li>
 *   <li>{@link top.architecture.Function#getAssuranceLevel <em>Assurance Level</em>}</li>
 *   <li>{@link top.architecture.Function#getFailureModels <em>Failure Models</em>}</li>
 *   <li>{@link top.architecture.Function#getMalfunctions <em>Malfunctions</em>}</li>
 * </ul>
 *
 * @see top.architecture.ArchitecturePackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
	 * The list contents are of type {@link top.architecture.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signals</em>' containment reference list.
	 * @see top.architecture.ArchitecturePackage#getFunction_Signals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signal> getSignals();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link top.architecture.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see top.architecture.ArchitecturePackage#getFunction_Ports()
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
	 * @see top.architecture.ArchitecturePackage#getFunction_PerfChars()
	 * @model containment="true"
	 * @generated
	 */
	PerfChars getPerfChars();

	/**
	 * Sets the value of the '{@link top.architecture.Function#getPerfChars <em>Perf Chars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perf Chars</em>' containment reference.
	 * @see #getPerfChars()
	 * @generated
	 */
	void setPerfChars(PerfChars value);

	/**
	 * Returns the value of the '<em><b>Sub Functions</b></em>' reference list.
	 * The list contents are of type {@link top.architecture.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Functions</em>' reference list.
	 * @see top.architecture.ArchitecturePackage#getFunction_SubFunctions()
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
	 * @see top.architecture.ArchitecturePackage#getFunction_AsAsset()
	 * @model
	 * @generated
	 */
	Asset getAsAsset();

	/**
	 * Sets the value of the '{@link top.architecture.Function#getAsAsset <em>As Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Asset</em>' reference.
	 * @see #getAsAsset()
	 * @generated
	 */
	void setAsAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>Dependability Requirements</b></em>' reference list.
	 * The list contents are of type {@link top.dependability.DependabilityRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependability Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependability Requirements</em>' reference list.
	 * @see top.architecture.ArchitecturePackage#getFunction_DependabilityRequirements()
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
	 * @see top.architecture.ArchitecturePackage#getFunction_AssuranceLevel()
	 * @model
	 * @generated
	 */
	AssuranceLevel getAssuranceLevel();

	/**
	 * Sets the value of the '{@link top.architecture.Function#getAssuranceLevel <em>Assurance Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assurance Level</em>' reference.
	 * @see #getAssuranceLevel()
	 * @generated
	 */
	void setAssuranceLevel(AssuranceLevel value);

	/**
	 * Returns the value of the '<em><b>Failure Models</b></em>' reference list.
	 * The list contents are of type {@link top.failureLogic.FailureModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Models</em>' reference list.
	 * @see top.architecture.ArchitecturePackage#getFunction_FailureModels()
	 * @model
	 * @generated
	 */
	EList<FailureModel> getFailureModels();

	/**
	 * Returns the value of the '<em><b>Malfunctions</b></em>' reference list.
	 * The list contents are of type {@link top.dependability.Malfunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Malfunctions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Malfunctions</em>' reference list.
	 * @see top.architecture.ArchitecturePackage#getFunction_Malfunctions()
	 * @model
	 * @generated
	 */
	EList<Malfunction> getMalfunctions();

} // Function
