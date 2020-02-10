package transformation.ode2thrift;

import failurelogic.markov.typed.TMarkovChain;
import failurelogic.markov.typed.TState;
import failurelogic.markov.typed.TTransition;
import thriftContract.TDDIMarkovChain;
import thriftContract.TDDIState;
import thriftContract.TDDIStateRef;
import thriftContract.TDDITransition;
import top.failureLogic.MarkovChain;
import top.failureLogic.State;
import top.failureLogic.Transition;

public class MarkovThriftTranslater {

	public static TDDIMarkovChain transformMarkovChain(MarkovChain eMarcovChain){
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eMarcovChain)){
			return (TDDIMarkovChain) BaseThriftTranslater.emf2ThriftMap.get(eMarcovChain);
		}
		
		TDDIMarkovChain tMarcovChain = new TDDIMarkovChain();
		BaseThriftTranslater.emf2ThriftMap.put(eMarcovChain, tMarcovChain);
		FailureLogicThriftTranslater.transformFailureModelContents(TMarkovChain.wrap(tMarcovChain), eMarcovChain);
	
		if(eMarcovChain.getStates() != null){
			for(State eState : eMarcovChain.getStates()){
				tMarcovChain.getStates().add(transformState(eState));
			}
		}
		
		if(eMarcovChain.getTransitions() != null){
			for(Transition eTransition : eMarcovChain.getTransitions()){
				tMarcovChain.getTransitions().add(transformTransition(eTransition));
			}
		}
		
		return tMarcovChain;
	}

	private static TDDIState transformState(State eState) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eState)){
			return (TDDIState) BaseThriftTranslater.emf2ThriftMap.get(eState);
		}
		
		TDDIState tState = new TDDIState();
		BaseThriftTranslater.emf2ThriftMap.put(eState, tState);
		BaseThriftTranslater.transformBaseElementContents(TState.wrap(tState), eState);
		
		tState.setIsFailState(eState.isIsFailState());
		tState.setIsInitialState(eState.isIsInitialState());
		
		if(eState.getFailState() != null){
			tState.setFailState(FailureLogicThriftTranslater.transformAbstractFailure(eState.getFailState()));
		}
		return tState;
	}
	
	private static TDDITransition transformTransition(Transition eTransition){
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eTransition)){
			return (TDDITransition) BaseThriftTranslater.emf2ThriftMap.get(eTransition);
		}
		
		TDDITransition tTransition = new TDDITransition();
		BaseThriftTranslater.emf2ThriftMap.put(eTransition, tTransition);
		BaseThriftTranslater.transformBaseElementContents(TTransition.wrap(tTransition), eTransition);
		
		tTransition.setTransition(tTransition.getTransition());
		
		if(eTransition.getTransitionProbDistribution() != null){
			tTransition.setTransitionProbDistribution(FailureLogicThriftTranslater.transformProbDist(eTransition.getTransitionProbDistribution()));
		}
		
		if(eTransition.getFromStates() != null){
			for(State eFromState : eTransition.getFromStates()){
				tTransition.getFromStates().add(new TDDIStateRef(transformState(eFromState)));
			}
		}
		
		if(eTransition.getToStates() != null){
			for(State eToState : eTransition.getToStates()){
				tTransition.getToStates().add(new TDDIStateRef(transformState(eToState)));
			}
		}
		return tTransition;
	}
}
