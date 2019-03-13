package transformation.sacmThrift2ode;

import argumentation.ArgumentAsset;
import argumentation.ArgumentGroup;
import argumentation.ArgumentPackage;
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
import argumentation.AssertionDeclaration;
import argumentation.Claim;
import sacm.argumentation.iface.IArgumentAsset;
import sacm.argumentation.iface.IArgumentPackage;
import sacm.argumentation.iface.IArgumentationElement;
import sacm.argumentation.iface.IAssertedRelationship;
import sacm.argumentation.iface.IAssertion;
import sacm.argumentation.typed.TArgumentGroup;
import sacm.argumentation.typed.TArgumentPackage;
import sacm.argumentation.typed.TArgumentReasoning;
import sacm.argumentation.typed.TArtifactReference;
import sacm.argumentation.typed.TAssertedArtifactContext;
import sacm.argumentation.typed.TAssertedArtifactSupport;
import sacm.argumentation.typed.TAssertedContext;
import sacm.argumentation.typed.TAssertedEvidence;
import sacm.argumentation.typed.TAssertedInference;
import sacm.argumentation.typed.TClaim;
import thriftContract.TDDIAbstractArgumentAsset;
import thriftContract.TDDIAbstractArgumentAssetRef;
import thriftContract.TDDIAbstractArgumentPackage;
import thriftContract.TDDIAbstractArgumentationElement;
import thriftContract.TDDIAbstractArgumentationElementRef;
import thriftContract.TDDIAbstractArtifactElementRef;
import thriftContract.TDDIAbstractAssertedRelationship;
import thriftContract.TDDIAbstractAssertion;
import thriftContract.TDDIArgumentGroup;
import thriftContract.TDDIArgumentPackage;
import thriftContract.TDDIArgumentReasoning;
import thriftContract.TDDIArtifactReference;
import thriftContract.TDDIAssertedArtifactContext;
import thriftContract.TDDIAssertedArtifactSupport;
import thriftContract.TDDIAssertedContext;
import thriftContract.TDDIAssertedEvidence;
import thriftContract.TDDIAssertedInference;
import thriftContract.TDDIClaim;
import thriftContract.TDDIClaimRef;
import util.EMFFactory;

public class SacmArgumentEMFTranslater {

	public static ArgumentPackage transformAbstractArgumentPackage(TDDIAbstractArgumentPackage tElement) {
		if (tElement.isSetUsedArgumentPackageType()) {
			switch (tElement.UsedArgumentPackageType) {
				case APUTArgumentPackage:
					return transformArgumentPackage(tElement.UsedArgumentPackage.getArgumentPackage());
				case APUTArgumentPackageBinding:
					//TODO
					break;
				case APUTArgumentPackageInterface:
					//TODO
					break;
			}
		}
		return EMFFactory.sacmArgumentationFactory.createArgumentPackage();
	}

