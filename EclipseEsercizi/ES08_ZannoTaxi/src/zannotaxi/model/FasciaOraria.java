package zannotaxi.model;

import java.time.LocalTime;

public class FasciaOraria {
	double costoScattoIniziale;
	LocalTime inizio;
	LocalTime fine;

	public FasciaOraria(LocalTime inizio, LocalTime fine, double costoScattoIniziale) {
		if (inizio.isAfter(fine) || inizio == null || fine == null) {
			throw new IllegalArgumentException();
		}
		this.inizio = inizio;
		this.fine = fine;
		this.costoScattoIniziale = costoScattoIniziale;
	}

	public double getCostoScattoIniziale() {
		if (this.inizio.isAfter(LocalTime.of(6, 00)) && this.fine.isBefore(LocalTime.of(21, 59))) {
			return 4.00F;
		} else
			return 6.00F;
	}
}
