package primaVersione;

/**
 * The CalcolatoreSeggi class represents a vote calculator that assigns seats to
 * political parties based on their votes. It provides methods to calculate the
 * allocation of seats.
 *
 * @author michelemazzaa
 */
public class CalcolatoreSeggi {
	private String nome;
	private StringBuilder sb;

	/**
	 * Constructs a CalcolatoreSeggi object with the given name and StringBuilder
	 * for logging.
	 *
	 * @param nomeCalcolatore The name of the vote calculator.
	 * @param sb              The StringBuilder used for logging.
	 * @throws IllegalArgumentException if nomeCalcolatore is null or empty, or sb
	 *                                  is null.
	 */
	public CalcolatoreSeggi(String nomeCalcolatore, StringBuilder sb) {
		if (nomeCalcolatore == null || nomeCalcolatore.isEmpty() || sb == null) {
			throw new IllegalArgumentException();
		}
		this.nome = nomeCalcolatore;
		this.sb = sb;
	}

	/**
	 * Returns the name of the vote calculator.
	 *
	 * @return The name of the vote calculator.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the StringBuilder used for logging.
	 *
	 * @return The StringBuilder used for logging.
	 */
	public StringBuilder getLogger() {
		return sb;
	}

	/**
	 * Calculates the allocation of seats based on the given number of seats to
	 * assign, party names, and votes.
	 *
	 * @param seggiDaAssegnare The number of seats to assign.
	 * @param partiti          The array of party names.
	 * @param voti             The array of votes for each party.
	 * @return An array representing the number of seats assigned to each party.
	 * @throws IllegalArgumentException if seggiDaAssegnare is less than or equal to
	 *                                  zero.
	 */
	public long[] calcolaSeggi(long seggiDaAssegnare, String[] partiti, long[] voti) {
		if (seggiDaAssegnare <= 0) {
			throw new IllegalArgumentException("The number of seats to assign must be greater than zero.");
		}
		long votiTotali = getVotiTotali(voti);
		if (seggiDaAssegnare == 0) {
			throw new IllegalArgumentException("The number of seats to assign cannot be zero.");
		}
		long quozienteElettorale = votiTotali / seggiDaAssegnare;
		int seggiAssegnati = 0;
		long[] seggi = new long[partiti.length];
		long[] resti = new long[partiti.length];
		for (int i = 0; i < partiti.length; i++) {
			seggi[i] = voti[i] / quozienteElettorale;
			seggiAssegnati += seggi[i];
			resti[i] = voti[i] % quozienteElettorale;
		}

		while (seggiDaAssegnare > seggiAssegnati) {
			int posMax = trovaPosMax(resti);
			seggi[posMax]++;
			seggiAssegnati++;
			resti[posMax] = 0;
		}
		return seggi;
	}

	/**
	 * Calculates the total number of votes from the given array of votes.
	 *
	 * @param voti The array of votes for each party.
	 * @return The total number of votes.
	 */
	private long getVotiTotali(long[] voti) {
		long votiTot = 0;
		for (int i = 0; i < voti.length; i++) {
			votiTot += voti[i];
		}
		return votiTot;
	}

	/**
	 * Finds the position of the maximum value in the given array.
	 *
	 * @param resti The array of remainders.
	 * @return The position of the maximum value in the array.
	 */
	private int trovaPosMax(long[] resti) {
		int posMax = 0;
		long max = resti[0];
		for (int i = 1; i < resti.length; i++) {
			if (resti[i] > max) {
				max = resti[i];
				posMax = i;
			}
		}
		return posMax;
	}
}
