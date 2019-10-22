package PetriNet;

import java.util.ArrayList;
import java.util.List;

import Arc.IArc;
import Arc.InputArc;
import Arc.OutputArc;
import Node.Transition;

/**
 * Implementation of the PetriNet interface.
 *
 * @version 1.0
 * @author Ladislas DELLINGER and Alfred PICHARD
 *
 */
public class PetriNet implements IPetriNet{
	
	private List<Transition> transitions;

	/**
	 * Instantiates a new PetriNet.
	 *
	 * @param transitions a list of transitions to initialize in the PetriNet.
	 */
	public PetriNet(List<Transition> transitions) {
		this.transitions = transitions;
	}

	/**
	 * Instantiates a new Petri net.
	 *
	 * <p>
	 *     Second constructor to create an empty PetriNet.
	 * </p>
	 */
	public PetriNet() {
		this(new ArrayList<Transition>());
	}

	/**
	 * Fire a random transition if there is one enabled.
	 *
	 */
	public void step() {
		List<Transition> enabledTransitions=this.getEnabledTransitions();
		if(enabledTransitions.size()>0) {
			Transition chosenTransition=enabledTransitions.get((int) (Math.random()*enabledTransitions.size()));
			this.fire(chosenTransition);
		}
		
	}

	/**
	 * Launch the emulation of the PetriNet.
	 *
	 * <p>
	 *     Execute the {@code step()} method until there is no more enabled transitions available.
	 * </p>
	 */
	public void emulate() {
		while(this.getEnabledTransitions().size()>0) {
			this.step();
		}
	}

	/**
	 * Execute the {@code fire} method of the {@code Transition} class.
	 *
	 * <p>
	 *     Can be considered as an alias of the {@code Transtion.fire()} method.
	 * </p>
	 *
	 * @param transition the Transition to fire
	 */
	public void fire(Transition transition) {
		transition.fire();
	}

	/**
	 * Gets enabled transitions.
	 *
	 * @return a list of the enabled transitions
	 */
	public List<Transition> getEnabledTransitions() {
		List <Transition>enabledTransitions=new ArrayList<Transition>();
		for(Transition transition:transitions) {
			if(transition.enabled()) {
				enabledTransitions.add(transition);
			}
		}
		return enabledTransitions;
	}

	/**
	 * Gets the arcs of the PetriNet.
	 *
	 * @return a list of the arcs of the PetriNet
	 */
	public List<IArc> getArcs(){
		List<IArc> list=new ArrayList<IArc>();

		// Get all the input arcs and output arcs and make a list with all the arc of the PetriNet
		for(Transition transition:transitions) {
			// Get the input arcs
			for(InputArc inputArc:transition.getInputArcs()) {
				for(IArc existingArc:list) {
					// Verify that the arc is not already in the list. Just as a prevention.
					if(existingArc!=inputArc) {
						list.add(inputArc);
					}
				}
			}

			// Get the output arcs
			for(OutputArc outputArc:transition.getOutputArcs()) {
				for(IArc existingArc:list) {
					// Verify that the arc is not already in the list. Just as a prevention.
					if(existingArc!=outputArc) {
						list.add(outputArc);
					}
				}
			}
		}
		return list;
	}
	
	public String toString() {
		String result="Transitions :\n";
		for(int i=0; i<transitions.size(); i++) {
			result+="transition "+ i + "\n";
			result+=transitions.get(i).toString()+"\n";
		}
		return result;
	}

}
