package PetriNet;

import java.util.List;

import Arc.IArc;
import Node.Transition;

/**
 * The interface PetriNet.
 *
 * @version 1.0
 * @author Ladislas DELLINGER and Alfred PICHARD
 */
public interface IPetriNet {

	/**
	 * Fire a random transition if there is one enabled.
	 *
	 */
	public void step();

	/**
	 * Execute the {@code fire} method of the {@code Transition} class.
	 *
	 * <p>
	 *     Can be considered as an alias of the {@code Transtion.fire()} method.
	 * </p>
	 *
	 * @param transition the transition to fire
	 */
	public void fire(Transition transition);

	/**
	 * Launch the emulation of the PetriNet.
	 *
	 * <p>
	 *     Execute the {@code step()} method until there is no more enabled transitions available.
	 * </p>
	 */
	public void emulate();

	/**
	 * Gets enabled transitions.
	 *
	 * @return a list of the enabled transitions
	 */
	public List<Transition> getEnabledTransitions();

	/**
	 * Gets the arcs of the PetriNet.
	 *
	 * @return a list of the arcs of the PetriNet
	 */
	public List<IArc> getArcs();
	
}