package imt.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import imt.code.ArcInTransition;
import imt.code.ArcOutTransition;
import imt.code.Place;
import imt.code.Transition;

public class ExampleTest {
	
	Place place_1;
	Place place_2;
	Place place_3;
	
	Transition transition_1;
	Transition transition_2;
	
	@Before
	public void initPetriData() {
		place_1 = new Place(1);
		place_2 = new Place(0);
		place_3 = new Place(0);
		
		transition_1 = new Transition();
		transition_2 = new Transition();
		
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
	}
	
	@Test
	public void testInitialValueInPetriNet() {
		assertEquals(place_1.getTokens().intValue(), 1);
		assertEquals(place_2.getTokens().intValue(), 0);
		assertEquals(place_3.getTokens().intValue(), 0);
	}

	@Test
	public void applyTransition1OnPetriNet() {
		transition_1.fire();
		assertEquals(place_1.getTokens().intValue(), 0);
		assertEquals(place_2.getTokens().intValue(), 1);
		assertEquals(place_3.getTokens().intValue(), 1);
	}
	
	@Test
	public void applyTransition2OnPetriNet() {
		transition_2.fire();
		assertEquals(place_1.getTokens().intValue(), 1);
		assertEquals(place_2.getTokens().intValue(), 0);
		assertEquals(place_3.getTokens().intValue(), 0);
	}
	
	@Test
	public void applyTransition2AfterTransition1OnPetriNet() {
		transition_1.fire();
		assertEquals(place_1.getTokens().intValue(), 0);
		assertEquals(place_2.getTokens().intValue(), 1);
		assertEquals(place_3.getTokens().intValue(), 1);
		transition_2.fire();
		assertEquals(place_1.getTokens().intValue(), 2);
		assertEquals(place_2.getTokens().intValue(), 0);
		assertEquals(place_3.getTokens().intValue(), 0);
	}

}
