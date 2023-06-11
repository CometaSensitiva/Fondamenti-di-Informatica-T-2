package mastermind.model;

/**
 * Il Gioco inteso come struttura (dimensioni, tentativi, risposte, etc.)
 * 
 * @author michelemazza
 *
 */
public class Gioco {
	private int dim; //La dimensione della combinazione segreta
	private int maxTentativi;
	private int numTentativi;
	private Risposta[] risposte;
	private Status status;
	private Combinazione[] tentativi;

	public Gioco(int maxTentativi, int dim) {
		this.maxTentativi = maxTentativi;
		this.dim = dim;
		this.numTentativi = 0;
		this.risposte = new Risposta[maxTentativi]; 
		this.status = Status.IN_CORSO;
		this.tentativi = new Combinazione[maxTentativi]; 
	}

	public int dimensione() {
		return dim;
	}

	public int maxTentativi() {
		return maxTentativi;
	}

	public Status stato() {
		return status;
	}

	public int tentativiEffettuati() {
		return numTentativi;
	}

	public int tentativiRimasti() {
		return maxTentativi - numTentativi;
	}

	public Combinazione tentativo(int index) {
		if (index >= numTentativi) {
			System.err.println("Tentativo " + index + " inesistente: l'ultimo è il " + numTentativi);
			return null;
		}
		return tentativi[index];
	}

	public Risposta risposta(int index) {
		if (index >= numTentativi) {
			System.err.println("Risposta " + index + " inesistente: l'ultima è la " + numTentativi);
			return null;
		}
		return risposte[index];
	}

	public Combinazione ultimoTentativo() {
		if (numTentativi == 0)
			return null;
		return tentativo(numTentativi - 1);
	}

	public Risposta ultimaRisposta() {
		if (numTentativi == 0)
			return null;
		return risposta(numTentativi - 1);
	}

	public Status registraMossa(Combinazione tentativo, Risposta risposta) {
		tentativi[numTentativi] = tentativo;
		risposte[numTentativi] = risposta;
		numTentativi++;
		if (risposta.vittoria())
			status = Status.VITTORIA;
		else if (numTentativi < maxTentativi)
			status = Status.IN_CORSO;
		else
			status = Status.PERSO;
		return status;
	}

	public String situazione() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numTentativi; i++) {
			sb.append((i + 1) + ") " + tentativi[i].toString() + "\t\t"
					+ (tentativi[i].toString().length() < 20 ? "\t" : "") + risposte[i].toString()
					+ System.lineSeparator());
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Situazione:" + System.lineSeparator() + situazione() + System.lineSeparator() + "Gioco: " + this.stato()
				+ System.lineSeparator();
	}

}
