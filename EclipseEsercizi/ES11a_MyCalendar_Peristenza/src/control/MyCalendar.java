package control;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import model.*;
import persistence.CalendarPersister;

/**
 * This class represents a calendar that can store and manage appointments.
 * 
 * @author michelemazzaa
 */
public class MyCalendar implements CalendarController {
	private AppointmentCollection allAppointments;
	private CalendarPersister persister;

	/**
	 * Constructs a new MyCalendar object with an empty collection of appointments.
	 *
	 * @param persister the CalendarPersister implementation to use for loading and
	 *                  saving appointments.
	 */
	public MyCalendar(CalendarPersister persister) {
		this.allAppointments = new AppointmentCollection();
		this.persister = persister;
		try {
			AppointmentCollection loaded = persister.load();
			for (int i = 0; i < loaded.size(); i++) {
				allAppointments.add(loaded.get(i));
			}
		} catch (NullPointerException e) {
			allAppointments = new AppointmentCollection();
		}
	}

	/**
	 * Constructs a new MyCalendar object with an empty collection of appointments.
	 * This constructor does not take a CalendarPersister implementation, and no
	 * loading of appointments is performed.
	 */
	public MyCalendar() {
		this.allAppointments = new AppointmentCollection();
	}

	/**
	 * Adds an appointment to the calendar.
	 *
	 * @param app the appointment to be added
	 * @return true if the appointment was successfully added
	 */
	public boolean add(Appointment app) {
		allAppointments.add(app);
		saveAll();
		return true;
	}

	/**
	 * Adds an appointment to the calendar without saving it.
	 *
	 * @param app the appointment to be added
	 * @return true if the appointment was successfully added
	 */
	public boolean addWithoutSaving(Appointment app) {
		allAppointments.add(app);
		return true;
	}

	private void saveAll() {
		try {
			persister.save(allAppointments);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Removes an appointment from the calendar.
	 *
	 * @param app the appointment to be removed
	 * @return true if the appointment was successfully removed, false otherwise
	 */
	public boolean remove(Appointment app) {
		if (allAppointments.indexOf(app) > 0) {
			allAppointments.remove(allAppointments.indexOf(app));
			saveAll();
			return true;
		}
		return false;
	}

	/**
	 * Removes an appointment from the calendar without saving it.
	 *
	 * @param app the appointment to be removed
	 * @return true if the appointment was successfully removed, false otherwise
	 */
	public boolean removeWithoutSaving(Appointment app) {
		if (allAppointments.indexOf(app) > 0) {
			allAppointments.remove(allAppointments.indexOf(app));
			return true;
		}
		return false;
	}

	/**
	 * Returns a copy of all appointments in the calendar.
	 *
	 * @return a copy of all appointments in the calendar
	 */
	public AppointmentCollection getAllAppointments() {
		AppointmentCollection copy = new AppointmentCollection(allAppointments.size());
		for (int i = 0; i < allAppointments.size(); i++) {
			copy.add(allAppointments.get(i));
		}
		return copy;
	}

	/**
	 * Returns all appointments in the calendar for a specific day.
	 *
	 * @param d the day for which to retrieve appointments
	 * @return all appointments in the calendar for the specified day
	 */
	public AppointmentCollection getDayAppointments(LocalDate d) {
		LocalDateTime start = LocalDateTime.of(d, LocalTime.of(0, 0));
		LocalDateTime end = LocalDateTime.of(d.plusDays(1), LocalTime.of(0, 0));
		return getAppointmentsIn(start, end);
	}

	/**
	 * Returns all appointments in the calendar for a specific week.
	 *
	 * @param w the week for which to retrieve appointments
	 * @return all appointments in the calendar for the specified week
	 */
	public AppointmentCollection getWeekAppointments(LocalDate w) {
		int daysToSubtract = w.getDayOfWeek().getValue() - DayOfWeek.MONDAY.getValue();
		LocalDate monday = w.minusDays(daysToSubtract);
		LocalDateTime start = LocalDateTime.of(monday, LocalTime.of(0, 0));
		LocalDateTime end = LocalDateTime.of(w.plusWeeks(1), LocalTime.of(0, 0));
		return getAppointmentsIn(start, end);
	}

	/**
	 * Returns all appointments in the calendar for a specific month.
	 *
	 * @param m the month for which to retrieve appointments
	 * @return all appointments in the calendar for the specified month
	 */
	public AppointmentCollection getMonthAppointments(LocalDate m) {
		LocalDateTime start = LocalDateTime.of(m, LocalTime.of(0, 0));
		LocalDateTime end = LocalDateTime.of(m.plusMonths(1), LocalTime.of(0, 0));
		return getAppointmentsIn(start, end);
	}

	/**
	 * Returns all appointments in the calendar that fall within a specific time
	 * range.
	 *
	 * @param start the start of the time range
	 * @param end   the end of the time range
	 * @return all appointments in the calendar that fall within the specified time
	 *         range
	 */
	private AppointmentCollection getAppointmentsIn(LocalDateTime start, LocalDateTime end) {
		AppointmentCollection appointmentsIn = new AppointmentCollection();
		for (int i = 0; i < allAppointments.size(); i++) {
			LocalDateTime refStart = allAppointments.get(i).getFrom();
			LocalDateTime refEnd = allAppointments.get(i).getTo();
			if (isOverlapped(start, end, refStart, refEnd))
				appointmentsIn.add(allAppointments.get(i));
		}
		return appointmentsIn;
	}

	/**
	 * Determines whether two time ranges overlap.
	 *
	 * @param start    the start of the first time range
	 * @param end      the end of the first time range
	 * @param refStart the start of the second time range
	 * @param refEnd   the end of the second time range
	 * @return true if the two time ranges overlap, false otherwise
	 */
	private boolean isOverlapped(LocalDateTime start, LocalDateTime end, LocalDateTime refStart, LocalDateTime refEnd) {
		if (start.isBefore(refStart) && end.isBefore(refStart))
			return false;
		if (start.isAfter(refEnd) && end.isAfter(refEnd))
			return false;
		else
			return true;
	}
}