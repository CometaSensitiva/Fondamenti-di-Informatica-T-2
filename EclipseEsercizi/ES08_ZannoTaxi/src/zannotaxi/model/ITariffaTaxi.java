package zannotaxi.model;

import java.util.Optional;

public interface ITariffaTaxi {
	String getNome();

	double getValoreScatto();

	Optional<Scatto> getScattoCorrente(
			int tempoTrascorsoDaUltimoScatto,
			double spazioPercorsoDaUltimoScatto,
			double costoCorrente);
}
