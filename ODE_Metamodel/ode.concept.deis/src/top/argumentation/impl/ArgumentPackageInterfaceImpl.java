/**
 */
package top.argumentation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import top.argumentation.ArgumentPackage;
import top.argumentation.ArgumentPackageInterface;
import top.argumentation.ArgumentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Package Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.argumentation.impl.ArgumentPackageInterfaceImpl#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentPackageInterfaceImpl extends ArgumentPackageImpl implements ArgumentPackageInterface {
	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected ArgumentPackage implements_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentPackageInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.ARGUMENT_PACKAGE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentPackage getImplements() {
		if (implements_ != null && implements_.eIsProxy()) {
			InternalEObject oldImplements = (InternalEObject)implements_;
			implements_ = (ArgumentPackage)eResolveProxy(oldImplements);
			if (implements_ != oldImplements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentationPackage.ARGUMENT_PACKAGE_INTERFACE__IMPLEMENTS, oldImplements, implements_));
			}
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentPackage basicGetImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(ArgumentPackage newImplements) {
		ArgumentPackage oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ARGUMENT_PACKAGE_INTERFACE__IMPLEMENTS, oldImplements, implements_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.ARGUMENT_PACKAGE_INTERFACE__IMPLEMENTS:
				if (resolve) return getImplements();
				return basicGetImplements();
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
			case ArgumentationPackage.ARGUMENT_PACKAGE_INTERFACE__IMPLEMENTS:
				setImplements((ArgumentPackage)newValue);
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
			case ArgumentationPackage.ARGUMENT_PACKAGE_INTERFACE__IMPLEMENTS:
				setImplements((ArgumentPackage)null);
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
			case ArgumentationPackage.ARGUMENT_PACKAGE_INTERFACE__IMPLEMENTS:
				return implements_ != null;
		}
		return super.eIsSet(featureID);
	}

} //ArgumentPackageInterfaceImpl
