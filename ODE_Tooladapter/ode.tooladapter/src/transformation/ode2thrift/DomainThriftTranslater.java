package transformation.ode2thrift;

import dependability.AssuranceLevel;
import dependability.DomainPackage;
import dependability.SafetyStandard;
import dependability.Standard;
import dependability.domain.typed.TAssuranceLevel;
import dependability.domain.typed.TDomainPackage;
import dependability.domain.typed.TSafetyStandard;
import dependability.domain.typed.TStandard;
import dependability.iface.IStandard;
import thriftContract.TDDIAbstractStandard;
import thriftContract.TDDIAssuranceLevel;
import thriftContract.TDDIAssuranceLevelRef;
import thriftContract.TDDIDomainPackage;
import thriftContract.TDDISafetyStandard;
import thriftContract.TDDIStandard;
import thriftContract.TDDIStandardUnion;
import thriftContract.TDDIStandardUnionType;

public class DomainThriftTranslater {

	public static TDDIDomainPackage transformDomainPackage(DomainPackage eDomainPackage){
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eDomainPackage)){
			return (TDDIDomainPackage) BaseThriftTranslater.emf2ThriftMap.get(eDomainPackage);
		}
		
		TDDIDomainPackage tDomainPackage = new TDDIDomainPackage();
		BaseThriftTranslater.emf2ThriftMap.put(eDomainPackage, tDomainPackage);
		ODE2ThriftTranslater.transformODEProductPackageContents(TDomainPackage.wrap(tDomainPackage), eDomainPackage);
		
		if(eDomainPackage.getAssuranceLevels() != null){
			for(AssuranceLevel eAssuranceLevel : eDomainPackage.getAssuranceLevels()){
				tDomainPackage.getAssuranceLevels().add(transformAssuranceLevel(eAssuranceLevel));	
			}
		}
		
		if(eDomainPackage.getStandards() != null){
			for(Standard eAbstractStandard : eDomainPackage.getStandards()){
				tDomainPackage.getStandards().add(transformAbstractStandard(eAbstractStandard));	
			}
		}
		
		if(eDomainPackage.getAssuranceLevels() != null){
			for(AssuranceLevel eAssuranceLevel : eDomainPackage.getAssuranceLevels()){
				tDomainPackage.getAssuranceLevels().add(transformAssuranceLevel(eAssuranceLevel));	
			}
		}
		
		return tDomainPackage;
	}
	
	public static TDDIAssuranceLevel transformAssuranceLevel(AssuranceLevel eAssuranceLevel) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eAssuranceLevel)){
			return (TDDIAssuranceLevel) BaseThriftTranslater.emf2ThriftMap.get(eAssuranceLevel);
		}
		
		TDDIAssuranceLevel tAssuranceLevel = new TDDIAssuranceLevel();
		BaseThriftTranslater.emf2ThriftMap.put(eAssuranceLevel, tAssuranceLevel);
		BaseThriftTranslater.transformBaseElementContents(TAssuranceLevel.wrap(tAssuranceLevel), eAssuranceLevel);
		
		return tAssuranceLevel;
	}

	public static TDDIAbstractStandard transformAbstractStandard(Standard eAbstractStandard) {
		TDDIAbstractStandard tAbstractStandard = new TDDIAbstractStandard();
		
		if(eAbstractStandard instanceof SafetyStandard){
			tAbstractStandard.UsedStandardType = TDDIStandardUnionType.SUTSafetyStandard;
			tAbstractStandard.UsedStandard = new TDDIStandardUnion();
			tAbstractStandard.UsedStandard.setSafetyStandard(transformSafetyStandard((SafetyStandard) eAbstractStandard));
		}
		else if (eAbstractStandard instanceof Standard) {
			tAbstractStandard.UsedStandardType = TDDIStandardUnionType.SUTStandard;
			tAbstractStandard.UsedStandard = new TDDIStandardUnion();
			tAbstractStandard.UsedStandard.setStandard(transformStandard((Standard) eAbstractStandard));
		}
		return tAbstractStandard;
	}

	private static TDDISafetyStandard transformSafetyStandard(SafetyStandard eSafetyStandard) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eSafetyStandard)){
			return (TDDISafetyStandard) BaseThriftTranslater.emf2ThriftMap.get(eSafetyStandard);
		}
		
		TDDISafetyStandard tSafetyStandard = new TDDISafetyStandard();
		BaseThriftTranslater.emf2ThriftMap.put(eSafetyStandard, tSafetyStandard);
		transformStandardContents(TSafetyStandard.wrap(tSafetyStandard), eSafetyStandard);
		
		if(eSafetyStandard.getAssuranceLevels() != null){
			for(AssuranceLevel eAssuranceLevel : eSafetyStandard.getAssuranceLevels()){
				tSafetyStandard.getAssuranceLevels().add(new TDDIAssuranceLevelRef(transformAssuranceLevel(eAssuranceLevel)));
			}
		}
		return tSafetyStandard;
	}

	private static TDDIStandard transformStandard(Standard eStandard) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eStandard)){
			return (TDDIStandard) BaseThriftTranslater.emf2ThriftMap.get(eStandard);
		}
		
		TDDIStandard tStandard = new TDDIStandard();
		BaseThriftTranslater.emf2ThriftMap.put(eStandard, tStandard);
		transformStandardContents(TStandard.wrap(tStandard), eStandard);
		
		return tStandard;
	}
	
	private static void transformStandardContents(IStandard tStandard, Standard eStandard){
		BaseThriftTranslater.transformBaseElementContents(tStandard, eStandard);
	}
	

}