	private static ArgumentPackage transformArgumentPackage(TDDIArgumentPackage tElement) {
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tElement)) {
			return (ArgumentPackage) SacmBaseEMFTranslater.thrift2EmfMap.get(tElement);
		}
		
		ArgumentPackage emfElement = EMFFactory.sacmArgumentationFactory.createArgumentPackage();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tElement, emfElement);
		transformArgumentationPackageContents(TArgumentPackage.wrap(tElement), emfElement);
				
		return emfElement;
	}

	private static void transformArgumentationPackageContents(IArgumentPackage tElement, ArgumentPackage emfElement) {
		transformArgumentationElementContents(tElement, emfElement);
		
		if (tElement.isSetArgumentationElements()) {
			for (TDDIAbstractArgumentationElementRef tSubelement : tElement.getArgumentationElement()) {
				emfElement.getArgumentationElement().add(transformAbstractArgumentationElement(tSubelement.getRef()));
			}
		}
	}

	public static ArgumentationElement transformAbstractArgumentationElement(TDDIAbstractArgumentationElement tElement) {
		if (tElement.isSetUsedArgumentationElementType()) {
			switch (tElement.UsedArgumentationElementType) {
				case AEUTAbstractArgumentAsset:
					TDDIAbstractArgumentAsset tArgumentAsset = tElement.getUsedArgumentationElement().getArgumentAsset();
					return transformAbstractArgumentAsset(tArgumentAsset);
				case AEUTAbstractArgumentPackage:
					return transformAbstractArgumentPackage(tElement.UsedArgumentationElement.getArgumentPackage());
				case AEUTArgumentGroup:
					return transformArgumentGroup(tElement.UsedArgumentationElement.getArgumentGroup());
			}
		}
		return null;
	}

	private static ArgumentAsset transformAbstractArgumentAsset(TDDIAbstractArgumentAsset tArgumentAsset) {
		if (tArgumentAsset.isSetUsedArgumentAssetType()) {
				switch (tArgumentAsset.UsedArgumentAssetType) {
				case AAUTAbstractAssertion:
					TDDIAbstractAssertion tAssertion = tArgumentAsset.UsedArgumentAsset.getAssertion();
					if (tAssertion.isSetUsedAssertionType()) {
						switch (tAssertion.UsedAssertionType) {
							case AUTAbstractAssertedRelationship:
								TDDIAbstractAssertedRelationship tAssertedRelationship = tAssertion.UsedAssertion.getAssertedRelationship();
								if (tAssertedRelationship.isSetUsedAssertedRelationshipType()) {
									switch (tAssertedRelationship.UsedAssertedRelationshipType) {
										case ARUTAssertedArtifactContext:
											return transformArtifactContext(tAssertedRelationship.UsedAssertedRelationship.getAssertedArtifactContext());
										case ARUTAssertedArtifactSupport:
											return transformAssertedArtifactSupport(tAssertedRelationship.UsedAssertedRelationship.getAssertedArtifactSupport());
										case ARUTAssertedContext:
											return transformAssertedContext(tAssertedRelationship.UsedAssertedRelationship.getAssertedContext());
										case ARUTAssertedEvidence:
											return transformAssertedEvidence(tAssertedRelationship.UsedAssertedRelationship.getAssertedEvidence());
										case ARUTAssertedInference:
											return transformAssertedInference(tAssertedRelationship.UsedAssertedRelationship.getAssertedInference());
									}
								}
								break;
							case AUTClaim:
								return transformClaim(tAssertion.UsedAssertion.getClaim());
						}
					}
					break;
				case AAUTArgumentReasoning:
					return transformArgumentReasoning(tArgumentAsset.UsedArgumentAsset.getArgumentReasoning());
				case AAUTArtifactReference:
					return transformArtifactReference(tArgumentAsset.UsedArgumentAsset.getArtifactReference());
				}
		}
		return null;
	}

	private static AssertedInference transformAssertedInference(TDDIAssertedInference tElement) {
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tElement)) {
			return (AssertedInference) SacmBaseEMFTranslater.thrift2EmfMap.get(tElement);
		}
		
		AssertedInference emfElement = EMFFactory.sacmArgumentationFactory.createAssertedInference();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tElement, emfElement);
		transformAssertedRelationshipContents(TAssertedInference.wrap(tElement), emfElement);
				
		return emfElement;
	}

	private static AssertedEvidence transformAssertedEvidence(TDDIAssertedEvidence tElement) {
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tElement)) {
			return (AssertedEvidence) SacmBaseEMFTranslater.thrift2EmfMap.get(tElement);
		}
		
		AssertedEvidence emfElement = EMFFactory.sacmArgumentationFactory.createAssertedEvidence();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tElement, emfElement);
		transformAssertedRelationshipContents(TAssertedEvidence.wrap(tElement), emfElement);
				
		return emfElement;
	}

	private static AssertedContext transformAssertedContext(TDDIAssertedContext tElement) {
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tElement)) {
			return (AssertedContext) SacmBaseEMFTranslater.thrift2EmfMap.get(tElement);
		}
		
		AssertedContext emfElement = EMFFactory.sacmArgumentationFactory.createAssertedContext();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tElement, emfElement);
		transformAssertedRelationshipContents(TAssertedContext.wrap(tElement), emfElement);
				
		return emfElement;
	}
	
	private static AssertedArtifactSupport transformAssertedArtifactSupport(TDDIAssertedArtifactSupport tElement) {
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tElement)) {
			return (AssertedArtifactSupport) SacmBaseEMFTranslater.thrift2EmfMap.get(tElement);
		}
		
		AssertedArtifactSupport emfElement = EMFFactory.sacmArgumentationFactory.createAssertedArtifactSupport();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tElement, emfElement);
		transformAssertedRelationshipContents(TAssertedArtifactSupport.wrap(tElement), emfElement);
				
		return emfElement;
	}
	
	private static AssertedArtifactContext transformArtifactContext(TDDIAssertedArtifactContext tElement) {
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tElement)) {
			return (AssertedArtifactContext) SacmBaseEMFTranslater.thrift2EmfMap.get(tElement);
		}
		
		AssertedArtifactContext emfElement = EMFFactory.sacmArgumentationFactory.createAssertedArtifactContext();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tElement, emfElement);
		transformAssertedRelationshipContents(TAssertedArtifactContext.wrap(tElement), emfElement);
				
		return emfElement;
	}
	
	private static ArtifactReference transformArtifactReference(TDDIArtifactReference tElement) {
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tElement)) {
			return (ArtifactReference) SacmBaseEMFTranslater.thrift2EmfMap.get(tElement);
		}
		
		ArtifactReference emfElement = EMFFactory.sacmArgumentationFactory.createArtifactReference();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tElement, emfElement);
		transformArgumentAssetContents(TArtifactReference.wrap(tElement), emfElement);
		
		if (tElement.isSetReferencedArtifactElement()) {
			for (TDDIAbstractArtifactElementRef artifact : tElement.getReferencedArtifactElement()) {
				emfElement.getReferencedArtifactElement().add(SacmBaseEMFTranslater.transformAbstractArtifactElement(artifact.ref));
			}
		}
				
		return emfElement;
	}

	private static Claim transformClaim(TDDIClaim tElement) {
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tElement)) {
			return (Claim) SacmBaseEMFTranslater.thrift2EmfMap.get(tElement);
		}
		
		Claim emfElement = EMFFactory.sacmArgumentationFactory.createClaim();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tElement, emfElement);
		transformAssertionContents(TClaim.wrap(tElement), emfElement);
				
		return emfElement;
	}

	private static ArgumentReasoning transformArgumentReasoning(TDDIArgumentReasoning tElement) {
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tElement)) {
			return (ArgumentReasoning) SacmBaseEMFTranslater.thrift2EmfMap.get(tElement);
		}
		
		ArgumentReasoning emfElement = EMFFactory.sacmArgumentationFactory.createArgumentReasoning();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tElement, emfElement);
		transformArgumentAssetContents(TArgumentReasoning.wrap(tElement), emfElement);
		
		if (tElement.isSetStructure()) {
			emfElement.setStructure(transformAbstractArgumentPackage(tElement.getStructure()));
		}
				
		return emfElement;
	}

	private static ArgumentGroup transformArgumentGroup(TDDIArgumentGroup tElement) {
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tElement)) {
			return (ArgumentGroup) SacmBaseEMFTranslater.thrift2EmfMap.get(tElement);
		}
		
		ArgumentGroup emfElement = EMFFactory.sacmArgumentationFactory.createArgumentGroup();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tElement, emfElement);
		transformArgumentationElementContents(TArgumentGroup.wrap(tElement), emfElement);
		
		if (tElement.isSetArgumentationElement()) {
			for (TDDIAbstractArgumentationElementRef elem : tElement.getArgumentationElement()) {
				emfElement.getArgumentationElement().add(transformAbstractArgumentationElement(elem.getRef()));
			}
		}
				
		return emfElement;
	}

	private static void transformArgumentationElementContents(IArgumentationElement tElement, ArgumentationElement emfElement) {
		SacmBaseEMFTranslater.transformArtifactElementContents(tElement, emfElement);		
	}
	
	private static void transformArgumentAssetContents(IArgumentAsset tElement, ArgumentAsset emfElement) {
		transformArgumentationElementContents(tElement, emfElement);
	}
	
	private static void transformAssertionContents(IAssertion tElement, Assertion emfElement) {
		transformArgumentAssetContents(tElement, emfElement);	
		
		if (tElement.isSetAssertionDeclaration()) {
			switch (tElement.getAssertionDeclaration()) {
				case ADAsCited: emfElement.setAssertionDeclaration(AssertionDeclaration.AS_CITED);
					break;
				case ADAsserted: emfElement.setAssertionDeclaration(AssertionDeclaration.ASSERTED);
					break;
				case ADAssumed: emfElement.setAssertionDeclaration(AssertionDeclaration.ASSUMED);
					break;
				case ADAxiomatic: emfElement.setAssertionDeclaration(AssertionDeclaration.AXIOMATIC);
					break;
				case ADDefeated: emfElement.setAssertionDeclaration(AssertionDeclaration.DEFEATED);
					break;
				case ADNeedsSupport: emfElement.setAssertionDeclaration(AssertionDeclaration.NEEDS_SUPPORT);
					break;		
			}			
		}
		if (tElement.isSetMetaClaims()) {
			for (TDDIClaimRef metaClaim : tElement.getMetaClaims()) {
				emfElement.getMetaClaim().add(transformClaim(metaClaim.ref));
			}
		}
	}
	
	private static void transformAssertedRelationshipContents(IAssertedRelationship tElement, AssertedRelationship emfElement) {
		transformAssertionContents(tElement, emfElement);
		
		if (tElement.isSetIsCounter()) {
			emfElement.setIsCounter(tElement.isIsCounter());
		}
		if (tElement.isSetSources()) {
			for (TDDIAbstractArgumentAssetRef source : tElement.getSources()) {
				emfElement.getSource().add(transformAbstractArgumentAsset(source.getRef()));
			}
		}
		
		if (tElement.isSetTargets()) {
			for (TDDIAbstractArgumentAssetRef target : tElement.getTargets()) {
				emfElement.getTarget().add(transformAbstractArgumentAsset(target.getRef()));
			}
		}
		
		if (tElement.isSetArgumentReasoning()) {
			emfElement.setReasoning(transformArgumentReasoning(tElement.getArgumentReasoning()));
		}
	}
}
