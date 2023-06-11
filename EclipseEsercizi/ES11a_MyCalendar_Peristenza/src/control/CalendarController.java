package control;

import java.time.LocalDate;

import model.Appointment;
import model.AppointmentCollection;

/**
 * 
 * The CalendarController interface defines the contract for classes that
 * provide functionality to manage a calendar and its appointments.
 * <p>
 * @author michelemazzaa
 * </p>
 */
public interface CalendarController {
	/**
	 * Adds an appointment to the calendar.
	 *
	 * @param app the appointment to be added
	 * @return true if the appointment was successfully added
	 */
	public boolean add(Appointment app);

	/**
	 * Adds an appointment to the calendar without saving it.
	 *
	 * @param app the appointment to be added
	 * @return true if the appointment was successfully added
	 */
	public boolean addWithoutSaving(Appointment app);

	/**
	 * Removes an appointment from the calendar.
	 *
	 * @param app the appointment to be removed
	 * @return true if the appointment was successfully removed, false otherwise
	 */
	public boolean remove(Appointment app);

	/**
	 * Removes an appointment from the calendar without saving it.
	 *
	 * @param app the appointment to be removed
	 * @return true if the appointment was successfully removed, false otherwise
	 */
	public boolean removeWithoutSaving(Appointment app);

	/**
	 * Returns a copy of all appointments in the calendar.
	 *
	 * @return a copy of all appointments in the calendar
	 */
	public AppointmentCollection getAllAppointments();

	/**
	 * Returns all appointments in the calendar for a specific day.
	 *
	 * @param d the day for which to retrieve appointments
	 * @return all appointments in the calendar for the specified day
	 */
	public AppointmentCollection getDayAppointments(LocalDate d);

	/**
	 * Returns all appointments in the calendar for a specific week.
	 *
	 * @param w the week for which to retrieve appointments
	 * @return all appointments in the calendar for the specified week
	 */
	public AppointmentCollection getWeekAppointments(LocalDate w);

	/**
	 * Returns all appointments in the calendar for a specific month.
	 *
	 * @param m the month for which to retrieve appointments
	 * @return all appointments in the calendar for the specified month
	 */
	public AppointmentCollection getMonthAppointments(LocalDate m);

}