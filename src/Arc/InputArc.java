package Arc;
import Node.Place;

public class InputArc implements IArc {
	
	private int weight;
	private Place place;
	
	public InputArc(int weight, Place place) {
		this.weight = weight;
		this.place = place;
	}
	
	public InputArc(Place place) {
		this(1, place);
	}

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

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}
	
	public String toString() {
		return "Arc entrant. Poids: "+this.getWeight()+"; Place liée contient "+this.getPlace().getTokens()+" jeton(s)";
	}
}