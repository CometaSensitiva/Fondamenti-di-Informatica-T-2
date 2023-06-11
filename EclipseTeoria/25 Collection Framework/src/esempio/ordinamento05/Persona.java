package esempio.ordinamento05;

public class Persona implements Comparable<Persona> {

	private String nome, cognome;

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public String nome() {
		return nome;
	}

	public String cognome() {
		return cognome;
	}

	public String toString() {
		return nome + " " + cognome;
	}

	public int compareTo(Persona that) {
		int confrontoCognomi = cognome.compareTo(that.cognome);
		return (confrontoCognomi != 0 ? confrontoCognomi : nome.compareTo(that.nome));
	}
}
