package persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.AppointmentCollection;

/**
 * 
 * This class implements the CalendarPersister interface and provides
 * functionality to load and save AppointmentCollection objects to a binary
 * file.
 * <p>
 * @author michelemazzaa
 * </p>
 */
public class MyCalendarPersister implements CalendarPersister {
	/*
	 * The file path of the binary file where AppointmentCollection objects are
	 * stored.
	 */
	private String FILE_PATH = "data/appointments.bin";

	/**
	 * Constructs a MyCalendarPersister object.
	 */
	public MyCalendarPersister() {

	}

	/**
	 * Loads an AppointmentCollection object from the binary file.
	 *
	 * @return The loaded AppointmentCollection object.
	 */
	@Override
	public AppointmentCollection load() {
		AppointmentCollection app = null;
		try (FileInputStream fileIn = new FileInputStream(FILE_PATH);
				ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
			app = (AppointmentCollection) objectIn.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error while reading from binary file");
		}
		return app;
	}

	/**
	 * Saves an AppointmentCollection object to the binary file.
	 *
	 * @param app The AppointmentCollection object to be saved.
	 * @throws IOException              if an I/O error occurs during the saving
	 *                                  process.
	 * @throws IllegalArgumentException if the provided AppointmentCollection object
	 *                                  is null.
	 */
	@Override
	public void save(AppointmentCollection app) throws IOException {
		if (app == null) {
			throw new IllegalArgumentException("The AppointmentCollection to be saved to binary file cannot be null");
		}
		try (FileOutputStream f = new FileOutputStream(FILE_PATH);) {
			ObjectOutputStream os = new ObjectOutputStream(f);
			os.writeObject(app);
		} catch (IOException e) {
			System.err.println("Error while writing to binary file");
			e.printStackTrace();
			System.exit(1);
		}
	}
}