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
			setActive(true);
			getPlace().setTokens(getPlace().getTokens() - getWeight());
			getTransition().getOutgoing().forEach(arc -> {
				if (!arc.isActive())
					arc.getPlace().setTokens(arc.getPlace().getTokens() + getWeight());
			});
		}
	}

	@Override
	public boolean isFireable() {
		return (getWeight() <= getPlace().getTokens() && getPlace().getTokens()!= 0) ? true : false;
	}
	
	
	

}
