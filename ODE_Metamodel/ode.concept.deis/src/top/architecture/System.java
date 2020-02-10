/**
 */
package top.architecture;

import org.eclipse.emf.common.util.EList;

import top.dependability.Asset;
import top.dependability.AssuranceLevel;
import top.dependability.DependabilityRequirement;
import top.dependability.Standard;

import top.failureLogic.FailureModel;

import top.odeBase.BaseElement;
import top.odeBase.TimeUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.architecture.System#getOverallLifetime <em>Overall Lifetime</em>}</li>
 *   <li>{@link top.architecture.System#getOverallLifetimeTimeUnit <em>Overall Lifetime Time Unit</em>}</li>
 *   <li>{@link top.architecture.System#getSystemBoundaries <em>System Boundaries</em>}</li>
 *   <li>{@link top.architecture.System#getContexts <em>Contexts</em>}</li>
 *   <li>{@link top.architecture.System#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link top.architecture.System#getSignals <em>Signals</em>}</li>
 *   <li>{@link top.architecture.System#getPorts <em>Ports</em>}</li>
 *   <li>{@link top.architecture.System#getSubSystems <em>Sub Systems</em>}</li>
 *   <li>{@link top.architecture.System#getRealisedFunctions <em>Realised Functions</em>}</li>
 *   <li>{@link top.architecture.System#getAsAsset <em>As Asset</em>}</li>
 *   <li>{@link top.architecture.System#getDependabilityRequirements <em>Dependability Requirements</em>}</li>
 *   <li>{@link top.architecture.System#getAssuranceLevel <em>Assurance Level</em>}</li>
 *   <li>{@link top.architecture.System#getAppliedStandards <em>Applied Standards</em>}</li>
 *   <li>{@link top.architecture.System#getFailureModels <em>Failure Models</em>}</li>
 * </ul>
 *
 * @see top.architecture.ArchitecturePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Overall Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overall Lifetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall Lifetime</em>' attribute.
	 * @see #setOverallLifetime(double)
	 * @see top.architecture.ArchitecturePackage#getSystem_OverallLifetime()
	 * @model
	 * @generated
	 */
	double getOverallLifetime();

	/**
	 * Sets the value of the '{@link top.architecture.System#getOverallLifetime <em>Overall Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall Lifetime</em>' attribute.
	 * @see #getOverallLifetime()
	 * @generated
	 */
	void setOverallLifetime(double value);

	/**
	 * Returns the value of the '<em><b>Overall Lifetime Time Unit</b></em>' attribute.
	 * The default value is <code>"Hour"</code>.
	 * The literals are from the enumeration {@link top.odeBase.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overall Lifetime Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall Lifetime Time Unit</em>' attribute.
	 * @see top.odeBase.TimeUnit
	 * @see #setOverallLifetimeTimeUnit(TimeUnit)
	 * @see top.architecture.ArchitecturePackage#getSystem_OverallLifetimeTimeUnit()
	 * @model default="Hour"
	 * @generated
	 */
	TimeUnit getOverallLifetimeTimeUnit();

	/**
	 * Sets the value of the '{@link top.architecture.System#getOverallLifetimeTimeUnit <em>Overall Lifetime Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall Lifetime Time Unit</em>' attribute.
	 * @see top.odeBase.TimeUnit
	 * @see #getOverallLifetimeTimeUnit()
	 * @generated
	 */
	void setOverallLifetimeTimeUnit(TimeUnit value);

	/**
	 * Returns the value of the '<em><b>System Boundaries</b></em>' containment reference list.
	 * The list contents are of type {@link top.architecture.SystemBoundary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Boundaries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Boundaries</em>' containment reference list.
	 * @see top.architecture.ArchitecturePackage#getSystem_SystemBoundaries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SystemBoundary> getSystemBoundaries();

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link top.architecture.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see top.architecture.ArchitecturePackage#getSystem_Contexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContexts();

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link top.architecture.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see top.architecture.ArchitecturePackage#getSystem_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configuration> getConfigurations();

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
	 * @see top.architecture.ArchitecturePackage#getSystem_Signals()
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
	 * @see top.architecture.ArchitecturePackage#getSystem_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Sub Systems</b></em>' reference list.
	 * The list contents are of type {@link top.architecture.System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Systems</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Systems</em>' reference list.
	 * @see top.architecture.ArchitecturePackage#getSystem_SubSystems()
	 * @model
	 * @generated
	 */
	EList<System> getSubSystems();

	/**
	 * Returns the value of the '<em><b>Realised Functions</b></em>' reference list.
	 * The list contents are of type {@link top.architecture.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realised Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realised Functions</em>' reference list.
	 * @see top.architecture.ArchitecturePackage#getSystem_RealisedFunctions()
	 * @model
	 * @generated
	 */
	EList<Function> getRealisedFunctions();

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
	 * @see top.architecture.ArchitecturePackage#getSystem_AsAsset()
	 * @model
	 * @generated
	 */
	Asset getAsAsset();

	/**
	 * Sets the value of the '{@link top.architecture.System#getAsAsset <em>As Asset</em>}' reference.
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
	 * @see top.architecture.ArchitecturePackage#getSystem_DependabilityRequirements()
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
	 * @see top.architecture.ArchitecturePackage#getSystem_AssuranceLevel()
	 * @model
	 * @generated
	 */
	AssuranceLevel getAssuranceLevel();

	/**
	 * Sets the value of the '{@link top.architecture.System#getAssuranceLevel <em>Assurance Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assurance Level</em>' reference.
	 * @see #getAssuranceLevel()
	 * @generated
	 */
	void setAssuranceLevel(AssuranceLevel value);

	/**
	 * Returns the value of the '<em><b>Applied Standards</b></em>' reference list.
	 * The list contents are of type {@link top.dependability.Standard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Standards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Standards</em>' reference list.
	 * @see top.architecture.ArchitecturePackage#getSystem_AppliedStandards()
	 * @model
	 * @generated
	 */
	EList<Standard> getAppliedStandards();

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
	 * @see top.architecture.ArchitecturePackage#getSystem_FailureModels()
	 * @model
	 * @generated
	 */
	EList<FailureModel> getFailureModels();

} // System
