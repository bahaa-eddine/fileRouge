package imt.code;

public class ArcOutTransition extends Arc {

	private Transition source;
	private Place destination;

	public ArcOutTransition(Place destination, Transition source, Integer weight) {
		super(destination, source, weight);
		this.source = source;
		this.destination = destination;
	}

	public Transition getSource() {
		return source;
	}

	public void setSource(Transition source) {
		this.source = source;
	}

	public Place getDestination() {
		return destination;
	}

	public void setDestination(Place destination) {
		this.destination = destination;
	}	

}
