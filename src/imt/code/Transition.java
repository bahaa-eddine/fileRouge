package imt.code;

import java.util.ArrayList;
import java.util.List;

public class Transition {
	
    private List<ArcInTransition> incoming = new ArrayList<ArcInTransition>();
    private List<ArcOutTransition> outgoing = new ArrayList<ArcOutTransition>();

	public Transition() {
		super();
	}

    public void fire() {
    		for (ArcInTransition arc : incoming) {
    			arc.fire();
    		}
    		for (ArcOutTransition arc : outgoing) {
    			arc.fire();
    		}
    		resetActivation();
    }

	private void resetActivation() {
		for(ArcInTransition inTransition: incoming) {
			inTransition.setActive(false);
		}
		for(ArcOutTransition inTransition: outgoing) {
			inTransition.setActive(false);
		}
	}

	public List<ArcInTransition> getIncoming() {
		return incoming;
	}

	public void setIncoming(List<ArcInTransition> incoming) {
		this.incoming = incoming;
	}

	public List<ArcOutTransition> getOutgoing() {
		return outgoing;
	}

	public void setOutgoing(List<ArcOutTransition> outgoing) {
		this.outgoing = outgoing;
	}
    
}
