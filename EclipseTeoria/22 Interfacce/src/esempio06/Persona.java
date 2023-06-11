package esempio06;

import java.time.LocalDateTime;

/**
 * 
 * The Persona interface represents a person's basic information, including
 * their surname, given name, date of birth, and place of birth.
 * 
 * @author michelemazzaa
 */
public interface Persona {

	/**
	 * 
	 * Returns the person's surname.
	 * 
	 * @return the person's surname
	 */
	public String cognome();

	/**
	 * 
	 * Returns the person's given name.
	 * 
	 * @return the person's given name
	 */
	public String nome();

	/**
	 * 
	 * Returns the person's date of birth.
	 * 
	 * @return the person's date of birth
	 */
	public LocalDateTime dataDiNascita();

	/**
	 * 
	 * Returns the person's place of birth.
	 * 
	 * @return the person's place of birth
	 */
	public String luogoDiNascita();
}