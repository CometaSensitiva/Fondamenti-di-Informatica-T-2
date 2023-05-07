package esempio2;

public class Main2 {
	public static void main(String args[]) {
		Real r1 = new Real(18.5F);
		Real r2 = new Real(3.14F);
		Real r;
		Complex c1 = new Complex(-16, 0);
		Complex c2 = new Complex(3, 2);
		Complex c3 = new Complex(0, -2);
		Complex c;
		r = r1.sum(r2);
		c = c1.sum(c2);

		// il reale 21.64
		System.out.println("r1 + r2 = " + r);

		// il complesso -13+2i
		System.out.println("c1 + c2 = " + c);

		// il complesso -13+i
		System.out.println("c1 + c2 -i = " + c.sub(new Complex(0, 1)));

		c = c.sum(c3);

		// il complesso -13+0i
		System.out.println("c + c3 = " + c);

		// POLIMORFISMO: c ora è un reale
		c = r;

		// stampa il reale 21.64
		System.out.println("c = r = " + c);

	}
}
