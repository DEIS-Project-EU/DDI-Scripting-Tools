package transformation.sacmThrift2ode;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import sacm.artifact.iface.IArtifactAsset;
import sacm.artifact.iface.IArtifactPackage;
import sacm.artifact.typed.TActivity;
import sacm.artifact.typed.TArtifact;
import sacm.artifact.typed.TArtifactAssetRelationship;
import sacm.artifact.typed.TArtifactGroup;
import sacm.artifact.typed.TArtifactPackage;
import sacm.artifact.typed.TEvent;
import sacm.artifact.typed.TParticipant;
import sacm.artifact.typed.TProperty;
import sacm.artifact.typed.TResource;
import sacm.artifact.typed.TTechnique;
import thriftContract.TDDIAbstractArtifactAsset;
import thriftContract.TDDIAbstractArtifactElement;
import thriftContract.TDDIAbstractArtifactPackage;
import thriftContract.TDDIActivity;
import thriftContract.TDDIArtifact;
import thriftContract.TDDIArtifactAssetRelationship;
import thriftContract.TDDIArtifactGroup;
import thriftContract.TDDIArtifactPackage;
import thriftContract.TDDIArtifactPackageBinding;
import thriftContract.TDDIArtifactPackageInterface;
import thriftContract.TDDIEvent;
import thriftContract.TDDIParticipant;
import thriftContract.TDDIProperty;
import thriftContract.TDDIResource;
import thriftContract.TDDITechnique;
import top.artifact.Activity;
import top.artifact.Artifact;
import top.artifact.ArtifactAsset;
import top.artifact.ArtifactAssetRelationship;
import top.artifact.ArtifactGroup;
import top.artifact.ArtifactPackage;
import top.artifact.Event;
import top.artifact.Participant;
import top.artifact.Property;
import top.artifact.Resource;
import top.artifact.Technique;
import util.EMFFactory;

public class SacmArtifactEMFTranslater {

	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(SacmArtifactEMFTranslater.class);
	
	public static ArtifactPackage transformAbstractArtifactPackage(TDDIAbstractArtifactPackage tAbstractArtifactPackage) {
		if (tAbstractArtifactPackage.isSetUsedArtifactPackageType()) {
			switch (tAbstractArtifactPackage.UsedArtifactPackageType) {
			case APUTArtifactPackage:
				return transformArtifactPackage(tAbstractArtifactPackage.UsedArtifactPackage.getArtifactPackage());
			case APUTArtifactPackageBinding:
				return transformArtifactPackageBinding(tAbstractArtifactPackage.UsedArtifactPackage.getArtifactPackageBinding());
			case APUTArtifactPackageInterface:
				return transformArtifactPackageInterface(tAbstractArtifactPackage.UsedArtifactPackage.getArtifactPackageInterface());
			default:
				break;
			
			}
		}
		return EMFFactory.sacmArtifactFactory.createArtifactPackage();
	}
	

	private static ArtifactPackage transformArtifactPackage(TDDIArtifactPackage tArtifactPackage) {
		if(SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tArtifactPackage)){
			return (ArtifactPackage)SacmBaseEMFTranslater.thrift2EmfMap.get(tArtifactPackage); 
		}
		
