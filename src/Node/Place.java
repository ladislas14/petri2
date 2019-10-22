package Node;

/**
 * Implementation of the places of the PetriNet.
 *
 * <p>
 *     A place is a type of node in a PetriNet.
 * </p>
 *
 * <p>
 *     <b><i>Remark : we made the choice, contrary to what we made in the class diagram, to not create a {@code Token} class but just use a {@code int} to simplify the implementation.</i></b>
 * </p>
 * @version 1.0
 * @author Ladislas DELLINGER and Alfred PICHARD
 */
public class Place {
	private int tokens;

	/**
	 * Instantiates a new Place.
	 *
	 * @param tokens the tokens
	 */
	public Place(int tokens) {
		this.tokens = tokens;
	}

	/**
	 * Instantiates a new Place.
	 *
	 * <p>
	 *     Second constructor to instantiate a new empty Place.
	 * </p>
	 */
	public Place() {
		this(0);
	}

	/**
	 * Gets tokens.
	 *
	 * @return the tokens
	 */
	public int getTokens() {
		return tokens;
	}

	/**
	 * Sets tokens.
	 *
	 * @param tokens the tokens
	 */
	public void setTokens(int tokens) {
		this.tokens = tokens;
	}

	/**
	 * Add the number of token given in param.
	 *
	 * @param tokens the tokens
	 */
	public void add(int tokens) {
		this.setTokens(this.getTokens()+tokens);
	}

	/**
	 * Remove the number of token given in param.
	 *
	 * @param tokens the tokens
	 */
	public void remove(int tokens) {
		this.setTokens(this.getTokens()-tokens);
	}

}
