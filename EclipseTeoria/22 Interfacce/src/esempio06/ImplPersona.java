package esempio06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * 
 * The ImplPersona class is an implementation of the Persona interface. It
 * includes basic information about a person, including their surname, given
 * name, date of birth, and place of birth.
 * 
 * @author michelemazzaa
 */
public class ImplPersona implements Persona {

	private String cognome, nome, luogoDiNascita;
	private LocalDateTime dataDiNascita;

	/**
	 * 
	 * Constructs a new ImplPersona object with the specified parameters.
	 * 
	 * @param cognome        the person's surname
	 * @param nome           the person's given name
	 * @param dataDiNascita  the person's date of birth
	 * @param luogoDiNascita the person's place of birth
	 */
	public ImplPersona(String cognome, String nome, LocalDateTime dataDiNascita, String luogoDiNascita) {
		this.cognome = cognome;
		this.nome = nome;
		this.dataDiNascita = dataDiNascita;
		this.luogoDiNascita = luogoDiNascita;
	}

	@Override
	public String cognome() {
		return cognome;
	}

	@Override
	public String nome() {
		return nome;
	}

	@Override
	public String luogoDiNascita() {
		return luogoDiNascita;
	}

	@Override
	public LocalDateTime dataDiNascita() {
		return dataDiNascita;
	}

	private DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

	/**
	 * 
	 * Returns a string representation of this ImplPersona object. The string
	 * includes the person's full name, place of birth, and date of birth.
	 * 
	 * @return a string representation of this ImplPersona object
	 */
	@Override
	public String toString() {
		return cognome() + " " + nome() + " nato a " + luogoDiNascita() + " il " + dataDiNascita().format(formatter);
	}
}
