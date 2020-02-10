package transformation.sacmOde2thrift;

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
import thriftContract.TDDIAbstractExpressionElementRef;
import thriftContract.TDDIAbstractTerminologyAsset;
import thriftContract.TDDIAbstractTerminologyElement;
import thriftContract.TDDIAbstractTerminologyElementRef;
import thriftContract.TDDIAbstractTerminologyPackage;
import thriftContract.TDDIAbstractTerminologyPackageRef;
import thriftContract.TDDICategory;
import thriftContract.TDDICategoryRef;
import thriftContract.TDDIExpression;
import thriftContract.TDDIExpressionElementUnion;
import thriftContract.TDDIExpressionElementUnionType;
import thriftContract.TDDITerm;
import thriftContract.TDDITerminologyAssetUnion;
import thriftContract.TDDITerminologyAssetUnionType;
import thriftContract.TDDITerminologyElementUnion;
import thriftContract.TDDITerminologyElementUnionType;
import thriftContract.TDDITerminologyGroup;
import thriftContract.TDDITerminologyPackage;
import thriftContract.TDDITerminologyPackageBinding;
import thriftContract.TDDITerminologyPackageInterface;
import thriftContract.TDDITerminologyPackageUnion;
import thriftContract.TDDITerminologyPackageUnionType;
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

public class SacmTerminologyThriftTranslator {

	public static TDDIAbstractTerminologyElement transformAbstractTerminologyElement(TerminologyElement eTerminologyElement) {
		TDDIAbstractTerminologyElement tAbstractTerminologyElement = new TDDIAbstractTerminologyElement();
		
		if(eTerminologyElement instanceof TerminologyGroup) {
			tAbstractTerminologyElement.UsedTerminologyElementType = TDDITerminologyElementUnionType.TEUTTerminologyGroup;
			tAbstractTerminologyElement.UsedTerminologyElement = new TDDITerminologyElementUnion();
			tAbstractTerminologyElement.UsedTerminologyElement.setTerminologyGroup(transformTerminologyGroup((TerminologyGroup) eTerminologyElement));
		} else if(eTerminologyElement instanceof TerminologyPackage) {
			tAbstractTerminologyElement.UsedTerminologyElementType = TDDITerminologyElementUnionType.TEUTAbstractTerminologyPackage;
			tAbstractTerminologyElement.UsedTerminologyElement = new TDDITerminologyElementUnion();
			tAbstractTerminologyElement.UsedTerminologyElement.setTerminologyPackage(transformAbstractTerminologyPackage((TerminologyPackage) eTerminologyElement));
		} else if(eTerminologyElement instanceof TerminologyAsset) {
			tAbstractTerminologyElement.UsedTerminologyElementType = TDDITerminologyElementUnionType.TEUTAbstractTerminologyAsset;
			tAbstractTerminologyElement.UsedTerminologyElement = new TDDITerminologyElementUnion();
			tAbstractTerminologyElement.UsedTerminologyElement.setTerminologyAsset(transformAbstractTerminologyAsset((TerminologyAsset) eTerminologyElement));
		} 
		
		return tAbstractTerminologyElement;
	}

