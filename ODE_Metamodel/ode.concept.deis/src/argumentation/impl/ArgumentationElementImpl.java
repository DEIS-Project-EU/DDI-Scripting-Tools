/**
 */
package argumentation.impl;

import argumentation.ArgumentationElement;
import argumentation.Argumentation_Package;

import base.impl.ArtifactElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argumentation Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link argumentation.impl.ArgumentationElementImpl#isUninstantiated <em>Uninstantiated</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArgumentationElementImpl extends ArtifactElementImpl implements ArgumentationElement {
	/**
	 * The default value of the '{@link #isUninstantiated() <em>Uninstantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUninstantiated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNINSTANTIATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUninstantiated() <em>Uninstantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUninstantiated()
	 * @generated
	 * @ordered
	 */
	protected boolean uninstantiated = UNINSTANTIATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Argumentation_Package.Literals.ARGUMENTATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUninstantiated() {
		return uninstantiated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUninstantiated(boolean newUninstantiated) {
		boolean oldUninstantiated = uninstantiated;
		uninstantiated = newUninstantiated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Argumentation_Package.ARGUMENTATION_ELEMENT__UNINSTANTIATED, oldUninstantiated, uninstantiated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Argumentation_Package.ARGUMENTATION_ELEMENT__UNINSTANTIATED:
				return isUninstantiated();
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
			case Argumentation_Package.ARGUMENTATION_ELEMENT__UNINSTANTIATED:
				setUninstantiated((Boolean)newValue);
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
			case Argumentation_Package.ARGUMENTATION_ELEMENT__UNINSTANTIATED:
				setUninstantiated(UNINSTANTIATED_EDEFAULT);
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
			case Argumentation_Package.ARGUMENTATION_ELEMENT__UNINSTANTIATED:
				return uninstantiated != UNINSTANTIATED_EDEFAULT;
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
		result.append(" (uninstantiated: ");
		result.append(uninstantiated);
		result.append(')');
		return result.toString();
	}

} //ArgumentationElementImpl
