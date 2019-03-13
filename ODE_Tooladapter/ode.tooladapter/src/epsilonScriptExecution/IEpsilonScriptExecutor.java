package epsilonScriptExecution;

import org.eclipse.epsilon.eol.IEolExecutableModule;

public interface IEpsilonScriptExecutor {

	public void execute() throws Exception;
	
	public Object getExecutionResult();
	
	public IEolExecutableModule getModule();
	
}
