/**
 */
package top.dependability;

import org.eclipse.emf.common.util.EList;

import top.failureLogic.Failure;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependability Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.DependabilityRequirement#getDecompositionArgument <em>Decomposition Argument</em>}</li>
 *   <li>{@link top.dependability.DependabilityRequirement#getRefinedRequirements <em>Refined Requirements</em>}</li>
 *   <li>{@link top.dependability.DependabilityRequirement#getRequirementSource <em>Requirement Source</em>}</li>
 *   <li>{@link top.dependability.DependabilityRequirement#getMeasures <em>Measures</em>}</li>
 *   <li>{@link top.dependability.DependabilityRequirement#getFailures <em>Failures</em>}</li>
 *   <li>{@link top.dependability.DependabilityRequirement#getAssuranceLevel <em>Assurance Level</em>}</li>
 *   <li>{@link top.dependability.DependabilityRequirement#getMaintenanceProcedures <em>Maintenance Procedures</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getDependabilityRequirement()
 * @model abstract="true"
 * @generated
 */
public interface DependabilityRequirement extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Decomposition Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposition Argument</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposition Argument</em>' attribute.
	 * @see #setDecompositionArgument(String)
	 * @see top.dependability.Dependability_Package#getDependabilityRequirement_DecompositionArgument()
	 * @model
	 * @generated
	 */
	String getDecompositionArgument();

	/**
	 * Sets the value of the '{@link top.dependability.DependabilityRequirement#getDecompositionArgument <em>Decomposition Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposition Argument</em>' attribute.
	 * @see #getDecompositionArgument()
	 * @generated
	 */
	void setDecompositionArgument(String value);

	/**
	 * Returns the value of the '<em><b>Refined Requirements</b></em>' reference list.
	 * The list contents are of type {@link top.dependability.DependabilityRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Requirements</em>' reference list.
	 * @see top.dependability.Dependability_Package#getDependabilityRequirement_RefinedRequirements()
	 * @model
	 * @generated
	 */
	EList<DependabilityRequirement> getRefinedRequirements();

	/**
	 * Returns the value of the '<em><b>Requirement Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Source</em>' reference.
	 * @see #setRequirementSource(RequirementSource)
	 * @see top.dependability.Dependability_Package#getDependabilityRequirement_RequirementSource()
	 * @model
	 * @generated
	 */
	RequirementSource getRequirementSource();

	/**
	 * Sets the value of the '{@link top.dependability.DependabilityRequirement#getRequirementSource <em>Requirement Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Source</em>' reference.
	 * @see #getRequirementSource()
	 * @generated
	 */
	void setRequirementSource(RequirementSource value);

	/**
	 * Returns the value of the '<em><b>Measures</b></em>' reference list.
	 * The list contents are of type {@link top.dependability.Measure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measures</em>' reference list.
	 * @see top.dependability.Dependability_Package#getDependabilityRequirement_Measures()
	 * @model
	 * @generated
	 */
	EList<Measure> getMeasures();

	/**
	 * Returns the value of the '<em><b>Failures</b></em>' reference list.
	 * The list contents are of type {@link top.failureLogic.Failure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failures</em>' reference list.
	 * @see top.dependability.Dependability_Package#getDependabilityRequirement_Failures()
	 * @model
	 * @generated
	 */
	EList<Failure> getFailures();

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
	 * @see top.dependability.Dependability_Package#getDependabilityRequirement_AssuranceLevel()
	 * @model
	 * @generated
	 */
	AssuranceLevel getAssuranceLevel();

	/**
	 * Sets the value of the '{@link top.dependability.DependabilityRequirement#getAssuranceLevel <em>Assurance Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assurance Level</em>' reference.
	 * @see #getAssuranceLevel()
	 * @generated
	 */
	void setAssuranceLevel(AssuranceLevel value);

	/**
	 * Returns the value of the '<em><b>Maintenance Procedures</b></em>' reference list.
	 * The list contents are of type {@link top.dependability.MaintenanceProcedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintenance Procedures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintenance Procedures</em>' reference list.
	 * @see top.dependability.Dependability_Package#getDependabilityRequirement_MaintenanceProcedures()
	 * @model
	 * @generated
	 */
	EList<MaintenanceProcedure> getMaintenanceProcedures();

} // DependabilityRequirement
