package model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * The Appointment class represents an appointment with a description, start
 * time, and end time.
 *
 * @author michelemazzaa
 */
public class Appointment {
	private String description;
	private LocalDateTime from;
	private LocalDateTime to;

	/**
	 * Constructs an Appointment object with the specified description, start time,
	 * and end time.
	 *
	 * @param description the description of the appointment
	 * @param from        the start time of the appointment
	 * @param to          the end time of the appointment
	 */
	public Appointment(String description, LocalDateTime from, LocalDateTime to) {
		this.description = description;
		this.from = from;
		this.to = to;
	}

	/**
	 * Constructs an Appointment object with the specified description, start time,
	 * and duration.
	 *
	 * @param description the description of the appointment
	 * @param from        the start time of the appointment
	 * @param durata      the duration of the appointment
	 */
	public Appointment(String description, LocalDateTime from, Duration durata) {
		this.description = description;
		this.from = from;
		this.to = this.from.plus(durata);
	}

	/**
	 * Returns the description of this appointment.
	 *
	 * @return the description of this appointment
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description of this appointment.
	 *
	 * @param description the new description for this appointment
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns the start time of this appointment.
	 *
	 * @return the start time of this appointment
	 */
	public LocalDateTime getFrom() {
		return from;
	}

	/**
	 * Sets the start time of this appointment.
	 *
	 * @param from the new start time for this appointment
	 */
	public void setFrom(LocalDateTime from) {
		this.from = from;
	}

	/**
	 * Returns the end time of this appointment.
	 *
	 * @return the end time of this appointment
	 */
	public LocalDateTime getTo() {
		return to;
	}

	/**
	 * Sets the end time of this appointment.
	 *
	 * @param to the new end time for this appointment
	 */
	public void setTo(LocalDateTime to) {
		this.to = to;
	}

	/**
	 * Returns the duration of this appointment.
	 *
	 * @return the duration of this appointment
	 */
	public Duration getDuration() {
		return Duration.between(from, to);
	}

	/**
	 * Sets the duration of this appointment.
	 *
	 * @param duration the new duration for this appointment
	 */
	public void setDuration(Duration duration) {
		this.to = this.from.plus(duration);
	}

	/**
	 * Determines whether this Appointment object is equal to the specified
	 * Appointment object. Two Appointment objects are considered equal if their
	 * start times, end times, and descriptions are equal.
	 *
	 * @param app the Appointment object to compare to this Appointment object
	 * @return true if this Appointment object is equal to the specified Appointment
	 *         object; false otherwise
	 */
	public boolean equals(Appointment app) {
		return from.equals(app.getFrom()) && to.equals(app.getTo()) && description.equals(app.getDescription());
	}

	/**
	 * Returns a string representation of this Appointment object. The string
	 * representation includes the start time, end time, description, and duration
	 * of the appointment.
	 *
	 * @return a string representation of this Appointment object
	 */
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.MEDIUM);
		StringBuilder sAppointment = new StringBuilder();
		sAppointment.append("Appuntamento da : " + fmt.format(this.getFrom()) + "\na :" + fmt.format(this.getTo()));
		sAppointment.append("\nDescrizione : " + this.getDescription());
		sAppointment.append("\nDurata : " + this.getDuration().toMinutes() + "min.");
		return sAppointment.toString();
	}
}
