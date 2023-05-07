package frazione;

import util.MyMath;

/**
 * Frazione come tipo di dato astratto (ADT) - Prima Parte
 * 
 * @author Fondamenti di Informatica T-2
 * @version Jan 2022
 */
public class Frazione {
	private int num, den;

	/**
	 * Costruttore della Frazione
	 * 
	 * @param num Numeratore
	 * @param den Denominatore
	 */
	public Frazione(int num, int den) {
		boolean negativo = num * den < 0;
		this.num = negativo ? -Math.abs(num) : Math.abs(num);
		this.den = Math.abs(den);
	}

	/**
	 * Costruttore della Frazione
	 * 
	 * @param num Numeratore
	 */
	public Frazione(int num) {
		this(num, 1);
	}

	/**
	 * Recupera il numeratore
	 * 
	 * @return Numeratore della frazione
	 */
	public int getNum() {
		return num;
	}

	/**
	 * Recupera il denominatore
	 * 
	 * @return Denominatore della frazione
	 */
	public int getDen() {
		return den;
	}

	/**
	 * Calcola la funzione ridotta ai minimi termini.
	 * 
	 * @return Una nuova funzione equivalente all'attuale, ridotta ai minimi
	 *         termini.
	 */
	public Frazione minTerm() {
		if (getNum() == 0)
			return new Frazione(getNum(), getDen());
		int mcd = MyMath.mcd(Math.abs(getNum()), getDen());
		int n = getNum() / mcd;
		int d = getDen() / mcd;
		return new Frazione(n, d);
	}

	public boolean equals(Frazione f) {
		return f.getNum() * getDen() == f.getDen() * getNum();
	}

	public Frazione sum(Frazione f) {
		if (getDen() == f.getDen()) {
			return new Frazione(getNum() + f.getNum(), getDen()).minTerm();
		} else {
			return this.sumWithMcm(f);
		}
	}

	public Frazione sumWithMcm(Frazione f) {
		int mcm = MyMath.mcm(getDen(), f.getDen());
		int n1 = getNum() * (mcm / getDen());
		int n2 = f.getNum() * (mcm / f.getDen());
		return new Frazione(n1 + n2, mcm).minTerm();
	}

	public Frazione sub(Frazione f) {
		if (getDen() == f.getDen()) {
			return new Frazione(getNum() - f.getNum(), getDen()).minTerm();
		} else {
			int mcm = MyMath.mcm(getDen(), f.getDen());
			int n1 = getNum() * (mcm / getDen());
			int n2 = f.getNum() * (mcm / f.getDen());
			return new Frazione(n1 - n2, mcm).minTerm();
		}
	}

	public Frazione mul(Frazione f) {
		return new Frazione(getNum() * f.getNum(), getDen() * f.getDen()).minTerm();
	}

	public Frazione div(Frazione f) {
		return new Frazione(getNum(), getDen()).mul(f.reciprocal());
	}

	public Frazione reciprocal() {
		return new Frazione(getDen(), getNum());
	}

	public int compareTo(Frazione f) {
		if (this.getDouble() == f.getDouble())
			return 0;
		else if (this.getDouble() < f.getDouble())
			return -1;
		else
			return 1;

	}

	public double getDouble() {
		return (double) getNum() / getDen();
	}
	
	public boolean isNegativo() {
		double res = getDouble();
		if(res>=0)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String str = "";
		int num = getNum();
		int den = getDen();
		str += getDen() == 1 ? num : num + "/" + den;
		return str;
	}

}
