package Arc;

/**
 * Interface IArc
 *
 * @author Ladislas DELLINGER and Alfred PICHARD
 * @version 1.0
 */
public interface IArc {

	/**
	 * Fire.
	 */
	public void fire();

	/**
	 * Get weight of the arc.
	 *
	 * @return weight of the arc
	 */
	public int getWeight();

	/**
	 * Set weight of the arc.
	 *
	 * @param weight of the arc
	 */
	public void setWeight(int weight);
}