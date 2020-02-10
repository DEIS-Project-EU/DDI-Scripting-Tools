/**
 */
package top.argumentation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import top.argumentation.ArgumentationPackage;
import top.argumentation.Assertion;
import top.argumentation.AssertionDeclaration;
import top.argumentation.Claim;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.argumentation.impl.AssertionImpl#getAssertionDeclaration <em>Assertion Declaration</em>}</li>
 *   <li>{@link top.argumentation.impl.AssertionImpl#getMetaClaim <em>Meta Claim</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssertionImpl extends ArgumentAssetImpl implements Assertion {
	/**
	 * The default value of the '{@link #getAssertionDeclaration() <em>Assertion Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertionDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final AssertionDeclaration ASSERTION_DECLARATION_EDEFAULT = AssertionDeclaration.ASSERTED;

	/**
	 * The cached value of the '{@link #getAssertionDeclaration() <em>Assertion Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertionDeclaration()
	 * @generated
	 * @ordered
	 */
	protected AssertionDeclaration assertionDeclaration = ASSERTION_DECLARATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetaClaim() <em>Meta Claim</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaClaim()
	 * @generated
	 * @ordered
	 */
	protected EList<Claim> metaClaim;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDeclaration getAssertionDeclaration() {
		return assertionDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssertionDeclaration(AssertionDeclaration newAssertionDeclaration) {
		AssertionDeclaration oldAssertionDeclaration = assertionDeclaration;
		assertionDeclaration = newAssertionDeclaration == null ? ASSERTION_DECLARATION_EDEFAULT : newAssertionDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ASSERTION__ASSERTION_DECLARATION, oldAssertionDeclaration, assertionDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Claim> getMetaClaim() {
		if (metaClaim == null) {
			metaClaim = new EObjectResolvingEList<Claim>(Claim.class, this, ArgumentationPackage.ASSERTION__META_CLAIM);
		}
		return metaClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.ASSERTION__ASSERTION_DECLARATION:
				return getAssertionDeclaration();
			case ArgumentationPackage.ASSERTION__META_CLAIM:
				return getMetaClaim();
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
			case ArgumentationPackage.ASSERTION__ASSERTION_DECLARATION:
				setAssertionDeclaration((AssertionDeclaration)newValue);
				return;
			case ArgumentationPackage.ASSERTION__META_CLAIM:
				getMetaClaim().clear();
				getMetaClaim().addAll((Collection<? extends Claim>)newValue);
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
			case ArgumentationPackage.ASSERTION__ASSERTION_DECLARATION:
				setAssertionDeclaration(ASSERTION_DECLARATION_EDEFAULT);
				return;
			case ArgumentationPackage.ASSERTION__META_CLAIM:
				getMetaClaim().clear();
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
			case ArgumentationPackage.ASSERTION__ASSERTION_DECLARATION:
				return assertionDeclaration != ASSERTION_DECLARATION_EDEFAULT;
			case ArgumentationPackage.ASSERTION__META_CLAIM:
				return metaClaim != null && !metaClaim.isEmpty();
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
		result.append(" (assertionDeclaration: ");
		result.append(assertionDeclaration);
		result.append(')');
		return result.toString();
	}

} //AssertionImpl
