package dependability.requirements.typed;

import java.util.List;

import dependability.iface.IDependabilityRequirement;
import thriftContract.TDDIAbstractDependabilityRequirementRef;
import thriftContract.TDDIAbstractFailureRef;
import thriftContract.TDDIAbstractMeasureRef;
import thriftContract.TDDIAbstractRequirementSource;
import thriftContract.TDDIAssuranceLevel;
import thriftContract.TDDIKeyValueMap;
import thriftContract.TDDIMaintenanceProcedureRef;
import thriftContract.TDDISecurityRequirement;

public class TSecurityRequirement implements IDependabilityRequirement {

	private TDDISecurityRequirement thriftElement;
	
	private TSecurityRequirement(TDDISecurityRequirement thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TSecurityRequirement wrap(TDDISecurityRequirement thriftElement) {
		return new TSecurityRequirement(thriftElement);
	}
	
	public TDDISecurityRequirement unwrap() {
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
	public boolean isSetDecompositionArgument() {
		return thriftElement.isSetDecompositionArgument();
	}

	@Override
	public String getDecompositionArgument() {
		return thriftElement.getDecompositionArgument();
	}

	@Override
	public void setDecompositionArgument(String value) {
		thriftElement.setDecompositionArgument(value);
		thriftElement.setDecompositionArgumentIsSet(true);
	}

	@Override
	public boolean isSetRequirementSource() {
		return thriftElement.isSetRequirementSource();
	}

	@Override
	public TDDIAbstractRequirementSource getRequirementSource() {
		return thriftElement.getRequirementSource();
	}

	@Override
	public void setRequirementSource(TDDIAbstractRequirementSource value) {
		thriftElement.setRequirementSource(value);
		thriftElement.setRequirementSourceIsSet(true);
	}

	@Override
	public boolean isSetRefinedRequirements() {
		return thriftElement.isSetRefinedRequirements();
	}

	@Override
	public List<TDDIAbstractDependabilityRequirementRef> getRefinedRequiremnts() {
		return thriftElement.getRefinedRequirements();
	}

	@Override
	public boolean isSetMeasures() {
		return thriftElement.isSetMeasures();
	}

	@Override
	public List<TDDIAbstractMeasureRef> getMeasures() {
		return thriftElement.getMeasures();
	}

	@Override
	public boolean isSetFailures() {
		return thriftElement.isSetFailures();
	}

	@Override
	public List<TDDIAbstractFailureRef> getFailures() {
		return thriftElement.getFailures();
	}

	@Override
	public boolean isSetAssuranceLevel() {
		return thriftElement.isSetAssuranceLevel();
	}

	@Override
	public TDDIAssuranceLevel getAssuranceLevel() {
		return thriftElement.getAssuranceLevel();
	}

	@Override
	public void setAssuranceLevel(TDDIAssuranceLevel value) {
		thriftElement.setAssuranceLevel(value);
		thriftElement.setAssuranceLevelIsSet(true);
	}

	@Override
	public boolean isSetMaintenanceProcedures() {
		return thriftElement.isSetMaintenanceProcedures();
	}

	@Override
	public List<TDDIMaintenanceProcedureRef> getMaintenanceProcedures() {
		return thriftElement.getMaintenanceProcedures();
	}
}
