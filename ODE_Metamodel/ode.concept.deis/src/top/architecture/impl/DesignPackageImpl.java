/**
 */
package top.architecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import top.architecture.ArchitecturePackage;
import top.architecture.DesignPackage;
import top.architecture.Function;

import top.integration.impl.ODEProductPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.architecture.impl.DesignPackageImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link top.architecture.impl.DesignPackageImpl#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignPackageImpl extends ODEProductPackageImpl implements DesignPackage {
	/**
	 * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<top.architecture.System> systems;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> functions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.DESIGN_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<top.architecture.System> getSystems() {
		if (systems == null) {
			systems = new EObjectContainmentEList<top.architecture.System>(top.architecture.System.class, this, ArchitecturePackage.DESIGN_PACKAGE__SYSTEMS);
		}
		return systems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<Function>(Function.class, this, ArchitecturePackage.DESIGN_PACKAGE__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.DESIGN_PACKAGE__SYSTEMS:
				return ((InternalEList<?>)getSystems()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.DESIGN_PACKAGE__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
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
			case ArchitecturePackage.DESIGN_PACKAGE__SYSTEMS:
				return getSystems();
			case ArchitecturePackage.DESIGN_PACKAGE__FUNCTIONS:
				return getFunctions();
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
			case ArchitecturePackage.DESIGN_PACKAGE__SYSTEMS:
				getSystems().clear();
				getSystems().addAll((Collection<? extends top.architecture.System>)newValue);
				return;
			case ArchitecturePackage.DESIGN_PACKAGE__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends Function>)newValue);
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
			case ArchitecturePackage.DESIGN_PACKAGE__SYSTEMS:
				getSystems().clear();
				return;
			case ArchitecturePackage.DESIGN_PACKAGE__FUNCTIONS:
				getFunctions().clear();
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
			case ArchitecturePackage.DESIGN_PACKAGE__SYSTEMS:
				return systems != null && !systems.isEmpty();
			case ArchitecturePackage.DESIGN_PACKAGE__FUNCTIONS:
				return functions != null && !functions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DesignPackageImpl
