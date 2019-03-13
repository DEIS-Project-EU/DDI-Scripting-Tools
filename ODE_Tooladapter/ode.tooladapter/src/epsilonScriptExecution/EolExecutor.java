package epsilonScriptExecution;

import java.util.List;

import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.execute.context.Variable;

import thriftContract.TDDIEpsilonScriptExecutionConfig;

public class EolExecutor extends AbstractEpsilonScriptExecutor{

	public EolExecutor(TDDIEpsilonScriptExecutionConfig scriptConfig, List<Variable> importedVariables) {
		super(scriptConfig, importedVariables);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setModule() {
		this.module = new EolModule();
		
	}

}
