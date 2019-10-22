package Node;

public class Place {
	private int tokens;

	public Place(int tokens) {
		this.tokens = tokens;
	}

	public Place() {
		this(0);
	}

	public int getTokens() {
		return tokens;
	}

	public void setTokens(int tokens) {
		this.tokens = tokens;
	}
	
	public void give(int tokens) {
		this.setTokens(this.getTokens()+tokens);
	}
	
	public void remove(int tokens) {
		this.setTokens(this.getTokens()-tokens);
	}

}
