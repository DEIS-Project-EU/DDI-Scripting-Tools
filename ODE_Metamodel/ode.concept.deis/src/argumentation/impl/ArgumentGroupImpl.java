/**
 */
package argumentation.impl;

import argumentation.ArgumentGroup;
import argumentation.ArgumentationElement;
import argumentation.Argumentation_Package;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link argumentation.impl.ArgumentGroupImpl#getArgumentationElement <em>Argumentation Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentGroupImpl extends ArgumentationElementImpl implements ArgumentGroup {
	/**
	 * The cached value of the '{@link #getArgumentationElement() <em>Argumentation Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentationElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentationElement> argumentationElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Argumentation_Package.Literals.ARGUMENT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentationElement> getArgumentationElement() {
		if (argumentationElement == null) {
			argumentationElement = new EObjectResolvingEList<ArgumentationElement>(ArgumentationElement.class, this, Argumentation_Package.ARGUMENT_GROUP__ARGUMENTATION_ELEMENT);
		}
		return argumentationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Argumentation_Package.ARGUMENT_GROUP__ARGUMENTATION_ELEMENT:
				return getArgumentationElement();
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
			case Argumentation_Package.ARGUMENT_GROUP__ARGUMENTATION_ELEMENT:
				getArgumentationElement().clear();
				getArgumentationElement().addAll((Collection<? extends ArgumentationElement>)newValue);
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
			case Argumentation_Package.ARGUMENT_GROUP__ARGUMENTATION_ELEMENT:
				getArgumentationElement().clear();
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
			case Argumentation_Package.ARGUMENT_GROUP__ARGUMENTATION_ELEMENT:
				return argumentationElement != null && !argumentationElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentGroupImpl
