package Arc;
import Node.Place;

/**
 *  Inhibitor arc class
 *
 *  @version 1.0
 *  @author Ladislas DELLINGER and Alfred PICHARD
 */
public class InhibitorArc extends InputArc {

	/**
	 * Instantiates a new Inhibitor arc.
	 *
	 * @param place as Place
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
		return "Inhibitor Arc. The corresponding Place owns "+this.getPlace().getTokens()+" Token(s)";
	}

}