package sacm.argumentation.iface;

import java.util.List;

import thriftContract.TDDIAssertionDeclaration;
import thriftContract.TDDIClaim;
import thriftContract.TDDIClaimRef;

public interface IAssertion extends IArgumentAsset {
	boolean isSetAssertionDeclaration();
	TDDIAssertionDeclaration getAssertionDeclaration();
	void setAssertionDeclaration(TDDIAssertionDeclaration value);
	
	boolean isSetMetaClaims();
	List<TDDIClaimRef> getMetaClaims();
	void addToMetaClaims(TDDIClaim value);
}
