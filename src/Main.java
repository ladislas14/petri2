import java.util.ArrayList;

import Arc.InhibitorArc;
import Arc.InputArc;
import Arc.OutputArc;
import Arc.ResetArc;
import Node.Place;
import Node.Transition;
import PetriNet.PetriNet;


public class Main {
	   public static void main (String [] args) {


	   	/**
		 * First Test with 1 fireable input arc.
		 */
		System.out.println("Test with 1 fireable InputArc");

		Place place1 = new Place(3);
		Place place2 = new Place(1);

		InputArc inputArc = new InputArc(2,place1);
		OutputArc outputArc = new OutputArc(3,place2);

		ArrayList<InputArc> inputArcsList = new ArrayList<InputArc>();
		ArrayList<OutputArc> outPutArcsList = new ArrayList<OutputArc>();

		inputArcsList.add(inputArc);
		outPutArcsList.add(outputArc);

		Transition t = new Transition(inputArcsList, outPutArcsList);
		ArrayList<Transition> transitions = new ArrayList<Transition>();
		transitions.add(t);

		PetriNet petriNet = new PetriNet(transitions);
		
		System.out.println(petriNet.toString());
		petriNet.emulate();
		System.out.println(petriNet.toString());



		/**
		 * Second Test with 1 non fireable input arc.
		 */
		System.out.println("Test with 1 non fireable InputArc");

		Place place3 = new Place(1);
		Place place4 = new Place(1);

		InputArc inputArc1 = new InputArc(2,place3);
		OutputArc outputArc1 = new OutputArc(3,place4);

		ArrayList<InputArc> inputArcsList1 = new ArrayList<InputArc>();
		ArrayList<OutputArc> outputArcsList1 = new ArrayList<OutputArc>();

		inputArcsList1.add(inputArc1);
		outputArcsList1.add(outputArc1);

		Transition t1 = new Transition(inputArcsList1, outputArcsList1);
		ArrayList<Transition> transitions1 = new ArrayList<Transition>();
		transitions1.add(t1);

		PetriNet petriNet1 = new PetriNet(transitions1);
		
		System.out.println(petriNet1.toString());
		petriNet.emulate();
		System.out.println(petriNet1.toString());


		/**
		 * Third Test with 3 fireable input arcs.
		 */
		System.out.println("Test with 3 fireable InputArc");
		Place place5 = new Place(3);
		Place place6 = new Place(3);
		Place place7 = new Place(3);
		Place place8 = new Place(1);

		InputArc inputArc2 = new InputArc(2,place5);
		InputArc inputArc3 = new InputArc(2,place6);
		InputArc inpurArc4 = new InputArc(2,place7);

		OutputArc outputArc2 = new OutputArc(3,place8);
		
		
		ArrayList<InputArc> inputArcsList2 = new ArrayList<InputArc>();
		ArrayList<OutputArc> outputArcsList2 = new ArrayList<OutputArc>();

		inputArcsList2.add(inputArc2);
		inputArcsList2.add(inputArc3);
		inputArcsList2.add(inpurArc4);

		outputArcsList2.add(outputArc2);
		
		Transition t2 = new Transition(inputArcsList2, outputArcsList2);
		System.out.println(t2.enabled());
		ArrayList<Transition> transitions2 = new ArrayList<Transition>();
		transitions2.add(t2);

		PetriNet petriNet2 = new PetriNet(transitions2);
		
		System.out.println(petriNet2.toString());
		petriNet2.emulate();
		System.out.println(petriNet2.toString());



		/**
		 * Fourth Test with 3 non fireable input arcs.
		 */

		System.out.println("Test with 3 non fireable InputArc");
		
		place5.setTokens(1);
				
		System.out.println(petriNet2.toString());
		petriNet2.emulate();
		System.out.println(petriNet2.toString());


		/**
		 * Fifth Test with 1 fireable input reset arc.
		 */
		System.out.println("Test avec 1 InputResetArc : tirable");
		Place resetPlace = new Place(4);
		Place outputPlace = new Place(1);
		
		ResetArc resetArc = new ResetArc(resetPlace);
		OutputArc outputArc3 = new OutputArc(outputPlace);
		
		ArrayList<InputArc> inputResetArcsList = new ArrayList<InputArc>();
		ArrayList<OutputArc> outputResetArcsList = new ArrayList<OutputArc>();
		
		inputResetArcsList.add(resetArc);
		outputResetArcsList.add(outputArc3);
		
		
		Transition resetTransition = new Transition(inputResetArcsList, outputResetArcsList);
		ArrayList<Transition> resetTransitions = new ArrayList<Transition>();
		resetTransitions.add(resetTransition);
		PetriNet resetPetriNet = new PetriNet(resetTransitions);
		
		
		System.out.println(resetPetriNet.toString());
		resetPetriNet.emulate();
		System.out.println(resetPetriNet.toString());

		/**
		 * Sixth Test with 1 non fireable input reset arc.
		 */
		System.out.println("Test with 1 fireable InputResetArc");
		
		resetPlace.setTokens(0);
		outputPlace.setTokens(1);

		System.out.println(resetPetriNet.toString());
		resetPetriNet.emulate();
		System.out.println(resetPetriNet.toString());


		/**
		 * Seventh Test with 1 fireable input inhibitor arc.
		 */
		System.out.println("Test with 1 fireable InputInhibitorArc");
		Place inhibitorPlace = new Place(0);
		Place inhibitorOutputPLace = new Place(1);
				
		InhibitorArc inhibitorArc = new InhibitorArc(inhibitorPlace);
		OutputArc inhibitorOutputArc = new OutputArc(inhibitorOutputPLace);
				
		ArrayList<InputArc> inputInhibitorArcsList = new ArrayList<InputArc>();
		ArrayList<OutputArc> outputInhibitorArcsList = new ArrayList<OutputArc>();
				
		inputInhibitorArcsList.add(inhibitorArc);
		outputInhibitorArcsList.add(inhibitorOutputArc);
				
		Transition tzero = new Transition(inputInhibitorArcsList, outputInhibitorArcsList);
		ArrayList<Transition> transitionszero = new ArrayList<Transition>();
		transitionszero.add(tzero);
		PetriNet inhibitorPetriNet = new PetriNet(transitionszero);
				
		System.out.println(inhibitorPetriNet.toString());
		inhibitorPetriNet.emulate();
		System.out.println(inhibitorPetriNet.toString());


		/**
		 * Eighth Test with 1 non fireable input inhibitor arc .
		 */
		System.out.println("Test wiht 1 non fireable iputArcZero");
		inhibitorPlace.setTokens(2);
		inhibitorOutputPLace.setTokens(1);
				
		System.out.println(inhibitorPetriNet.toString());
		inhibitorPetriNet.emulate();
		System.out.println(inhibitorPetriNet.toString());
		
		
		
	}
}