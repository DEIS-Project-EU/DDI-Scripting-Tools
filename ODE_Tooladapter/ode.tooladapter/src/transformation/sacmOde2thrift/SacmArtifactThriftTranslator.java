package transformation.sacmOde2thrift;

import artifact.Activity;
import artifact.Artifact;
import artifact.ArtifactAsset;
import artifact.ArtifactAssetRelationship;
import artifact.ArtifactGroup;
import artifact.ArtifactPackage;
import artifact.ArtifactPackageBinding;
import artifact.ArtifactPackageInterface;
import artifact.Event;
import artifact.Participant;
import artifact.Property;
import artifact.Resource;
import artifact.Technique;
import sacm.artifact.iface.IArtifactAsset;
import sacm.artifact.iface.IArtifactPackage;
import sacm.artifact.typed.TActivity;
import sacm.artifact.typed.TArtifact;
import sacm.artifact.typed.TArtifactAssetRelationship;
import sacm.artifact.typed.TArtifactGroup;
import sacm.artifact.typed.TArtifactPackage;
import sacm.artifact.typed.TArtifactPackageBinding;
import sacm.artifact.typed.TArtifactPackageInterface;
import sacm.artifact.typed.TEvent;
import sacm.artifact.typed.TParticipant;
import sacm.artifact.typed.TProperty;
import sacm.artifact.typed.TResource;
import sacm.artifact.typed.TTechnique;
import base.ArtifactElement;
import thriftContract.TDDIAbstractArtifactAsset;
import thriftContract.TDDIAbstractArtifactAssetRef;
import thriftContract.TDDIAbstractArtifactElementRef;
import thriftContract.TDDIAbstractArtifactPackage;
import thriftContract.TDDIActivity;
import thriftContract.TDDIArtifact;
import thriftContract.TDDIArtifactAssetRelationship;
import thriftContract.TDDIArtifactAssetUnion;
import thriftContract.TDDIArtifactAssetUnionType;
import thriftContract.TDDIArtifactGroup;
import thriftContract.TDDIArtifactPackage;
import thriftContract.TDDIArtifactPackageBinding;
import thriftContract.TDDIArtifactPackageInterface;
import thriftContract.TDDIArtifactPackageUnion;
import thriftContract.TDDIArtifactPackageUnionType;
import thriftContract.TDDIEvent;
import thriftContract.TDDIParticipant;
import thriftContract.TDDIProperty;
import thriftContract.TDDIPropertyRef;
import thriftContract.TDDIResource;
import thriftContract.TDDITechnique;

public class SacmArtifactThriftTranslator {

	public static TDDIAbstractArtifactPackage transformAbstractArtifactPackage(ArtifactPackage eArtifactPackage) {
		TDDIAbstractArtifactPackage tAbstractArtifactPackage = new TDDIAbstractArtifactPackage();
		
		if(eArtifactPackage instanceof ArtifactPackageBinding) {
			tAbstractArtifactPackage.UsedArtifactPackageType = TDDIArtifactPackageUnionType.APUTArtifactPackageBinding;
			tAbstractArtifactPackage.UsedArtifactPackage = new TDDIArtifactPackageUnion();
			tAbstractArtifactPackage.UsedArtifactPackage.setArtifactPackageBinding(transformArtifactPackageBinding((ArtifactPackageBinding) eArtifactPackage));
		} else if(eArtifactPackage instanceof ArtifactPackageInterface) {
			tAbstractArtifactPackage.UsedArtifactPackageType = TDDIArtifactPackageUnionType.APUTArtifactPackageInterface;
			tAbstractArtifactPackage.UsedArtifactPackage = new TDDIArtifactPackageUnion();
			tAbstractArtifactPackage.UsedArtifactPackage.setArtifactPackageInterface(transformArtifactPackageInterface((ArtifactPackageInterface) eArtifactPackage));
		} else if (eArtifactPackage instanceof ArtifactPackage) {
			tAbstractArtifactPackage.UsedArtifactPackageType = TDDIArtifactPackageUnionType.APUTArtifactPackage;
			tAbstractArtifactPackage.UsedArtifactPackage = new TDDIArtifactPackageUnion();
			tAbstractArtifactPackage.UsedArtifactPackage.setArtifactPackage(transformArtifactPackage((ArtifactPackage) eArtifactPackage));
		}
		return tAbstractArtifactPackage;
	}

