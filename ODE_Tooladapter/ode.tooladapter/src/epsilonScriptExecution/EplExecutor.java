package epsilonScriptExecution;

import java.util.List;

import org.eclipse.epsilon.eol.execute.context.Variable;

import thriftContract.TDDIEpsilonScriptExecutionConfig;
import org.eclipse.epsilon.epl.EplModule;

public class EplExecutor extends AbstractEpsilonScriptExecutor{

	public EplExecutor(TDDIEpsilonScriptExecutionConfig scriptConfig, List<Variable> importedVariables) {
		super(scriptConfig, importedVariables);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setModule() {
		this.module = new EplModule();
		
	}

}
