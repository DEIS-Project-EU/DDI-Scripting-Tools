/**
 */
package artifact.impl;

import artifact.Artifact_Package;
import artifact.Event;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link artifact.impl.EventImpl#getOccurence <em>Occurence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends ArtifactAssetImpl implements Event {
	/**
	 * The default value of the '{@link #getOccurence() <em>Occurence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurence()
	 * @generated
	 * @ordered
	 */
	protected static final Date OCCURENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOccurence() <em>Occurence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurence()
	 * @generated
	 * @ordered
	 */
	protected Date occurence = OCCURENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Artifact_Package.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getOccurence() {
		return occurence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurence(Date newOccurence) {
		Date oldOccurence = occurence;
		occurence = newOccurence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Artifact_Package.EVENT__OCCURENCE, oldOccurence, occurence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Artifact_Package.EVENT__OCCURENCE:
				return getOccurence();
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
			case Artifact_Package.EVENT__OCCURENCE:
				setOccurence((Date)newValue);
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
			case Artifact_Package.EVENT__OCCURENCE:
				setOccurence(OCCURENCE_EDEFAULT);
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
			case Artifact_Package.EVENT__OCCURENCE:
				return OCCURENCE_EDEFAULT == null ? occurence != null : !OCCURENCE_EDEFAULT.equals(occurence);
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
		result.append(" (occurence: ");
		result.append(occurence);
		result.append(')');
		return result.toString();
	}

} //EventImpl
