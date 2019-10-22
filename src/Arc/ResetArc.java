package Arc;
import Node.Place;

public class ResetArc extends InputArc {

	public ResetArc(int weight, Place place) {
		super(weight, place);
	}

	public ResetArc(Place place) {
		super(place);
	}

	public boolean enabled() {
		if(this.getPlace().getTokens()>0) {
			return true;
		}else {
			return false;
		}
	}

	public void fire() {
		this.getPlace().setTokens(0);
	}
	
	public String toString() {
		return "Arc zéro. Place liée contient "+this.getPlace().getTokens()+" jeton(s)";
	}

}