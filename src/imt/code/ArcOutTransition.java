package imt.code;

public class ArcOutTransition extends Arc {
	
	private int nodes;

	public ArcOutTransition(Place destination, Transition source, Integer weight) {
		super(destination, source, weight);
		this.setPlace(destination);
		this.setTransition(source);
	}

	@Override
	public void fire() {
		if(isFireable()) {
			setActive(true);
			getPlace().setTokens(getPlace().getTokens() + getWeight());
			getTransition().getIncoming().forEach(arc -> {
				if(!arc.isActive()) {
					if(arc.getPlace().getTokens() <= getWeight()) {
						arc.getPlace().setTokens(0);
					} else {
						arc.getPlace().setTokens(arc.getPlace().getTokens() - arc.getWeight());
					}
				}
			});
		}
		
	}

	@Override
	public boolean isFireable() {
		nodes = 0;
		getTransition().getIncoming().forEach(arc -> {
			if(!arc.isActive())
				nodes += arc.getPlace().getTokens();
		});
		return (nodes <= getWeight() && nodes != 0) ? true : false;
	}	

}
