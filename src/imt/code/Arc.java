package imt.code;

public class Arc {

	private Integer weight = 1;
	private Place place;
	private Transition transition;

	public Arc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Arc(Place place, Transition transition, Integer weight) {
		super();
		this.weight = weight;
		this.place = place;
		this.transition = transition;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public Transition getTransition() {
		return transition;
	}

	public void setTransition(Transition transition) {
		this.transition = transition;
	}

	public void fire() {
		if (isFireable() && isActive() )
			getPlace().setTokens(getPlace().getTokens() - getWeight());
	}

	public boolean isFireable() {
		return getWeight() <= getPlace().getTokens() ? true : false;
	}
	
	private boolean isActive() {
		return (getPlace().getTokens() == 0 ? false : true);
	}

}
