package Arc;
import Node.Place;

/**
 * Reset arc class
 *
 * @version 1.0
 * @author Ladislas DELLINGER and Alfred PICHARD
 */
public class ResetArc extends InputArc {

	/**
	 * Instantiates a new Reset arc.
	 *
	 * @param weight as weight.
	 * @param place  as place.
	 */
	public ResetArc(int weight, Place place) {
		super(weight, place);
	}

	/**
	 * Instantiates a new Reset arc.
	 *
	 * @param place as place.
	 */
	public ResetArc(Place place) {
		super(place);
	}

	/**
	 * Enabled as a boolean.
	 *
	 * @return true if arc is enabled (ie: if there are enough token to fire).
	 */
	public boolean enabled() {
		if(this.getPlace().getTokens()>0) {
			return true;
		}else {
			return false;
		}
	}

	/**
	 * In this case, remove all the tokens from the corresponding place.
	 */
	public void fire() {
		this.getPlace().setTokens(0);
	}

	/**
	 *  toString function.
	 */
	public String toString() {
		return "Reset Arc. The corresponding Place owns "+this.getPlace().getTokens()+" Token(s)";
	}

}