package Arc;
import Node.Place;

public class OutputArc implements IArc {
	
	private int weight;
	private Place place;
	

	public OutputArc(int weight, Place place) {
		this.weight = weight;
		this.place = place;
	}

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

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}
	
	public String toString() {
		return "Arc sortant. Poids: "+this.getWeight()+"; Place liée contient "+this.getPlace().getTokens()+" jeton(s)";
	}

}