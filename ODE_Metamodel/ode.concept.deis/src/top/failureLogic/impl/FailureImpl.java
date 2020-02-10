/**
 */
package top.failureLogic.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import top.failureLogic.Failure;
import top.failureLogic.FailureLogic_Package;
import top.failureLogic.FailureOriginType;
import top.failureLogic.ProbDist;

import top.odeBase.impl.BaseElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.failureLogic.impl.FailureImpl#getOriginType <em>Origin Type</em>}</li>
 *   <li>{@link top.failureLogic.impl.FailureImpl#getFailureClass <em>Failure Class</em>}</li>
 *   <li>{@link top.failureLogic.impl.FailureImpl#getFailureRate <em>Failure Rate</em>}</li>
 *   <li>{@link top.failureLogic.impl.FailureImpl#isIsCcf <em>Is Ccf</em>}</li>
 *   <li>{@link top.failureLogic.impl.FailureImpl#getFailureProbDistribution <em>Failure Prob Distribution</em>}</li>
 *   <li>{@link top.failureLogic.impl.FailureImpl#getCcfFailures <em>Ccf Failures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureImpl extends BaseElementImpl implements Failure {
	/**
	 * The default value of the '{@link #getOriginType() <em>Origin Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginType()
	 * @generated
	 * @ordered
	 */
	protected static final FailureOriginType ORIGIN_TYPE_EDEFAULT = FailureOriginType.INPUT;

	/**
	 * The cached value of the '{@link #getOriginType() <em>Origin Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginType()
	 * @generated
	 * @ordered
	 */
	protected FailureOriginType originType = ORIGIN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailureClass() <em>Failure Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILURE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailureClass() <em>Failure Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureClass()
	 * @generated
	 * @ordered
	 */
	protected String failureClass = FAILURE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailureRate() <em>Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureRate()
	 * @generated
	 * @ordered
	 */
	protected static final double FAILURE_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFailureRate() <em>Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureRate()
	 * @generated
	 * @ordered
	 */
	protected double failureRate = FAILURE_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCcf() <em>Is Ccf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCcf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CCF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCcf() <em>Is Ccf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCcf()
	 * @generated
	 * @ordered
	 */
	protected boolean isCcf = IS_CCF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFailureProbDistribution() <em>Failure Prob Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureProbDistribution()
	 * @generated
	 * @ordered
	 */
	protected ProbDist failureProbDistribution;

	/**
	 * The cached value of the '{@link #getCcfFailures() <em>Ccf Failures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcfFailures()
	 * @generated
	 * @ordered
	 */
	protected EList<Failure> ccfFailures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailureLogic_Package.Literals.FAILURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureOriginType getOriginType() {
		return originType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginType(FailureOriginType newOriginType) {
		FailureOriginType oldOriginType = originType;
		originType = newOriginType == null ? ORIGIN_TYPE_EDEFAULT : newOriginType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureLogic_Package.FAILURE__ORIGIN_TYPE, oldOriginType, originType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFailureClass() {
		return failureClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureClass(String newFailureClass) {
		String oldFailureClass = failureClass;
		failureClass = newFailureClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureLogic_Package.FAILURE__FAILURE_CLASS, oldFailureClass, failureClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFailureRate() {
		return failureRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureRate(double newFailureRate) {
		double oldFailureRate = failureRate;
		failureRate = newFailureRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureLogic_Package.FAILURE__FAILURE_RATE, oldFailureRate, failureRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCcf() {
		return isCcf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCcf(boolean newIsCcf) {
		boolean oldIsCcf = isCcf;
		isCcf = newIsCcf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureLogic_Package.FAILURE__IS_CCF, oldIsCcf, isCcf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbDist getFailureProbDistribution() {
		return failureProbDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailureProbDistribution(ProbDist newFailureProbDistribution, NotificationChain msgs) {
		ProbDist oldFailureProbDistribution = failureProbDistribution;
		failureProbDistribution = newFailureProbDistribution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FailureLogic_Package.FAILURE__FAILURE_PROB_DISTRIBUTION, oldFailureProbDistribution, newFailureProbDistribution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureProbDistribution(ProbDist newFailureProbDistribution) {
		if (newFailureProbDistribution != failureProbDistribution) {
			NotificationChain msgs = null;
			if (failureProbDistribution != null)
				msgs = ((InternalEObject)failureProbDistribution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FailureLogic_Package.FAILURE__FAILURE_PROB_DISTRIBUTION, null, msgs);
			if (newFailureProbDistribution != null)
				msgs = ((InternalEObject)newFailureProbDistribution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FailureLogic_Package.FAILURE__FAILURE_PROB_DISTRIBUTION, null, msgs);
			msgs = basicSetFailureProbDistribution(newFailureProbDistribution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureLogic_Package.FAILURE__FAILURE_PROB_DISTRIBUTION, newFailureProbDistribution, newFailureProbDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Failure> getCcfFailures() {
		if (ccfFailures == null) {
			ccfFailures = new EObjectResolvingEList<Failure>(Failure.class, this, FailureLogic_Package.FAILURE__CCF_FAILURES);
		}
		return ccfFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FailureLogic_Package.FAILURE__FAILURE_PROB_DISTRIBUTION:
				return basicSetFailureProbDistribution(null, msgs);
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
			case FailureLogic_Package.FAILURE__ORIGIN_TYPE:
				return getOriginType();
			case FailureLogic_Package.FAILURE__FAILURE_CLASS:
				return getFailureClass();
			case FailureLogic_Package.FAILURE__FAILURE_RATE:
				return getFailureRate();
			case FailureLogic_Package.FAILURE__IS_CCF:
				return isIsCcf();
			case FailureLogic_Package.FAILURE__FAILURE_PROB_DISTRIBUTION:
				return getFailureProbDistribution();
			case FailureLogic_Package.FAILURE__CCF_FAILURES:
				return getCcfFailures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FailureLogic_Package.FAILURE__ORIGIN_TYPE:
				setOriginType((FailureOriginType)newValue);
				return;
			case FailureLogic_Package.FAILURE__FAILURE_CLASS:
				setFailureClass((String)newValue);
				return;
			case FailureLogic_Package.FAILURE__FAILURE_RATE:
				setFailureRate((Double)newValue);
				return;
			case FailureLogic_Package.FAILURE__IS_CCF:
				setIsCcf((Boolean)newValue);
				return;
			case FailureLogic_Package.FAILURE__FAILURE_PROB_DISTRIBUTION:
				setFailureProbDistribution((ProbDist)newValue);
				return;
			case FailureLogic_Package.FAILURE__CCF_FAILURES:
				getCcfFailures().clear();
				getCcfFailures().addAll((Collection<? extends Failure>)newValue);
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
			case FailureLogic_Package.FAILURE__ORIGIN_TYPE:
				setOriginType(ORIGIN_TYPE_EDEFAULT);
				return;
			case FailureLogic_Package.FAILURE__FAILURE_CLASS:
				setFailureClass(FAILURE_CLASS_EDEFAULT);
				return;
			case FailureLogic_Package.FAILURE__FAILURE_RATE:
				setFailureRate(FAILURE_RATE_EDEFAULT);
				return;
			case FailureLogic_Package.FAILURE__IS_CCF:
				setIsCcf(IS_CCF_EDEFAULT);
				return;
			case FailureLogic_Package.FAILURE__FAILURE_PROB_DISTRIBUTION:
				setFailureProbDistribution((ProbDist)null);
				return;
			case FailureLogic_Package.FAILURE__CCF_FAILURES:
				getCcfFailures().clear();
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
			case FailureLogic_Package.FAILURE__ORIGIN_TYPE:
				return originType != ORIGIN_TYPE_EDEFAULT;
			case FailureLogic_Package.FAILURE__FAILURE_CLASS:
				return FAILURE_CLASS_EDEFAULT == null ? failureClass != null : !FAILURE_CLASS_EDEFAULT.equals(failureClass);
			case FailureLogic_Package.FAILURE__FAILURE_RATE:
				return failureRate != FAILURE_RATE_EDEFAULT;
			case FailureLogic_Package.FAILURE__IS_CCF:
				return isCcf != IS_CCF_EDEFAULT;
			case FailureLogic_Package.FAILURE__FAILURE_PROB_DISTRIBUTION:
				return failureProbDistribution != null;
			case FailureLogic_Package.FAILURE__CCF_FAILURES:
				return ccfFailures != null && !ccfFailures.isEmpty();
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
		result.append(" (originType: ");
		result.append(originType);
		result.append(", failureClass: ");
		result.append(failureClass);
		result.append(", failureRate: ");
		result.append(failureRate);
		result.append(", isCcf: ");
		result.append(isCcf);
		result.append(')');
		return result.toString();
	}

} //FailureImpl
