/**
 */
package top.architecture;

import org.eclipse.emf.common.util.EList;

import top.dependability.AssuranceLevel;
import top.dependability.DependabilityRequirement;

import top.failureLogic.Failure;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.architecture.Port#getFlowType <em>Flow Type</em>}</li>
 *   <li>{@link top.architecture.Port#getDirection <em>Direction</em>}</li>
 *   <li>{@link top.architecture.Port#getInterfaceFailures <em>Interface Failures</em>}</li>
 *   <li>{@link top.architecture.Port#getRefinedPorts <em>Refined Ports</em>}</li>
 *   <li>{@link top.architecture.Port#getAssuranceLevel <em>Assurance Level</em>}</li>
 *   <li>{@link top.architecture.Port#getDependabilityRequirements <em>Dependability Requirements</em>}</li>
 * </ul>
 *
 * @see top.architecture.ArchitecturePackage#getPort()
 * @model
 * @generated
 */
public interface Port extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Flow Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Type</em>' attribute.
	 * @see #setFlowType(String)
	 * @see top.architecture.ArchitecturePackage#getPort_FlowType()
	 * @model
	 * @generated
	 */
	String getFlowType();

	/**
	 * Sets the value of the '{@link top.architecture.Port#getFlowType <em>Flow Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Type</em>' attribute.
	 * @see #getFlowType()
	 * @generated
	 */
	void setFlowType(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link top.architecture.PortDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see top.architecture.PortDirection
	 * @see #setDirection(PortDirection)
	 * @see top.architecture.ArchitecturePackage#getPort_Direction()
	 * @model
	 * @generated
	 */
	PortDirection getDirection();

	/**
	 * Sets the value of the '{@link top.architecture.Port#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see top.architecture.PortDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(PortDirection value);

	/**
	 * Returns the value of the '<em><b>Interface Failures</b></em>' reference list.
	 * The list contents are of type {@link top.failureLogic.Failure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Failures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Failures</em>' reference list.
	 * @see top.architecture.ArchitecturePackage#getPort_InterfaceFailures()
	 * @model
	 * @generated
	 */
	EList<Failure> getInterfaceFailures();

	/**
	 * Returns the value of the '<em><b>Refined Ports</b></em>' reference list.
	 * The list contents are of type {@link top.architecture.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Ports</em>' reference list.
	 * @see top.architecture.ArchitecturePackage#getPort_RefinedPorts()
	 * @model
	 * @generated
	 */
	EList<Port> getRefinedPorts();

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
	 * @see top.architecture.ArchitecturePackage#getPort_AssuranceLevel()
	 * @model
	 * @generated
	 */
	AssuranceLevel getAssuranceLevel();

	/**
	 * Sets the value of the '{@link top.architecture.Port#getAssuranceLevel <em>Assurance Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assurance Level</em>' reference.
	 * @see #getAssuranceLevel()
	 * @generated
	 */
	void setAssuranceLevel(AssuranceLevel value);

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
	 * @see top.architecture.ArchitecturePackage#getPort_DependabilityRequirements()
	 * @model
	 * @generated
	 */
	EList<DependabilityRequirement> getDependabilityRequirements();

} // Port
