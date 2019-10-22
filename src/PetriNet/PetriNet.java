package PetriNet;

import java.util.ArrayList;
import java.util.List;

import Arc.IArc;
import Arc.InputArc;
import Arc.OutputArc;
import Node.Transition;

public class PetriNet implements IPetriNet{
	
	private List<Transition> transitions;

	public PetriNet(List<Transition> transitions) {
		this.transitions = transitions;
	}

	public PetriNet() {
		this(new ArrayList<Transition>());
	}

	public void step() {
		List<Transition> enabledTransitions=this.getEnabledTransitions();
		if(enabledTransitions.size()>0) {
			Transition chosenTransition=enabledTransitions.get((int) (Math.random()*enabledTransitions.size()));
			this.fire(chosenTransition);
		}
		
	}
	
	public void emulate() {
		while(this.getEnabledTransitions().size()>0) {
			this.step();
		}
	}
	public void fire(Transition transition) {
		transition.fire();
	}

	public List<Transition> getEnabledTransitions() {
		List <Transition>enabledTransitions=new ArrayList<Transition>();
		for(Transition transition:transitions) {
			if(transition.enabled()) {
				enabledTransitions.add(transition);
			}
		}
		return enabledTransitions;
	}
	
	public List<IArc> getArcs(){
		List<IArc> list=new ArrayList<IArc>();
		for(Transition transition:transitions) {
			for(InputArc inputArc:transition.getInputArcs()) {
				for(IArc existingArc:list) {
					if(existingArc!=inputArc) {
						list.add(inputArc);
					}
				}
			}
			for(OutputArc outputArc:transition.getOutputArcs()) {
				for(IArc existingArc:list) {
					if(existingArc!=outputArc) {
						list.add(outputArc);
					}
				}
			}
		}
		return list;
	}
	
	public String toString() {
		String result="Liste des transitions:\n";
		for(int i=0; i<transitions.size(); i++) {
			result+="transition "+ i + "\n";
			result+=transitions.get(i).toString()+"\n";
		}
		return result;
	}

}
