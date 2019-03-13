package transformation.sacmOde2thrift;

import argumentation.ArgumentAsset;
import argumentation.ArgumentGroup;
import argumentation.ArgumentPackage;
import argumentation.ArgumentPackageBinding;
import argumentation.ArgumentPackageInterface;
import argumentation.ArgumentReasoning;
import argumentation.ArgumentationElement;
import argumentation.ArtifactReference;
import argumentation.AssertedArtifactContext;
import argumentation.AssertedArtifactSupport;
import argumentation.AssertedContext;
import argumentation.AssertedEvidence;
import argumentation.AssertedInference;
import argumentation.AssertedRelationship;
import argumentation.Assertion;
import argumentation.Claim;
import sacm.argumentation.iface.IArgumentAsset;
import sacm.argumentation.iface.IArgumentPackage;
import sacm.argumentation.iface.IArgumentationElement;
import sacm.argumentation.iface.IAssertedRelationship;
import sacm.argumentation.iface.IAssertion;
import sacm.argumentation.typed.TArgumentGroup;
import sacm.argumentation.typed.TArgumentPackage;
import sacm.argumentation.typed.TArgumentPackageBinding;
import sacm.argumentation.typed.TArgumentPackageInterface;
import sacm.argumentation.typed.TArgumentReasoning;
import sacm.argumentation.typed.TArtifactReference;
import sacm.argumentation.typed.TAssertedArtifactContext;
import sacm.argumentation.typed.TAssertedArtifactSupport;
import sacm.argumentation.typed.TAssertedContext;
import sacm.argumentation.typed.TAssertedEvidence;
import sacm.argumentation.typed.TAssertedInference;
import sacm.argumentation.typed.TClaim;
import base.ArtifactElement;
import thriftContract.TDDIAbstractArgumentAsset;
import thriftContract.TDDIAbstractArgumentAssetRef;
import thriftContract.TDDIAbstractArgumentPackage;
import thriftContract.TDDIAbstractArgumentPackageRef;
import thriftContract.TDDIAbstractArgumentationElement;
import thriftContract.TDDIAbstractArgumentationElementRef;
import thriftContract.TDDIAbstractArtifactElementRef;
import thriftContract.TDDIAbstractAssertedRelationship;
import thriftContract.TDDIAbstractAssertion;
import thriftContract.TDDIArgumentAssetUnion;
import thriftContract.TDDIArgumentAssetUnionType;
import thriftContract.TDDIArgumentGroup;
import thriftContract.TDDIArgumentPackage;
import thriftContract.TDDIArgumentPackageBinding;
import thriftContract.TDDIArgumentPackageInterface;
import thriftContract.TDDIArgumentPackageUnion;
import thriftContract.TDDIArgumentPackageUnionType;
import thriftContract.TDDIArgumentReasoning;
import thriftContract.TDDIArgumentationElementUnion;
import thriftContract.TDDIArgumentationElementUnionType;
import thriftContract.TDDIArtifactReference;
import thriftContract.TDDIAssertedArtifactContext;
import thriftContract.TDDIAssertedArtifactSupport;
import thriftContract.TDDIAssertedContext;
import thriftContract.TDDIAssertedEvidence;
import thriftContract.TDDIAssertedInference;
import thriftContract.TDDIAssertedRelationshipUnion;
import thriftContract.TDDIAssertedRelationshipUnionType;
import thriftContract.TDDIAssertionDeclaration;
import thriftContract.TDDIAssertionUnion;
import thriftContract.TDDIAssertionUnionType;
import thriftContract.TDDIClaim;

public class SacmArgumentThriftTranslator {

