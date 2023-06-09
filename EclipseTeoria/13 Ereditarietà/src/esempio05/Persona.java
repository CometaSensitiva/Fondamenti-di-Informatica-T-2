package esempio05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * 
 * This class represents a Person with a name, surname, and birth date.
 * 
 * @author michelemazzaa
 */
public class Persona {

	private String name; // the name of the person
	private String surname; // the surname of the person
	private LocalDate birthDay; // the birth date of the person
	private DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.ITALY);
	// the formatter for the birth date

	/**
	 * 
	 * Constructs a new Person object with the given name, surname, and birth date.
	 * 
	 * @param name     the name of the person
	 * @param surname  the surname of the person
	 * @param birthDay the birth date of the person
	 */
	public Persona(String name, String surname, LocalDate birthDay) {
		setNameSurname(name, surname);
		setBirthDay(birthDay);
	}

	/**
	 * 
	 * Constructs a new Person object with the given name, surname, and birth date
	 * string.
	 * 
	 * @param name     the name of the person
	 * @param surname  the surname of the person
	 * @param birthDay the birth date string of the person (format: dd/MM/yyyy)
	 */
	public Persona(String name, String surname, String birthDay) {
		setNameSurname(name, surname);
		setBirthDay(LocalDate.parse(birthDay, fmt));
	}

	/**
	 * 
	 * Returns the name of the person.
	 * 
	 * @return the name of the person
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * Returns the surname of the person.
	 * 
	 * @return the surname of the person
	 */
	public String getSurname() {
		return this.surname;
	}

	/**
	 * 
	 * Sets the name and surname of the person.
	 * 
	 * @param name    the name of the person
	 * @param surname the surname of the person
	 */
	protected void setNameSurname(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	/**
	 * 
	 * Returns the birth date of the person.
	 * 
	 * @return the birth date of the person
	 */
	public LocalDate getBirthDay() {
		return this.birthDay;
	}

	/**
	 * 
	 * Sets the birth date of the person.
	 * 
	 * @param birthDay the birth date of the person
	 */
	protected void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * 
	 * Returns whether the given person has the same name and surname as this
	 * person.
	 * 
	 * @param p the person to compare with
	 * @return true if the given person has the same name and surname as this
	 *         person, false otherwise
	 */
	public boolean omonimo(Persona p) {
		return getName().equals(p.getName()) && getSurname().equals(p.getSurname());
	}

	/**
	 * 
	 * Compares this person's birth date with another person's birth date.
	 * 
	 * @param other the other person to compare with
	 * @return -1 if this person is older, 0 if both persons have the same age, +1
	 *         if the other person is older
	 */
	public int olderThan(Persona other) {
		return getBirthDay().isBefore(other.getBirthDay()) ? -1 : getBirthDay().equals(other.getBirthDay()) ? 0 : +1;
	}

	/**
	 * 
	 * Returns a string representation of the person's name, surname, and birth
	 * date.
	 * 
	 * @return a string representation of the person's name, surname, and birth date
	 */
	@Override
	public String toString() {
		return "Nome : " + getName() + "\nCognome : " + getSurname() + "\nData di nascita : "
				+ getBirthDay().format(fmt);
	}
}
