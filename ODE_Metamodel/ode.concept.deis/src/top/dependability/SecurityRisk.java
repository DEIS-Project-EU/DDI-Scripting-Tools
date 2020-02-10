/**
 */
package top.dependability;

import org.eclipse.emf.common.util.EList;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Risk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.SecurityRisk#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link top.dependability.SecurityRisk#getImpactAsset <em>Impact Asset</em>}</li>
 *   <li>{@link top.dependability.SecurityRisk#getImpactIndividuals <em>Impact Individuals</em>}</li>
 *   <li>{@link top.dependability.SecurityRisk#getImpactBusiness <em>Impact Business</em>}</li>
 *   <li>{@link top.dependability.SecurityRisk#getAttackerGoals <em>Attacker Goals</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getSecurityRisk()
 * @model
 * @generated
 */
public interface SecurityRisk extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Likelihood</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likelihood</em>' attribute.
	 * @see #setLikelihood(double)
	 * @see top.dependability.Dependability_Package#getSecurityRisk_Likelihood()
	 * @model
	 * @generated
	 */
	double getLikelihood();

	/**
	 * Sets the value of the '{@link top.dependability.SecurityRisk#getLikelihood <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Likelihood</em>' attribute.
	 * @see #getLikelihood()
	 * @generated
	 */
	void setLikelihood(double value);

	/**
	 * Returns the value of the '<em><b>Impact Asset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impact Asset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact Asset</em>' attribute.
	 * @see #setImpactAsset(String)
	 * @see top.dependability.Dependability_Package#getSecurityRisk_ImpactAsset()
	 * @model
	 * @generated
	 */
	String getImpactAsset();

	/**
	 * Sets the value of the '{@link top.dependability.SecurityRisk#getImpactAsset <em>Impact Asset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact Asset</em>' attribute.
	 * @see #getImpactAsset()
	 * @generated
	 */
	void setImpactAsset(String value);

	/**
	 * Returns the value of the '<em><b>Impact Individuals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impact Individuals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact Individuals</em>' attribute.
	 * @see #setImpactIndividuals(String)
	 * @see top.dependability.Dependability_Package#getSecurityRisk_ImpactIndividuals()
	 * @model
	 * @generated
	 */
	String getImpactIndividuals();

	/**
	 * Sets the value of the '{@link top.dependability.SecurityRisk#getImpactIndividuals <em>Impact Individuals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact Individuals</em>' attribute.
	 * @see #getImpactIndividuals()
	 * @generated
	 */
	void setImpactIndividuals(String value);

	/**
	 * Returns the value of the '<em><b>Impact Business</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impact Business</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact Business</em>' attribute.
	 * @see #setImpactBusiness(String)
	 * @see top.dependability.Dependability_Package#getSecurityRisk_ImpactBusiness()
	 * @model
	 * @generated
	 */
	String getImpactBusiness();

	/**
	 * Sets the value of the '{@link top.dependability.SecurityRisk#getImpactBusiness <em>Impact Business</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact Business</em>' attribute.
	 * @see #getImpactBusiness()
	 * @generated
	 */
	void setImpactBusiness(String value);

	/**
	 * Returns the value of the '<em><b>Attacker Goals</b></em>' reference list.
	 * The list contents are of type {@link top.dependability.AttackerGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker Goals</em>' reference list.
	 * @see top.dependability.Dependability_Package#getSecurityRisk_AttackerGoals()
	 * @model
	 * @generated
	 */
	EList<AttackerGoal> getAttackerGoals();

} // SecurityRisk
