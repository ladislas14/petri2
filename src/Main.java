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
		  
		System.out.println("Test avec 1 InputArc : tirable");
		Place place1 = new Place(3);
		Place place2 = new Place(1);
		InputArc iArc = new InputArc(2,place1);
		OutputArc oArc = new OutputArc(3,place2);
		ArrayList<InputArc> iList = new ArrayList<InputArc>();
		ArrayList<OutputArc> oList = new ArrayList<OutputArc>();
		iList.add(iArc);
		oList.add(oArc);
		Transition t = new Transition(iList, oList);
		ArrayList<Transition> transitions = new ArrayList<Transition>();
		transitions.add(t);
		PetriNet petriNet = new PetriNet(transitions);
		
		System.out.println(petriNet.toString());
		petriNet.emulate();
		System.out.println(petriNet.toString());
		
		// 
		System.out.println("Test avec 1 InputArc : non tirable");
		Place place3 = new Place(1);
		Place place4 = new Place(1);
		InputArc iarc1 = new InputArc(2,place3);
		OutputArc oarc1 = new OutputArc(3,place4);
		ArrayList<InputArc> ilist1 = new ArrayList<InputArc>();
		ArrayList<OutputArc> olist1 = new ArrayList<OutputArc>();
		ilist1.add(iarc1);
		olist1.add(oarc1);
		Transition t1 = new Transition(ilist1, olist1);
		ArrayList<Transition> transitions1 = new ArrayList<Transition>();
		transitions1.add(t1);
		PetriNet petriNet1 = new PetriNet(transitions1);
		
		System.out.println(petriNet1.toString());
		petriNet.emulate();
		System.out.println(petriNet1.toString());

		
		System.out.println("Test avec 3 InputArc : tirable");
		Place place5 = new Place(3);
		Place place6 = new Place(3);
		Place place7 = new Place(3);
		Place place8 = new Place(1);

		InputArc iarc2 = new InputArc(2,place5);
		InputArc iarc3 = new InputArc(2,place6);
		InputArc iarc4 = new InputArc(2,place7);

		OutputArc oarc2 = new OutputArc(3,place8);
		
		
		ArrayList<InputArc> ilist2 = new ArrayList<InputArc>();
		ArrayList<OutputArc> olist2 = new ArrayList<OutputArc>();
		ilist2.add(iarc2);
		ilist2.add(iarc3);
		ilist2.add(iarc4);

		olist2.add(oarc2);
		
		Transition t2 = new Transition(ilist2, olist2);
		System.out.println(t2.enabled());
		ArrayList<Transition> transitions2 = new ArrayList<Transition>();
		transitions2.add(t2);
		PetriNet petriNet2 = new PetriNet(transitions2);
		
		System.out.println(petriNet2.toString());
		petriNet2.emulate();
		System.out.println(petriNet2.toString());
		
		
		
		// 
		System.out.println("Test avec 3 InputArc : non tirable");
		
		place5.setTokens(1);
				
		System.out.println(petriNet2.toString());
		petriNet2.emulate();
		System.out.println(petriNet2.toString());		


		// 
		System.out.println("Test avec 1 InputResetArc : tirable");	
		Place resetPlace = new Place(4);
		Place outputPlace = new Place(1);
		
		ResetArc resetArc = new ResetArc(resetPlace);
		OutputArc outputArc = new OutputArc(outputPlace);
		
		ArrayList<InputArc> iResetList = new ArrayList<InputArc>();
		ArrayList<OutputArc> oResetList = new ArrayList<OutputArc>();
		
		iResetList.add(resetArc);
		oResetList.add(outputArc);
		
		
		Transition resetTransition = new Transition(iResetList, oResetList);
		ArrayList<Transition> resetTransitions = new ArrayList<Transition>();
		resetTransitions.add(resetTransition);
		PetriNet resetPetriNet = new PetriNet(resetTransitions);
		
		
		System.out.println(resetPetriNet.toString());
		resetPetriNet.emulate();
		System.out.println(resetPetriNet.toString());	
		
		// 
		System.out.println("Test avec 1 InputResetArc : non tirable");
		
		resetPlace.setTokens(0);
		outputPlace.setTokens(1);
		System.out.println(resetPetriNet.toString());
		resetPetriNet.emulate();
		System.out.println(resetPetriNet.toString());		


		// 
		System.out.println("Test avec 1 InputInhibitorArc : tirable");	
		Place inhibitorPlace = new Place(0);
		Place inhibitorOutputPLace = new Place(1);
				
		InhibitorArc inhibitorArc = new InhibitorArc(inhibitorPlace);
		OutputArc inhibitorOutputArc = new OutputArc(inhibitorOutputPLace);
				
		ArrayList<InputArc> iInhibitorList = new ArrayList<InputArc>();
		ArrayList<OutputArc> oInhibitorList = new ArrayList<OutputArc>();
				
		iInhibitorList.add(inhibitorArc);
		oInhibitorList.add(inhibitorOutputArc);
				
		Transition tzero = new Transition(iInhibitorList, oInhibitorList);
		ArrayList<Transition> transitionszero = new ArrayList<Transition>();
		transitionszero.add(tzero);
		PetriNet inhibitorPetriNet = new PetriNet(transitionszero);
				
		System.out.println(inhibitorPetriNet.toString());
		inhibitorPetriNet.emulate();
		System.out.println(inhibitorPetriNet.toString());	
		
		// 
		System.out.println("Test avec 1 InputArcZero : non tirable");	
		inhibitorPlace.setTokens(2);
		inhibitorOutputPLace.setTokens(1);
				
		System.out.println(inhibitorPetriNet.toString());
		inhibitorPetriNet.emulate();
		System.out.println(inhibitorPetriNet.toString());
		
		
		
	}
}