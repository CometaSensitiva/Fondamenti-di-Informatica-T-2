package zannotaxi.model;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Optional;

public class Tassametro implements ITassametro {
	private ITariffaTaxi[] tariffe;
	private FasciaOraria[] fasceOrarie;

	public Tassametro(ITariffaTaxi[] tariffe, FasciaOraria[] fasceOrarie) {
		this.tariffe = Arrays.copyOf(tariffe,tariffe.length);
		this.fasceOrarie = Arrays.copyOf(fasceOrarie,fasceOrarie.length);
	}

	private double getScattoIniziale(LocalTime oraInizioCorsa) {
		for (FasciaOraria fascia : fasceOrarie) {
			if (fascia.contiene(oraInizioCorsa)) {
				return fascia.getCostoScattoIniziale();
			}
		}
		//Non si deve mai arrivare qui
		return Double.NaN; // risultato farlocco..
	}
	
	/* (non-Javadoc)
	 * @see zannotaxi.model.ITassametro#calcolaCostoCorsa(zannotaxi.model.CorsaTaxi)
	 */
	@Override
	public double calcolaCostoCorsa(CorsaTaxi corsa) {
		double[] rilevazioniDistanze = corsa.getRilevazioniDistanze();
		
		double costoVariabile = 0;
		int tempoTrascorsoDaUltimoScatto = 0;
		double spazioPercorsoDaUltimoScatto = 0;
		for (int i = 1; i < rilevazioniDistanze.length; i++) {
			spazioPercorsoDaUltimoScatto += rilevazioniDistanze[i] - rilevazioniDistanze[i - 1];
			tempoTrascorsoDaUltimoScatto++;
			
			Optional<Scatto> optionalScatto = findScatto(
					spazioPercorsoDaUltimoScatto, 
					tempoTrascorsoDaUltimoScatto,
					costoVariabile);
			
			if (optionalScatto.isPresent()) {
				Scatto scatto = optionalScatto.get();
				tempoTrascorsoDaUltimoScatto -= scatto.getTempo();
				spazioPercorsoDaUltimoScatto -= scatto.getSpazio();
				costoVariabile += scatto.getCosto();	
			}
		}
		
		return costoVariabile + getScattoIniziale(corsa.getOraPartenza());
	}

	private Optional<Scatto> findScatto(
			double spazioPercorsoDaUltimoScatto,
			int tempoTrascorsoDaUltimoScatto, 
			double costoCorrente) {
		for (ITariffaTaxi tariffa : tariffe) {
			Optional<Scatto> scatto = tariffa.getScattoCorrente(tempoTrascorsoDaUltimoScatto, 
					spazioPercorsoDaUltimoScatto, 
					costoCorrente);
			if (scatto.isPresent()) return scatto;
		}
		return Optional.empty();
	}
}
