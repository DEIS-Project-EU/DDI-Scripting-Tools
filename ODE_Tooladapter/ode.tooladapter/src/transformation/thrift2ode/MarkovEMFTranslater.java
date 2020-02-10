package transformation.thrift2ode;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import failurelogic.markov.typed.TMarkovChain;
import failurelogic.markov.typed.TState;
import failurelogic.markov.typed.TTransition;
import thriftContract.TDDIMarkovChain;
import thriftContract.TDDIState;
import thriftContract.TDDITransition;
import top.failureLogic.MarkovChain;
import top.failureLogic.State;
import top.failureLogic.Transition;
import util.EMFFactory;

public class MarkovEMFTranslater {

	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(MarkovEMFTranslater.class);

	public static MarkovChain transformMarkovChain(TDDIMarkovChain tMarkovChain){
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tMarkovChain)){
			return (MarkovChain) BaseEMFTranslater.thrift2EmfMap.get(tMarkovChain);
		}
		
		MarkovChain emfMarkovChain = EMFFactory.failureLogicFactory.createMarkovChain();
		FailureLogicEMFTranslater.transformFailureModelContents(TMarkovChain.wrap(tMarkovChain), emfMarkovChain);
		
		if(tMarkovChain.isSetStates()){
			for(TDDIState tState : tMarkovChain.getStates()){
				emfMarkovChain.getStates().add(transformState(tState));
			}
		}
		
		if(tMarkovChain.isSetTransitions()){
			for(TDDITransition tTransition : tMarkovChain.getTransitions()){
				emfMarkovChain.getTransitions().add(transformTransition(tTransition));
			}
		}
		return emfMarkovChain;
	}

	private static State transformState(TDDIState tState) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tState)){
			return (State) BaseEMFTranslater.thrift2EmfMap.get(tState);
		}
		
		State emfState = EMFFactory.failureLogicFactory.createState();
		BaseEMFTranslater.thrift2EmfMap.put(tState, emfState);
		BaseEMFTranslater.transformBaseElementContents(TState.wrap(tState), emfState);
		
		if(tState.isSetIsInitialState()){
			emfState.setIsInitialState(tState.IsInitialState);
		}
		
		if(tState.isSetIsFailState()){
			emfState.setIsFailState(tState.IsFailState);
		}
		
		if(tState.isSetFailState()){
			emfState.setFailState(FailureLogicEMFTranslater.transformAbstractFailure(tState.getFailState()));
		}
		
		return emfState;
	}
	
	private static Transition transformTransition(TDDITransition tTransition) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tTransition)){
			return (Transition) BaseEMFTranslater.thrift2EmfMap.get(tTransition);
		}
		
		Transition emfTransition = EMFFactory.failureLogicFactory.createTransition();
		BaseEMFTranslater.thrift2EmfMap.put(tTransition, emfTransition);
		BaseEMFTranslater.transformBaseElementContents(TTransition.wrap(tTransition), emfTransition);
		
		if(tTransition.isSetTransition()){
			emfTransition.setTransition(tTransition.getTransition());
		}
		
		if(tTransition.isSetTransitionProbDistribution()){
			emfTransition.setTransitionProbDistribution(FailureLogicEMFTranslater.transformProbDist(tTransition.getTransitionProbDistribution()));
		}
		
		if(tTransition.isSetFromStates()){
			for(TDDIState tFromState : tTransition.getFromStates().stream().map(ref -> ref.ref).collect(Collectors.toList())){
				emfTransition.getFromStates().add(transformState(tFromState));
			}
		}
		
		if(tTransition.isSetToStates()){
			for(TDDIState tToState : tTransition.getToStates().stream().map(ref -> ref.ref).collect(Collectors.toList())){
				emfTransition.getToStates().add(transformState(tToState));
			}
		}		
		return emfTransition;
	}
	
	
}
