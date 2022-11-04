package imt.code;

import java.util.ArrayList;
import java.util.List;

public class PetriNet implements IPetriNet {
	
	private List<Place> listPlace = new ArrayList<>();
	private List<Arc> listArc = new ArrayList<>();
	private List<Transition> listTransition = new ArrayList<>();
	
	public PetriNet(List<Place> listPlace, List<Arc> listArc, List<Transition> listTransition) {
		super();
		this.listPlace = listPlace;
		this.listArc = listArc;
		this.listTransition = listTransition;
	}

	@Override
	public void addPlace(Place place) {
		listPlace.add(place);		
	}

	@Override
	public void addTransition(Transition transition) {
		listTransition.add(transition);
	}

	@Override
	public void addArc(Arc arc) {
		listArc.add(arc);
	}

	@Override
	public void addArcInTransition(Transition transition, Place place, Arc arc) {
		transition.getIncoming().add(new ArcInTransition(place, transition, arc.getWeight()));
	}

	@Override
	public void addArcOutTransition(Transition transition, Place place, Arc arc) {
		transition.getOutgoing().add(new ArcOutTransition(place, transition, arc.getWeight()));
		
	}

	@Override
	public void removePlace(Place place) {
		listPlace.remove(place);		
	}

	@Override
	public void removeTransition(Transition transition) {
		listTransition.remove(transition);		
	}

	@Override
	public void removeArc(Arc arc) {
		listArc.remove(arc);		
	}

	@Override
	public Integer getNbrTokens(Place place) {
		return place.getTokens();
	}

	@Override
	public Place setNbrTokens(Place place, Integer token) {
		place.setTokens(token);
		return place;
	}

	@Override
	public Integer getWeight(Arc arc) {
		return arc.getWeight();
	}

	@Override
	public Arc setNbrWeight(Arc arc, Integer weight) {
		arc.setWeight(weight);
		return arc;
	}

	@Override
	public List<Place> getPlaces() {
		return listPlace;
	}

	@Override
	public List<Arc> getArcs() {
		return listArc;
	}

	@Override
	public List<Transition> getTransitions() {
		return listTransition;
	}

}
