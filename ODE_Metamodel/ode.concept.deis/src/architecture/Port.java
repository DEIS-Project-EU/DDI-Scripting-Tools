/**
 */
package architecture;

import dependability.AssuranceLevel;
import dependability.DependabilityRequirement;

import failureLogic.Failure;

import odeBase.BaseElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecture.Port#getFlowType <em>Flow Type</em>}</li>
 *   <li>{@link architecture.Port#getDirection <em>Direction</em>}</li>
 *   <li>{@link architecture.Port#getInterfaceFailures <em>Interface Failures</em>}</li>
 *   <li>{@link architecture.Port#getRefinedPorts <em>Refined Ports</em>}</li>
 *   <li>{@link architecture.Port#getAssuranceLevel <em>Assurance Level</em>}</li>
 *   <li>{@link architecture.Port#getDependabilityRequirements <em>Dependability Requirements</em>}</li>
 * </ul>
 *
 * @see architecture.Architecture_Package#getPort()
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
	 * @see architecture.Architecture_Package#getPort_FlowType()
	 * @model
	 * @generated
	 */
	String getFlowType();

	/**
	 * Sets the value of the '{@link architecture.Port#getFlowType <em>Flow Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Type</em>' attribute.
	 * @see #getFlowType()
	 * @generated
	 */
	void setFlowType(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link architecture.PortDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see architecture.PortDirection
	 * @see #setDirection(PortDirection)
	 * @see architecture.Architecture_Package#getPort_Direction()
	 * @model
	 * @generated
	 */
	PortDirection getDirection();

	/**
	 * Sets the value of the '{@link architecture.Port#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see architecture.PortDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(PortDirection value);

	/**
	 * Returns the value of the '<em><b>Interface Failures</b></em>' reference list.
	 * The list contents are of type {@link failureLogic.Failure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Failures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Failures</em>' reference list.
	 * @see architecture.Architecture_Package#getPort_InterfaceFailures()
	 * @model
	 * @generated
	 */
	EList<Failure> getInterfaceFailures();

	/**
	 * Returns the value of the '<em><b>Refined Ports</b></em>' reference list.
	 * The list contents are of type {@link architecture.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Ports</em>' reference list.
	 * @see architecture.Architecture_Package#getPort_RefinedPorts()
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
	 * @see architecture.Architecture_Package#getPort_AssuranceLevel()
	 * @model
	 * @generated
	 */
	AssuranceLevel getAssuranceLevel();

	/**
	 * Sets the value of the '{@link architecture.Port#getAssuranceLevel <em>Assurance Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assurance Level</em>' reference.
	 * @see #getAssuranceLevel()
	 * @generated
	 */
	void setAssuranceLevel(AssuranceLevel value);

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
	 * @see architecture.Architecture_Package#getPort_DependabilityRequirements()
	 * @model
	 * @generated
	 */
	EList<DependabilityRequirement> getDependabilityRequirements();

} // Port
