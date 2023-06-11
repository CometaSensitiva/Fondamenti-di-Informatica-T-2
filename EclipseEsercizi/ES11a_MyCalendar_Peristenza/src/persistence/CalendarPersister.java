package persistence;

import java.io.IOException;

import model.AppointmentCollection;

/**
 * 
 * The CalendarPersister interface defines the contract for classes that provide
 * functionality to load and save AppointmentCollection objects.
 * <p>
 * @author michelemazzaa
 * </p>
 */
public interface CalendarPersister {
	/*
	 * Loads an AppointmentCollection object.
	 *
	 * @return The loaded AppointmentCollection object.
	 */
	public AppointmentCollection load();

	/**
	 * Saves an AppointmentCollection object.
	 *
	 * @param app The AppointmentCollection object to be saved.
	 * @throws IOException if an I/O error occurs during the saving process.
	 */
	public void save(AppointmentCollection app) throws IOException;
}
