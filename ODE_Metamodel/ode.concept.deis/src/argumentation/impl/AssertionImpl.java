/**
 */
package argumentation.impl;

import argumentation.Argumentation_Package;
import argumentation.Assertion;
import argumentation.AssertionDeclaration;
import argumentation.Claim;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link argumentation.impl.AssertionImpl#getAssertionDeclaration <em>Assertion Declaration</em>}</li>
 *   <li>{@link argumentation.impl.AssertionImpl#getMetaClaim <em>Meta Claim</em>}</li>
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
		return Argumentation_Package.Literals.ASSERTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Argumentation_Package.ASSERTION__ASSERTION_DECLARATION, oldAssertionDeclaration, assertionDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Claim> getMetaClaim() {
		if (metaClaim == null) {
			metaClaim = new EObjectResolvingEList<Claim>(Claim.class, this, Argumentation_Package.ASSERTION__META_CLAIM);
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
			case Argumentation_Package.ASSERTION__ASSERTION_DECLARATION:
				return getAssertionDeclaration();
			case Argumentation_Package.ASSERTION__META_CLAIM:
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
			case Argumentation_Package.ASSERTION__ASSERTION_DECLARATION:
				setAssertionDeclaration((AssertionDeclaration)newValue);
				return;
			case Argumentation_Package.ASSERTION__META_CLAIM:
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
			case Argumentation_Package.ASSERTION__ASSERTION_DECLARATION:
				setAssertionDeclaration(ASSERTION_DECLARATION_EDEFAULT);
				return;
			case Argumentation_Package.ASSERTION__META_CLAIM:
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
			case Argumentation_Package.ASSERTION__ASSERTION_DECLARATION:
				return assertionDeclaration != ASSERTION_DECLARATION_EDEFAULT;
			case Argumentation_Package.ASSERTION__META_CLAIM:
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
