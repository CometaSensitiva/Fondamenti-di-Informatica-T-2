package secondaVersione;

/**
 * 
 * The CalcolatoreSeggi class calculates the allocation of seats based on the
 * votes received by each party.
 * 
 * It stores the name of the calculator and a StringBuilder object for logging
 * purposes.
 * 
 * The class provides methods to retrieve the calculator name and the logger.
 * 
 * It also provides a method to calculate the seat allocation given the number
 * of seats to be assigned and an array of party results.
 * 
 * The calculation follows a proportional representation system.
 * 
 * @author michelemazzaa
 */
public class CalcolatoreSeggi {

	private String nome;
	private StringBuilder sb;

	/**
	 * 
	 * Constructs a CalcolatoreSeggi object with the given calculator name and
	 * StringBuilder object for logging.
	 * 
	 * @param nomeCalcolatore the name of the calculator
	 * @param sb              the StringBuilder object for logging
	 * @throws IllegalArgumentException if the calculator name is null, empty, or if
	 *                                  the StringBuilder object is null
	 */
	public CalcolatoreSeggi(String nomeCalcolatore, StringBuilder sb) {
		if (nomeCalcolatore == null || nomeCalcolatore.isEmpty() || sb == null) {
			throw new IllegalArgumentException();
		}
		this.nome = nomeCalcolatore;
		this.sb = sb;
	}

	/**
	 * 
	 * Returns the name of the calculator.
	 * 
	 * @return the calculator name
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * Returns the StringBuilder object used for logging.
	 * 
	 * @return the StringBuilder object
	 */
	public StringBuilder getLogger() {
		return sb;
	}

	/**
	 * 
	 * Calculates the seat allocation based on the given number of seats to be
	 * assigned and an array of party results.
	 * 
	 * The calculation follows a proportional representation system.
	 * 
	 * @param seggiDaAssegnare the number of seats to be assigned
	 * 
	 * @param partiti          an array of party results
	 */
	public void calcolaSeggi(long seggiDaAssegnare, RisultatoDelPartito[] partiti) {
		long votiTotali = getVotiTotali(partiti);
		double quoziente = (double) votiTotali / seggiDaAssegnare;
		sb.setLength(0); // clear the buffer

// Log initial party results
		for (RisultatoDelPartito p : partiti) {
			sb.append(p + System.lineSeparator());
		}
		sb.append("Seggi da assegnare: " + seggiDaAssegnare + System.lineSeparator());
		sb.append("Quoziente elettorale: " + quoziente + System.lineSeparator());

		int seggiAssegnati = 0;
		int indexResti = 0;
		RestoDelPartito[] resti = new RestoDelPartito[partiti.length];

// Calculate initial seat allocation and store remaining votes
		for (RisultatoDelPartito p : partiti) {
			p.setSeggi((long) Math.floor(p.getVoti() / quoziente));
			seggiAssegnati += p.getSeggi();
			resti[indexResti++] = new RestoDelPartito(p.getNome(), (long) (p.getVoti() % quoziente));
		}

		sb.append("Seggi assegnati al primo giro: " + System.lineSeparator());
		for (RisultatoDelPartito p : partiti) {
			sb.append(p + System.lineSeparator());
		}

		sb.append("Resti dopo il primo giro: " + System.lineSeparator());
		for (RestoDelPartito r : resti) {
			sb.append(r + System.lineSeparator());
		}
		sb.append("Seggi ancora da assegnare: " + (seggiDaAssegnare - seggiAssegnati) + System.lineSeparator());
		// Assign remaining seats to parties with the highest remaining votes
		while (seggiDaAssegnare > seggiAssegnati) {
			RestoDelPartito max = trovaMax(resti);
			incSeggiPartito(max.getPartito(), partiti);
			seggiAssegnati++;
			max.azzeraResto();
		}

		sb.append("Seggi assegnati alla fine: " + System.lineSeparator());
		for (RisultatoDelPartito p : partiti) {
			sb.append(p + System.lineSeparator());
		}
	}

	/**
	 * Increments the number of seats for the party with the given name in the given
	 * party results array.
	 * 
	 * @param nomePartito the name of the party
	 * @param risultato   the array of party results
	 */
	public void incSeggiPartito(String nomePartito, RisultatoDelPartito[] risultato) {
		for (RisultatoDelPartito p : risultato) {
			if (p.getNome().equals(nomePartito)) {
				p.incSeggi();
			}
		}
	}

	/**
	 * Calculates the total number of votes from the given party results array.
	 * 
	 * @param partiti the array of party results
	 * @return the total number of votes
	 */
	private long getVotiTotali(RisultatoDelPartito[] partiti) {
		long votiTot = 0;
		for (int i = 0; i < partiti.length; i++) {
			votiTot += partiti[i].getVoti();
		}
		return votiTot;
	}

	/**
	 * Finds the party with the maximum remaining votes from the given array of
	 * remaining parties.
	 * 
	 * @param resti the array of remaining parties
	 * @return the party with the maximum remaining votes
	 */
	private RestoDelPartito trovaMax(RestoDelPartito[] resti) {
		long max = resti[0].getResto();
		int posMax = 0;
		for (int i = 0; i < resti.length; i++) {
			if (resti[i].getResto() > max) {
				max = resti[i].getResto();
				posMax = i;
			}
		}
		return resti[posMax];
	}
}