	public static TDDIAbstractArgumentationElement transformAbstractArgumentationElement(ArgumentationElement eArgumentationElement) {
		TDDIAbstractArgumentationElement tArgumentationElement = new TDDIAbstractArgumentationElement();
		
		if(eArgumentationElement instanceof ArgumentAsset) {
			tArgumentationElement.UsedArgumentationElementType = TDDIArgumentationElementUnionType.AEUTAbstractArgumentAsset;
			tArgumentationElement.UsedArgumentationElement = new TDDIArgumentationElementUnion();
			tArgumentationElement.UsedArgumentationElement.setArgumentAsset(transformAbstractArgumentAsset((ArgumentAsset) eArgumentationElement));
		} else if(eArgumentationElement instanceof ArgumentGroup) {
			tArgumentationElement.UsedArgumentationElementType = TDDIArgumentationElementUnionType.AEUTArgumentGroup;
			tArgumentationElement.UsedArgumentationElement = new TDDIArgumentationElementUnion();
			tArgumentationElement.UsedArgumentationElement.setArgumentGroup(transformArgumentGroup((ArgumentGroup) eArgumentationElement));
		} else if(eArgumentationElement instanceof ArgumentPackage) {
			tArgumentationElement.UsedArgumentationElementType = TDDIArgumentationElementUnionType.AEUTAbstractArgumentPackage;
			tArgumentationElement.UsedArgumentationElement = new TDDIArgumentationElementUnion();
			tArgumentationElement.UsedArgumentationElement.setArgumentPackage(transformAbstractArgumentPackage((ArgumentPackage) eArgumentationElement));
		}
		return tArgumentationElement;
	}
	
	
	
	
	private static TDDIAbstractArgumentAsset transformAbstractArgumentAsset(ArgumentAsset eArgumentAsset) {
		TDDIAbstractArgumentAsset tArgumentAsset = new TDDIAbstractArgumentAsset();
		
		if(eArgumentAsset instanceof ArgumentReasoning) {
			tArgumentAsset.UsedArgumentAssetType = TDDIArgumentAssetUnionType.AAUTArgumentReasoning;
			tArgumentAsset.UsedArgumentAsset = new TDDIArgumentAssetUnion();
			tArgumentAsset.UsedArgumentAsset.setArgumentReasoning(transformArgumentReasoning((ArgumentReasoning) eArgumentAsset));
		} else if(eArgumentAsset instanceof ArtifactReference) {
			tArgumentAsset.UsedArgumentAssetType = TDDIArgumentAssetUnionType.AAUTArtifactReference;
			tArgumentAsset.UsedArgumentAsset = new TDDIArgumentAssetUnion();
			tArgumentAsset.UsedArgumentAsset.setArtifactReference(transformArtifactReference((ArtifactReference) eArgumentAsset));
		} else if(eArgumentAsset instanceof Assertion) {
			tArgumentAsset.UsedArgumentAssetType = TDDIArgumentAssetUnionType.AAUTAbstractAssertion;
			tArgumentAsset.UsedArgumentAsset = new TDDIArgumentAssetUnion();
			tArgumentAsset.UsedArgumentAsset.setAssertion(transformAbstractAssertion((Assertion) eArgumentAsset));
		}
		return tArgumentAsset;
	}

	
	



