package transformation.sacmThrift2ode;

import java.util.HashMap;

import sacm.base.iface.IArtifactElement;
import sacm.base.iface.IModelElement;
import sacm.base.iface.ISacmElement;
import sacm.base.iface.IUtilityElement;
import sacm.base.typed.TDescription;
import sacm.base.typed.TImplementationConstraint;
import sacm.base.typed.TNote;
import sacm.base.typed.TTaggedValue;
import thriftContract.TDDIAbstractArtifactElement;
import thriftContract.TDDIAbstractLangString;
import thriftContract.TDDIAbstractModelElement;
import thriftContract.TDDIAbstractSACMElement;
import thriftContract.TDDIAbstractUtilityElement;
import thriftContract.TDDIDescription;
import thriftContract.TDDIExpressionLangString;
import thriftContract.TDDIImplementationConstraint;
import thriftContract.TDDIImplementationConstraintRef;
import thriftContract.TDDILangString;
import thriftContract.TDDIMultiLangString;
import thriftContract.TDDINote;
import thriftContract.TDDINoteRef;
import thriftContract.TDDITaggedValue;
import thriftContract.TDDITaggedValueRef;
import top.base.ArtifactElement;
import top.base.Description;
import top.base.Element;
import top.base.ExpressionLangString;
import top.base.ImplementationConstraint;
import top.base.LangString;
import top.base.ModelElement;
import top.base.MultiLangString;
import top.base.Note;
import top.base.SACMElement;
import top.base.TaggedValue;
import top.base.UtilityElement;
import util.EMFFactory;

public class SacmBaseEMFTranslater {
	public static HashMap<Object, Element> thrift2EmfMap = new HashMap<Object, Element>();

	private static LangString transformAbstractLangString(TDDIAbstractLangString tAbstractLangString) {
		if (tAbstractLangString.isSetUsedLangStringType()) {
			switch (tAbstractLangString.UsedLangStringType) {
				case LSUTExpressionLangString:
					return transformExpressionLangString(tAbstractLangString.UsedLangString.getExpressionLangString());
				case LSUTLangString:
					return transformLangString(tAbstractLangString.UsedLangString.getLangString());
			}
		}
		return EMFFactory.sacmBaseFactory.createLangString();
	}
	
	private static LangString transformLangString(TDDILangString tElement) {
		/*if (thrift2EmfMap.containsKey(tElement)) {
			return (LangString) thrift2EmfMap.get(tElement);
		}*/
		
		LangString emfElement = EMFFactory.sacmBaseFactory.createLangString();
		thrift2EmfMap.put(tElement, emfElement);
		//Element superclass does not have contents so far -> not superclass call
		
		if (tElement.isSetContent()) {
			emfElement.setContent(tElement.getContent());
		}
		if (tElement.isSetLang()) {
			emfElement.setLang(tElement.getLang());
		}
		
		return emfElement;
	}

	private static ExpressionLangString transformExpressionLangString(TDDIExpressionLangString tElement) {
		/*if (thrift2EmfMap.containsKey(tElement)) {
			return (ExpressionLangString) thrift2EmfMap.get(tElement);
		}*/
		
		ExpressionLangString emfElement = EMFFactory.sacmBaseFactory.createExpressionLangString();
		thrift2EmfMap.put(tElement, emfElement);
		//LangString superclass contents are duplicated here for avoiding another interface		
		if (tElement.isSetContent()) {
			emfElement.setContent(tElement.getContent());
		}
		if (tElement.isSetLang()) {
			emfElement.setLang(tElement.getLang());
		}
		
		//ExpressionLangString content
		if (tElement.isSetExpression()) {
			emfElement.setExpression(transformAbstractArtifactElement(tElement.getExpression()));
		}
		
		return emfElement;
	}

