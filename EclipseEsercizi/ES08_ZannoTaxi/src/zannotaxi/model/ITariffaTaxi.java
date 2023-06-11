package zannotaxi.model;

public interface ITariffaTaxi {
	public String getNome();
	public Optional<Scatto> getScattoCorrente(int costo, double tempo, double spazio){
		
	}
}