	private static TDDIArgumentReasoning transformArgumentReasoning(ArgumentReasoning eArgumentAsset) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eArgumentAsset)) {
			return (TDDIArgumentReasoning) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eArgumentAsset);
		}
		
		TDDIArgumentReasoning tArgumentReasoning = new TDDIArgumentReasoning();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eArgumentAsset, tArgumentReasoning);
		transformArgumentAssetContents(TArgumentReasoning.wrap(tArgumentReasoning), eArgumentAsset);
		
		if(eArgumentAsset.getStructure() != null) {
			tArgumentReasoning.setStructure(transformAbstractArgumentPackage(eArgumentAsset.getStructure()));
		}
		
		return tArgumentReasoning;
	}




	private static TDDIArtifactReference transformArtifactReference(ArtifactReference eArtifactReference) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eArtifactReference)) {
			return (TDDIArtifactReference) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eArtifactReference);
		}
		
		TDDIArtifactReference tArtifactReference = new TDDIArtifactReference();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eArtifactReference, tArtifactReference);
		transformArgumentAssetContents(TArtifactReference.wrap(tArtifactReference), eArtifactReference);
		
		if(eArtifactReference.getReferencedArtifactElement() != null) {
			for(ArtifactElement eReferencedArtifactElement : eArtifactReference.getReferencedArtifactElement()) {
				tArtifactReference.addToReferencedArtifactElement(new TDDIAbstractArtifactElementRef(SacmBaseThriftTranslator.transformAbstractArtifactElement(eReferencedArtifactElement)));
			}
		}
		
		return tArtifactReference;
	}




	private static TDDIAbstractAssertion transformAbstractAssertion(Assertion eArgumentAsset) {
		TDDIAbstractAssertion tAbstractAssertion = new TDDIAbstractAssertion();
		
		if(eArgumentAsset instanceof Claim) {
			tAbstractAssertion.UsedAssertionType = TDDIAssertionUnionType.AUTClaim;
			tAbstractAssertion.UsedAssertion = new TDDIAssertionUnion();
			tAbstractAssertion.UsedAssertion.setClaim(transformClaim((Claim) eArgumentAsset));
		} else if(eArgumentAsset instanceof AssertedRelationship) {
			tAbstractAssertion.UsedAssertionType = TDDIAssertionUnionType.AUTAbstractAssertedRelationship;
			tAbstractAssertion.UsedAssertion = new TDDIAssertionUnion();
			tAbstractAssertion.UsedAssertion.setAssertedRelationship(transformAbstractAssertedRelationship((AssertedRelationship) eArgumentAsset));
		}
		return tAbstractAssertion;
	}


	private static TDDIClaim transformClaim(Claim eClaim) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eClaim)) {
			return (TDDIClaim) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eClaim);
		}
		
		TDDIClaim tClaim = new TDDIClaim();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eClaim, tClaim);
		transformAssertionContents(TClaim.wrap(tClaim), eClaim);
		return tClaim;
	}




	private static TDDIAbstractAssertedRelationship transformAbstractAssertedRelationship(AssertedRelationship eAssertedRelationShip) {
		TDDIAbstractAssertedRelationship tAbstractAssertedRelationship = new TDDIAbstractAssertedRelationship();
		
		if(eAssertedRelationShip instanceof AssertedArtifactContext) {
			tAbstractAssertedRelationship.UsedAssertedRelationshipType = TDDIAssertedRelationshipUnionType.ARUTAssertedArtifactContext;
			tAbstractAssertedRelationship.UsedAssertedRelationship = new TDDIAssertedRelationshipUnion();
			tAbstractAssertedRelationship.UsedAssertedRelationship.setAssertedArtifactContext(transformAssertedArtifactContext((AssertedArtifactContext) eAssertedRelationShip));
		} else if(eAssertedRelationShip instanceof AssertedContext) {
			tAbstractAssertedRelationship.UsedAssertedRelationshipType = TDDIAssertedRelationshipUnionType.ARUTAssertedContext;
			tAbstractAssertedRelationship.UsedAssertedRelationship = new TDDIAssertedRelationshipUnion();
			tAbstractAssertedRelationship.UsedAssertedRelationship.setAssertedContext(transformAssertedContext((AssertedContext) eAssertedRelationShip));
		} else if(eAssertedRelationShip instanceof AssertedInference) {
			tAbstractAssertedRelationship.UsedAssertedRelationshipType = TDDIAssertedRelationshipUnionType.ARUTAssertedInference;
			tAbstractAssertedRelationship.UsedAssertedRelationship = new TDDIAssertedRelationshipUnion();
			tAbstractAssertedRelationship.UsedAssertedRelationship.setAssertedInference(transformAssertedInference((AssertedInference) eAssertedRelationShip));
		} else if(eAssertedRelationShip instanceof AssertedEvidence) {
			tAbstractAssertedRelationship.UsedAssertedRelationshipType = TDDIAssertedRelationshipUnionType.ARUTAssertedEvidence;
			tAbstractAssertedRelationship.UsedAssertedRelationship = new TDDIAssertedRelationshipUnion();
			tAbstractAssertedRelationship.UsedAssertedRelationship.setAssertedEvidence(transformAssertedEvidence((AssertedEvidence) eAssertedRelationShip));
		} else if(eAssertedRelationShip instanceof AssertedArtifactSupport) {
			tAbstractAssertedRelationship.UsedAssertedRelationshipType = TDDIAssertedRelationshipUnionType.ARUTAssertedArtifactSupport;
			tAbstractAssertedRelationship.UsedAssertedRelationship = new TDDIAssertedRelationshipUnion();
			tAbstractAssertedRelationship.UsedAssertedRelationship.setAssertedArtifactSupport(transformAssertedArtifactSupport((AssertedArtifactSupport) eAssertedRelationShip));
		}
		
		return tAbstractAssertedRelationship;
	}


	private static TDDIAssertedArtifactContext transformAssertedArtifactContext(AssertedArtifactContext eAssertedArtifactContext) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eAssertedArtifactContext)) {
			return (TDDIAssertedArtifactContext) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eAssertedArtifactContext);
		}
		
		TDDIAssertedArtifactContext tAssertedArtifactContext = new TDDIAssertedArtifactContext();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eAssertedArtifactContext, tAssertedArtifactContext);
		transformAssertedRelationshipContents(TAssertedArtifactContext.wrap(tAssertedArtifactContext), eAssertedArtifactContext);
		
		return tAssertedArtifactContext;
	}




	private static TDDIAssertedContext transformAssertedContext(AssertedContext eAssertedContext) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eAssertedContext)) {
			return (TDDIAssertedContext) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eAssertedContext);
		}
		
		TDDIAssertedContext tAssertedContext = new TDDIAssertedContext();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eAssertedContext, tAssertedContext);
		transformAssertedRelationshipContents(TAssertedContext.wrap(tAssertedContext), eAssertedContext);
		
		return tAssertedContext;
	}




	private static TDDIAssertedInference transformAssertedInference(AssertedInference eAssertedInference) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eAssertedInference)) {
			return (TDDIAssertedInference) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eAssertedInference);
		}
		
		TDDIAssertedInference tAssertedInference = new TDDIAssertedInference();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eAssertedInference, tAssertedInference);
		transformAssertedRelationshipContents(TAssertedInference.wrap(tAssertedInference), eAssertedInference);
		
		return tAssertedInference;
	}




	private static TDDIAssertedEvidence transformAssertedEvidence(AssertedEvidence eAssertedEvidence) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eAssertedEvidence)) {
			return (TDDIAssertedEvidence) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eAssertedEvidence);
		}
		
		TDDIAssertedEvidence tAssertedEvidence = new TDDIAssertedEvidence();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eAssertedEvidence, tAssertedEvidence);
		transformAssertedRelationshipContents(TAssertedEvidence.wrap(tAssertedEvidence), eAssertedEvidence);
		
		return tAssertedEvidence;
	}




	private static TDDIAssertedArtifactSupport transformAssertedArtifactSupport(AssertedArtifactSupport eAssertedSupport) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eAssertedSupport)) {
			return (TDDIAssertedArtifactSupport) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eAssertedSupport);
		}
		
		TDDIAssertedArtifactSupport tAssertedArtifactSupport = new TDDIAssertedArtifactSupport();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eAssertedSupport, tAssertedArtifactSupport);
		transformAssertedRelationshipContents(TAssertedArtifactSupport.wrap(tAssertedArtifactSupport), eAssertedSupport);
		
		return tAssertedArtifactSupport;
	}




	private static void transformAssertedRelationshipContents(IAssertedRelationship tAssertedRelationship, AssertedRelationship emfAssertedRelationship) {
		transformAssertionContents(tAssertedRelationship, emfAssertedRelationship);
		
		if(emfAssertedRelationship.getSource() != null) {
			for(ArgumentAsset eSource : emfAssertedRelationship.getSource()) {
				tAssertedRelationship.addToSources(new TDDIAbstractArgumentAssetRef(transformAbstractArgumentAsset(eSource)));
			}
		}
		
		if(emfAssertedRelationship.getTarget() != null) {
			for(ArgumentAsset eTarget : emfAssertedRelationship.getTarget()) {
				tAssertedRelationship.addToTargets(new TDDIAbstractArgumentAssetRef(transformAbstractArgumentAsset(eTarget)));
			}
		}
		
		if(emfAssertedRelationship.getReasoning() != null) {
			tAssertedRelationship.setArgumentReasoning(transformArgumentReasoning(emfAssertedRelationship.getReasoning()));
		}
		
		if(emfAssertedRelationship.isIsCounter()) {
			tAssertedRelationship.setIsCounter(emfAssertedRelationship.isIsCounter());
		}
	}

	private static void transformAssertionContents(IAssertion tAssertion, Assertion emfAssertion) {
		transformArgumentAssetContents(tAssertion, emfAssertion);
		
		if(emfAssertion.getMetaClaim() != null) {
			for(Claim eMetaClaim : emfAssertion.getMetaClaim()) {
				tAssertion.addToMetaClaims(transformClaim(eMetaClaim));
			}
		}
		
		if(emfAssertion.getAssertionDeclaration() != null) {
			switch(emfAssertion.getAssertionDeclaration()) {
			case ASSERTED: tAssertion.setAssertionDeclaration(TDDIAssertionDeclaration.ADAsserted);
				break;
			case ASSUMED: tAssertion.setAssertionDeclaration(TDDIAssertionDeclaration.ADAssumed);
				break;
			case AS_CITED: tAssertion.setAssertionDeclaration(TDDIAssertionDeclaration.ADAsCited);
				break;
			case AXIOMATIC: tAssertion.setAssertionDeclaration(TDDIAssertionDeclaration.ADAxiomatic);
				break;
			case DEFEATED: tAssertion.setAssertionDeclaration(TDDIAssertionDeclaration.ADDefeated);
				break;
			case NEEDS_SUPPORT: tAssertion.setAssertionDeclaration(TDDIAssertionDeclaration.ADNeedsSupport);
				break;
			}
		}
	}
	

	private static void transformArgumentAssetContents(IArgumentAsset tArgumentAsset, ArgumentAsset emfArgumentAsset) {
		transformArgumentationElementContents(tArgumentAsset, emfArgumentAsset);
	}
	

	private static TDDIArgumentGroup transformArgumentGroup(ArgumentGroup eArgumentGroup) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eArgumentGroup)) {
			return (TDDIArgumentGroup) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eArgumentGroup);
		}
		
		TDDIArgumentGroup tArgumentGroup = new TDDIArgumentGroup();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eArgumentGroup, tArgumentGroup);
		transformArgumentationElementContents(TArgumentGroup.wrap(tArgumentGroup), eArgumentGroup);
		
		if(eArgumentGroup.getArgumentationElement() != null) {
			for(ArgumentationElement eArgumentationElement : eArgumentGroup.getArgumentationElement()) {
				tArgumentGroup.addToArgumentationElement(new TDDIAbstractArgumentationElementRef(transformAbstractArgumentationElement(eArgumentationElement)));
			}
		}
		
		return tArgumentGroup;
	}

	public static TDDIAbstractArgumentPackage transformAbstractArgumentPackage(ArgumentPackage eArgumentPackage) {
		TDDIAbstractArgumentPackage tAbstractArgumentPackage = new TDDIAbstractArgumentPackage();
		
		if(eArgumentPackage instanceof ArgumentPackageInterface) {
			tAbstractArgumentPackage.UsedArgumentPackageType = TDDIArgumentPackageUnionType.APUTArgumentPackageInterface;
			tAbstractArgumentPackage.UsedArgumentPackage = new TDDIArgumentPackageUnion();
			tAbstractArgumentPackage.UsedArgumentPackage.setArgumentPackageInterface(transformArgumentPackageInterface((ArgumentPackageInterface) eArgumentPackage));
		} else if(eArgumentPackage instanceof ArgumentPackageBinding) {
			tAbstractArgumentPackage.UsedArgumentPackageType = TDDIArgumentPackageUnionType.APUTArgumentPackageBinding;
			tAbstractArgumentPackage.UsedArgumentPackage = new TDDIArgumentPackageUnion();
			tAbstractArgumentPackage.UsedArgumentPackage.setArgumentPackageBinding(transformArgumentPackageBinding((ArgumentPackageBinding) eArgumentPackage));
		} else if(eArgumentPackage instanceof ArgumentPackage) {
			tAbstractArgumentPackage.UsedArgumentPackageType = TDDIArgumentPackageUnionType.APUTArgumentPackage;
			tAbstractArgumentPackage.UsedArgumentPackage = new TDDIArgumentPackageUnion();
			tAbstractArgumentPackage.UsedArgumentPackage.setArgumentPackage(transformArgumentPackage((ArgumentPackage) eArgumentPackage));
		}
		return tAbstractArgumentPackage;
	}

	private static TDDIArgumentPackageInterface transformArgumentPackageInterface(ArgumentPackageInterface eArgumentPackageInterface) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eArgumentPackageInterface)) {
			return (TDDIArgumentPackageInterface) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eArgumentPackageInterface);
		}
		
		TDDIArgumentPackageInterface tArgumentPackageInterface = new TDDIArgumentPackageInterface();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eArgumentPackageInterface, tArgumentPackageInterface);
		transformArgumentPackageContents(TArgumentPackageInterface.wrap(tArgumentPackageInterface), eArgumentPackageInterface);
		
		if(eArgumentPackageInterface.getImplements() != null) {
			tArgumentPackageInterface.setImplements(transformAbstractArgumentPackage(eArgumentPackageInterface.getImplements()));
		}
		
		return tArgumentPackageInterface;
	}

	private static TDDIArgumentPackageBinding transformArgumentPackageBinding(ArgumentPackageBinding eArgumentPackageBinding) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eArgumentPackageBinding)) {
			return (TDDIArgumentPackageBinding) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eArgumentPackageBinding);
		}
		
		TDDIArgumentPackageBinding tArgumentPackageBinding = new TDDIArgumentPackageBinding();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eArgumentPackageBinding, tArgumentPackageBinding);
		transformArgumentPackageContents(TArgumentPackageBinding.wrap(tArgumentPackageBinding), eArgumentPackageBinding);
		
		if(eArgumentPackageBinding.getParticipantPackage() != null && eArgumentPackageBinding.getParticipantPackage().size() >= 2) {
			for(ArgumentPackage eParticipantPackage : eArgumentPackageBinding.getParticipantPackage()) {
				tArgumentPackageBinding.addToParticipantPackage(new TDDIAbstractArgumentPackageRef(transformAbstractArgumentPackage(eParticipantPackage)));
			}
		}
		
		return tArgumentPackageBinding;
	}

	private static TDDIArgumentPackage transformArgumentPackage(ArgumentPackage eArgumentPackage) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eArgumentPackage)) {
			return (TDDIArgumentPackage) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eArgumentPackage);
		}
		
		TDDIArgumentPackage tArgumentPackage = new TDDIArgumentPackage();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eArgumentPackage, tArgumentPackage);
		transformArgumentPackageContents(TArgumentPackage.wrap(tArgumentPackage), eArgumentPackage);
		return tArgumentPackage;
	}
	
	
	
	private static void transformArgumentPackageContents(IArgumentPackage tArgumentPackage, ArgumentPackage emfArgumentPackage) {
		transformArgumentationElementContents(tArgumentPackage, emfArgumentPackage);
		
		if(emfArgumentPackage.getArgumentationElement() != null) {
			for(ArgumentationElement eArgumentationElement : emfArgumentPackage.getArgumentationElement()) {
				tArgumentPackage.addToArgumentationElement(new TDDIAbstractArgumentationElementRef(transformAbstractArgumentationElement(eArgumentationElement)));
			}
		}
	}
	
	
	
	private static void transformArgumentationElementContents(IArgumentationElement tArgumentationElement, ArgumentationElement emfArgumentationElement) {
		SacmBaseThriftTranslator.transformArtifactElementContents(tArgumentationElement, emfArgumentationElement);
	}
}
