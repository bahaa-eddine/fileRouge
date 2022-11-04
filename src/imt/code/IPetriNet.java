package imt.code;

import java.util.List;

public interface IPetriNet {
	
	public void addPlace(Place place);
	public void addTransition(Transition transition);
	public void addArc(Arc arc);
	public void addArcInTransition(Transition transition, Place place, Arc arc);
	public void addArcOutTransition(Transition transition, Place place, Arc arc);

	public void removePlace(Place place);
	public void removeTransition(Transition transition);
	public void removeArc(Arc arc);
	
	public Integer getNbrTokens(Place place);
	public Place setNbrTokens(Place place, Integer token);
	public Integer getWeight(Arc arc);
	public Arc setNbrWeight(Arc arc, Integer weight);
	
	public List<Place> getPlaces();
	public List<Arc> getArcs();
	public List<Transition> getTransitions();

}
