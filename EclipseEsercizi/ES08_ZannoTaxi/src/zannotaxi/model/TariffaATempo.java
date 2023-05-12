package zannotaxi.model;

import java.util.Optional;

public class TariffaATempo implements ITariffaTaxi {
	private String nome;
	private double velocitaMinima;
	private double velocitaMassima;
	private double valoreScatto;
	private int tempoDiScatto;

	public TariffaATempo(String nome, double velocitaMinima, double velocitaMassima, 
			double valoreScatto, int tempoDiScatto) {
		this.nome = nome;
		this.velocitaMinima = velocitaMinima;
		this.velocitaMassima = velocitaMassima;
		this.valoreScatto = valoreScatto;
		this.tempoDiScatto = tempoDiScatto;
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
		double velocitaMedia = 3.6 * spazioPercorsoDaUltimoScatto / tempoTrascorsoDaUltimoScatto;
		boolean effettuaScatto = velocitaMinima <= velocitaMedia && 
				velocitaMedia < velocitaMassima && 
				tempoTrascorsoDaUltimoScatto >= tempoDiScatto;
		return effettuaScatto
				? Optional.of(new Scatto(tempoDiScatto, spazioPercorsoDaUltimoScatto, valoreScatto))
				: Optional.empty();
	}
	
	public double getVelocitaMinima() {
		return this.velocitaMinima;
	}
	
	public double getVelocitaMassima() {
		return this.velocitaMassima;
	}
	
	public int getTempoDiScatto() {
		return this.tempoDiScatto;
	}

}
