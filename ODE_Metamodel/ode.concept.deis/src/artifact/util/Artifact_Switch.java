/**
 */
package artifact.util;

import artifact.*;

import base.ArtifactElement;
import base.Element;
import base.ModelElement;
import base.SACMElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see artifact.Artifact_Package
 * @generated
 */
public class Artifact_Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Artifact_Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact_Switch() {
		if (modelPackage == null) {
			modelPackage = Artifact_Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Artifact_Package.ARTIFACT_GROUP: {
				ArtifactGroup artifactGroup = (ArtifactGroup)theEObject;
				T result = caseArtifactGroup(artifactGroup);
				if (result == null) result = caseArtifactElement(artifactGroup);
				if (result == null) result = caseModelElement(artifactGroup);
				if (result == null) result = caseSACMElement(artifactGroup);
				if (result == null) result = caseElement(artifactGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Artifact_Package.ARTIFACT_PACKAGE: {
				ArtifactPackage artifactPackage = (ArtifactPackage)theEObject;
				T result = caseArtifactPackage(artifactPackage);
				if (result == null) result = caseArtifactElement(artifactPackage);
				if (result == null) result = caseModelElement(artifactPackage);
				if (result == null) result = caseSACMElement(artifactPackage);
				if (result == null) result = caseElement(artifactPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Artifact_Package.ARTIFACT_PACKAGE_BINDING: {
				ArtifactPackageBinding artifactPackageBinding = (ArtifactPackageBinding)theEObject;
				T result = caseArtifactPackageBinding(artifactPackageBinding);
				if (result == null) result = caseArtifactPackage(artifactPackageBinding);
				if (result == null) result = caseArtifactElement(artifactPackageBinding);
				if (result == null) result = caseModelElement(artifactPackageBinding);
				if (result == null) result = caseSACMElement(artifactPackageBinding);
				if (result == null) result = caseElement(artifactPackageBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Artifact_Package.ARTIFACT_PACKAGE_INTERFACE: {
				ArtifactPackageInterface artifactPackageInterface = (ArtifactPackageInterface)theEObject;
				T result = caseArtifactPackageInterface(artifactPackageInterface);
				if (result == null) result = caseArtifactPackage(artifactPackageInterface);
				if (result == null) result = caseArtifactElement(artifactPackageInterface);
				if (result == null) result = caseModelElement(artifactPackageInterface);
				if (result == null) result = caseSACMElement(artifactPackageInterface);
				if (result == null) result = caseElement(artifactPackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Artifact_Package.ARTIFACT_ASSET: {
				ArtifactAsset artifactAsset = (ArtifactAsset)theEObject;
				T result = caseArtifactAsset(artifactAsset);
				if (result == null) result = caseArtifactElement(artifactAsset);
				if (result == null) result = caseModelElement(artifactAsset);
				if (result == null) result = caseSACMElement(artifactAsset);
				if (result == null) result = caseElement(artifactAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Artifact_Package.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseArtifactAsset(property);
				if (result == null) result = caseArtifactElement(property);
				if (result == null) result = caseModelElement(property);
				if (result == null) result = caseSACMElement(property);
				if (result == null) result = caseElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Artifact_Package.TECHNIQUE: {
				Technique technique = (Technique)theEObject;
				T result = caseTechnique(technique);
				if (result == null) result = caseArtifactAsset(technique);
				if (result == null) result = caseArtifactElement(technique);
				if (result == null) result = caseModelElement(technique);
				if (result == null) result = caseSACMElement(technique);
				if (result == null) result = caseElement(technique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Artifact_Package.PARTICIPANT: {
				Participant participant = (Participant)theEObject;
				T result = caseParticipant(participant);
				if (result == null) result = caseArtifactAsset(participant);
				if (result == null) result = caseArtifactElement(participant);
				if (result == null) result = caseModelElement(participant);
				if (result == null) result = caseSACMElement(participant);
				if (result == null) result = caseElement(participant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Artifact_Package.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseArtifactAsset(activity);
				if (result == null) result = caseArtifactElement(activity);
				if (result == null) result = caseModelElement(activity);
				if (result == null) result = caseSACMElement(activity);
				if (result == null) result = caseElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Artifact_Package.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseArtifactAsset(event);
				if (result == null) result = caseArtifactElement(event);
				if (result == null) result = caseModelElement(event);
				if (result == null) result = caseSACMElement(event);
				if (result == null) result = caseElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Artifact_Package.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseArtifactAsset(resource);
				if (result == null) result = caseArtifactElement(resource);
				if (result == null) result = caseModelElement(resource);
				if (result == null) result = caseSACMElement(resource);
				if (result == null) result = caseElement(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Artifact_Package.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				T result = caseArtifact(artifact);
				if (result == null) result = caseArtifactAsset(artifact);
				if (result == null) result = caseArtifactElement(artifact);
				if (result == null) result = caseModelElement(artifact);
				if (result == null) result = caseSACMElement(artifact);
				if (result == null) result = caseElement(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Artifact_Package.ARTIFACT_ASSET_RELATIONSHIP: {
				ArtifactAssetRelationship artifactAssetRelationship = (ArtifactAssetRelationship)theEObject;
				T result = caseArtifactAssetRelationship(artifactAssetRelationship);
				if (result == null) result = caseArtifactAsset(artifactAssetRelationship);
				if (result == null) result = caseArtifactElement(artifactAssetRelationship);
				if (result == null) result = caseModelElement(artifactAssetRelationship);
				if (result == null) result = caseSACMElement(artifactAssetRelationship);
				if (result == null) result = caseElement(artifactAssetRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactGroup(ArtifactGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactPackage(ArtifactPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactPackageBinding(ArtifactPackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactPackageInterface(ArtifactPackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactAsset(ArtifactAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnique(Technique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant(Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Asset Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Asset Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactAssetRelationship(ArtifactAssetRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SACM Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SACM Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSACMElement(SACMElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactElement(ArtifactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Artifact_Switch
