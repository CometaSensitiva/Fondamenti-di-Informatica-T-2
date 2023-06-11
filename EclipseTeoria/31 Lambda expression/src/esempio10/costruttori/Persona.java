package esempio10.costruttori;

public class Persona {

	private String cognome, nome;
	private int eta;
	private boolean sex;

	public Persona(String nome, String cognome, int eta, boolean sex) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.sex = sex;
	}

	public Persona(String nome, String cognome, int eta) {
		this(nome, cognome, 1, true);
	}

	public Persona(String cognome, String nome) {
		this(nome, cognome, 1);
	}

	public Persona(String cognome) {
		this("boh", cognome, 1);
	}

	public Persona() {
		this("boh", "nnn");
	}

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the eta
	 */
	public int getEta() {
		return eta;
	}

	/**
	 * @return the sex
	 */
	public boolean isSex() {
		return sex;
	}

	@Override
	public String toString() {
		return "Persona [cognome=" + cognome + ", nome=" + nome + ", eta=" + eta + ", sex=" + sex + "]";
	}
}
