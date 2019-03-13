package failurelogic.iface;

import java.util.List;

import base.iface.IBaseElement;
import thriftContract.TDDIAbstractFailureRef;
import thriftContract.TDDIFailureOriginType;
import thriftContract.TDDIProbDist;

public interface IFailure extends IBaseElement {
	boolean isSetOriginType();
	TDDIFailureOriginType getOriginType();
	void setOriginType(TDDIFailureOriginType value);
	
	boolean isSetFailureClass();
	String getFailureClass();
	void setFailureClass(String value);
	
	boolean isSetFailureRate();
	double getFailureRate();
	void setFailureRate(double failureRate);
	
	boolean isSetIsCCF();
	boolean getIsCCF();
	void setIsCCF(boolean value);
	
	boolean isSetFailureProbDistribution();
	TDDIProbDist getFailureProbDistribution();
	void setFailureProbDistribution(TDDIProbDist probDist);

	boolean isSetCCFFailures();
	List<TDDIAbstractFailureRef> getCCFFailures();
	
}
