package secondaVersione;

/**
 * 
 * The RestoDelPartito class represents the remaining votes of a political party
 * after seat allocation.
 * 
 * It stores the party name and the number of remaining votes.
 * 
 * The class provides methods to retrieve and modify the remaining votes.
 * 
 * It also overrides the toString() method to provide a string representation of
 * the party's remaining votes.
 * 
 * @author michelemazzaa
 */
public class RestoDelPartito {
	private String partito;
	private long resto;

	/**
	 * 
	 * Constructs a RestoDelPartito object with the given party name and remaining
	 * votes.
	 * 
	 * @param partito the name of the party
	 * @param resto   the number of remaining votes
	 */
	public RestoDelPartito(String partito, long resto) {
		this.partito = partito;
		this.resto = resto;
	}

	/**
	 * 
	 * Returns the name of the party.
	 * 
	 * @return the party name
	 */
	public String getPartito() {
		return partito;
	}

	/**
	 * 
	 * Returns the number of remaining votes for the party.
	 * 
	 * @return the number of remaining votes
	 */
	public long getResto() {
		return resto;
	}

	/**
	 * 
	 * Sets the remaining votes for the party to 0.
	 */
	public void azzeraResto() {
		resto = 0;
	}

	/**
	 * 
	 * Returns a string representation of the party's remaining votes.
	 * 
	 * @return a string representation of the party's remaining votes
	 */
	@Override
	public String toString() {
		return "RestoDelPartito [partito=" + partito + ", resto=" + resto + "]";
	}
}
