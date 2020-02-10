/**
 */
package top.dependability;

import org.eclipse.emf.common.util.EList;

import top.integration.ODEProductPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependability Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.DependabilityPackage#getMeasures <em>Measures</em>}</li>
 *   <li>{@link top.dependability.DependabilityPackage#getMeasureTypes <em>Measure Types</em>}</li>
 *   <li>{@link top.dependability.DependabilityPackage#getMaintenanceProcedures <em>Maintenance Procedures</em>}</li>
 *   <li>{@link top.dependability.DependabilityPackage#getHARAPackages <em>HARA Packages</em>}</li>
 *   <li>{@link top.dependability.DependabilityPackage#getRequirementPackages <em>Requirement Packages</em>}</li>
 *   <li>{@link top.dependability.DependabilityPackage#getDomainPackages <em>Domain Packages</em>}</li>
 *   <li>{@link top.dependability.DependabilityPackage#getTARAPackages <em>TARA Packages</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getDependabilityPackage()
 * @model
 * @generated
 */
public interface DependabilityPackage extends ODEProductPackage {
	/**
	 * Returns the value of the '<em><b>Measures</b></em>' containment reference list.
	 * The list contents are of type {@link top.dependability.Measure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measures</em>' containment reference list.
	 * @see top.dependability.Dependability_Package#getDependabilityPackage_Measures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Measure> getMeasures();

	/**
	 * Returns the value of the '<em><b>Measure Types</b></em>' containment reference list.
	 * The list contents are of type {@link top.dependability.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Types</em>' containment reference list.
	 * @see top.dependability.Dependability_Package#getDependabilityPackage_MeasureTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasureType> getMeasureTypes();

	/**
	 * Returns the value of the '<em><b>Maintenance Procedures</b></em>' containment reference list.
	 * The list contents are of type {@link top.dependability.MaintenanceProcedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintenance Procedures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintenance Procedures</em>' containment reference list.
	 * @see top.dependability.Dependability_Package#getDependabilityPackage_MaintenanceProcedures()
	 * @model containment="true"
	 * @generated
	 */
	EList<MaintenanceProcedure> getMaintenanceProcedures();

	/**
	 * Returns the value of the '<em><b>HARA Packages</b></em>' containment reference list.
	 * The list contents are of type {@link top.dependability.HARAPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HARA Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HARA Packages</em>' containment reference list.
	 * @see top.dependability.Dependability_Package#getDependabilityPackage_HARAPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<HARAPackage> getHARAPackages();

	/**
	 * Returns the value of the '<em><b>Requirement Packages</b></em>' containment reference list.
	 * The list contents are of type {@link top.dependability.RequirementPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Packages</em>' containment reference list.
	 * @see top.dependability.Dependability_Package#getDependabilityPackage_RequirementPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementPackage> getRequirementPackages();

	/**
	 * Returns the value of the '<em><b>Domain Packages</b></em>' containment reference list.
	 * The list contents are of type {@link top.dependability.DomainPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Packages</em>' containment reference list.
	 * @see top.dependability.Dependability_Package#getDependabilityPackage_DomainPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainPackage> getDomainPackages();

	/**
	 * Returns the value of the '<em><b>TARA Packages</b></em>' containment reference list.
	 * The list contents are of type {@link top.dependability.TARAPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TARA Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TARA Packages</em>' containment reference list.
	 * @see top.dependability.Dependability_Package#getDependabilityPackage_TARAPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<TARAPackage> getTARAPackages();

} // DependabilityPackage
