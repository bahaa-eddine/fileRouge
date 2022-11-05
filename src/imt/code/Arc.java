package imt.code;

public abstract class Arc {

	private Integer weight = 1;
	private Place place;
	private Transition transition;
	private boolean active = false;

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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public abstract void fire();
	public abstract boolean isFireable();
	
}
