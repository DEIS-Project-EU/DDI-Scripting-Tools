/**
 */
package artifact.impl;

import artifact.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Artifact_FactoryImpl extends EFactoryImpl implements Artifact_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Artifact_Factory init() {
		try {
			Artifact_Factory theArtifact_Factory = (Artifact_Factory)EPackage.Registry.INSTANCE.getEFactory(Artifact_Package.eNS_URI);
			if (theArtifact_Factory != null) {
				return theArtifact_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Artifact_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact_FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Artifact_Package.ARTIFACT_GROUP: return createArtifactGroup();
			case Artifact_Package.ARTIFACT_PACKAGE: return createArtifactPackage();
			case Artifact_Package.ARTIFACT_PACKAGE_BINDING: return createArtifactPackageBinding();
			case Artifact_Package.ARTIFACT_PACKAGE_INTERFACE: return createArtifactPackageInterface();
			case Artifact_Package.PROPERTY: return createProperty();
			case Artifact_Package.TECHNIQUE: return createTechnique();
			case Artifact_Package.PARTICIPANT: return createParticipant();
			case Artifact_Package.ACTIVITY: return createActivity();
			case Artifact_Package.EVENT: return createEvent();
			case Artifact_Package.RESOURCE: return createResource();
			case Artifact_Package.ARTIFACT: return createArtifact();
			case Artifact_Package.ARTIFACT_ASSET_RELATIONSHIP: return createArtifactAssetRelationship();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactGroup createArtifactGroup() {
		ArtifactGroupImpl artifactGroup = new ArtifactGroupImpl();
		return artifactGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactPackage createArtifactPackage() {
		ArtifactPackageImpl artifactPackage = new ArtifactPackageImpl();
		return artifactPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactPackageBinding createArtifactPackageBinding() {
		ArtifactPackageBindingImpl artifactPackageBinding = new ArtifactPackageBindingImpl();
		return artifactPackageBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactPackageInterface createArtifactPackageInterface() {
		ArtifactPackageInterfaceImpl artifactPackageInterface = new ArtifactPackageInterfaceImpl();
		return artifactPackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technique createTechnique() {
		TechniqueImpl technique = new TechniqueImpl();
		return technique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactAssetRelationship createArtifactAssetRelationship() {
		ArtifactAssetRelationshipImpl artifactAssetRelationship = new ArtifactAssetRelationshipImpl();
		return artifactAssetRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact_Package getArtifact_Package() {
		return (Artifact_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Artifact_Package getPackage() {
		return Artifact_Package.eINSTANCE;
	}

} //Artifact_FactoryImpl
