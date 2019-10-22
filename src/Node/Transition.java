package Node;
import java.util.ArrayList;
import java.util.List;

import Arc.InputArc;
import Arc.OutputArc;

/**
 * The type Transition.
 */
public class Transition {

	private List<InputArc> inputArcs;
	private List<OutputArc> outputArcs;

	/**
	 * Instantiates a new Transition.
	 *
	 * @param inputArcs  the input arcs
	 * @param outputArcs the output arcs
	 */
	public Transition(List<InputArc> inputArcs, List<OutputArc> outputArcs) {
		this.inputArcs = inputArcs;
		this.outputArcs = outputArcs;
	}

	/**
	 * Instantiates a new Transition.
	 */
	public Transition() {
		this(new ArrayList<InputArc>(), new ArrayList<OutputArc>());
	}

	/**
	 * Gets input arcs.
	 *
	 * @return the input arcs
	 */
	public List<InputArc> getInputArcs() {
		return inputArcs;
	}

	/**
	 * Sets input arcs.
	 *
	 * @param inputArcs the input arcs
	 */
	public void setInputArcs(List<InputArc> inputArcs) {
		this.inputArcs = inputArcs;
	}

	/**
	 * Gets output arcs.
	 *
	 * @return the output arcs
	 */
	public List<OutputArc> getOutputArcs() {
		return outputArcs;
	}

	/**
	 * Sets output arcs.
	 *
	 * @param outputArcs the output arcs
	 */
	public void setOutputArcs(List<OutputArc> outputArcs) {
		this.outputArcs = outputArcs;
	}

	/**
	 * Enabled boolean.
	 *
	 * @return the boolean
	 */
	public boolean enabled() {
		boolean answer=true;
		for(InputArc arc:inputArcs) {
			if(!arc.enabled()) {
				answer=false;
			}
		}
		return answer;
	}

	/**
	 * Fire.
	 */
	public void fire() {
		for(InputArc arc:inputArcs) {
			arc.fire();
		}
		for(OutputArc arc:outputArcs) {
			arc.fire();
		}
	}
	
	public String toString() {
		String result="Transition. Arcs liés: \n";
		for(OutputArc outputArc:this.getOutputArcs()) {
			result+=outputArc.toString()+"\n";
		}
		for(InputArc inputArc:this.getInputArcs()) {
			result+=inputArc.toString()+"\n";
		}
		return result;
	}

}
