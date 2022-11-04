package imt.code;

public class ArcInTransition extends Arc {

	public ArcInTransition(Place source, Transition destination, Integer weight) {
		super(source, destination, weight);
		this.setPlace(source);
		this.setTransition(destination);
	}

	@Override
	public void fire() {
		if (isFireable()) {
			getPlace().setTokens(getPlace().getTokens() - getWeight());
			getTransition().getOutgoing().forEach(arc -> {
				arc.getPlace().setTokens(getWeight());
			});
		}
	}

	@Override
	public boolean isFireable() {
		return (getWeight() <= getPlace().getTokens()) ? true : false;
	}
	
	
	

}