	private static MultiLangString transformMultiLangString(TDDIMultiLangString tElement) {
		/*if (thrift2EmfMap.containsKey(tElement)) {
			return (MultiLangString) thrift2EmfMap.get(tElement);
		}*/
		
		MultiLangString emfElement = EMFFactory.sacmBaseFactory.createMultiLangString();
		thrift2EmfMap.put(tElement, emfElement);
		//Element superclass does not have contents so far -> not superclass call
		
		if (tElement.isSetValues()) {
			for (TDDIAbstractLangString value : tElement.getValues()) {
				emfElement.getValue().add(transformAbstractLangString(value));
			}
		}
		
		return emfElement;
	}
		
	private static SACMElement transformAbstractSacmElement(TDDIAbstractSACMElement tAbstractCitedElement) {
		if (tAbstractCitedElement.isSetUsedSACMElementType()) {
			switch (tAbstractCitedElement.UsedSACMElementType) {
				case EUTAbstractModelElement: return transformAbstractModelElement(tAbstractCitedElement.UsedSACMElement.getModelElement());
				case EUTAbstractUtilityElement: return transformAbstractUtilityElement(tAbstractCitedElement.UsedSACMElement.getUtilityElement());
			}
		}
		return null;
	}
	
	private static void transformSacmElementContents(ISacmElement tElement, SACMElement emfElement) {
		//Element superclass does not have content -> no superclass call
		
		if (tElement.isSetGid())
			emfElement.setGid(tElement.getGid());
		if (tElement.isSetIsCitation())
			emfElement.setIsCitation(tElement.isIsCitation());
		if (tElement.isSetIsAbstract())
			emfElement.setIsAbstract(tElement.isIsAbstract());
		if (tElement.isSetCitedElement()) {			
			TDDIAbstractSACMElement tAbstractCitedElement = tElement.getCitedElement();
			emfElement.setCitedElement(transformAbstractSacmElement(tAbstractCitedElement));
		}	
		if (tElement.isSetAbstractForm()) {			
			TDDIAbstractSACMElement tAbstractForm = tElement.getAbstractForm();
			emfElement.setAbstractForm(transformAbstractSacmElement(tAbstractForm));
		}	
	}
	
	private static UtilityElement transformAbstractUtilityElement(TDDIAbstractUtilityElement tElement) {
		if (tElement.isSetUsedUtilityElementType()) {
			switch (tElement.UsedUtilityElementType) {
				case UEUTDescription: return transformDescription(tElement.UsedUtilityElement.getDescription());
				case UEUTImplementationConstraint: return transformImplementationConstraint(tElement.UsedUtilityElement.getImplementationConstraint());
				case UEUTNote: return transformNote(tElement.UsedUtilityElement.getNote());
				case UEUTTaggedValue: return transformTaggedValue(tElement.UsedUtilityElement.getTaggedValue());
			}
		}
		return null;
	}
	
	private static void transformUtilityElementContents(IUtilityElement tElement, UtilityElement emfElement) {
		transformSacmElementContents(tElement, emfElement);
		
		if (tElement.isSetContent()) {
			emfElement.setContent(transformMultiLangString(tElement.getContent()));
		}
	}
	
	private static Description transformDescription(TDDIDescription tElement) {
		//if (thrift2EmfMap.containsKey(tElement)) {
		//	return (Description) thrift2EmfMap.get(tElement);
		//}
		
		Description emfElement = EMFFactory.sacmBaseFactory.createDescription();
		thrift2EmfMap.put(tElement, emfElement);
		transformUtilityElementContents(TDescription.wrap(tElement), emfElement);
				
		return emfElement;
	}
	
	private static ImplementationConstraint transformImplementationConstraint(TDDIImplementationConstraint tElement) {
		if (thrift2EmfMap.containsKey(tElement)) {
			return (ImplementationConstraint) thrift2EmfMap.get(tElement);
		}
		
		ImplementationConstraint emfElement = EMFFactory.sacmBaseFactory.createImplementationConstraint();
		thrift2EmfMap.put(tElement, emfElement);
		transformUtilityElementContents(TImplementationConstraint.wrap(tElement), emfElement);
				
		return emfElement;
	}
	
