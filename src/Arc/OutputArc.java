package Arc;
import Node.Place;

/**
 *  Output arc class
 *
 *  @version 1.0
 *  @author Ladislas DELLINGER and Alfred PICHARD
 */
public class OutputArc implements IArc {
	
	private int weight;
	private Place place;


	/**
	 * Instantiates a new Output arc.
	 *
	 * @param weight as weight
	 * @param place  as place
	 */
	public OutputArc(int weight, Place place) {
		this.weight = weight;
		this.place = place;
	}

	/**
	 * Instantiates a new Output arc.
	 *
	 * @param place as place
	 */
	public OutputArc(Place place) {
		this(1,place);
	}

	/**
	 * In this case, give the right number of tokens to the corresponding place.
	 */
	public void fire() {
		this.getPlace().add(this.getWeight());

	}

	/**
	 * Getter and setter for weight
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	/**
	 * Getter and setter for place
	 */
	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}
	
	public String toString() {
		return "Output Arc. Weight : "+this.getWeight()+"; The corresponding Place owns "+this.getPlace().getTokens()+" Token(s)";
	}

}