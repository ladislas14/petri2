package Arc;
import Node.Place;

/**
 *  Input arc class
 * @version 1.0
 * @author Ladislas DELLINGER & Alfred PICHARD
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
	 * Getter and setter for weight
	 */
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

    /**
     * Getter and Setter for place
     */
    public Place getPlace() {
		return place;
	}

    public void setPlace(Place place) {
		this.place = place;
	}

	/**
	 * toString function
	 */
	public String toString() {
		return "Arc entrant. Poids: "+this.getWeight()+"; Place liée contient "+this.getPlace().getTokens()+" jeton(s)";
	}
}