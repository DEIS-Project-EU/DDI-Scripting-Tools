package epsilonScriptExecution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

import thriftContract.TDDIEpsilonScriptExecutionConfig;
import thriftContract.TDDIValidationResult;
import thriftContract.TDDIValidationViolationMessage;

public class EvlExecutor extends AbstractEpsilonScriptExecutor{

	private TDDIValidationResult lastValidationResult;
	
	public EvlExecutor(TDDIEpsilonScriptExecutionConfig scriptConfig, List<Variable> importedVariables) {
		super(scriptConfig, importedVariables);
		lastValidationResult = new TDDIValidationResult();
	}

	@Override
	public Object getExecutionResult(){
		return lastValidationResult;
	}
	
	@Override
	public void postProcess(){
		EvlModule module = (EvlModule) this.module;
		
		Collection<UnsatisfiedConstraint> unsatisfied = module.getContext().getUnsatisfiedConstraints();
		
		if (unsatisfied.size() > 0) {
			
			this.lastValidationResult.setValidationViolationOccurred(true);
			this.lastValidationResult.setValidationViolationOccurredIsSet(true);
			
			System.err.println(unsatisfied.size() + " constraint(s) have not been satisfied\n");
			
			Map<String, List<String>> context2UnsatisfiedConstraintMessage = new HashMap<String, List<String>>();
			
			// sort messages by the context type
			for (UnsatisfiedConstraint uc : unsatisfied) {
				String context = uc.getConstraint().getConstraintContext().getTypeName();
				if(context2UnsatisfiedConstraintMessage.containsKey(context)) {
					context2UnsatisfiedConstraintMessage.get(context).add(uc.getMessage());
				}
				else{
					List<String> messagesForObjectType = new ArrayList<String>();
					messagesForObjectType.add(uc.getMessage());
					context2UnsatisfiedConstraintMessage.put(context, messagesForObjectType);
				}
			}
			
			// print UnsatisfiedConstraintMessages
			for(Map.Entry<String, List<String>> unsatisfiedValidationEntry : context2UnsatisfiedConstraintMessage.entrySet()){
				String context = unsatisfiedValidationEntry.getKey();
				System.err.println("Context: " + context);
				
				for(String message : unsatisfiedValidationEntry.getValue()){
					
					this.lastValidationResult.getValidationViolationMessages().add(getThriftValidationViolationMessage(context, message));
					
					System.err.println(message);
				}
				System.err.println();
			}
		}
		else {
			System.out.println("All constraints have been satisfied");
		}
	}
	
	@Override
	public void setModule() {
		this.module = new EvlModule();
	}
	
	private TDDIValidationViolationMessage getThriftValidationViolationMessage(String context, String message) {
		TDDIValidationViolationMessage thriftViolationMessage = new TDDIValidationViolationMessage();
		thriftViolationMessage.setContext(context);
		thriftViolationMessage.setContextIsSet(true);
		
		thriftViolationMessage.setMessage(message);
		thriftViolationMessage.setMessageIsSet(true);
		return thriftViolationMessage;
	}
}
