package Node;

/**
 * The type Place.
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
	 * Give.
	 *
	 * @param tokens the tokens
	 */
	public void give(int tokens) {
		this.setTokens(this.getTokens()+tokens);
	}

	/**
	 * Remove.
	 *
	 * @param tokens the tokens
	 */
	public void remove(int tokens) {
		this.setTokens(this.getTokens()-tokens);
	}

}
