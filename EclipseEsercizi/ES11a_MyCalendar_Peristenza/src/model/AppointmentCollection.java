package model;

import java.io.Serializable;

/**
 * This class represents a collection of appointments.
 * 
 * @author michelemazzaa
 */
public class AppointmentCollection implements Serializable{

	
	private static final long serialVersionUID = -7893975120652907254L; 
	
	/**
	 * The default growth factor for the inner container.
	 */
	final static int DEFAULT_GROWTH_FACTOR = 2;

	/**
	 * The default physical size for the inner container.
	 */
	final static int DEFAULT_PHYSICAL_SIZE = 10;

	/**
	 * The inner container for storing appointments.
	 */
	private Appointment[] innerContainer;

	/**
	 * The number of appointments in the collection.
	 */
	private int size;

	/**
	 * Constructs an AppointmentCollection with the specified physical size.
	 *
	 * @param physicalSize the physical size of the inner container
	 */
	public AppointmentCollection(int physicalSize) {
		innerContainer = new Appointment[physicalSize];
		size = 0;
	}

	/**
	 * Constructs an AppointmentCollection with the default physical size.
	 */
	public AppointmentCollection() {
		this(DEFAULT_PHYSICAL_SIZE);
	}

	/**
	 * Constructs an AppointmentCollection from an array of appointments.
	 *
	 * @param collection the array of appointments
	 */
	public AppointmentCollection(Appointment[] collection) {
		innerContainer = new Appointment[collection.length];
		size = 0;
		for (int i = 0; i < collection.length; ++i) {

			if (collection[i] != null) {
				innerContainer[size] = collection[i];
				size++;
			}
		}
	}

	/**
	 * Returns the appointment at the specified index.
	 *
	 * @param index the index of the appointment to return
	 * @return the appointment at the specified index, or null if the index is out
	 *         of range
	 */
	public Appointment get(int index) {
		if (index < 0 || index >= size)
			return null;

		return innerContainer[index];
	}

	/**
	 * Adds an appointment to the collection.
	 *
	 * @param app the appointment to add
	 */
	public void add(Appointment app) {
		if (innerContainer.length == size) {
			Appointment[] newContainer = new Appointment[size * DEFAULT_GROWTH_FACTOR];
			for (int i = 0; i < innerContainer.length; i++) {
				newContainer[i] = innerContainer[i];
			}
			innerContainer = newContainer;
		}
		innerContainer[size++] = app;
	}

	/**
	 * Returns the index of the first occurrence of the specified appointment in
	 * this collection, or -1 if this collection does not contain the element.
	 *
	 * @param app the appointment to search for
	 * @return the index of the first occurrence of the specified appointment in
	 *         this collection, or -1 if this collection does not contain the
	 *         element
	 */
	public int indexOf(Appointment app) {
		for (int i = 0; i < size(); i++) {
			if (get(i).equals(app))
				return i;
		}
		return -1;

	}

	/**
	 * Removes the appointment at the specified position in this collection. Shifts
	 * any subsequent elements to the left (subtracts one from their indices).
	 *
	 * @param index the index of the element to be removed
	 */
	public void remove(int index) {
		if (index < 0 || index >= size)
			return;

		for (int i = index; i < size - 1; i++) {
			innerContainer[i] = innerContainer[i + 1];
		}
		size--;
	}

	/**
	 * Returns the number of appointments in this collection.
	 *
	 * @return the number of appointments in this collection
	 */
	public int size() {
		return this.size;
	}
}
