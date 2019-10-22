package Arc;
import Node.Place;

/**
 * The type Inhibitor arc.
 */
public class InhibitorArc extends InputArc {

	/**
	 * Instantiates a new Inhibitor arc.
	 *
	 * @param place the place
	 */
	public InhibitorArc(Place place) {
		super(0,place);
	}

	public boolean enabled() {
		if(this.getPlace().getTokens()==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "Arc videur. Place liée contient "+this.getPlace().getTokens()+" jeton(s)";
	}

}