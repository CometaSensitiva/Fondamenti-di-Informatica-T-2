package ticketsosta;

import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * This class represents a Ticket.
 * 
 * @author michelemazzaa
 */
public class Ticket {
	private double costo;
	private LocalTime inizio;
	private LocalTime fine;

	/**
	 * Constructs a new Ticket object with the specified start time, end time and
	 * cost.
	 * 
	 * @param inizio The start time of the ticket.
	 * @param fine   The end time of the ticket.
	 * @param costo  The cost of the ticket.
	 */
	public Ticket(LocalTime inizio, LocalTime fine, double costo) {
		this.inizio = inizio;
		this.fine = fine;
		this.costo = costo;
	}

	/**
	 * Returns the cost of the ticket.
	 * 
	 * @return The cost of the ticket.
	 */
	public double getCosto() {
		return this.costo;
	}

	/**
	 * Returns the start time of the ticket.
	 * 
	 * @return The start time of the ticket.
	 */
	public LocalTime getInizioSosta() {
		return this.inizio;
	}

	/**
	 * Returns the end time of the ticket.
	 * 
	 * @return The end time of the ticket.
	 */
	public LocalTime getFineSosta() {
		return this.fine;
	}

	/**
	 * Returns the cost of the ticket as a formatted string in local currency.
	 * 
	 * @return The cost of the ticket as a formatted string in local currency.
	 */
	public String getCostoAsString() {
		NumberFormat formattatore1 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		String res = formattatore1.format(costo);
		return res;
	}

	/**
	 * Returns a string representation of the given duration in hours and minutes.
	 * 
	 * @param duration The duration to be formatted.
	 * @return A string representation of the given duration in hours and minutes.
	 * 
	 */
	public String toStringDuration(Duration duration) {
		int minuti = duration.toMinutesPart();
		String sDuration;

		if (minuti > 10) {
			sDuration = duration.toHours() + ":" + Integer.toString(minuti) + "h";
		} else {
			sDuration = duration.toHours() + ":0" + Integer.toString(minuti) + "h";
		}

		return sDuration;
	}

	/**
	 * Returns a string representation of the Ticket object.
	 * 
	 * @return A string representation of the Ticket object.
	 * 
	 */
	@Override
	public String toString() {
		StringBuilder sTicket = new StringBuilder();
		DateTimeFormatter formattatoreOrario = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
				.withLocale(Locale.ITALY);

		sTicket.append("Sosta autorizzata \ndalle : ");
		sTicket.append(formattatoreOrario.format(this.inizio));
		sTicket.append(" alle : ");
		sTicket.append(formattatoreOrario.format(this.fine) + "\n");

		sTicket.append("Durata totale : ");
		sTicket.append(toStringDuration(Duration.between(this.inizio, this.fine)) + "\n");

		sTicket.append("Totale pagato : ");
		sTicket.append(getCostoAsString());

		return sTicket.toString();
	}

}
