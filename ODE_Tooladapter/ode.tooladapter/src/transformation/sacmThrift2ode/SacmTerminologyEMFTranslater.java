package transformation.sacmThrift2ode;

import java.util.stream.Collectors;

import sacm.base.typed.TTaggedValue;
import sacm.terminology.iface.IExpressionElement;
import sacm.terminology.iface.ITerminologyAsset;
import sacm.terminology.iface.ITerminologyElement;
import sacm.terminology.iface.ITerminologyPackage;
import sacm.terminology.typed.TCategory;
import sacm.terminology.typed.TExpression;
import sacm.terminology.typed.TTerm;
import sacm.terminology.typed.TTerminologyGroup;
import sacm.terminology.typed.TTerminologyPackage;
import sacm.terminology.typed.TTerminologyPackageBinding;
import sacm.terminology.typed.TTerminologyPackageInterface;
import thriftContract.TDDIAbstractExpressionElement;
import thriftContract.TDDIAbstractTerminologyAsset;
import thriftContract.TDDIAbstractTerminologyElement;
import thriftContract.TDDIAbstractTerminologyPackage;
import thriftContract.TDDIAbstractTerminologyPackageRef;
import thriftContract.TDDICategory;
import thriftContract.TDDIExpression;
import thriftContract.TDDITerm;
import thriftContract.TDDITerminologyGroup;
import thriftContract.TDDITerminologyPackage;
import thriftContract.TDDITerminologyPackageBinding;
import thriftContract.TDDITerminologyPackageInterface;
import top.base.TaggedValue;
import top.terminology.Category;
import top.terminology.Expression;
import top.terminology.ExpressionElement;
import top.terminology.Term;
import top.terminology.TerminologyAsset;
import top.terminology.TerminologyElement;
import top.terminology.TerminologyGroup;
import top.terminology.TerminologyPackage;
import top.terminology.TerminologyPackageBinding;
import top.terminology.TerminologyPackageInterface;
import util.EMFFactory;

public class SacmTerminologyEMFTranslater {

	public static TerminologyPackage transformAbstractTerminologyPackage (TDDIAbstractTerminologyPackage tAbstractTerminologyPackage){
		if(tAbstractTerminologyPackage.isSetUsedTerminologyPackageType()){
			switch(tAbstractTerminologyPackage.UsedTerminologyPackageType){
			case TPUTTerminologyPackage: return transformTerminologyPackage(tAbstractTerminologyPackage.UsedTerminologyPackage.getTerminologyPackage());
			case TPUTTerminologyPackageBinding: return transformTerminologyPackageBinding(tAbstractTerminologyPackage.UsedTerminologyPackage.getTerminologyPackageBinding());
			case TPUTTerminologyPackageInterface: return transformTerminologyPackageInterface(tAbstractTerminologyPackage.UsedTerminologyPackage.getTerminologyPackageInterface());
			default:
				break;
			
			}
		}
		return null;
	}
	
