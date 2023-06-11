package mastermind.model;

import java.util.Random;

/**
 * The MasterMind class represents a game of Mastermind.
 * 
 * @author michelemazzaa
 */
public class MasterMind {
	private Combinazione segreta;

	/**
	 * Constructs a new MasterMind object with the specified code length.
	 * 
	 * @param lunghezzaCodice the length of the code for the new MasterMind object
	 */
	public MasterMind(int lunghezzaCodice) {
		segreta = new Combinazione(lunghezzaCodice);
		sorteggiaCombinazione(segreta);
	}

	/**
	 * Calculates the response to the specified attempt.
	 * 
	 * @param tentativo the attempt to calculate the response for
	 * @return the response to the specified attempt
	 */
	public Risposta calcolaRisposta(Combinazione tentativo) {
		Risposta risposta = new Risposta(segreta.dim());
		int numPegsBlack = 0;
		int numPegsWhite = 0;
		int[] occorrenzeTentativo;
		int[] occorrenzeSegreto;

		for (int i = 0; i < segreta.dim(); i++) {
			if (segreta.getPiolo(i).equals(tentativo.getPiolo(i)))
				numPegsBlack++;
		}

		occorrenzeTentativo = occorrenze(tentativo);
		occorrenzeSegreto = occorrenze(segreta);

		for (int j = 0; j < occorrenzeTentativo.length; j++) {
			numPegsWhite += Math.min(occorrenzeTentativo[j], occorrenzeSegreto[j]);
		}
		numPegsWhite -= numPegsBlack;

		for (int i = 0; i < numPegsBlack; i++) {
			risposta.setPiolo(i, PioloRisposta.NERO);
		}
		for (int i = numPegsBlack; i < numPegsWhite + numPegsBlack; i++) {
			risposta.setPiolo(i, PioloRisposta.BIANCO);
		}
		return risposta;
	}

	/**
	 * Returns a string representation of the secret combination.
	 * 
	 * @return a string representation of the secret combination
	 */
	public String combinazioneSegreta() {
		return segreta.toString();
	}

	/**
	 * Calculates the occurrences of each PioloDiGioco object in the specified
	 * combination.
	 * 
	 * @param tentativo the combination to calculate the occurrences for
	 * @return an array of integers representing the occurrences of each
	 *         PioloDiGioco object in the specified combination
	 */
	private int[] occorrenze(Combinazione tentativo) {
		int[] occorrenze = new int[PioloDiGioco.values().length];
		for (int i = 0; i < tentativo.dim(); i++) {
			PioloDiGioco piolo = tentativo.getPiolo(i);
			occorrenze[piolo.ordinal()]++;
		}
		return occorrenze;
	}

	/**
	 * Randomly generates a secret combination.
	 * 
	 * @param segreta the secret combination to generate
	 */
	protected void sorteggiaCombinazione(Combinazione segreta) {
		Random randomIndex = new Random();
		for (int i = 0; i < segreta.dim(); i++) {
			PioloDiGioco piolo = PioloDiGioco.values()[randomIndex.nextInt(6) + 1];
			segreta.setPiolo(i, piolo);
		}
	}

}
