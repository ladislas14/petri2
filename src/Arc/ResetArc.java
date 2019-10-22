package Arc;
import Node.Place;

/**
 * The type Reset arc.
 */
public class ResetArc extends InputArc {

	/**
	 * Instantiates a new Reset arc.
	 *
	 * @param weight the weight
	 * @param place  the place
	 */
	public ResetArc(int weight, Place place) {
		super(weight, place);
	}

	/**
	 * Instantiates a new Reset arc.
	 *
	 * @param place the place
	 */
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