		ArtifactPackage eArtifactPackage = EMFFactory.sacmArtifactFactory.createArtifactPackage();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tArtifactPackage, eArtifactPackage);
		transformArtifactPackageContents(TArtifactPackage.wrap(tArtifactPackage), eArtifactPackage);
		
		
		return eArtifactPackage;
	}


	private static ArtifactPackage transformArtifactPackageBinding(TDDIArtifactPackageBinding tArtifactPackageBinding) {
		// TODO Auto-generated method stub
		return null;
	}


	private static ArtifactPackage transformArtifactPackageInterface(TDDIArtifactPackageInterface tArtifactPackageInterface) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static void transformArtifactPackageContents(IArtifactPackage tArtifactPackage, ArtifactPackage eArtifactPackage){
		SacmBaseEMFTranslater.transformArtifactElementContents(tArtifactPackage, eArtifactPackage);
		
		for(TDDIAbstractArtifactElement abstractArtifactElement : tArtifactPackage.getArtifactElement().stream().map(ref -> ref.ref).collect(Collectors.toList())){
			eArtifactPackage.getArtifactElement().add(SacmBaseEMFTranslater.transformAbstractArtifactElement(abstractArtifactElement));
		}
	}
	
	public static ArtifactGroup transformArtifactGroup(TDDIArtifactGroup tArtifactGroup){
		if(SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tArtifactGroup)){
			return (ArtifactGroup)SacmBaseEMFTranslater.thrift2EmfMap.get(tArtifactGroup); 
		}
		
		ArtifactGroup eArtifactGroup = EMFFactory.sacmArtifactFactory.createArtifactGroup();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tArtifactGroup, eArtifactGroup);
		SacmBaseEMFTranslater.transformArtifactElementContents(TArtifactGroup.wrap(tArtifactGroup), eArtifactGroup);
		
		for(TDDIAbstractArtifactElement tArtifactElement : tArtifactGroup.getArtifactElement().stream().map(ref -> ref.ref).collect(Collectors.toList())){
			eArtifactGroup.getArtifactElement().add(SacmBaseEMFTranslater.transformAbstractArtifactElement(tArtifactElement));
		}
		
		return eArtifactGroup;
	}
	
	public static ArtifactAsset transformAbstractArtifactAsset(TDDIAbstractArtifactAsset tAbstractArtifactAsset){
		if(tAbstractArtifactAsset.isSetUsedArtifactAssetType()){
			switch(tAbstractArtifactAsset.UsedArtifactAssetType){
			case AAUTActivity: return transformActivity(tAbstractArtifactAsset.getUsedArtifactAsset().getActivity());
			case AAUTArtifact: return transformArtifact(tAbstractArtifactAsset.getUsedArtifactAsset().getArtifact());
			case AAUTArtifactAssetRelationship: return transformArtifactAssetRelationship(tAbstractArtifactAsset.getUsedArtifactAsset().getArtifactAssetRelationship());
			case AAUTEvent: return transformEvent(tAbstractArtifactAsset.getUsedArtifactAsset().getEvent());
			case AAUTParticipant: return transformParticipant(tAbstractArtifactAsset.getUsedArtifactAsset().getParticipant());
			case AAUTProperty: return transformArtifactProperty(tAbstractArtifactAsset.getUsedArtifactAsset().getProperty());
			case AAUTResource: return transformResource(tAbstractArtifactAsset.getUsedArtifactAsset().getResource());
			case AAUTTechnique: return transformTechnique(tAbstractArtifactAsset.getUsedArtifactAsset().getTechnique());
			default:
				break;
				
			}
		}
		return null;
	}
	
	private static void transformArtifactAssetContents(IArtifactAsset tArtifactAsset, ArtifactAsset eArtifactAsset){
		SacmBaseEMFTranslater.transformArtifactElementContents(tArtifactAsset, eArtifactAsset);
		for(TDDIProperty tProperty : tArtifactAsset.getProperty().stream().map(ref -> ref.ref).collect(Collectors.toList())){
			eArtifactAsset.getArtifactProperty().add(transformArtifactProperty(tProperty));
		}
	}
	
	private static Property transformArtifactProperty(TDDIProperty tProperty) {
		if(SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tProperty)){
			return (Property)SacmBaseEMFTranslater.thrift2EmfMap.get(tProperty); 
		}
		
		Property eProperty = EMFFactory.sacmArtifactFactory.createProperty();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tProperty, eProperty);
		transformArtifactAssetContents(TProperty.wrap(tProperty), eProperty);
		
		return eProperty;
	}


	private static Activity transformActivity(TDDIActivity tActivity){
		if(SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tActivity)){
			return (Activity)SacmBaseEMFTranslater.thrift2EmfMap.get(tActivity); 
		}
		
		Activity eActivity = EMFFactory.sacmArtifactFactory.createActivity();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tActivity, eActivity);
		transformArtifactAssetContents(TActivity.wrap(tActivity), eActivity);
		
		if(tActivity.isSetStartTime()){
			Date transformedStartTime = transformStringToDate(tActivity.getStartTime());
			if(transformedStartTime != null){
				eActivity.setStartTime(transformedStartTime);
			}	
		}
		
		if(tActivity.isSetEndTime()){
			Date transformedEndTime = transformStringToDate(tActivity.getEndTime());
			if(transformedEndTime != null){
				eActivity.setStartTime(transformedEndTime);
			}	
		}
		
		return eActivity;
	}
	
	private static Artifact transformArtifact(TDDIArtifact tArtifact){
		if(SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tArtifact)){
			return (Artifact)SacmBaseEMFTranslater.thrift2EmfMap.get(tArtifact); 
		}
		
		Artifact eArtifact = EMFFactory.sacmArtifactFactory.createArtifact();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tArtifact, eArtifact);
		transformArtifactAssetContents(TArtifact.wrap(tArtifact), eArtifact);
		
		if(tArtifact.isSetVersion()) {
			eArtifact.setVersion(tArtifact.getVersion());
		}
		if(tArtifact.isSetDate()){
			Date transformedDate = transformStringToDate(tArtifact.getDate());
			if(transformedDate != null){
				eArtifact.setDate(transformedDate);	
			}	
		}
		return eArtifact;
	}
	
	private static ArtifactAssetRelationship transformArtifactAssetRelationship(TDDIArtifactAssetRelationship tArtifactAssetRelationship){
		if(SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tArtifactAssetRelationship)){
			return (ArtifactAssetRelationship)SacmBaseEMFTranslater.thrift2EmfMap.get(tArtifactAssetRelationship); 
		}
		
		ArtifactAssetRelationship eArtifactAssetRelationship = EMFFactory.sacmArtifactFactory.createArtifactAssetRelationship();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tArtifactAssetRelationship, eArtifactAssetRelationship);
		transformArtifactAssetContents(TArtifactAssetRelationship.wrap(tArtifactAssetRelationship), eArtifactAssetRelationship);
		
		for(TDDIAbstractArtifactAsset tSource : tArtifactAssetRelationship.getSource().stream().map(ref -> ref.ref).collect(Collectors.toList())){
			eArtifactAssetRelationship.getSource().add(transformAbstractArtifactAsset(tSource));
		}
		
		for(TDDIAbstractArtifactAsset tTarget : tArtifactAssetRelationship.getTarget().stream().map(ref -> ref.ref).collect(Collectors.toList())){
			eArtifactAssetRelationship.getTarget().add(transformAbstractArtifactAsset(tTarget));
		}
		
		return eArtifactAssetRelationship;
	}
	
	private static Event transformEvent(TDDIEvent tEvent){
		if(SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tEvent)){
			return (Event)SacmBaseEMFTranslater.thrift2EmfMap.get(tEvent); 
		}
		
		Event eEvent = EMFFactory.sacmArtifactFactory.createEvent();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tEvent, eEvent);
		transformArtifactAssetContents(TEvent.wrap(tEvent), eEvent);
		
		if(tEvent.isSetOccurence()){
			Date transformedDate = transformStringToDate(tEvent.getOccurence());
			if(transformedDate != null){
				eEvent.setOccurence(transformedDate);	
			}	
		}
		return eEvent;
	}
	
	private static Participant transformParticipant(TDDIParticipant tParticipant){
		if(SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tParticipant)){
			return (Participant)SacmBaseEMFTranslater.thrift2EmfMap.get(tParticipant); 
		}
		
		Participant eParticipant = EMFFactory.sacmArtifactFactory.createParticipant();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tParticipant, eParticipant);
		transformArtifactAssetContents(TParticipant.wrap(tParticipant), eParticipant);
		return eParticipant;
	}
	
	private static Resource transformResource(TDDIResource tResource){
		if(SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tResource)){
			return (Resource)SacmBaseEMFTranslater.thrift2EmfMap.get(tResource); 
		}
		
		Resource eResource = EMFFactory.sacmArtifactFactory.createResource();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tResource, eResource);
		transformArtifactAssetContents(TResource.wrap(tResource), eResource);
		return eResource;
	}
	
	private static Technique transformTechnique(TDDITechnique tTechnique){
		if(SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tTechnique)){
			return (Technique)SacmBaseEMFTranslater.thrift2EmfMap.get(tTechnique); 
		}
		
		Technique eTechnique = EMFFactory.sacmArtifactFactory.createTechnique();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tTechnique, eTechnique);
		transformArtifactAssetContents(TTechnique.wrap(tTechnique), eTechnique);
		return eTechnique;
	}
	
	private static Date transformStringToDate(String dateString){
		//DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		DateFormat format = new SimpleDateFormat("EEE MMM dd hh:mm:ss zzz yyyy");
		Date date = null;
		try {
			date = format.parse(dateString);
		} catch (ParseException e) {
			Log.warn("Date string could not be transformed into date type. Null is returned. Value: " + dateString, e);
			e.printStackTrace();
		}
		return date;
	}
	
}
