/**
 */
package failureLogic.impl;

import failureLogic.FMEDAEntry;
import failureLogic.FailureLogic_Package;
import failureLogic.ProbDist;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMEDA Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.impl.FMEDAEntryImpl#getDiagnosisRate <em>Diagnosis Rate</em>}</li>
 *   <li>{@link failureLogic.impl.FMEDAEntryImpl#getDiagnosisProbDistribution <em>Diagnosis Prob Distribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMEDAEntryImpl extends FMEAEntryImpl implements FMEDAEntry {
	/**
	 * The default value of the '{@link #getDiagnosisRate() <em>Diagnosis Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisRate()
	 * @generated
	 * @ordered
	 */
	protected static final double DIAGNOSIS_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiagnosisRate() <em>Diagnosis Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisRate()
	 * @generated
	 * @ordered
	 */
	protected double diagnosisRate = DIAGNOSIS_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiagnosisProbDistribution() <em>Diagnosis Prob Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisProbDistribution()
	 * @generated
	 * @ordered
	 */
	protected ProbDist diagnosisProbDistribution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMEDAEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailureLogic_Package.Literals.FMEDA_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiagnosisRate() {
		return diagnosisRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosisRate(double newDiagnosisRate) {
		double oldDiagnosisRate = diagnosisRate;
		diagnosisRate = newDiagnosisRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureLogic_Package.FMEDA_ENTRY__DIAGNOSIS_RATE, oldDiagnosisRate, diagnosisRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbDist getDiagnosisProbDistribution() {
		return diagnosisProbDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosisProbDistribution(ProbDist newDiagnosisProbDistribution, NotificationChain msgs) {
		ProbDist oldDiagnosisProbDistribution = diagnosisProbDistribution;
		diagnosisProbDistribution = newDiagnosisProbDistribution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FailureLogic_Package.FMEDA_ENTRY__DIAGNOSIS_PROB_DISTRIBUTION, oldDiagnosisProbDistribution, newDiagnosisProbDistribution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosisProbDistribution(ProbDist newDiagnosisProbDistribution) {
		if (newDiagnosisProbDistribution != diagnosisProbDistribution) {
			NotificationChain msgs = null;
			if (diagnosisProbDistribution != null)
				msgs = ((InternalEObject)diagnosisProbDistribution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FailureLogic_Package.FMEDA_ENTRY__DIAGNOSIS_PROB_DISTRIBUTION, null, msgs);
			if (newDiagnosisProbDistribution != null)
				msgs = ((InternalEObject)newDiagnosisProbDistribution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FailureLogic_Package.FMEDA_ENTRY__DIAGNOSIS_PROB_DISTRIBUTION, null, msgs);
			msgs = basicSetDiagnosisProbDistribution(newDiagnosisProbDistribution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureLogic_Package.FMEDA_ENTRY__DIAGNOSIS_PROB_DISTRIBUTION, newDiagnosisProbDistribution, newDiagnosisProbDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FailureLogic_Package.FMEDA_ENTRY__DIAGNOSIS_PROB_DISTRIBUTION:
				return basicSetDiagnosisProbDistribution(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailureLogic_Package.FMEDA_ENTRY__DIAGNOSIS_RATE:
				return getDiagnosisRate();
			case FailureLogic_Package.FMEDA_ENTRY__DIAGNOSIS_PROB_DISTRIBUTION:
				return getDiagnosisProbDistribution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FailureLogic_Package.FMEDA_ENTRY__DIAGNOSIS_RATE:
				setDiagnosisRate((Double)newValue);
				return;
			case FailureLogic_Package.FMEDA_ENTRY__DIAGNOSIS_PROB_DISTRIBUTION:
				setDiagnosisProbDistribution((ProbDist)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FailureLogic_Package.FMEDA_ENTRY__DIAGNOSIS_RATE:
				setDiagnosisRate(DIAGNOSIS_RATE_EDEFAULT);
				return;
			case FailureLogic_Package.FMEDA_ENTRY__DIAGNOSIS_PROB_DISTRIBUTION:
				setDiagnosisProbDistribution((ProbDist)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FailureLogic_Package.FMEDA_ENTRY__DIAGNOSIS_RATE:
				return diagnosisRate != DIAGNOSIS_RATE_EDEFAULT;
			case FailureLogic_Package.FMEDA_ENTRY__DIAGNOSIS_PROB_DISTRIBUTION:
				return diagnosisProbDistribution != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (diagnosisRate: ");
		result.append(diagnosisRate);
		result.append(')');
		return result.toString();
	}

} //FMEDAEntryImpl
