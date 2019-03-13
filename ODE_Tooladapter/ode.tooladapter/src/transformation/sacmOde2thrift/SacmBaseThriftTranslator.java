package transformation.sacmOde2thrift;


import java.util.HashMap;

import argumentation.ArgumentationElement;
import artifact.ArtifactAsset;
import artifact.ArtifactGroup;
import artifact.ArtifactPackage;
import assuranceCase.AssuranceCasePackage;
import base.ArtifactElement;
import base.Description;
import base.Element;
import base.ExpressionLangString;
import base.ImplementationConstraint;
import base.LangString;
import base.ModelElement;
import base.MultiLangString;
import base.Note;
import base.SACMElement;
import base.TaggedValue;
import base.UtilityElement;
import sacm.base.iface.IArtifactElement;
import sacm.base.iface.IElement;
import sacm.base.iface.ILangString;
import sacm.base.iface.IModelElement;
import sacm.base.iface.ISacmElement;
import sacm.base.iface.IUtilityElement;
import sacm.base.typed.TDescription;
import sacm.base.typed.TExpressionLangString;
import sacm.base.typed.TImplementationConstraint;
import sacm.base.typed.TLangString;
import sacm.base.typed.TMultiLangString;
import sacm.base.typed.TNote;
import sacm.base.typed.TTaggedValue;
import terminology.TerminologyElement;
import thriftContract.TDDIAbstractArtifactElement;
import thriftContract.TDDIAbstractLangString;
import thriftContract.TDDIAbstractModelElement;
import thriftContract.TDDIAbstractSACMElement;
import thriftContract.TDDIAbstractUtilityElement;
import thriftContract.TDDIArtifactElementUnion;
import thriftContract.TDDIArtifactElementUnionType;
import thriftContract.TDDIDescription;
import thriftContract.TDDIExpressionLangString;
import thriftContract.TDDIImplementationConstraint;
import thriftContract.TDDIImplementationConstraintRef;
import thriftContract.TDDILangString;
import thriftContract.TDDILangStringUnion;
import thriftContract.TDDILangStringUnionType;
import thriftContract.TDDIModelElementUnion;
import thriftContract.TDDIModelElementUnionType;
import thriftContract.TDDIMultiLangString;
import thriftContract.TDDINote;
import thriftContract.TDDINoteRef;
import thriftContract.TDDISACMElementUnion;
import thriftContract.TDDISACMElementUnionType;
import thriftContract.TDDITaggedValue;
import thriftContract.TDDITaggedValueRef;
import thriftContract.TDDIUtilityElementUnion;
import thriftContract.TDDIUtilityElementUnionType;
import transformation.ode2thrift.BaseThriftTranslater;

public class SacmBaseThriftTranslator {
	public static HashMap<Element, Object> sacmEmf2ThriftMap = new HashMap<Element, Object>();
	
	public static TDDIAbstractSACMElement transformAbstractSacmElement(SACMElement eSacmElement) {
		TDDIAbstractSACMElement tAbstractSacmElement = new TDDIAbstractSACMElement();
		if(eSacmElement instanceof UtilityElement) {
			tAbstractSacmElement.UsedSACMElementType = TDDISACMElementUnionType.EUTAbstractUtilityElement;
			tAbstractSacmElement.UsedSACMElement = new TDDISACMElementUnion();
			tAbstractSacmElement.UsedSACMElement.setUtilityElement(transformAbstractUtilityElement((UtilityElement) eSacmElement));
		} else if(eSacmElement instanceof ModelElement) {
			tAbstractSacmElement.UsedSACMElementType = TDDISACMElementUnionType.EUTAbstractModelElement;
			tAbstractSacmElement.UsedSACMElement = new TDDISACMElementUnion();
			tAbstractSacmElement.UsedSACMElement.setModelElement(transformAbstractModelElement((ModelElement) eSacmElement));
		}
		return tAbstractSacmElement;
	}
	
