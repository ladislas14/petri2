package PetriNet;

import java.util.List;

import Arc.IArc;
import Node.Transition;

/**
 * The interface Petri net.
 */
public interface IPetriNet {

	/**
	 * Step.
	 */
	public void step();

	/**
	 * Fire.
	 *
	 * @param transition the transition
	 */
	public void fire(Transition transition);

	/**
	 * Emulate.
	 */
	public void emulate();

	/**
	 * Gets enabled transitions.
	 *
	 * @return the enabled transitions
	 */
	public List<Transition> getEnabledTransitions();

	/**
	 * Gets arcs.
	 *
	 * @return the arcs
	 */
	public List<IArc> getArcs();
	
}