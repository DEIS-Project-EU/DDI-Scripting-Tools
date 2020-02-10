/**
 */
package top.architecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import top.architecture.ArchitecturePackage;
import top.architecture.Port;
import top.architecture.PortDirection;

import top.dependability.AssuranceLevel;
import top.dependability.DependabilityRequirement;

import top.failureLogic.Failure;

import top.odeBase.impl.BaseElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.architecture.impl.PortImpl#getFlowType <em>Flow Type</em>}</li>
 *   <li>{@link top.architecture.impl.PortImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link top.architecture.impl.PortImpl#getInterfaceFailures <em>Interface Failures</em>}</li>
 *   <li>{@link top.architecture.impl.PortImpl#getRefinedPorts <em>Refined Ports</em>}</li>
 *   <li>{@link top.architecture.impl.PortImpl#getAssuranceLevel <em>Assurance Level</em>}</li>
 *   <li>{@link top.architecture.impl.PortImpl#getDependabilityRequirements <em>Dependability Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends BaseElementImpl implements Port {
	/**
	 * The default value of the '{@link #getFlowType() <em>Flow Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowType()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOW_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlowType() <em>Flow Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowType()
	 * @generated
	 * @ordered
	 */
	protected String flowType = FLOW_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final PortDirection DIRECTION_EDEFAULT = PortDirection.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected PortDirection direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfaceFailures() <em>Interface Failures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceFailures()
	 * @generated
	 * @ordered
	 */
	protected EList<Failure> interfaceFailures;

	/**
	 * The cached value of the '{@link #getRefinedPorts() <em>Refined Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> refinedPorts;

	/**
	 * The cached value of the '{@link #getAssuranceLevel() <em>Assurance Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssuranceLevel()
	 * @generated
	 * @ordered
	 */
	protected AssuranceLevel assuranceLevel;

	/**
	 * The cached value of the '{@link #getDependabilityRequirements() <em>Dependability Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependabilityRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<DependabilityRequirement> dependabilityRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlowType() {
		return flowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowType(String newFlowType) {
		String oldFlowType = flowType;
		flowType = newFlowType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PORT__FLOW_TYPE, oldFlowType, flowType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(PortDirection newDirection) {
		PortDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PORT__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Failure> getInterfaceFailures() {
		if (interfaceFailures == null) {
			interfaceFailures = new EObjectResolvingEList<Failure>(Failure.class, this, ArchitecturePackage.PORT__INTERFACE_FAILURES);
		}
		return interfaceFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getRefinedPorts() {
		if (refinedPorts == null) {
			refinedPorts = new EObjectResolvingEList<Port>(Port.class, this, ArchitecturePackage.PORT__REFINED_PORTS);
		}
		return refinedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceLevel getAssuranceLevel() {
		if (assuranceLevel != null && assuranceLevel.eIsProxy()) {
			InternalEObject oldAssuranceLevel = (InternalEObject)assuranceLevel;
			assuranceLevel = (AssuranceLevel)eResolveProxy(oldAssuranceLevel);
			if (assuranceLevel != oldAssuranceLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.PORT__ASSURANCE_LEVEL, oldAssuranceLevel, assuranceLevel));
			}
		}
		return assuranceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceLevel basicGetAssuranceLevel() {
		return assuranceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssuranceLevel(AssuranceLevel newAssuranceLevel) {
		AssuranceLevel oldAssuranceLevel = assuranceLevel;
		assuranceLevel = newAssuranceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PORT__ASSURANCE_LEVEL, oldAssuranceLevel, assuranceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependabilityRequirement> getDependabilityRequirements() {
		if (dependabilityRequirements == null) {
			dependabilityRequirements = new EObjectResolvingEList<DependabilityRequirement>(DependabilityRequirement.class, this, ArchitecturePackage.PORT__DEPENDABILITY_REQUIREMENTS);
		}
		return dependabilityRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.PORT__FLOW_TYPE:
				return getFlowType();
			case ArchitecturePackage.PORT__DIRECTION:
				return getDirection();
			case ArchitecturePackage.PORT__INTERFACE_FAILURES:
				return getInterfaceFailures();
			case ArchitecturePackage.PORT__REFINED_PORTS:
				return getRefinedPorts();
			case ArchitecturePackage.PORT__ASSURANCE_LEVEL:
				if (resolve) return getAssuranceLevel();
				return basicGetAssuranceLevel();
			case ArchitecturePackage.PORT__DEPENDABILITY_REQUIREMENTS:
				return getDependabilityRequirements();
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
			case ArchitecturePackage.PORT__FLOW_TYPE:
				setFlowType((String)newValue);
				return;
			case ArchitecturePackage.PORT__DIRECTION:
				setDirection((PortDirection)newValue);
				return;
			case ArchitecturePackage.PORT__INTERFACE_FAILURES:
				getInterfaceFailures().clear();
				getInterfaceFailures().addAll((Collection<? extends Failure>)newValue);
				return;
			case ArchitecturePackage.PORT__REFINED_PORTS:
				getRefinedPorts().clear();
				getRefinedPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case ArchitecturePackage.PORT__ASSURANCE_LEVEL:
				setAssuranceLevel((AssuranceLevel)newValue);
				return;
			case ArchitecturePackage.PORT__DEPENDABILITY_REQUIREMENTS:
				getDependabilityRequirements().clear();
				getDependabilityRequirements().addAll((Collection<? extends DependabilityRequirement>)newValue);
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
			case ArchitecturePackage.PORT__FLOW_TYPE:
				setFlowType(FLOW_TYPE_EDEFAULT);
				return;
			case ArchitecturePackage.PORT__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case ArchitecturePackage.PORT__INTERFACE_FAILURES:
				getInterfaceFailures().clear();
				return;
			case ArchitecturePackage.PORT__REFINED_PORTS:
				getRefinedPorts().clear();
				return;
			case ArchitecturePackage.PORT__ASSURANCE_LEVEL:
				setAssuranceLevel((AssuranceLevel)null);
				return;
			case ArchitecturePackage.PORT__DEPENDABILITY_REQUIREMENTS:
				getDependabilityRequirements().clear();
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
			case ArchitecturePackage.PORT__FLOW_TYPE:
				return FLOW_TYPE_EDEFAULT == null ? flowType != null : !FLOW_TYPE_EDEFAULT.equals(flowType);
			case ArchitecturePackage.PORT__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case ArchitecturePackage.PORT__INTERFACE_FAILURES:
				return interfaceFailures != null && !interfaceFailures.isEmpty();
			case ArchitecturePackage.PORT__REFINED_PORTS:
				return refinedPorts != null && !refinedPorts.isEmpty();
			case ArchitecturePackage.PORT__ASSURANCE_LEVEL:
				return assuranceLevel != null;
			case ArchitecturePackage.PORT__DEPENDABILITY_REQUIREMENTS:
				return dependabilityRequirements != null && !dependabilityRequirements.isEmpty();
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
		result.append(" (flowType: ");
		result.append(flowType);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //PortImpl
