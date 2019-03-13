/**
 */
package terminology.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import terminology.TerminologyElement;
import terminology.TerminologyGroup;
import terminology.Terminology_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link terminology.impl.TerminologyGroupImpl#getTerminologyElement <em>Terminology Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyGroupImpl extends TerminologyElementImpl implements TerminologyGroup {
	/**
	 * The cached value of the '{@link #getTerminologyElement() <em>Terminology Element</em>}' reference list.
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
	protected TerminologyGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Terminology_Package.Literals.TERMINOLOGY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyElement> getTerminologyElement() {
		if (terminologyElement == null) {
			terminologyElement = new EObjectResolvingEList<TerminologyElement>(TerminologyElement.class, this, Terminology_Package.TERMINOLOGY_GROUP__TERMINOLOGY_ELEMENT);
		}
		return terminologyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Terminology_Package.TERMINOLOGY_GROUP__TERMINOLOGY_ELEMENT:
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
			case Terminology_Package.TERMINOLOGY_GROUP__TERMINOLOGY_ELEMENT:
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
			case Terminology_Package.TERMINOLOGY_GROUP__TERMINOLOGY_ELEMENT:
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
			case Terminology_Package.TERMINOLOGY_GROUP__TERMINOLOGY_ELEMENT:
				return terminologyElement != null && !terminologyElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TerminologyGroupImpl
