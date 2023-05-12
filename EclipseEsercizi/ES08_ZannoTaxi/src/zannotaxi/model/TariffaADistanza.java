package zannotaxi.model;

import java.util.Optional;

public class TariffaADistanza implements ITariffaTaxi {

	private String nome;
	private double velocitaMinima;
	private double velocitaMassima;
	private double costoMinimo;
	private double costoMassimo;
	private double valoreScatto;
	private double distanzaDiScatto;

	public TariffaADistanza(String nome, double velocitaMinima,
			double velocitaMassima, double costoMinimo, double costoMassimo,
			double valoreScatto, double distanzaDiScatto) {		
		this.nome = nome;
		this.velocitaMinima = velocitaMinima;
		this.velocitaMassima = velocitaMassima;
		this.costoMinimo = costoMinimo;
		this.costoMassimo = costoMassimo;
		this.valoreScatto = valoreScatto;
		this.distanzaDiScatto = distanzaDiScatto;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public double getValoreScatto() {
		return valoreScatto;
	}

	@Override
	public Optional<Scatto> getScattoCorrente(int tempoTrascorsoDaUltimoScatto,
			double spazioPercorsoDaUltimoScatto, double costoCorrente) {

		double velocitaMedia = 3.6 * spazioPercorsoDaUltimoScatto
				/ tempoTrascorsoDaUltimoScatto;
		boolean effettuaScatto = velocitaMinima <= velocitaMedia
				&& velocitaMedia < velocitaMassima
				&& costoMinimo <= costoCorrente && costoCorrente < costoMassimo
				&& Math.round(spazioPercorsoDaUltimoScatto) >= distanzaDiScatto;
		return effettuaScatto
				? Optional.of(new Scatto(tempoTrascorsoDaUltimoScatto, distanzaDiScatto, valoreScatto))
				: Optional.empty();
	}

	public double getVelocitaMinima() {
		return this.velocitaMinima;
	}

	public double getVelocitaMassima() {
		return this.velocitaMassima;
	}

	public double getCostoMinimo() {
		return this.costoMinimo;
	}

	public double getCostoMassimo() {
		return this.costoMassimo;
	}

	public double getDistanzaDiScatto() {
		return this.distanzaDiScatto;
	}

}
