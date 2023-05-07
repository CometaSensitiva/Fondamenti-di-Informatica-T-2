package esempio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Persona {

	private String name;
	private String surname;
	private LocalDate birthDay;
	private DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.ITALY);
	public Persona(String name, String surname, LocalDate birthDay) {
		setNameSurname(name, surname);
		setBirthDay(birthDay);
	}

	public Persona(String name, String surname, String birthDay) {
		setNameSurname(name, surname);
		setBirthDay(LocalDate.parse(birthDay, fmt));
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	protected void setNameSurname(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public LocalDate getBirthDay() {
		return this.birthDay;
	}

	protected void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public boolean omonimo(Persona p) {
		return getName().equals(p.getName()) && getSurname().equals(p.getSurname());
	}

	public int olderThan(Persona other) {
		return getBirthDay().isBefore(other.getBirthDay()) ? -1 : getBirthDay().equals(other.getBirthDay()) ? 0 : +1;
	}

	@Override
	public String toString() {
		return "Nome : " + getName() + "\nCognome : " + getSurname() + "\nData di nascita : " + getBirthDay().format(fmt);
	}

}
