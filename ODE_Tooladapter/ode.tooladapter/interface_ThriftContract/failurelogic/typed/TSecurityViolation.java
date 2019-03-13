package failurelogic.typed;

import java.util.List;

import failurelogic.iface.IFailure;
import thriftContract.TDDIAbstractFailureRef;
import thriftContract.TDDIFailureOriginType;
import thriftContract.TDDIKeyValueMap;
import thriftContract.TDDIProbDist;
import thriftContract.TDDISecurityViolation;

public class TSecurityViolation implements IFailure {

	private TDDISecurityViolation thriftElement;

	private TSecurityViolation(TDDISecurityViolation thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TSecurityViolation wrap(TDDISecurityViolation tDDISecurityViolation) {
		return new TSecurityViolation(tDDISecurityViolation);
	}
	
	public TDDISecurityViolation unwrap() {
		return thriftElement;
	}
	
	@Override
	public boolean isSetId() {
		return thriftElement.isSetId();
	}

	@Override
	public long getId() {
		return thriftElement.getId();
	}

	@Override
	public boolean isSetName() {
		return thriftElement.isSetName();
	}

	@Override
	public String getName() {
		return thriftElement.getName();
	}

	@Override
	public boolean isSetDescription() {
		return thriftElement.isSetDescription();
	}

	@Override
	public String getDescription() {
		return thriftElement.getDescription();
	}

	@Override
	public boolean isSetKeyValueMaps() {
		return thriftElement.isSetKeyValueMaps();
	}

	@Override
	public List<TDDIKeyValueMap> getKeyValueMaps() {
		return thriftElement.getKeyValueMaps();
	}

	@Override
	public void setKeyValueMaps(List<TDDIKeyValueMap> tKeyValueMaps){
		thriftElement.setKeyValueMaps(tKeyValueMaps);
	}

	@Override
	public void setId(long id) {
		thriftElement.setId(id);
		thriftElement.setIdIsSet(true);
	}

	@Override
	public void setName(String name) {
		thriftElement.setName(name);
		thriftElement.setNameIsSet(true);
	}

	@Override
	public void setDescription(String description) {
		thriftElement.setDescription(description);
		thriftElement.setDescriptionIsSet(true);
	}

	@Override
	public boolean isSetOriginType() {
		return thriftElement.isSetOriginType();
	}

	@Override
	public TDDIFailureOriginType getOriginType() {
		return thriftElement.getOriginType();
	}

	@Override
	public void setOriginType(TDDIFailureOriginType value) {
		thriftElement.setOriginType(value);
		thriftElement.setOriginTypeIsSet(true);
	}

	@Override
	public boolean isSetFailureClass() {
		return thriftElement.isSetFailureClass();
	}

	@Override
	public String getFailureClass() {
		return thriftElement.getFailureClass();
	}

	@Override
	public void setFailureClass(String value) {
		thriftElement.setFailureClass(value);
		thriftElement.setFailureClassIsSet(true);
	}

	@Override
	public boolean isSetFailureRate() {
		return thriftElement.isSetFailureRate();
	}

	@Override
	public double getFailureRate() {
		return thriftElement.getFailureRate();
	}

	@Override
	public void setFailureRate(double failureRate) {
		thriftElement.setFailureRate(failureRate);
		thriftElement.setFailureRateIsSet(true);
	}

	@Override
	public boolean isSetIsCCF() {
		return thriftElement.isSetIsCCF();
	}

	@Override
	public boolean getIsCCF() {
		return thriftElement.IsCCF;
	}

	@Override
	public void setIsCCF(boolean value) {
		thriftElement.setIsCCF(value);
		thriftElement.setIsCCFIsSet(true);
	}

	@Override
	public boolean isSetFailureProbDistribution() {
		return thriftElement.isSetFailureProbDistribution();
	}

	@Override
	public TDDIProbDist getFailureProbDistribution() {
		return thriftElement.getFailureProbDistribution();
	}

	@Override
	public void setFailureProbDistribution(TDDIProbDist probDist) {
		thriftElement.setFailureProbDistribution(probDist);
		thriftElement.setFailureProbDistributionIsSet(true);
	}

	@Override
	public boolean isSetCCFFailures() {
		return thriftElement.isSetCCFFailures();
	}

	@Override
	public List<TDDIAbstractFailureRef> getCCFFailures() {
		return thriftElement.getCCFFailures();
	}
}
