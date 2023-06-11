package agenda.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a contact with a name, surname, and a list of details. Implements
 * the Comparable interface to allow sorting contacts based on surname and name.
 * 
 * @author michelemazzaa
 */
public class Contact implements Comparable<Contact> {
	String name, surname;

	private List<Detail> detailList;

	/**
	 * 
	 * Creates a contact with the given name and surname.
	 * 
	 * @param name    the name of the contact
	 * 
	 * @param surname the surname of the contact
	 * 
	 * @throws IllegalArgumentException if the name or surname is null or empty
	 */
	public Contact(String name, String surname) {
		if (name == null || surname == null || name.isEmpty() || surname.isEmpty()) {
			throw new IllegalArgumentException("Invalid arguments to create a contact");
		}
		this.name = name;
		this.surname = surname;
		this.detailList = new ArrayList<>();
	}

	/**
	 * 
	 * Creates a contact with the given name, surname, and detail list.
	 * 
	 * @param name       the name of the contact
	 * 
	 * @param surname    the surname of the contact
	 * 
	 * @param detailList the list of details associated with the contact
	 * 
	 * @throws IllegalArgumentException if the name or surname is null or empty, or
	 *                                  if the detailList is null or empty
	 * 
	 */
	public Contact(String name, String surname, List<Detail> detailList) {
		if (name == null || surname == null || name.isEmpty() || surname.isEmpty() || detailList == null
				|| detailList.isEmpty()) {
			throw new IllegalArgumentException("Invalid arguments to create a contact");
		}
		this.name = name;
		this.surname = surname;
		this.detailList = new ArrayList<>(detailList);
	}

	/**
	 * 
	 * Compares this contact with the specified contact for order. Contacts are
	 * ordered based on surname and then name in a case-insensitive manner.
	 * 
	 * @param o the contact to be compared
	 * 
	 * @return a negative integer, zero, or a positive integer as this contact is
	 *         less than, equal to, or greater than the specified contact
	 * 
	 */
	@Override
	public int compareTo(Contact o) {
		int result = getSurname().trim().compareToIgnoreCase(o.getSurname().trim());
		return result != 0 ? result : getName().trim().compareToIgnoreCase(o.getName().trim());
	}

	/**
	 * 
	 * Retrieves the name of the contact.
	 * 
	 * @return the name of the contact
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * Sets the name of the contact.
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * Retrieves the surname of the contact.
	 * 
	 * @return the surname of the contact
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * 
	 * Sets the surname of the contact.
	 * 
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * 
	 * Retrieves the list of details associated with the contact.
	 * 
	 * @return the list of details
	 */
	public List<Detail> getDetailList() {
		return detailList;
	}

	/**
	 * 
	 * Generates a hash code for this contact based on its detail list, name, and
	 * surname.
	 * 
	 * @return the hash code value for this contact
	 */
	@Override
	public int hashCode() {
		return Objects.hash(detailList, name, surname);
	}

	/**
	 * 
	 * Checks if this contact is equal to the specified object. Two contacts are
	 * considered equal if they have the same detail list, name, and surname.
	 * 
	 * @param obj the object to compare for equality
	 * 
	 * @return true if the contacts are equal, false otherwise
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(detailList, other.detailList) && Objects.equals(name, other.name)
				&& Objects.equals(surname, other.surname);
	}

	/**
	 * 
	 * Generates a string representation of this contact.
	 * 
	 * The string contains the name, surname, and details associated with the
	 * contact.
	 * 
	 * @return a string representation of the contact
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append(" ");
		sb.append(getSurname());
		sb.append("\n");

		for (Detail d : getDetailList()) {
			sb.append(d.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}