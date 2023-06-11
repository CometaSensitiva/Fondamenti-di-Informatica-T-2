package esempio.ricerca02;

public class Persona implements Comparable<Persona> {

	@SuppressWarnings("unused")
	private String nome, cognome, codiceFiscale;

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = "xxxxxxyymddxxxxu";

	}

	public Persona(String nome, String cognome, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
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
