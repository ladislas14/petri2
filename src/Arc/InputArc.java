package Arc;
import Node.Place;

/**
 * The type Input arc.
 */
public class InputArc implements IArc {
	
	private int weight;
	private Place place;

    /**
     * Instantiates a new Input arc.
     *
     * @param weight the weight
     * @param place  the place
     */
    public InputArc(int weight, Place place) {
		this.weight = weight;
		this.place = place;
	}

    /**
     * Instantiates a new Input arc.
     *
     * @param place the place
     */
    public InputArc(Place place) {
		this(1, place);
	}

    /**
     * Enabled boolean.
     *
     * @return the boolean
     */
    public boolean enabled() {
		if(this.getPlace().getTokens()>=this.getWeight()) {
			return true;
		}else {
			return false;
		}
	}

	public void fire() {
		this.getPlace().remove(this.getWeight());
	}

	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

    /**
     * Gets place.
     *
     * @return the place
     */
    public Place getPlace() {
		return place;
	}

    /**
     * Sets place.
     *
     * @param place the place
     */
    public void setPlace(Place place) {
		this.place = place;
	}
	
	public String toString() {
		return "Arc entrant. Poids: "+this.getWeight()+"; Place liée contient "+this.getPlace().getTokens()+" jeton(s)";
	}
}