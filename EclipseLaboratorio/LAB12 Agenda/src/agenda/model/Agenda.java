package agenda.model;

import java.util.*;

/**
 * Represents an agenda that holds a collection of contacts. Contacts are sorted
 * in the agenda based on their natural order (defined by the Contact class).
 * 
 * @author michelemazzaa
 */
public class Agenda {
	private SortedSet<Contact> contactSet;

	/**
	 * 
	 * Creates an empty agenda.
	 */
	public Agenda() {
		this.contactSet = new TreeSet<>();
	}

	/**
	 * 
	 * Creates an agenda with the given collection of contacts.
	 * 
	 * @param contacts the collection of contacts to initialize the agenda
	 * 
	 * @throws IllegalArgumentException if the contacts collection is null or empty
	 */
	public Agenda(Collection<Contact> contacts) {
		if (contacts == null || contacts.isEmpty()) {
			throw new IllegalArgumentException("The collection passed to create an agenda is null or empty");
		}
		this.contactSet = new TreeSet<>(contacts);
	}

	/**
	 * 
	 * Retrieves the set of contacts in the agenda.
	 * 
	 * @return the set of contacts in the agenda
	 */
	public SortedSet<Contact> getContacts() {
		return contactSet;
	}

	/**
	 * 
	 * Retrieves the contact with the specified first name and second name.
	 * 
	 * @param firstName the first name of the contact to retrieve
	 * 
	 * @param secondName the second name of the contact to retrieve
	 * 
	 * @return an Optional containing the contact if found, or an empty Optional if
	 * not found
	 */
	public Optional<Contact> getContact(String firstName, String secondName) {
		Optional<Contact> result = Optional.empty();
		for (Contact c : contactSet) {
			if (c.getName().equals(firstName) && c.getSurname().equals(secondName)) {
				result = Optional.of(c);
				break;
			}
		}
		return result;
	}

	/**
	 * 
	 * Retrieves the contact at the specified index in the agenda.
	 * 
	 * @param index the index of the contact to retrieve
	 * 
	 * @return an Optional containing the contact if found, or an empty Optional if
	 * not found
	 */
	public Optional<Contact> getContact(int index) {
		List<Contact> list = new ArrayList<>(contactSet);
		Optional<Contact> result = Optional.empty();
		try {
			result = Optional.of(list.get(index));
		} catch (IndexOutOfBoundsException e) {
			// Index is out of bounds, return an empty Optional
		}
		return result;
	}

	/**
	 * 
	 * Searches for contacts in the agenda with the specified surname.
	 * 
	 * @param surname the surname to search for
	 * 
	 * @return a sorted set of contacts with the specified surname
	 */
	public SortedSet<Contact> searchContacts(String surname) {
		SortedSet<Contact> result = new TreeSet<>();
		for (Contact c : contactSet) {
			if (c.getSurname().equals(surname)) {
				result.add(c);
			}
		}
		return result;
	}

	/**
	 * 
	 * Adds a contact to the agenda.
	 * 
	 * @param c the contact to add
	 * 
	 * @throws IllegalArgumentException if the contact is null
	 */
	public void addContact(Contact c) {
		if (c == null) {
			throw new IllegalArgumentException("Cannot add a null contact to the agenda");
		}
		contactSet.add(c);
	}

	/**
	 * 
	 * Removes a contact from the agenda.
	 * 
	 * @param c the contact to remove
	 * 
	 * @throws IllegalArgumentException if the contact is null
	 */
	public void removeContact(Contact c) {
		if (c == null) {
			throw new IllegalArgumentException("Cannot remove a null contact from the agenda");
		}
		contactSet.remove(c);
	}
}
