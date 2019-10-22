package Arc;
import Node.Place;

/**
 * The type Output arc.
 */
public class OutputArc implements IArc {
	
	private int weight;
	private Place place;


	/**
	 * Instantiates a new Output arc.
	 *
	 * @param weight the weight
	 * @param place  the place
	 */
	public OutputArc(int weight, Place place) {
		this.weight = weight;
		this.place = place;
	}

	/**
	 * Instantiates a new Output arc.
	 *
	 * @param place the place
	 */
	public OutputArc(Place place) {
		this(1,place);
	}

	public void fire() {
		this.getPlace().give(this.getWeight());

	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
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
		return "Arc sortant. Poids: "+this.getWeight()+"; Place liée contient "+this.getPlace().getTokens()+" jeton(s)";
	}

}