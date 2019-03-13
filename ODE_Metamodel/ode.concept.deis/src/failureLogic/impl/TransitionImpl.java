/**
 */
package failureLogic.impl;

import failureLogic.FailureLogic_Package;
import failureLogic.ProbDist;
import failureLogic.State;
import failureLogic.Transition;

import java.util.Collection;

import odeBase.impl.BaseElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.impl.TransitionImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link failureLogic.impl.TransitionImpl#getTransitionProbDistribution <em>Transition Prob Distribution</em>}</li>
 *   <li>{@link failureLogic.impl.TransitionImpl#getFromStates <em>From States</em>}</li>
 *   <li>{@link failureLogic.impl.TransitionImpl#getToStates <em>To States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends BaseElementImpl implements Transition {
	/**
	 * The default value of the '{@link #getTransition() <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected double transition = TRANSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransitionProbDistribution() <em>Transition Prob Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionProbDistribution()
	 * @generated
	 * @ordered
	 */
	protected ProbDist transitionProbDistribution;

	/**
	 * The cached value of the '{@link #getFromStates() <em>From States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> fromStates;

	/**
	 * The cached value of the '{@link #getToStates() <em>To States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> toStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailureLogic_Package.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(double newTransition) {
		double oldTransition = transition;
		transition = newTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureLogic_Package.TRANSITION__TRANSITION, oldTransition, transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbDist getTransitionProbDistribution() {
		return transitionProbDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionProbDistribution(ProbDist newTransitionProbDistribution, NotificationChain msgs) {
		ProbDist oldTransitionProbDistribution = transitionProbDistribution;
		transitionProbDistribution = newTransitionProbDistribution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FailureLogic_Package.TRANSITION__TRANSITION_PROB_DISTRIBUTION, oldTransitionProbDistribution, newTransitionProbDistribution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionProbDistribution(ProbDist newTransitionProbDistribution) {
		if (newTransitionProbDistribution != transitionProbDistribution) {
			NotificationChain msgs = null;
			if (transitionProbDistribution != null)
				msgs = ((InternalEObject)transitionProbDistribution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FailureLogic_Package.TRANSITION__TRANSITION_PROB_DISTRIBUTION, null, msgs);
			if (newTransitionProbDistribution != null)
				msgs = ((InternalEObject)newTransitionProbDistribution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FailureLogic_Package.TRANSITION__TRANSITION_PROB_DISTRIBUTION, null, msgs);
			msgs = basicSetTransitionProbDistribution(newTransitionProbDistribution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureLogic_Package.TRANSITION__TRANSITION_PROB_DISTRIBUTION, newTransitionProbDistribution, newTransitionProbDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getFromStates() {
		if (fromStates == null) {
			fromStates = new EObjectResolvingEList<State>(State.class, this, FailureLogic_Package.TRANSITION__FROM_STATES);
		}
		return fromStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getToStates() {
		if (toStates == null) {
			toStates = new EObjectResolvingEList<State>(State.class, this, FailureLogic_Package.TRANSITION__TO_STATES);
		}
		return toStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FailureLogic_Package.TRANSITION__TRANSITION_PROB_DISTRIBUTION:
				return basicSetTransitionProbDistribution(null, msgs);
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
			case FailureLogic_Package.TRANSITION__TRANSITION:
				return getTransition();
			case FailureLogic_Package.TRANSITION__TRANSITION_PROB_DISTRIBUTION:
				return getTransitionProbDistribution();
			case FailureLogic_Package.TRANSITION__FROM_STATES:
				return getFromStates();
			case FailureLogic_Package.TRANSITION__TO_STATES:
				return getToStates();
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
			case FailureLogic_Package.TRANSITION__TRANSITION:
				setTransition((Double)newValue);
				return;
			case FailureLogic_Package.TRANSITION__TRANSITION_PROB_DISTRIBUTION:
				setTransitionProbDistribution((ProbDist)newValue);
				return;
			case FailureLogic_Package.TRANSITION__FROM_STATES:
				getFromStates().clear();
				getFromStates().addAll((Collection<? extends State>)newValue);
				return;
			case FailureLogic_Package.TRANSITION__TO_STATES:
				getToStates().clear();
				getToStates().addAll((Collection<? extends State>)newValue);
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
			case FailureLogic_Package.TRANSITION__TRANSITION:
				setTransition(TRANSITION_EDEFAULT);
				return;
			case FailureLogic_Package.TRANSITION__TRANSITION_PROB_DISTRIBUTION:
				setTransitionProbDistribution((ProbDist)null);
				return;
			case FailureLogic_Package.TRANSITION__FROM_STATES:
				getFromStates().clear();
				return;
			case FailureLogic_Package.TRANSITION__TO_STATES:
				getToStates().clear();
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
			case FailureLogic_Package.TRANSITION__TRANSITION:
				return transition != TRANSITION_EDEFAULT;
			case FailureLogic_Package.TRANSITION__TRANSITION_PROB_DISTRIBUTION:
				return transitionProbDistribution != null;
			case FailureLogic_Package.TRANSITION__FROM_STATES:
				return fromStates != null && !fromStates.isEmpty();
			case FailureLogic_Package.TRANSITION__TO_STATES:
				return toStates != null && !toStates.isEmpty();
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
		result.append(" (transition: ");
		result.append(transition);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