	private static TerminologyPackage transformTerminologyPackage(TDDITerminologyPackage tTerminologyPackage){
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tTerminologyPackage)) {
			return (TerminologyPackage) SacmBaseEMFTranslater.thrift2EmfMap.get(tTerminologyPackage);
		}
		
		TerminologyPackage eTerminologyPackage = EMFFactory.sacmTerminologyFactory.createTerminologyPackage();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tTerminologyPackage, eTerminologyPackage);
		transformTerminologyPackageContents(TTerminologyPackage.wrap(tTerminologyPackage), eTerminologyPackage);
		
		return eTerminologyPackage;
	}
	
	private static TerminologyPackageBinding transformTerminologyPackageBinding(TDDITerminologyPackageBinding tTerminologyPackageBinding){
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tTerminologyPackageBinding)) {
			return (TerminologyPackageBinding) SacmBaseEMFTranslater.thrift2EmfMap.get(tTerminologyPackageBinding);
		}
		
		TerminologyPackageBinding eTerminologyPackageBinding = EMFFactory.sacmTerminologyFactory.createTerminologyPackageBinding();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tTerminologyPackageBinding, eTerminologyPackageBinding);
		transformTerminologyPackageContents(TTerminologyPackageBinding.wrap(tTerminologyPackageBinding), eTerminologyPackageBinding);
		
		if(tTerminologyPackageBinding.isSetParticipantPackage()){
			for(TDDIAbstractTerminologyPackage tAbstractTerminologyPackage : tTerminologyPackageBinding.getParticipantPackage().stream().map(ref -> ref.ref).collect(Collectors.toList())){
				eTerminologyPackageBinding.getParticipantPackage().add(transformAbstractTerminologyPackage(tAbstractTerminologyPackage));
			}
		}
		
		return eTerminologyPackageBinding;
	}
	
	private static TerminologyPackageInterface transformTerminologyPackageInterface(TDDITerminologyPackageInterface tTerminologyPackageInterface){
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tTerminologyPackageInterface)) {
			return (TerminologyPackageInterface) SacmBaseEMFTranslater.thrift2EmfMap.get(tTerminologyPackageInterface);
		}
		
		TerminologyPackageInterface eTerminologyPackageInterface = EMFFactory.sacmTerminologyFactory.createTerminologyPackageInterface();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tTerminologyPackageInterface, eTerminologyPackageInterface);
		transformTerminologyPackageContents(TTerminologyPackageInterface.wrap(tTerminologyPackageInterface), eTerminologyPackageInterface);
		
		if(tTerminologyPackageInterface.isSetImplements()){
			eTerminologyPackageInterface.setImplements(transformAbstractTerminologyPackage(tTerminologyPackageInterface.getImplements()));
		}
		
		return eTerminologyPackageInterface;
	}
	
	private static void transformTerminologyPackageContents(ITerminologyPackage tTerminologyPackage, TerminologyPackage eTerminologyPackage){
		transformTerminologyElementContents(tTerminologyPackage, eTerminologyPackage);
		
		if(tTerminologyPackage.isSetTerminologyElements()){
			
			for(TDDIAbstractTerminologyElement tAbstractTerminologyElement : tTerminologyPackage.getTerminologyElements()){
				eTerminologyPackage.getTerminologyElement().add(transformAbstractTerminologyElement(tAbstractTerminologyElement));
			}
		}
	}
	
	private static TerminologyElement transformAbstractTerminologyElement(TDDIAbstractTerminologyElement tAbstractTerminologyElement){
		if(tAbstractTerminologyElement.isSetUsedTerminologyElementType()){
			switch(tAbstractTerminologyElement.UsedTerminologyElementType){
			case TEUTAbstractTerminologyAsset: return transformAbstractTerminologyAsset(tAbstractTerminologyElement.getUsedTerminologyElement().getTerminologyAsset());
			case TEUTAbstractTerminologyPackage: return transformAbstractTerminologyPackage(tAbstractTerminologyElement.getUsedTerminologyElement().getTerminologyPackage());
			case TEUTTerminologyGroup: return transformTerminologyGroup(tAbstractTerminologyElement.getUsedTerminologyElement().getTerminologyGroup());
			default:
				break;
			
			}
		}
		return null;
	}
	
	private static TerminologyGroup transformTerminologyGroup(TDDITerminologyGroup tTerminologyGroup){
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tTerminologyGroup)) {
			return (TerminologyGroup) SacmBaseEMFTranslater.thrift2EmfMap.get(tTerminologyGroup);
		}
		
		TerminologyGroup eTerminologyGroup = EMFFactory.sacmTerminologyFactory.createTerminologyGroup();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tTerminologyGroup, eTerminologyGroup);
		transformTerminologyElementContents(TTerminologyGroup.wrap(tTerminologyGroup), eTerminologyGroup);
		
		if(tTerminologyGroup.isSetTerminologyElement()){
			for(TDDIAbstractTerminologyElement tAbstractTerminologyElement : tTerminologyGroup.getTerminologyElement().stream().map(ref -> ref.ref).collect(Collectors.toList())){
				eTerminologyGroup.getTerminologyElement().add(transformAbstractTerminologyElement(tAbstractTerminologyElement));
			}
		}
		return eTerminologyGroup;
	}
	
	private static void transformTerminologyElementContents(ITerminologyElement tTerminologyElement, TerminologyElement eTerminologyElement){
		SacmBaseEMFTranslater.transformArtifactElementContents(tTerminologyElement, eTerminologyElement);
	}
	
	private static TerminologyAsset transformAbstractTerminologyAsset(TDDIAbstractTerminologyAsset tAbstractTerminologyAsset){
		if(tAbstractTerminologyAsset.isSetUsedTerminologyAssetType()){
			switch(tAbstractTerminologyAsset.UsedTerminologyAssetType){
			case TAUTAbstractExpressionElement:
				break;
			case TAUTCategory: return transformCategory(tAbstractTerminologyAsset.getUsedTerminologyAsset().getCategory());
			default: 
				break;
			
			}
		}
		return null;
	}
	
	
	private static void transformTerminologyAssetContents(ITerminologyAsset tTerminologyAsset, TerminologyAsset eTerminologyAsset){
		transformTerminologyElementContents(tTerminologyAsset, eTerminologyAsset);
	}
	
	private static Category transformCategory(TDDICategory tCategory){
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tCategory)) {
			return (Category) SacmBaseEMFTranslater.thrift2EmfMap.get(tCategory);
		}
		
		Category eCategory = EMFFactory.sacmTerminologyFactory.createCategory();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tCategory, eCategory);
		transformTerminologyAssetContents(TCategory.wrap(tCategory), eCategory);
		
		return eCategory;
	}
	
	
	public static ExpressionElement transformAbstractExpressionElement(TDDIAbstractExpressionElement tAbstractExpression) {
		if(tAbstractExpression.isSetUsedExpressionElementType()){
			switch(tAbstractExpression.UsedExpressionElementType){
			case EEUTExpression: return transformExpression(tAbstractExpression.getUsedExpressionElement().getExpression());
			case EEUTTerm: return transformTerm(tAbstractExpression.getUsedExpressionElement().getTerm());
			default:
				break;
			
			}
		}
		return null;
	}
	
	private static void transformExpressionElementContents(IExpressionElement tExpressionElement, ExpressionElement eExpressionElement){
		transformTerminologyAssetContents(tExpressionElement, eExpressionElement);
		
		if(tExpressionElement.isSetValue()){
			eExpressionElement.setValue(tExpressionElement.getValue());
		}
		
		if(tExpressionElement.isSetCategory()){
			for(TDDICategory tCategory : tExpressionElement.getCategory().stream().map(ref -> ref.ref).collect(Collectors.toList())){
				eExpressionElement.getCategory().add(transformCategory(tCategory));
			}
		}
	}
	
	private static Expression transformExpression(TDDIExpression tExpression){
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tExpression)) {
			return (Expression) SacmBaseEMFTranslater.thrift2EmfMap.get(tExpression);
		}
		
		Expression eExpression = EMFFactory.sacmTerminologyFactory.createExpression();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tExpression, eExpression);
		transformExpressionElementContents(TExpression.wrap(tExpression), eExpression);
		
		if(tExpression.isSetElement()){
			for(TDDIAbstractExpressionElement tAbstractExpressionElement : tExpression.getElement().stream().map(ref -> ref.ref).collect(Collectors.toList())){
				eExpression.getElement().add(transformAbstractExpressionElement(tAbstractExpressionElement));
			}
		}
		
		return eExpression;
	}
	
	private static Term transformTerm(TDDITerm tTerm){
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tTerm)) {
			return (Term) SacmBaseEMFTranslater.thrift2EmfMap.get(tTerm);
		}
		
		Term eTerm = EMFFactory.sacmTerminologyFactory.createTerm();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tTerm, eTerm);
		transformExpressionElementContents(TTerm.wrap(tTerm), eTerm);
		
		if(tTerm.isSetOrigin()){
			eTerm.setOrigin(SacmBaseEMFTranslater.transformAbstractModelElement(tTerm.getOrigin()));
		}
		
		if(tTerm.isSetExternalReference()){
			eTerm.setExternalReference(tTerm.getExternalReference());
		}
		return eTerm;
	}

}
