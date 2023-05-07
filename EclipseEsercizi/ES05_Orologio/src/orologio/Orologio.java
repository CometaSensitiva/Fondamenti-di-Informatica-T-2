package orologio;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import util.Counter;

public class Orologio {
	private Counter hours, minutes, seconds;

	public Orologio(int hours, int minutes, int seconds) {
		if (hours > 24)
			hours = hours % 24;
		if (minutes > 60)
			minutes = minutes % 60;
		if (seconds > 60)
			seconds = seconds % 60;
		this.hours = new Counter(hours);
		this.minutes = new Counter(minutes);
		this.seconds = new Counter(seconds);
	}
	public Orologio(LocalTime now) {
		this(now.getHour(),now.getMinute(),now.getSecond());

	}

	public Orologio(int hours, int minutes) {
		this(hours, minutes, 0);
	}

	public Orologio(int hours) {
		this(hours, 0, 0);
	}

	public Orologio() {
		this(0, 0, 0);
	}

	// ipotesi: campi separati da ':'
	public Orologio OrologioFromString(String hhmmss) {
		int separaMS = hhmmss.lastIndexOf(':');
		int separaHM = hhmmss.indexOf(':');
		String hh = hhmmss.substring(0, separaHM);
		String mm = hhmmss.substring(separaHM + 1, separaMS);
		String ss = hhmmss.substring(separaMS);
		int h = Integer.parseInt(hh);
		int m = Integer.parseInt(mm);
		int s = Integer.parseInt(ss);
		return new Orologio(h, m, s);
	}

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

	public int getHours() {
		return hours.getValue();
	}

	public int getMinutes() {
		return minutes.getValue();
	}

	public int getSeconds() {
		return seconds.getValue();
	}

	public Orologio clone() {
		return new Orologio(this.getHours(), this.getMinutes(), this.getSeconds());

	}

	@Override
	public String toString() {
		LocalTime t = LocalTime.of(getHours(), getMinutes(), getSeconds());
		DateTimeFormatter formatterMediumDefault = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		String sOrologio = formatterMediumDefault.format(t);
		return sOrologio;
	}
}
