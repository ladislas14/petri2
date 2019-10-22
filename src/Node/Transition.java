package Node;
import java.util.ArrayList;
import java.util.List;

import Arc.InputArc;
import Arc.OutputArc;

public class Transition {

	private List<InputArc> inputArcs;
	private List<OutputArc> outputArcs;
	
	public Transition(List<InputArc> inputArcs, List<OutputArc> outputArcs) {
		this.inputArcs = inputArcs;
		this.outputArcs = outputArcs;
	}

	public Transition() {
		this(new ArrayList<InputArc>(), new ArrayList<OutputArc>());
	}

	public List<InputArc> getInputArcs() {
		return inputArcs;
	}

	public void setInputArcs(List<InputArc> inputArcs) {
		this.inputArcs = inputArcs;
	}

	public List<OutputArc> getOutputArcs() {
		return outputArcs;
	}

	public void setOutputArcs(List<OutputArc> outputArcs) {
		this.outputArcs = outputArcs;
	}

	public boolean enabled() {
		boolean answer=true;
		for(InputArc arc:inputArcs) {
			if(!arc.enabled()) {
				answer=false;
			}
		}
		return answer;
	}
	
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
