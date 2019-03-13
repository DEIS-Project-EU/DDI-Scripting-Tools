package dependability.iface;

import java.util.List;

import base.iface.IBaseElement;
import thriftContract.TDDIAttackerGoal;

public interface IThreatAgent extends IBaseElement {

	boolean isSetSkillLevel();
	String getSkillLevel();
	void setSkillLevel(String value);
	
	boolean isSetMotivation();
	String getMotivation();
	void setMotivation(String value);
	
	boolean isSetAnonymityDesire();
	String getAnonymityDesire();
	void setAnonymityDesire(String value);
	
	boolean isSetAttackerGoals();
	List<TDDIAttackerGoal> getAttackerGoals();
}
