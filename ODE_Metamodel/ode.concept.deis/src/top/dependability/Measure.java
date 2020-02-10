/**
 */
package top.dependability;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.Measure#getIntrinsicSafety <em>Intrinsic Safety</em>}</li>
 *   <li>{@link top.dependability.Measure#getSafeGuard <em>Safe Guard</em>}</li>
 *   <li>{@link top.dependability.Measure#getApplierInformation <em>Applier Information</em>}</li>
 *   <li>{@link top.dependability.Measure#isRiskAcceptability <em>Risk Acceptability</em>}</li>
 *   <li>{@link top.dependability.Measure#getFurtherAction <em>Further Action</em>}</li>
 *   <li>{@link top.dependability.Measure#getSource <em>Source</em>}</li>
 *   <li>{@link top.dependability.Measure#getMeasureType <em>Measure Type</em>}</li>
 *   <li>{@link top.dependability.Measure#getAssuranceLevel <em>Assurance Level</em>}</li>
 * </ul>
 *
 * @see top.dependability.Dependability_Package#getMeasure()
 * @model
 * @generated
 */
public interface Measure extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Intrinsic Safety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intrinsic Safety</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intrinsic Safety</em>' attribute.
	 * @see #setIntrinsicSafety(String)
	 * @see top.dependability.Dependability_Package#getMeasure_IntrinsicSafety()
	 * @model
	 * @generated
	 */
	String getIntrinsicSafety();

	/**
	 * Sets the value of the '{@link top.dependability.Measure#getIntrinsicSafety <em>Intrinsic Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intrinsic Safety</em>' attribute.
	 * @see #getIntrinsicSafety()
	 * @generated
	 */
	void setIntrinsicSafety(String value);

	/**
	 * Returns the value of the '<em><b>Safe Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safe Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safe Guard</em>' attribute.
	 * @see #setSafeGuard(String)
	 * @see top.dependability.Dependability_Package#getMeasure_SafeGuard()
	 * @model
	 * @generated
	 */
	String getSafeGuard();

	/**
	 * Sets the value of the '{@link top.dependability.Measure#getSafeGuard <em>Safe Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safe Guard</em>' attribute.
	 * @see #getSafeGuard()
	 * @generated
	 */
	void setSafeGuard(String value);

	/**
	 * Returns the value of the '<em><b>Applier Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applier Information</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applier Information</em>' attribute.
	 * @see #setApplierInformation(String)
	 * @see top.dependability.Dependability_Package#getMeasure_ApplierInformation()
	 * @model
	 * @generated
	 */
	String getApplierInformation();

	/**
	 * Sets the value of the '{@link top.dependability.Measure#getApplierInformation <em>Applier Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applier Information</em>' attribute.
	 * @see #getApplierInformation()
	 * @generated
	 */
	void setApplierInformation(String value);

	/**
	 * Returns the value of the '<em><b>Risk Acceptability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Acceptability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Acceptability</em>' attribute.
	 * @see #setRiskAcceptability(boolean)
	 * @see top.dependability.Dependability_Package#getMeasure_RiskAcceptability()
	 * @model
	 * @generated
	 */
	boolean isRiskAcceptability();

	/**
	 * Sets the value of the '{@link top.dependability.Measure#isRiskAcceptability <em>Risk Acceptability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Acceptability</em>' attribute.
	 * @see #isRiskAcceptability()
	 * @generated
	 */
	void setRiskAcceptability(boolean value);

	/**
	 * Returns the value of the '<em><b>Further Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Further Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Further Action</em>' attribute.
	 * @see #setFurtherAction(String)
	 * @see top.dependability.Dependability_Package#getMeasure_FurtherAction()
	 * @model
	 * @generated
	 */
	String getFurtherAction();

	/**
	 * Sets the value of the '{@link top.dependability.Measure#getFurtherAction <em>Further Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Further Action</em>' attribute.
	 * @see #getFurtherAction()
	 * @generated
	 */
	void setFurtherAction(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see top.dependability.Dependability_Package#getMeasure_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link top.dependability.Measure#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Measure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Type</em>' reference.
	 * @see #setMeasureType(MeasureType)
	 * @see top.dependability.Dependability_Package#getMeasure_MeasureType()
	 * @model
	 * @generated
	 */
	MeasureType getMeasureType();

	/**
	 * Sets the value of the '{@link top.dependability.Measure#getMeasureType <em>Measure Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Type</em>' reference.
	 * @see #getMeasureType()
	 * @generated
	 */
	void setMeasureType(MeasureType value);

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
	 * @see top.dependability.Dependability_Package#getMeasure_AssuranceLevel()
	 * @model
	 * @generated
	 */
	AssuranceLevel getAssuranceLevel();

	/**
	 * Sets the value of the '{@link top.dependability.Measure#getAssuranceLevel <em>Assurance Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assurance Level</em>' reference.
	 * @see #getAssuranceLevel()
	 * @generated
	 */
	void setAssuranceLevel(AssuranceLevel value);

} // Measure