	private static TDDIArtifactPackageBinding transformArtifactPackageBinding(ArtifactPackageBinding eArtifactPackageBinding) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eArtifactPackageBinding)) {
			return (TDDIArtifactPackageBinding) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eArtifactPackageBinding);
		}
		
		TDDIArtifactPackageBinding tArtifactPackageBinding = new TDDIArtifactPackageBinding();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eArtifactPackageBinding, tArtifactPackageBinding);
		transformArtifactPackageContents(TArtifactPackageBinding.wrap(tArtifactPackageBinding),eArtifactPackageBinding);
		
		if(eArtifactPackageBinding.getParticipantPackage() != null) {
			for(ArtifactPackage eParticipantPackage : eArtifactPackageBinding.getParticipantPackage()) {
				tArtifactPackageBinding.addToParticipantPackage(transformAbstractArtifactPackage(eParticipantPackage));
			}
		}
		
		return tArtifactPackageBinding;
	}

	private static TDDIArtifactPackageInterface transformArtifactPackageInterface(ArtifactPackageInterface eArtifactPackageInterface) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eArtifactPackageInterface)) {
			return (TDDIArtifactPackageInterface) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eArtifactPackageInterface);
		}
		
		TDDIArtifactPackageInterface tArtifactPackageInterface = new TDDIArtifactPackageInterface();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eArtifactPackageInterface, tArtifactPackageInterface);
		transformArtifactPackageContents(TArtifactPackageInterface.wrap(tArtifactPackageInterface), eArtifactPackageInterface);

		if(eArtifactPackageInterface.getImplements() != null) {
			tArtifactPackageInterface.setImplements(transformAbstractArtifactPackage(eArtifactPackageInterface.getImplements()));
		}
		
		return tArtifactPackageInterface;
	}

	private static TDDIArtifactPackage transformArtifactPackage(ArtifactPackage eArtifactPackage) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eArtifactPackage)) {
			return (TDDIArtifactPackage) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eArtifactPackage);
		}
		
		TDDIArtifactPackage tArtifactPackage = new TDDIArtifactPackage();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eArtifactPackage, tArtifactPackage);
		transformArtifactPackageContents(TArtifactPackage.wrap(tArtifactPackage), eArtifactPackage);
		
		return tArtifactPackage;
	}
	
	private static void transformArtifactPackageContents(IArtifactPackage tArtifactPackage, ArtifactPackage emfArtifactPackage) {
		SacmBaseThriftTranslator.transformArtifactElementContents(tArtifactPackage, emfArtifactPackage);
		
		if(emfArtifactPackage.getArtifactElement() != null) {
			for(ArtifactElement eArtifactElement : emfArtifactPackage.getArtifactElement()) {
				tArtifactPackage.addToArtifactElement(new TDDIAbstractArtifactElementRef(SacmBaseThriftTranslator.transformAbstractArtifactElement(eArtifactElement)));
			}
		}
	}
	
	public static TDDIArtifactGroup transformArtifactGroup(ArtifactGroup eArtifactGroup) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eArtifactGroup)) {
			return (TDDIArtifactGroup) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eArtifactGroup);
		}
		
		TDDIArtifactGroup tArtifactGroup = new TDDIArtifactGroup();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eArtifactGroup, tArtifactGroup);
		SacmBaseThriftTranslator.transformArtifactElementContents(TArtifactGroup.wrap(tArtifactGroup), eArtifactGroup);
		
		if(eArtifactGroup.getArtifactElement() != null) {
			for(ArtifactElement eArtifactElement : eArtifactGroup.getArtifactElement()) {
				tArtifactGroup.addToArtifactElement(new TDDIAbstractArtifactElementRef(SacmBaseThriftTranslator.transformAbstractArtifactElement(eArtifactElement)));
			}
		}
		
		return tArtifactGroup;
	}
	
	public static TDDIAbstractArtifactAsset transformAbstractArtifactAsset(ArtifactAsset eArtifactAsset) {
		TDDIAbstractArtifactAsset tAbstractArtifactAsset = new TDDIAbstractArtifactAsset();
		
		if(eArtifactAsset instanceof ArtifactAssetRelationship) {
			tAbstractArtifactAsset.UsedArtifactAssetType = TDDIArtifactAssetUnionType.AAUTArtifactAssetRelationship;
			tAbstractArtifactAsset.UsedArtifactAsset = new TDDIArtifactAssetUnion();
			tAbstractArtifactAsset.UsedArtifactAsset.setArtifactAssetRelationship(transformArtifactAssetRelationShip((ArtifactAssetRelationship) eArtifactAsset));
		} else if(eArtifactAsset instanceof Activity) {
			tAbstractArtifactAsset.UsedArtifactAssetType = TDDIArtifactAssetUnionType.AAUTActivity;
			tAbstractArtifactAsset.UsedArtifactAsset = new TDDIArtifactAssetUnion();
			tAbstractArtifactAsset.UsedArtifactAsset.setActivity(transformActivity((Activity) eArtifactAsset));
		} else if(eArtifactAsset instanceof Artifact) {
			tAbstractArtifactAsset.UsedArtifactAssetType = TDDIArtifactAssetUnionType.AAUTArtifact;
			tAbstractArtifactAsset.UsedArtifactAsset = new TDDIArtifactAssetUnion();
			tAbstractArtifactAsset.UsedArtifactAsset.setArtifact(transformArtifact((Artifact) eArtifactAsset));
		} else if(eArtifactAsset instanceof Event) {
			tAbstractArtifactAsset.UsedArtifactAssetType = TDDIArtifactAssetUnionType.AAUTEvent;
			tAbstractArtifactAsset.UsedArtifactAsset = new TDDIArtifactAssetUnion();
			tAbstractArtifactAsset.UsedArtifactAsset.setEvent(transformEvent((Event) eArtifactAsset));
		} else if(eArtifactAsset instanceof Property) {
			tAbstractArtifactAsset.UsedArtifactAssetType = TDDIArtifactAssetUnionType.AAUTProperty;
			tAbstractArtifactAsset.UsedArtifactAsset = new TDDIArtifactAssetUnion();
			tAbstractArtifactAsset.UsedArtifactAsset.setProperty(transformProperty((Property) eArtifactAsset));
		} else if(eArtifactAsset instanceof Participant) {
			tAbstractArtifactAsset.UsedArtifactAssetType = TDDIArtifactAssetUnionType.AAUTParticipant;
			tAbstractArtifactAsset.UsedArtifactAsset = new TDDIArtifactAssetUnion();
			tAbstractArtifactAsset.UsedArtifactAsset.setParticipant(transformParticipant((Participant) eArtifactAsset));
		} else if(eArtifactAsset instanceof Resource) {
			tAbstractArtifactAsset.UsedArtifactAssetType = TDDIArtifactAssetUnionType.AAUTResource;
			tAbstractArtifactAsset.UsedArtifactAsset = new TDDIArtifactAssetUnion();
			tAbstractArtifactAsset.UsedArtifactAsset.setResource(transformResource((Resource) eArtifactAsset));
		} else if(eArtifactAsset instanceof Technique) {
			tAbstractArtifactAsset.UsedArtifactAssetType = TDDIArtifactAssetUnionType.AAUTTechnique;
			tAbstractArtifactAsset.UsedArtifactAsset = new TDDIArtifactAssetUnion();
			tAbstractArtifactAsset.UsedArtifactAsset.setTechnique(transformTechnique((Technique) eArtifactAsset));
		}
		return tAbstractArtifactAsset;
	}
	
	
	private static TDDIArtifactAssetRelationship transformArtifactAssetRelationShip(ArtifactAssetRelationship eArtifactAssetRelationShip) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eArtifactAssetRelationShip)) {
			return (TDDIArtifactAssetRelationship) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eArtifactAssetRelationShip); 
		}
		
		TDDIArtifactAssetRelationship tArtifactAssetRelationship = new TDDIArtifactAssetRelationship();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eArtifactAssetRelationShip, tArtifactAssetRelationship);
		transformArtifactAssetContents(TArtifactAssetRelationship.wrap(tArtifactAssetRelationship), eArtifactAssetRelationShip);
		
		if(eArtifactAssetRelationShip.getSource() != null) {
			for(ArtifactAsset eSource : eArtifactAssetRelationShip.getSource()) {
				tArtifactAssetRelationship.addToSource(new TDDIAbstractArtifactAssetRef(transformAbstractArtifactAsset(eSource)));
			}
		}
		
		if(eArtifactAssetRelationShip.getTarget() != null) {
			for(ArtifactAsset eTarget : eArtifactAssetRelationShip.getTarget()) {
				tArtifactAssetRelationship.addToTarget(new TDDIAbstractArtifactAssetRef(transformAbstractArtifactAsset(eTarget)));
			}
		}
		
		return tArtifactAssetRelationship;
	}

	private static TDDIActivity transformActivity(Activity eActivity) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eActivity)) {
			return (TDDIActivity) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eActivity); 
		}
		
		TDDIActivity tActivity = new TDDIActivity();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eActivity, tActivity);
		transformArtifactAssetContents(TActivity.wrap(tActivity), eActivity);
		
		if(eActivity.getStartTime() != null) {
			tActivity.setStartTime(eActivity.getStartTime().toString());
		}
		
		if(eActivity.getEndTime() != null) {
			tActivity.setEndTime(eActivity.getEndTime().toString());
		}
		
		return tActivity;
	}

	private static TDDIArtifact transformArtifact(Artifact eArtifact) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eArtifact)) {
			return (TDDIArtifact) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eArtifact); 
		}
		
		TDDIArtifact tArtifact = new TDDIArtifact();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eArtifact, tArtifact);
		transformArtifactAssetContents(TArtifact.wrap(tArtifact), eArtifact);
		
		if(eArtifact.getVersion() != null) {
			tArtifact.setVersion(eArtifact.getVersion());
		}
		
		if(eArtifact.getDate() != null) {
			tArtifact.setDate(eArtifact.getDate().toString());
		}
		
		return tArtifact;
	}

	private static TDDIEvent transformEvent(Event eEvent) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eEvent)) {
			return (TDDIEvent) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eEvent); 
		}
		
		TDDIEvent tEvent = new TDDIEvent();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eEvent, tEvent);
		transformArtifactAssetContents(TEvent.wrap(tEvent), eEvent);
		
		if(eEvent.getOccurence() != null) {
			tEvent.setOccurence(eEvent.getOccurence().toString());
		}
		
		return tEvent;
	}

	private static TDDIProperty transformProperty(Property eProperty) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eProperty)) {
			return (TDDIProperty) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eProperty); 
		}
		
		TDDIProperty tProperty = new TDDIProperty();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eProperty, tProperty);
		transformArtifactAssetContents(TProperty.wrap(tProperty), eProperty);
		return tProperty;
	}

	private static TDDIParticipant transformParticipant(Participant eParticipant) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eParticipant)) {
			return (TDDIParticipant) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eParticipant); 
		}
		
		TDDIParticipant tParticipant = new TDDIParticipant();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eParticipant, tParticipant);
		transformArtifactAssetContents(TParticipant.wrap(tParticipant), eParticipant);
		return tParticipant;
	}

	private static TDDIResource transformResource(Resource eResource) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eResource)) {
			return (TDDIResource) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eResource); 
		}
		
		TDDIResource tResource = new TDDIResource();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eResource, tResource);
		transformArtifactAssetContents(TResource.wrap(tResource), eResource);
		return tResource;
	}

	private static TDDITechnique transformTechnique(Technique eTechnique) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eTechnique)) {
			return (TDDITechnique) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eTechnique); 
		}
		
		TDDITechnique tTechnique = new TDDITechnique();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eTechnique, tTechnique);
		transformArtifactAssetContents(TTechnique.wrap(tTechnique), eTechnique);
		return tTechnique;
	}

	private static void transformArtifactAssetContents(IArtifactAsset tArtifactAsset, ArtifactAsset emfArtifactAsset) {
		SacmBaseThriftTranslator.transformArtifactElementContents(tArtifactAsset, emfArtifactAsset);
		
		if(emfArtifactAsset.getArtifactProperty() != null) {
			for(Property eProperty : emfArtifactAsset.getArtifactProperty()) {
				tArtifactAsset.addToProperty(new TDDIPropertyRef(transformProperty(eProperty)));
			}
		}
	}
}
