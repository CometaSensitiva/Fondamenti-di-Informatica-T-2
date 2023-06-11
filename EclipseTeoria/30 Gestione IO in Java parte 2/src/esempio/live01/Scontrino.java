package esempio.live01;

import java.time.LocalDate;

public class Scontrino {
	private LocalDate data;
	private double importo;

	public Scontrino(LocalDate data, double importo) {
		// Controllo argomenti lo devo fare quì???
		// Object.requiredNotNull(data); lancia NPE al prof Denti piace più
		// IllegalArgument per la semantica delle specifiche javadoc
		/*
		 * if (data == null) throw new
		 * IllegalArgumentException("La data non può essere null"); if
		 * (Double.isFinite(importo)) { throw new
		 * IllegalArgumentException("L'importono non può essere indeterminato o infinito"
		 * ); }
		 */
		this.data = data;
		this.importo = importo;
	}

	public double getImporto() {
		return importo;
	}

	public LocalDate getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Scontrino in data " + Formatters.dateFormatter.format(data) + "per "
				+ Formatters.priceFormatter.format(importo);
	}
}