	private static TDDIAbstractUtilityElement transformAbstractUtilityElement(UtilityElement eUtilityElement) {
		TDDIAbstractUtilityElement tAbstractUtilityElement = new TDDIAbstractUtilityElement();
		if(eUtilityElement instanceof Description) {
			tAbstractUtilityElement.UsedUtilityElementType = TDDIUtilityElementUnionType.UEUTDescription;
			tAbstractUtilityElement.UsedUtilityElement = new TDDIUtilityElementUnion();
			tAbstractUtilityElement.UsedUtilityElement.setDescription(transformDescription((Description) eUtilityElement));
		} else if (eUtilityElement instanceof Note) {
			tAbstractUtilityElement.UsedUtilityElementType = TDDIUtilityElementUnionType.UEUTNote;
			tAbstractUtilityElement.UsedUtilityElement = new TDDIUtilityElementUnion();
			tAbstractUtilityElement.UsedUtilityElement.setNote(transformNote((Note) eUtilityElement));
		} else if (eUtilityElement instanceof TaggedValue) {
			tAbstractUtilityElement.UsedUtilityElementType = TDDIUtilityElementUnionType.UEUTTaggedValue;
			tAbstractUtilityElement.UsedUtilityElement = new TDDIUtilityElementUnion();
			tAbstractUtilityElement.UsedUtilityElement.setTaggedValue(transformTaggedValue((TaggedValue) eUtilityElement));
		}else if(eUtilityElement instanceof ImplementationConstraint) {
			tAbstractUtilityElement.UsedUtilityElementType = TDDIUtilityElementUnionType.UEUTImplementationConstraint;
			tAbstractUtilityElement.UsedUtilityElement = new TDDIUtilityElementUnion();
			tAbstractUtilityElement.UsedUtilityElement.setImplementationConstraint(transformImplementationConstraint((ImplementationConstraint) eUtilityElement));
		}
		return tAbstractUtilityElement;
	}
	
	private static TDDIDescription transformDescription(Description eDescription) {
		if(sacmEmf2ThriftMap.containsKey(eDescription)) {
			return (TDDIDescription) sacmEmf2ThriftMap.get(eDescription);
		}
		
		TDDIDescription tDescription = new TDDIDescription();
		sacmEmf2ThriftMap.put(eDescription, tDescription);
		transformUtilityElementContents(TDescription.wrap(tDescription), eDescription);
		
		return tDescription;
	}

	private static TDDINote transformNote(Note eNote) {
		if(sacmEmf2ThriftMap.containsKey(eNote)) {
			return (TDDINote) sacmEmf2ThriftMap.get(eNote);
		}
		
		TDDINote tNote = new TDDINote();
		sacmEmf2ThriftMap.put(eNote, tNote);
		transformUtilityElementContents(TNote.wrap(tNote), eNote);
		
		return tNote;
	}

	private static TDDITaggedValue transformTaggedValue(TaggedValue eTaggedValue) {
		if(sacmEmf2ThriftMap.containsKey(eTaggedValue)) {
			return (TDDITaggedValue) sacmEmf2ThriftMap.get(eTaggedValue);
		}
		
		TDDITaggedValue tTaggedValue = new TDDITaggedValue();
		sacmEmf2ThriftMap.put(eTaggedValue, tTaggedValue);
		transformUtilityElementContents(TTaggedValue.wrap(tTaggedValue), eTaggedValue);
		
		if(eTaggedValue.getKey() != null) {
			tTaggedValue.setKey(transformMultiLangString(eTaggedValue.getKey()));
		}
		
		return tTaggedValue;
	}

	private static TDDIImplementationConstraint transformImplementationConstraint(ImplementationConstraint eImplementationConstraint) {
		if(sacmEmf2ThriftMap.containsKey(eImplementationConstraint)) {
			return (TDDIImplementationConstraint) sacmEmf2ThriftMap.get(eImplementationConstraint);
		}
		
		TDDIImplementationConstraint tImplementationConstraint = new TDDIImplementationConstraint();
		sacmEmf2ThriftMap.put(eImplementationConstraint, tImplementationConstraint);
		transformUtilityElementContents(TImplementationConstraint.wrap(tImplementationConstraint), eImplementationConstraint);
		
		return tImplementationConstraint;
	}

	public static TDDIAbstractModelElement transformAbstractModelElement(ModelElement eModelElement) {
		TDDIAbstractModelElement tAbstractModelElement = new TDDIAbstractModelElement();
		
		if(eModelElement instanceof ArtifactElement) {
			tAbstractModelElement.UsedModelElementType = TDDIModelElementUnionType.MEUTAbstractArtifactElement;
			tAbstractModelElement.UsedModelElement = new TDDIModelElementUnion();
			tAbstractModelElement.UsedModelElement.setArtifactElement(transformAbstractArtifactElement((ArtifactElement)eModelElement));
		}
		return tAbstractModelElement;
	}
	
