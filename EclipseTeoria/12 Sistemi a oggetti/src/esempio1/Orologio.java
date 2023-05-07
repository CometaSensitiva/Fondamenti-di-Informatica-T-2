package esempio1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * This class represents a digital clock with hours, minutes, and seconds. It
 * uses three Counter objects to keep track of the time.
 *
 * @author michelemazzaa
 */
public class Orologio {

	private Counter hours;
	private Counter minutes;
	private Counter seconds;

	/**
	 * Constructs a new Orologio object with the specified hours, minutes, and
	 * seconds. If the input values are outside of their valid ranges, they are
	 * adjusted to fit within them.
	 *
	 * @param hours   the initial hours for the clock
	 * @param minutes the initial minutes for the clock
	 * @param seconds the initial seconds for the clock
	 */
	public Orologio(int hours, int minutes, int seconds) {
		if (hours > 24) {
			hours = hours % 24;
		}
		if (minutes > 60) {
			minutes = minutes % 60;
		}
		if (seconds > 60) {
			seconds = seconds % 60;
		}
		this.hours = new Counter(hours);
		this.minutes = new Counter(minutes);
		this.seconds = new Counter(seconds);
	}

	/**
	 * Constructs a new Orologio object with the specified hours and minutes,
	 * setting seconds to 0.
	 *
	 * @param hours   the initial hours for the clock
	 * @param minutes the initial minutes for the clock
	 */
	public Orologio(int hours, int minutes) {
		this(hours, minutes, 0);
	}

	/**
	 * Constructs a new Orologio object with the specified hours, setting minutes
	 * and seconds to 0.
	 *
	 * @param hours the initial hours for the clock
	 */
	public Orologio(int hours) {
		this(hours, 0, 0);
	}

	/**
	 * Constructs a new Orologio object with hours, minutes, and seconds set to 0.
	 */
	public Orologio() {
		this(0, 0, 0);
	}

	/**
	 * Creates a new Orologio object from a string representation in the format
	 * "hh:mm:ss".
	 *
	 * @param hhmmss the string representation of the time
	 * @return a new Orologio object with the specified time
	 */
	public Orologio OrologioFromString(String hhmmss) {
		int separaMS = hhmmss.lastIndexOf(':');
		int separaHM = hhmmss.indexOf(':');
		String hh = hhmmss.substring(0, separaHM);
		String mm = hhmmss.substring(separaHM + 1, separaMS);
		String ss = hhmmss.substring(separaMS + 1);
		int h = Integer.parseInt(hh);
		int m = Integer.parseInt(mm);
		int s = Integer.parseInt(ss);
		return new Orologio(h, m, s);
	}

	/**
	 * Advances the clock by one second, updating the hours, minutes, and seconds
	 * fields if necessary.
	 */
	public void tic() {
		seconds.inc();
		if (seconds.getValue() > 60) {
			seconds.reset();
			minutes.inc();
		}
		if (minutes.getValue() > 60) {
			seconds.reset();
			minutes.reset();
			hours.inc();
		}
		if (hours.getValue() > 24) {
			seconds.reset();
			minutes.reset();
			hours.reset();
		}
	}

	/**
	 * Returns the current value of the hours field.
	 *
	 * @return the current hours value
	 */
	public int getHours() {
		return hours.getValue();
	}

	/**
	 * 
	 * Gets the value of the minutes counter.
	 * 
	 * @return The value of the minutes counter.
	 */
	public int getMinutes() {
		return minutes.getValue();
	}

	/**
	 * 
	 * Gets the value of the seconds counter.
	 * 
	 * @return The value of the seconds counter.
	 */
	public int getSeconds() {
		return seconds.getValue();
	}

	/**
	 * 
	 * Creates and returns a new instance of the {@link Orologio} class that is a
	 * copy of the current instance, with the same hours, minutes, and seconds
	 * values.
	 * 
	 * @return A new instance of the {@link Orologio} class that is a copy of the
	 *         current instance.
	 */
	public Orologio clone() {
		return new Orologio(this.getHours(), this.getMinutes(), this.getSeconds());
	}

	/**
	 * 
	 * Returns a string representation of the current instance of the
	 * {@link Orologio} class in the format "hh:mm:ss", using a {@link LocalTime}
	 * object and a {@link DateTimeFormatter}.
	 * 
	 * @return A string representation of the current instance of the
	 *         {@link Orologio} class in the format "hh:mm:ss".
	 */
	@Override
	public String toString() {
		LocalTime t = LocalTime.of(getHours(), getMinutes(), getSeconds());
		DateTimeFormatter formatterMediumDefault = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		String sOrologio = formatterMediumDefault.format(t);
		return sOrologio;
	}
}
