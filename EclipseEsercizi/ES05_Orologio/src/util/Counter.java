package util;


public class Counter {
	
	
	private int value;//è this value
	//Costruttori
	public Counter(int value) {this.value=value;}
	public Counter() {this(0);}
	
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
