package esempio01;

import java.time.LocalDate;

/**
 * The PersonaRecord class represents a person with a name, a surname, and a
 * birth date. This class provides methods to access and manipulate these
 * attributes, as well as to compare and display instances of the class. This
 * class is implemented as a record, which is a special kind of class that is
 * optimized for representing immutable data. Records have a compact syntax for
 * defining their state and automatically generate useful methods like equals(),
 * hashCode(), and toString().
 * 
 * This class was correctly defined and documented by ChatGPT.
 * 
 * @author michelemazzaa
 *
 */
public record PersonaRecord(String nome, String cognome, LocalDate nascita) {

	/**
	 * Returns a new instance of PersonaRecord with the specified name.
	 * 
	 * @param nome the new name to use
	 * @return a new instance of PersonaRecord with the specified name
	 */
	public PersonaRecord withNome(String nome) {
		return new PersonaRecord(nome, this.cognome, this.nascita);
	}

	/**
	 * Returns a new instance of PersonaRecord with the specified surname.
	 * 
	 * @param cognome the new surname to use
	 * @return a new instance of PersonaRecord with the specified surname
	 */
	public PersonaRecord withCognome(String cognome) {
		return new PersonaRecord(this.nome, cognome, this.nascita);
	}

	/**
	 * Returns a new instance of PersonaRecord with the specified birth date.
	 * 
	 * @param nascita the new birth date to use
	 * @return a new instance of PersonaRecord with the specified birth date
	 */
	public PersonaRecord withNascita(LocalDate nascita) {
		return new PersonaRecord(this.nome, this.cognome, nascita);
	}

	/**
	 * Returns a string representation of this PersonaRecord instance.
	 * 
	 * @return a string representation of this PersonaRecord instance
	 */
	@Override
	public String toString() {
		return "PersonaRecord [nome=" + nome + ", cognome=" + cognome + ", nascita=" + nascita + "]";
	}

	/**
	 * Indicates whether some other object is equal to this one.
	 * 
	 * @param obj the object to compare this instance with
	 * @return true if obj is an instance of PersonaRecord and has the same name,
	 *         surname, and birth date as this instance; false otherwise
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PersonaRecord))
			return false;
		PersonaRecord other = (PersonaRecord) obj;
		return cognome.equals(other.cognome) && nascita.equals(other.nascita) && nome.equals(other.nome);
	}

	/**
	 * Returns a hash code for this PersonaRecord instance.
	 * 
	 * @return a hash code for this PersonaRecord instance
	 */
	@Override
	public int hashCode() {
		return nome.hashCode() * 31 + cognome.hashCode() * 31 + nascita.hashCode();
	}
}