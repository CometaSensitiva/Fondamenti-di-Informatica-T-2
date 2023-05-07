package ticketsosta;

/**
 * This class represents a Tariffa with a name, hourly rate, franchise minutes
 * and minimum duration.
 * 
 * @author michelemazzaa
 */
public class Tariffa {
	private String nome;
	private double tariffaOraria;
	private int minutiFranchigia, durataMinima;

	/**
	 * Constructs a new Tariffa object with the specified name, hourly rate,
	 * franchise minutes and minimum duration.
	 *
	 * @param nome             the name of the Tariffa
	 * @param tariffaOraria    the hourly rate of the Tariffa
	 * @param minutiFranchigia the number of franchise minutes for the Tariffa
	 * @param durataMinima     the minimum duration for the Tariffa
	 */
	public Tariffa(String nome, double tariffaOraria, int minutiFranchigia, int durataMinima) {
		super();
		this.nome = nome;
		this.tariffaOraria = tariffaOraria;
		this.minutiFranchigia = minutiFranchigia;
		this.durataMinima = durataMinima;
	}

	/**
	 * Returns the name of the Tariffa
	 *
	 * @return the name of the Tariffa
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the hourly rate of the Tariffa
	 *
	 * @return the hourly rate of the Tariffa
	 */
	public double getTariffaOraria() {
		return tariffaOraria;
	}

	/**
	 * Returns the number of franchise minutes for the Tariffa
	 *
	 * @return the number of franchise minutes for the Tariffa
	 */
	public int getMinutiFranchigia() {
		return minutiFranchigia;
	}

	/**
	 * Returns the minimum duration for the Tariffa
	 *
	 * @return the minimum duration for the Tariffa
	 */
	public int getDurataMinima() {
		return durataMinima;
	}

	/**
	 * Returns a string representation of the Tariffa object.
	 *
	 * @return a string representation of the Tariffa object
	 */
	@Override
	public String toString() {
		String sTariffa = "Tariffa " + nome + ", tariffa oraria=" + tariffaOraria + ", minuti franchigia="
				+ minutiFranchigia + ", durata minima=" + durataMinima;
		return sTariffa;
	}

}
