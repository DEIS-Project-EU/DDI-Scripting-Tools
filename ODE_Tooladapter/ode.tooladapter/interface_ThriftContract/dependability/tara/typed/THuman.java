package dependability.tara.typed;

import java.util.List;

import dependability.iface.IThreatAgent;
import thriftContract.TDDIAttackerGoal;
import thriftContract.TDDIHuman;
import thriftContract.TDDIKeyValueMap;

public class THuman implements IThreatAgent {

	private TDDIHuman thriftElement;
	
	private THuman(TDDIHuman thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static THuman wrap(TDDIHuman thriftElement) {
		return new THuman(thriftElement);
	}
	
	public TDDIHuman unwrap() {
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
	public boolean isSetSkillLevel() {
		return thriftElement.isSetSkillLevel();
	}

	@Override
	public String getSkillLevel() {
		return thriftElement.getSkillLevel();
	}

	@Override
	public void setSkillLevel(String value) {
		thriftElement.setSkillLevel(value);
		thriftElement.setSkillLevelIsSet(true);
	}

	@Override
	public boolean isSetMotivation() {
		return thriftElement.isSetMotivation();
	}

	@Override
	public String getMotivation() {
		return thriftElement.getMotivation();
	}

	@Override
	public void setMotivation(String value) {
		thriftElement.setMotivation(value);
		thriftElement.setMotivationIsSet(true);
	}

	@Override
	public boolean isSetAnonymityDesire() {
		return thriftElement.isSetAnonymityDesire();
	}

	@Override
	public String getAnonymityDesire() {
		return thriftElement.getAnonymityDesire();
	}

	@Override
	public void setAnonymityDesire(String value) {
		thriftElement.setAnonymityDesire(value);
		thriftElement.setAnonymityDesireIsSet(true);
	}

	@Override
	public boolean isSetAttackerGoals() {
		return thriftElement.isSetAttackerGoals();
	}

	@Override
	public List<TDDIAttackerGoal> getAttackerGoals() {
		return thriftElement.getAttackerGoals();
	}
}
