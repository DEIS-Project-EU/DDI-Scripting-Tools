package transformation.thrift2ode;

import java.util.stream.Collectors;

import dependability.AssuranceLevel;
import dependability.DomainPackage;
import dependability.SafetyStandard;
import dependability.Standard;
import dependability.domain.typed.TAssuranceLevel;
import dependability.domain.typed.TDomainPackage;
import dependability.domain.typed.TSafetyStandard;
import dependability.domain.typed.TStandard;
import thriftContract.TDDIAbstractStandard;
import thriftContract.TDDIAssuranceLevel;
import thriftContract.TDDIDomainPackage;
import thriftContract.TDDISafetyStandard;
import thriftContract.TDDIStandard;
import util.EMFFactory;

public class DomainEMFTranslater {

	public static DomainPackage transformDomainPackage(TDDIDomainPackage tDomainPackage){
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tDomainPackage)){
			return (DomainPackage) BaseEMFTranslater.thrift2EmfMap.get(tDomainPackage);
		}
		
		DomainPackage emfDomainPackage = EMFFactory.dependabilityFactory.createDomainPackage();
		BaseEMFTranslater.thrift2EmfMap.put(tDomainPackage, emfDomainPackage);
		BaseEMFTranslater.transformBaseElementContents(TDomainPackage.wrap(tDomainPackage), emfDomainPackage);
		
		if(tDomainPackage.isSetStandards()){
			for(TDDIAbstractStandard tAbstractStandard : tDomainPackage.getStandards()){
				emfDomainPackage.getStandards().add(transformAbstractStandard(tAbstractStandard));
			}
		}
		
		if(tDomainPackage.isSetAssuranceLevels()){
			for(TDDIAssuranceLevel tAssuranceLevel : tDomainPackage.getAssuranceLevels()){
				emfDomainPackage.getAssuranceLevels().add(transformAssuranceLevel(tAssuranceLevel));
			}
		}
		
		return emfDomainPackage;
	}
	
	public static Standard transformAbstractStandard(TDDIAbstractStandard tAbstractStandard) {
		if(tAbstractStandard.isSetUsedStandardType()){
			switch(tAbstractStandard.getUsedStandardType()){
			case SUTSafetyStandard:
				return transformSafetyStandard(tAbstractStandard.UsedStandard.getSafetyStandard());
			case SUTStandard:
				return transformStandard(tAbstractStandard.UsedStandard.getStandard());
			}
		}
		return EMFFactory.dependabilityFactory.createStandard();
	}
	
	private static Standard transformStandard(TDDIStandard tStandard){
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tStandard)){
			return (Standard) BaseEMFTranslater.thrift2EmfMap.get(tStandard);
		}
		
		Standard emfStandard = EMFFactory.dependabilityFactory.createStandard();
		BaseEMFTranslater.thrift2EmfMap.put(tStandard, emfStandard);
		BaseEMFTranslater.transformBaseElementContents(TStandard.wrap(tStandard), emfStandard);
		
		return emfStandard;
	}
	
	private static SafetyStandard transformSafetyStandard(TDDISafetyStandard tSafetyStandard){
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tSafetyStandard)){
			return (SafetyStandard) BaseEMFTranslater.thrift2EmfMap.get(tSafetyStandard);
		}
		
		SafetyStandard emfSafetyStandard = EMFFactory.dependabilityFactory.createSafetyStandard();
		BaseEMFTranslater.thrift2EmfMap.put(tSafetyStandard, emfSafetyStandard);
		BaseEMFTranslater.transformBaseElementContents(TSafetyStandard.wrap(tSafetyStandard), emfSafetyStandard);
		
		if(tSafetyStandard.isSetAssuranceLevels()){
			for(TDDIAssuranceLevel tAssuranceLevel : tSafetyStandard.getAssuranceLevels().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfSafetyStandard.getAssuranceLevels().add(transformAssuranceLevel(tAssuranceLevel));
			}
		}
		
		return emfSafetyStandard; 
	}
	
	public static AssuranceLevel transformAssuranceLevel(TDDIAssuranceLevel tAssuranceLevel) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tAssuranceLevel)){
			return (AssuranceLevel) BaseEMFTranslater.thrift2EmfMap.get(tAssuranceLevel);
		}
		
		AssuranceLevel emfAssuranceLevel = EMFFactory.dependabilityFactory.createAssuranceLevel();
		BaseEMFTranslater.thrift2EmfMap.put(tAssuranceLevel, emfAssuranceLevel);
		BaseEMFTranslater.transformBaseElementContents(TAssuranceLevel.wrap(tAssuranceLevel), emfAssuranceLevel);

		return emfAssuranceLevel;
	}
}
