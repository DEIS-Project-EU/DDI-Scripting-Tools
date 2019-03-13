/**
 */
package terminology.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import terminology.TerminologyElement;
import terminology.TerminologyPackage;
import terminology.Terminology_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link terminology.impl.TerminologyPackageImpl#getTerminologyElement <em>Terminology Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyPackageImpl extends TerminologyElementImpl implements TerminologyPackage {
	/**
	 * The cached value of the '{@link #getTerminologyElement() <em>Terminology Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminologyElement()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyElement> terminologyElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Terminology_Package.Literals.TERMINOLOGY_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyElement> getTerminologyElement() {
		if (terminologyElement == null) {
			terminologyElement = new EObjectContainmentEList<TerminologyElement>(TerminologyElement.class, this, Terminology_Package.TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT);
		}
		return terminologyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Terminology_Package.TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT:
				return ((InternalEList<?>)getTerminologyElement()).basicRemove(otherEnd, msgs);
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
			case Terminology_Package.TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT:
				return getTerminologyElement();
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
			case Terminology_Package.TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT:
				getTerminologyElement().clear();
				getTerminologyElement().addAll((Collection<? extends TerminologyElement>)newValue);
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
			case Terminology_Package.TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT:
				getTerminologyElement().clear();
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
			case Terminology_Package.TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT:
				return terminologyElement != null && !terminologyElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TerminologyPackageImpl
