package Arc;
/**
 * Interface IArc
 *
 * @version 1.0
 * @author Ladislas DELLINGER and Alfred PICHARD
 */
public interface IArc {
	
	/**
	 * Fire function, see different arc cases.
	 */
	public void fire();
	
	/**
	 * Getter and Setter for weight.
	 */
	public int getWeight();

	public void setWeight(int weight);
}