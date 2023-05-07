package counter;

public class Counter {
	//Aggiungi la toString()
	
	private int value;//è this value
	//Costruttori
	public Counter(int value) {this.value=value;}
	public Counter() {this(1);}
	
	//Metodi
	public void reset() {this.value=0;}
	
	public void inc() {this.value++;}
	
	public void inc(int k) {this.value+=k;}
	
	public int getValue() {return this.value;}
	
	public boolean equals(Counter that) {return this.getValue()==that.getValue();}
	
	@Override
	
	public String toString() {
		String res="Valore contatore"+value;
		return res;
	}
}