	private static TDDITerminologyGroup transformTerminologyGroup(TerminologyGroup eTerminologyGroup) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eTerminologyGroup)) {
			return (TDDITerminologyGroup) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eTerminologyGroup);
		}
		
		TDDITerminologyGroup tTerminologyGroup = new TDDITerminologyGroup();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eTerminologyGroup, tTerminologyGroup);
		transformTerminologyElementContents(TTerminologyGroup.wrap(tTerminologyGroup), eTerminologyGroup);
		
		if(eTerminologyGroup.getTerminologyElement() != null) {
			for(TerminologyElement eTerminologyElement : eTerminologyGroup.getTerminologyElement()) {
				tTerminologyGroup.getTerminologyElement().add(new TDDIAbstractTerminologyElementRef(transformAbstractTerminologyElement(eTerminologyElement)));
			}
		}
		return tTerminologyGroup;
	}

	public static TDDIAbstractTerminologyPackage transformAbstractTerminologyPackage(TerminologyPackage eTerminologyPackage) {
		TDDIAbstractTerminologyPackage tAbstractTerminologyPackage = new TDDIAbstractTerminologyPackage();
		
		if(eTerminologyPackage instanceof TerminologyPackageBinding) {
			tAbstractTerminologyPackage.UsedTerminologyPackageType = TDDITerminologyPackageUnionType.TPUTTerminologyPackageBinding;
			tAbstractTerminologyPackage.UsedTerminologyPackage = new TDDITerminologyPackageUnion();
			tAbstractTerminologyPackage.UsedTerminologyPackage.setTerminologyPackageBinding(transformTerminologyPackageBinding((TerminologyPackageBinding) eTerminologyPackage));
		} else if(eTerminologyPackage instanceof TerminologyPackageInterface) {
			tAbstractTerminologyPackage.UsedTerminologyPackageType = TDDITerminologyPackageUnionType.TPUTTerminologyPackageInterface;
			tAbstractTerminologyPackage.UsedTerminologyPackage = new TDDITerminologyPackageUnion();
			tAbstractTerminologyPackage.UsedTerminologyPackage.setTerminologyPackageInterface(transformTerminologyPackageInterface((TerminologyPackageInterface) eTerminologyPackage));
		} else if(eTerminologyPackage instanceof TerminologyPackage) {
			tAbstractTerminologyPackage.UsedTerminologyPackageType = TDDITerminologyPackageUnionType.TPUTTerminologyPackage;
			tAbstractTerminologyPackage.UsedTerminologyPackage = new TDDITerminologyPackageUnion();
			tAbstractTerminologyPackage.UsedTerminologyPackage.setTerminologyPackage(transformTerminologyPackage((TerminologyPackage) eTerminologyPackage));
		}
		
		return tAbstractTerminologyPackage;
	}
	
	private static TDDITerminologyPackageBinding transformTerminologyPackageBinding(TerminologyPackageBinding eTerminologyPackageBinding) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eTerminologyPackageBinding)) {
			return (TDDITerminologyPackageBinding) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eTerminologyPackageBinding);
		}
		
		TDDITerminologyPackageBinding tTerminologyPackageBinding = new TDDITerminologyPackageBinding();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eTerminologyPackageBinding, tTerminologyPackageBinding);
		transformTerminologyPackageContents(TTerminologyPackageBinding.wrap(tTerminologyPackageBinding), eTerminologyPackageBinding);
		
		if(eTerminologyPackageBinding.getParticipantPackage() != null && eTerminologyPackageBinding.getParticipantPackage().size() >= 2) {
			for(TerminologyPackage eParticipantTerminologyPackage : eTerminologyPackageBinding.getParticipantPackage()) {
				tTerminologyPackageBinding.getParticipantPackage().add(new TDDIAbstractTerminologyPackageRef(transformAbstractTerminologyPackage(eParticipantTerminologyPackage)));
			}
		}
		return tTerminologyPackageBinding;
	}

	private static TDDITerminologyPackageInterface transformTerminologyPackageInterface(TerminologyPackageInterface eTerminologyPackageInterface) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eTerminologyPackageInterface)) {
			return (TDDITerminologyPackageInterface) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eTerminologyPackageInterface);
		}
		
		TDDITerminologyPackageInterface tTerminologyPackageInterface = new TDDITerminologyPackageInterface();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eTerminologyPackageInterface, tTerminologyPackageInterface);
		transformTerminologyPackageContents(TTerminologyPackageInterface.wrap(tTerminologyPackageInterface), eTerminologyPackageInterface);
		
		if(eTerminologyPackageInterface.getImplements() != null) {
			tTerminologyPackageInterface.setImplements(transformAbstractTerminologyPackage(eTerminologyPackageInterface.getImplements()));
		}
		return tTerminologyPackageInterface;
	}

	private static TDDITerminologyPackage transformTerminologyPackage(TerminologyPackage eTerminologyPackage) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eTerminologyPackage)) {
			return (TDDITerminologyPackage) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eTerminologyPackage);
		}
		TDDITerminologyPackage tTerminologyPackage = new TDDITerminologyPackage();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eTerminologyPackage, tTerminologyPackage);
		transformTerminologyPackageContents(TTerminologyPackage.wrap(tTerminologyPackage), eTerminologyPackage);
		
		return tTerminologyPackage;
	}

	private static void transformTerminologyPackageContents(ITerminologyPackage tTerminologyPackage, TerminologyPackage emfTerminologyPackage) {
		transformTerminologyElementContents(tTerminologyPackage, emfTerminologyPackage);
		
		if(emfTerminologyPackage.getTerminologyElement() != null) {
			for(TerminologyElement eTerminologyElement : emfTerminologyPackage.getTerminologyElement()) {
				tTerminologyPackage.getTerminologyElements().add(transformAbstractTerminologyElement(eTerminologyElement));
			}
		}
	}
	
	private static TDDIAbstractTerminologyAsset transformAbstractTerminologyAsset(TerminologyAsset eTerminologyAsset) {
		TDDIAbstractTerminologyAsset tAbstractTerminologyAsset = new TDDIAbstractTerminologyAsset();
		
		if(eTerminologyAsset instanceof Category) {
			tAbstractTerminologyAsset.UsedTerminologyAssetType = TDDITerminologyAssetUnionType.TAUTCategory;
			tAbstractTerminologyAsset.UsedTerminologyAsset = new TDDITerminologyAssetUnion();
			tAbstractTerminologyAsset.UsedTerminologyAsset.setCategory(transformCategory((Category) eTerminologyAsset));
		} else if(eTerminologyAsset instanceof ExpressionElement) {
			tAbstractTerminologyAsset.UsedTerminologyAssetType = TDDITerminologyAssetUnionType.TAUTAbstractExpressionElement;
			tAbstractTerminologyAsset.UsedTerminologyAsset = new TDDITerminologyAssetUnion();
			tAbstractTerminologyAsset.UsedTerminologyAsset.setExpressionElement(transformAbstractExpressionElement((ExpressionElement) eTerminologyAsset));
		}
		return tAbstractTerminologyAsset;
	}
	
	private static TDDICategory transformCategory(Category eCategory) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eCategory)) {
			return (TDDICategory) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eCategory);
		}
		
		TDDICategory tCategory = new TDDICategory();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eCategory, tCategory);
		transformTerminologyAssetContents(TCategory.wrap(tCategory), eCategory);
		
		return tCategory;
	}
	
	public static TDDIAbstractExpressionElement transformAbstractExpressionElement(ExpressionElement eExpressionElement) {
		TDDIAbstractExpressionElement tAbstractExpressionElement = new TDDIAbstractExpressionElement();
		
		if(eExpressionElement instanceof Term) {
			tAbstractExpressionElement.UsedExpressionElementType = TDDIExpressionElementUnionType.EEUTTerm;
			tAbstractExpressionElement.UsedExpressionElement = new TDDIExpressionElementUnion();
			tAbstractExpressionElement.UsedExpressionElement.setTerm(transformTerm((Term) eExpressionElement));
		} else if(eExpressionElement instanceof Expression) {
			tAbstractExpressionElement.UsedExpressionElementType = TDDIExpressionElementUnionType.EEUTExpression;
			tAbstractExpressionElement.UsedExpressionElement = new TDDIExpressionElementUnion();
			tAbstractExpressionElement.UsedExpressionElement.setExpression(transformExpression((Expression) eExpressionElement));
		}
		return tAbstractExpressionElement;
	}

	private static TDDITerm transformTerm(Term eTerm) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eTerm)) {
			return (TDDITerm) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eTerm);
		}
		
		TDDITerm tTerm = new TDDITerm();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eTerm, tTerm);
		transformExpressionElementContents(TTerm.wrap(tTerm), eTerm);
		
		if(eTerm.getOrigin() != null) {
			tTerm.setOrigin(SacmBaseThriftTranslator.transformAbstractModelElement(eTerm.getOrigin()));
		}
		
		if(eTerm.getExternalReference() != null) {
			tTerm.setExternalReference(eTerm.getExternalReference());
		}
		
		return tTerm;
	}

	private static TDDIExpression transformExpression(Expression eExpression) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eExpression)) {
			return (TDDIExpression) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eExpression);
		}
		
		TDDIExpression tExpression = new TDDIExpression();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eExpression, tExpression);
		transformExpressionElementContents(TExpression.wrap(tExpression), eExpression);
		
		if(eExpression.getElement() != null) {
			for(ExpressionElement element : eExpression.getElement()) {
				tExpression.addToElement(new TDDIAbstractExpressionElementRef(transformAbstractExpressionElement(element)));
			}
		}
		
		return tExpression;
	}

	private static void transformExpressionElementContents(IExpressionElement tExpressionElement, ExpressionElement emfExpressionElement) {
		transformTerminologyAssetContents(tExpressionElement, emfExpressionElement);
		
		if(emfExpressionElement.getCategory() != null) {
			for(Category category : emfExpressionElement.getCategory()){
				tExpressionElement.addToCategory(new TDDICategoryRef(transformCategory(category)));
			}
		}
		
		if(emfExpressionElement.getValue() != null) {
			tExpressionElement.setValue(emfExpressionElement.getValue());
		}
	}
	
	private static void transformTerminologyAssetContents(ITerminologyAsset tTerminologyAsset, TerminologyAsset emfTerminologyAsset) {
		transformTerminologyElementContents(tTerminologyAsset, emfTerminologyAsset);
	}
	
	private static void transformTerminologyElementContents(ITerminologyElement tTerminologyElement, TerminologyElement emfTerminologyElement) {
		SacmBaseThriftTranslator.transformArtifactElementContents(tTerminologyElement, emfTerminologyElement);
	}
}