	public static TDDIAbstractArtifactElement transformAbstractArtifactElement(ArtifactElement eArtifactElement) {
		TDDIAbstractArtifactElement tAbstractArtifactElement = new TDDIAbstractArtifactElement();
		
		if(eArtifactElement instanceof TerminologyElement) {
			tAbstractArtifactElement.UsedArtifactElementType = TDDIArtifactElementUnionType.AEUTAbstractTerminologyElement;
			tAbstractArtifactElement.UsedArtifactElement = new TDDIArtifactElementUnion();
			tAbstractArtifactElement.UsedArtifactElement.setTerminologyElement(SacmTerminologyThriftTranslator.transformAbstractTerminologyElement((TerminologyElement) eArtifactElement));
		}else if (eArtifactElement instanceof AssuranceCasePackage) {
			tAbstractArtifactElement.UsedArtifactElementType = TDDIArtifactElementUnionType.AEUTAbstractAssuranceCasePackage;
			tAbstractArtifactElement.UsedArtifactElement = new TDDIArtifactElementUnion();
			tAbstractArtifactElement.UsedArtifactElement.setAssuranceCasePackage(SacmAssuranceCaseThriftTranslator.transformAbstractAssuranceCasePackage((AssuranceCasePackage) eArtifactElement));
		}else if(eArtifactElement instanceof ArtifactPackage) {
			tAbstractArtifactElement.UsedArtifactElementType = TDDIArtifactElementUnionType.AEUTAbstractArtifactPackage;
			tAbstractArtifactElement.UsedArtifactElement = new TDDIArtifactElementUnion();
			tAbstractArtifactElement.UsedArtifactElement.setArtifactPackage(SacmArtifactThriftTranslator.transformAbstractArtifactPackage((ArtifactPackage) eArtifactElement));
		}else if(eArtifactElement instanceof ArtifactGroup) {
			tAbstractArtifactElement.UsedArtifactElementType = TDDIArtifactElementUnionType.AEUTArtifactGroup;
			tAbstractArtifactElement.UsedArtifactElement = new TDDIArtifactElementUnion();
			tAbstractArtifactElement.UsedArtifactElement.setArtifactGroup(SacmArtifactThriftTranslator.transformArtifactGroup((ArtifactGroup) eArtifactElement));
		}else if(eArtifactElement instanceof ArtifactAsset) {
			tAbstractArtifactElement.UsedArtifactElementType = TDDIArtifactElementUnionType.AEUTAbstractArtifactAsset;
			tAbstractArtifactElement.UsedArtifactElement = new TDDIArtifactElementUnion();
			tAbstractArtifactElement.UsedArtifactElement.setArtifactAsset(SacmArtifactThriftTranslator.transformAbstractArtifactAsset((ArtifactAsset) eArtifactElement));
		}else if(eArtifactElement instanceof ArgumentationElement) {
			tAbstractArtifactElement.UsedArtifactElementType = TDDIArtifactElementUnionType.AEUTAbstractArgumentationElement;
			tAbstractArtifactElement.UsedArtifactElement = new TDDIArtifactElementUnion();
			tAbstractArtifactElement.UsedArtifactElement.setArgumentationElement(SacmArgumentThriftTranslator.transformAbstractArgumentationElement((ArgumentationElement) eArtifactElement));
		}
		return tAbstractArtifactElement;
	}
	
	
	public static void transformArtifactElementContents(IArtifactElement tArtifactElement, ArtifactElement emfArtifactElement) {
		transformModelElementContents(tArtifactElement, emfArtifactElement);
	}
	
	private static void transformModelElementContents(IModelElement tModelElement, ModelElement emfModelElement) {
		transformSacmElementContents(tModelElement, emfModelElement);
		
		if(emfModelElement.getTaggedValue() != null) {
			for(TaggedValue eTaggedValue : emfModelElement.getTaggedValue()) {
				tModelElement.getTaggedValue().add(new TDDITaggedValueRef(transformTaggedValue(eTaggedValue)));
			}
		}
		
		if(emfModelElement.getName() != null) {
			tModelElement.setName(transformAbstractLangString(emfModelElement.getName()));
		}
		
		if(emfModelElement.getImplementationConstraint() != null) {
			for(ImplementationConstraint eImplConstraint : emfModelElement.getImplementationConstraint()) {
				tModelElement.getImplementationConstraint().add(new TDDIImplementationConstraintRef(transformImplementationConstraint(eImplConstraint)));
			}
		}
		
		if(emfModelElement.getNote() != null) {
			for(Note eNote : emfModelElement.getNote()) {
				tModelElement.getNote().add(new TDDINoteRef(transformNote(eNote)));
			}
		}
		
		if(emfModelElement.getDescription() != null) {
			tModelElement.setDescription(transformDescription(emfModelElement.getDescription()));
		}
		
	}

