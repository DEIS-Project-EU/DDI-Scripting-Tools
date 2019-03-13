/**
 */
package terminology.impl;

import base.ModelElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import terminology.Term;
import terminology.Terminology_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link terminology.impl.TermImpl#getExternalReference <em>External Reference</em>}</li>
 *   <li>{@link terminology.impl.TermImpl#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermImpl extends ExpressionElementImpl implements Term {
	/**
	 * The default value of the '{@link #getExternalReference() <em>External Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalReference() <em>External Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference()
	 * @generated
	 * @ordered
	 */
	protected String externalReference = EXTERNAL_REFERENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected ModelElement origin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Terminology_Package.Literals.TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalReference() {
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalReference(String newExternalReference) {
		String oldExternalReference = externalReference;
		externalReference = newExternalReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Terminology_Package.TERM__EXTERNAL_REFERENCE, oldExternalReference, externalReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject)origin;
			origin = (ModelElement)eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Terminology_Package.TERM__ORIGIN, oldOrigin, origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(ModelElement newOrigin) {
		ModelElement oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Terminology_Package.TERM__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Terminology_Package.TERM__EXTERNAL_REFERENCE:
				return getExternalReference();
			case Terminology_Package.TERM__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
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
			case Terminology_Package.TERM__EXTERNAL_REFERENCE:
				setExternalReference((String)newValue);
				return;
			case Terminology_Package.TERM__ORIGIN:
				setOrigin((ModelElement)newValue);
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
			case Terminology_Package.TERM__EXTERNAL_REFERENCE:
				setExternalReference(EXTERNAL_REFERENCE_EDEFAULT);
				return;
			case Terminology_Package.TERM__ORIGIN:
				setOrigin((ModelElement)null);
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
			case Terminology_Package.TERM__EXTERNAL_REFERENCE:
				return EXTERNAL_REFERENCE_EDEFAULT == null ? externalReference != null : !EXTERNAL_REFERENCE_EDEFAULT.equals(externalReference);
			case Terminology_Package.TERM__ORIGIN:
				return origin != null;
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
		result.append(" (externalReference: ");
		result.append(externalReference);
		result.append(')');
		return result.toString();
	}

} //TermImpl
