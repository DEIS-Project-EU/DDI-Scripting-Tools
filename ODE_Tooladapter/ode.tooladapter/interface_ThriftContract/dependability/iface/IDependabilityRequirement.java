package dependability.iface;

import java.util.List;

import base.iface.IBaseElement;
import thriftContract.TDDIAbstractDependabilityRequirementRef;
import thriftContract.TDDIAbstractFailureRef;
import thriftContract.TDDIAbstractMeasureRef;
import thriftContract.TDDIAbstractRequirementSource;
import thriftContract.TDDIAssuranceLevel;
import thriftContract.TDDIMaintenanceProcedureRef;

public interface IDependabilityRequirement extends IBaseElement {
	
	boolean isSetDecompositionArgument();
	String getDecompositionArgument();
	void setDecompositionArgument(String value);
	
	boolean isSetRequirementSource();
	TDDIAbstractRequirementSource getRequirementSource();
	void setRequirementSource(TDDIAbstractRequirementSource value);
	
	boolean isSetRefinedRequirements();
	List<TDDIAbstractDependabilityRequirementRef> getRefinedRequiremnts();
	
	boolean isSetMeasures();
	List<TDDIAbstractMeasureRef> getMeasures();
	
	boolean isSetFailures();
	List<TDDIAbstractFailureRef> getFailures();
	
	boolean isSetAssuranceLevel();
	TDDIAssuranceLevel getAssuranceLevel();
	void setAssuranceLevel(TDDIAssuranceLevel value);
	
	boolean isSetMaintenanceProcedures();
	List<TDDIMaintenanceProcedureRef> getMaintenanceProcedures();
}
