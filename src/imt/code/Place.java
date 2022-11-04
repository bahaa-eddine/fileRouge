package imt.code;

public class Place {
	
	private Integer tokens;

	public Place(Integer tokens) {
		super();
		this.tokens = tokens;
	}

	public Integer getTokens() {
		return tokens;
	}

	public void setTokens(Integer tokens) {
		this.tokens = tokens;
	}

	@Override
	public String toString() {
		return "Place [tokens=" + tokens + ", getTokens()=" + getTokens() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
