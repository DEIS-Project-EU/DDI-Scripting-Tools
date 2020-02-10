/**
 */
package top.assuranceCase;

import org.eclipse.emf.common.util.EList;

import top.argumentation.ArgumentPackage;

import top.artifact.ArtifactPackage;

import top.base.ArtifactElement;

import top.terminology.TerminologyPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assurance Case Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.assuranceCase.AssuranceCasePackage#getAssuranceCasePackage <em>Assurance Case Package</em>}</li>
 *   <li>{@link top.assuranceCase.AssuranceCasePackage#getInterface <em>Interface</em>}</li>
 *   <li>{@link top.assuranceCase.AssuranceCasePackage#getArtifactPackage <em>Artifact Package</em>}</li>
 *   <li>{@link top.assuranceCase.AssuranceCasePackage#getArgumentPackage <em>Argument Package</em>}</li>
 *   <li>{@link top.assuranceCase.AssuranceCasePackage#getTerminologyPackage <em>Terminology Package</em>}</li>
 * </ul>
 *
 * @see top.assuranceCase.AssuranceCase_Package#getAssuranceCasePackage()
 * @model
 * @generated
 */
public interface AssuranceCasePackage extends ArtifactElement {
	/**
	 * Returns the value of the '<em><b>Assurance Case Package</b></em>' containment reference list.
	 * The list contents are of type {@link top.assuranceCase.AssuranceCasePackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assurance Case Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assurance Case Package</em>' containment reference list.
	 * @see top.assuranceCase.AssuranceCase_Package#getAssuranceCasePackage_AssuranceCasePackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssuranceCasePackage> getAssuranceCasePackage();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference list.
	 * The list contents are of type {@link top.assuranceCase.AssuranceCasePackageInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference list.
	 * @see top.assuranceCase.AssuranceCase_Package#getAssuranceCasePackage_Interface()
	 * @model
	 * @generated
	 */
	EList<AssuranceCasePackageInterface> getInterface();

	/**
	 * Returns the value of the '<em><b>Artifact Package</b></em>' containment reference list.
	 * The list contents are of type {@link top.artifact.ArtifactPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Package</em>' containment reference list.
	 * @see top.assuranceCase.AssuranceCase_Package#getAssuranceCasePackage_ArtifactPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtifactPackage> getArtifactPackage();

	/**
	 * Returns the value of the '<em><b>Argument Package</b></em>' containment reference list.
	 * The list contents are of type {@link top.argumentation.ArgumentPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Package</em>' containment reference list.
	 * @see top.assuranceCase.AssuranceCase_Package#getAssuranceCasePackage_ArgumentPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentPackage> getArgumentPackage();

	/**
	 * Returns the value of the '<em><b>Terminology Package</b></em>' containment reference list.
	 * The list contents are of type {@link top.terminology.TerminologyPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminology Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminology Package</em>' containment reference list.
	 * @see top.assuranceCase.AssuranceCase_Package#getAssuranceCasePackage_TerminologyPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<TerminologyPackage> getTerminologyPackage();

} // AssuranceCasePackage
