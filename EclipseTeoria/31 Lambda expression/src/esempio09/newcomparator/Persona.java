package esempio09.newcomparator;

public class Persona {
	private String nome, cognome;
	private int età;

	public Persona(String nome, String cognome, int età) {
		this.nome = nome;
		this.cognome = cognome;
		this.età = età;
	}

	public String getCognome() {
		return cognome;
	}

	public String getNome() {
		return nome;
	}

	public int getEtà() {
		return età;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", età=" + età + "]";
	}

}