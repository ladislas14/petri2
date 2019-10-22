package PetriNet;

import java.util.List;

import Arc.IArc;
import Node.Transition;

public interface IPetriNet {
	
	public void step();
	
	public void fire(Transition transition);
	
	public void emulate();
	
	public List<Transition> getEnabledTransitions();
	
	public List<IArc> getArcs();
	
}