	private static Note transformNote(TDDINote tElement) {
		if (thrift2EmfMap.containsKey(tElement)) {
			return (Note) thrift2EmfMap.get(tElement);
		}
		
		Note emfElement = EMFFactory.sacmBaseFactory.createNote();
		thrift2EmfMap.put(tElement, emfElement);
		transformUtilityElementContents(TNote.wrap(tElement), emfElement);
				
		return emfElement;
	}
	
	private static TaggedValue transformTaggedValue(TDDITaggedValue tElement) {
		if (thrift2EmfMap.containsKey(tElement)) {
			return (TaggedValue) thrift2EmfMap.get(tElement);
		}
		
		TaggedValue emfElement = EMFFactory.sacmBaseFactory.createTaggedValue();
		thrift2EmfMap.put(tElement, emfElement);
		transformUtilityElementContents(TTaggedValue.wrap(tElement), emfElement);
		
		if (tElement.isSetKey()) {
			emfElement.setKey(transformMultiLangString(tElement.getKey()));
		}
				
		return emfElement;
	}
	
	public static ModelElement transformAbstractModelElement(TDDIAbstractModelElement tElement) {
		if (tElement.isSetUsedModelElementType()) {
			switch (tElement.UsedModelElementType) {
				case MEUTAbstractArtifactElement: return transformAbstractArtifactElement(tElement.UsedModelElement.getArtifactElement());
			}
		}
		return null;
	}
	
	public static void transformModelElementContents(IModelElement tElement, ModelElement emfElement) {	
		transformSacmElementContents(tElement, emfElement);		

		if (tElement.isSetName()) {			
			TDDIAbstractLangString tAbstractLangString = tElement.getName();
			emfElement.setName(transformAbstractLangString(tAbstractLangString));
		}	
		if (tElement.isSetDescription()) {			
			TDDIDescription tDescription = tElement.getDescription();
			emfElement.setDescription(transformDescription(tDescription));
		}
		if (tElement.isSetImplementationConstraint()) {
			for (TDDIImplementationConstraintRef ic : tElement.getImplementationConstraint()) {
				emfElement.getImplementationConstraint().add(transformImplementationConstraint(ic.ref));
			}
		}
		if (tElement.isSetNote()) {
			for (TDDINoteRef note : tElement.getNote()) {
				emfElement.getNote().add(transformNote(note.ref));
			}
		}
		if (tElement.isSetTaggedValue()) {
			for (TDDITaggedValueRef tv : tElement.getTaggedValue()) {
				emfElement.getTaggedValue().add(transformTaggedValue(tv.ref));
			}
		}
	}
		
	public static ArtifactElement transformAbstractArtifactElement(TDDIAbstractArtifactElement tAbstractArtifactElement) {
		if (tAbstractArtifactElement.isSetUsedArtifactElementType()) {
			switch (tAbstractArtifactElement.UsedArtifactElementType) {
				case AEUTAbstractArgumentationElement: return SacmArgumentEMFTranslater.transformAbstractArgumentationElement(tAbstractArtifactElement.UsedArtifactElement.getArgumentationElement());
				case AEUTAbstractArtifactAsset: return SacmArtifactEMFTranslater.transformAbstractArtifactAsset(tAbstractArtifactElement.UsedArtifactElement.getArtifactAsset());
				case AEUTAbstractArtifactPackage: return SacmArtifactEMFTranslater.transformAbstractArtifactPackage(tAbstractArtifactElement.UsedArtifactElement.getArtifactPackage());
				case AEUTAbstractAssuranceCasePackage: return SacmAssuranceCaseEMFTranslater.transformAbstractAssuranceCasePackage(tAbstractArtifactElement.UsedArtifactElement.getAssuranceCasePackage());
				case AEUTAbstractTerminologyElement: //TODO
					break;
				case AEUTArtifactGroup: return SacmArtifactEMFTranslater.transformArtifactGroup(tAbstractArtifactElement.UsedArtifactElement.getArtifactGroup());
			}
		}
		return null;
	}
	
	public static void transformArtifactElementContents(IArtifactElement tElement, ArtifactElement emfElement) {
		transformModelElementContents(tElement, emfElement);		
	}
}