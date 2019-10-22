package Arc;
import Node.Place;

/**
 *  Input arc class
 *
 *  @version 1.0
 *  @author Ladislas DELLINGER and Alfred PICHARD
 */
public class InputArc implements IArc {
	
	private int weight;
	private Place place;

    /**
     * Instantiates a new Input arc.
     *
     * @param weight as weight
     * @param place  as place
     */
    public InputArc(int weight, Place place) {
		this.weight = weight;
		this.place = place;
	}

    /**
     * Instantiates a new Input arc.
     *
     * @param place as place
     */
    public InputArc(Place place) {
		this(1, place);
	}

    /**
     * Enabled as a boolean.
     *
     * @return true if arc is enabled (ie: if there are enough token to fire)
     */
    public boolean enabled() {
		if(this.getPlace().getTokens()>=this.getWeight()) {
			return true;
		}else {
			return false;
		}
	}

	/**
	 * In this case, remove the right number of tokens from the corresponding place.
	 */
	public void fire() {
		this.getPlace().remove(this.getWeight());
	}

	/**
	 * Get weight of the arc.
	 *
	 * @return weight of the arc
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * Set weight of the arc.
	 *
	 * @param weight of the arc
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * Get place linked to the arc
	 *
	 * @return place
	 */
    public Place getPlace() {
		return place;
	}

	/**
	 * Set place linked to the arc.
	 *
	 * @param place the place linked to the arc
	 */
    public void setPlace(Place place) {
		this.place = place;
	}

	/**
	 * toString function
	 */
	public String toString() {
		return "Input Arc. Weight : "+this.getWeight()+"; The corresponding Place owns "+this.getPlace().getTokens()+" Token(s)";
	}
}