	public static void transformUtilityElementContents(IUtilityElement tUtlityElement, UtilityElement emfUtilityElement) {
		transformSacmElementContents(tUtlityElement, emfUtilityElement);
		if(emfUtilityElement.getContent() != null) {
			tUtlityElement.setContent(transformMultiLangString(emfUtilityElement.getContent()));
		}
	}
	
	private static TDDIMultiLangString transformMultiLangString(MultiLangString eMultiLangString) {
		if(sacmEmf2ThriftMap.containsKey(eMultiLangString)) {
			return (TDDIMultiLangString) sacmEmf2ThriftMap.get(eMultiLangString);
		}
		
		TDDIMultiLangString tMultiLangString = new TDDIMultiLangString();
		sacmEmf2ThriftMap.put(eMultiLangString, tMultiLangString);
		transformElementsContents(TMultiLangString.wrap(tMultiLangString), eMultiLangString);
		if(eMultiLangString.getValue() != null) {
			for(LangString langString : eMultiLangString.getValue()) {
				tMultiLangString.getValues().add(transformAbstractLangString(langString));
			}	
		}
		return tMultiLangString;
	}

	private static TDDIAbstractLangString transformAbstractLangString(LangString eLangString) {
		TDDIAbstractLangString tAbstractLangString = new TDDIAbstractLangString();
		
		if(eLangString instanceof LangString) {
			tAbstractLangString.UsedLangStringType = TDDILangStringUnionType.LSUTLangString;
			tAbstractLangString.UsedLangString = new TDDILangStringUnion();
			tAbstractLangString.UsedLangString.setLangString(transformLangString((LangString) eLangString));
		}else if(eLangString instanceof ExpressionLangString) {
			tAbstractLangString.UsedLangStringType = TDDILangStringUnionType.LSUTExpressionLangString;
			tAbstractLangString.UsedLangString = new TDDILangStringUnion();
			tAbstractLangString.UsedLangString.setExpressionLangString(transformExpressionLangString((ExpressionLangString) eLangString));
		}
		return tAbstractLangString;
	}
	
	private static TDDILangString transformLangString(LangString eLangString) {
		/*if(sacmEmf2ThriftMap.containsKey(eLangString)) {
			return (TDDILangString) sacmEmf2ThriftMap.get(eLangString);
		}*/
		
		TDDILangString tLangString = new TDDILangString();
		sacmEmf2ThriftMap.put(eLangString, tLangString);
		transformLangStringContents(TLangString.wrap(tLangString), eLangString);
		return tLangString;
	}
	
	private static TDDIExpressionLangString transformExpressionLangString(ExpressionLangString eLangString) {
		/*if(sacmEmf2ThriftMap.containsKey(eLangString)) {
			return (TDDIExpressionLangString) sacmEmf2ThriftMap.get(eLangString);
		}*/
		
		TDDIExpressionLangString tExpressionLangString = new TDDIExpressionLangString();
		sacmEmf2ThriftMap.put(eLangString, tExpressionLangString);
		transformLangStringContents(TExpressionLangString.wrap(tExpressionLangString), eLangString);
		
		if(eLangString.getExpression() != null) {
			tExpressionLangString.setExpression(transformAbstractArtifactElement(eLangString.getExpression()));
		}
		
		return tExpressionLangString;
	}

	
	private static void transformLangStringContents(ILangString tLangString, LangString emfLangString) {
		transformElementsContents(tLangString, emfLangString);
		
		tLangString.setLang(emfLangString.getLang());
		tLangString.setContent(emfLangString.getContent());
	}

	public static void transformSacmElementContents(ISacmElement tSacmElement, SACMElement emfSacmElement) {
		transformElementsContents(tSacmElement, emfSacmElement);
		
		tSacmElement.setGid(Long.toString(BaseThriftTranslater.importId++));
		tSacmElement.setIsCitation(emfSacmElement.isIsCitation());
		tSacmElement.setIsAbstract(emfSacmElement.isIsAbstract());
		
		if(emfSacmElement.getCitedElement() != null) {
			tSacmElement.setCitedElement(transformAbstractSacmElement(emfSacmElement.getCitedElement()));
		}
		if(emfSacmElement.getAbstractForm() != null) {
			tSacmElement.setAbstractForm(transformAbstractSacmElement(emfSacmElement.getAbstractForm()));
		}
	}
	
	
	/**
	 * This method does only exist, if the abstract class Element will eventually have own attributes 
	 **/
	public static void transformElementsContents(IElement tElement, Element emfSacmElement) {
		
	}
	
}
