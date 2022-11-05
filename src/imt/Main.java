package imt;

import imt.code.ArcInTransition;
import imt.code.ArcOutTransition;
import imt.code.PetriNet;
import imt.code.Place;
import imt.code.Transition;
import imt.code.Type;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetriNet net = new PetriNet();
		
		Place place_1 = new Place(1);
		Place place_2 = new Place(0);
		Place place_3 = new Place(0);
		
		Transition transition_1 = new Transition();
		Transition transition_2 = new Transition();
		
		ArcInTransition arc_place_1_transition_1 = new ArcInTransition(place_1, transition_1, 1); 
		ArcOutTransition arc_transition_1_place_2 = new ArcOutTransition(place_2, transition_1, 1);
		ArcOutTransition arc_transition_1_place_3 = new ArcOutTransition(place_3, transition_1, 1);
		
		ArcOutTransition arc_place_1_transition_2 = new ArcOutTransition(place_1, transition_2, 2); 
		ArcInTransition arc_transition_2_place_2 = new ArcInTransition(place_2, transition_2, 1);
		ArcInTransition arc_transition_2_place_3 = new ArcInTransition(place_3, transition_2, 1);
		
		transition_1.getIncoming().add(arc_place_1_transition_1);
		transition_1.getOutgoing().add(arc_transition_1_place_2);
		transition_1.getOutgoing().add(arc_transition_1_place_3);
		
		transition_2.getOutgoing().add(arc_place_1_transition_2);
		transition_2.getIncoming().add(arc_transition_2_place_2);
		transition_2.getIncoming().add(arc_transition_2_place_3);
		
		System.out.println(place_1);
		System.out.println(place_2);
		System.out.println(place_3);
		
		System.out.println("Tr : 1");
		transition_1.fire();
		
		System.out.println(place_1);
		System.out.println(place_2);
		System.out.println(place_3);
		
		System.out.println("Tr : 2");
		transition_2.fire();

		System.out.println(place_1);
		System.out.println(place_2);
		System.out.println(place_3);
		
		System.out.println("Tr : 1");
		transition_1.fire();
		
		System.out.println(place_1);
		System.out.println(place_2);
		System.out.println(place_3);
		
		System.out.println("Tr : 2");
		transition_2.fire();

		System.out.println(place_1);
		System.out.println(place_2);
		System.out.println(place_3);
	}

}
