package secondaVersione;

/**
 * 
 * The RisultatoDelPartito class represents the result of a political party in
 * an election.
 * 
 * It stores the party name, the number of votes received, and the number of
 * seats obtained.
 * 
 * The class provides methods to retrieve and modify the number of seats.
 * 
 * It also overrides the toString() method to provide a string representation of
 * the party result.
 * 
 * @author michelemazzaa
 */
public class RisultatoDelPartito {
	private String partito;
	private long voti;
	private long seggi;

	/**
	 * 
	 * Constructs a RisultatoDelPartito object with the given party name, votes, and
	 * seats.
	 * 
	 * @param nome  the name of the party
	 * @param voti  the number of votes received by the party
	 * @param seggi the number of seats obtained by the party
	 */
	public RisultatoDelPartito(String nome, long voti, long seggi) {
		this.partito = nome;
		this.voti = voti;
		this.seggi = seggi;
	}

	/**
	 * 
	 * Returns the number of seats obtained by the party.
	 * 
	 * @return the number of seats
	 */
	public long getSeggi() {
		return seggi;
	}

	/**
	 * 
	 * Increments the number of seats obtained by the party by 1.
	 */
	public void incSeggi() {
		this.seggi++;
	}

	/**
	 * 
	 * Sets the number of seats obtained by the party.
	 * 
	 * @param seggi the number of seats
	 */
	public void setSeggi(long seggi) {
		this.seggi = seggi;
	}

	/**
	 * 
	 * Returns the name of the party.
	 * 
	 * @return the party name
	 */
	public String getNome() {
		return partito;
	}

	/**
	 * 
	 * Returns the number of votes received by the party.
	 * 
	 * @return the number of votes
	 */
	public long getVoti() {
		return voti;
	}

	/**
	 * 
	 * Returns a string representation of the party result.
	 * 
	 * @return a string representation of the party result
	 */
	@Override
	public String toString() {
		return partito + ",\tvoti=" + voti + ",\tseggi=" + seggi;
	}
}