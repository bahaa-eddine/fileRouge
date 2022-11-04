package imt.code;

public class ArcInTransition extends Arc {

	private Place source;
	private Transition destination;

	public ArcInTransition(Place source, Transition destination, Integer weight) {
		super(source, destination, weight);
		this.source = source;
		this.destination = destination;
	}

	public Place getSource() {
		return source;
	}

	public void setSource(Place source) {
		this.source = source;
	}

	public Transition getDestination() {
		return destination;
	}

	public void setDestination(Transition destination) {
		this.destination = destination;
	}
	
	

}
