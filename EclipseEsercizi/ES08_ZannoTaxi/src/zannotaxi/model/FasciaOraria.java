package zannotaxi.model;

import java.time.LocalTime;

public class FasciaOraria {
	private LocalTime inizio;
	private LocalTime fine;
	private double costoScattoIniziale;

	public FasciaOraria(LocalTime inizio, LocalTime fine,
			double costoScattoIniziale) {
		this.inizio = inizio;
		this.fine = fine;
		this.costoScattoIniziale = costoScattoIniziale;
	}

	public double getCostoScattoIniziale() {
		return costoScattoIniziale;
	}

	public boolean contiene(LocalTime time) {
		LocalTime onlyHoursAndMinutesTime = time.withSecond(0).withNano(0);
		return inizio.compareTo(onlyHoursAndMinutesTime) <= 0 && 
				onlyHoursAndMinutesTime.compareTo(fine) <= 0;
	}
}
