package libreriastatica;

import java.util.Arrays;

/**
 * Classe Matrice come libreria statica
 * 
 * @author michelemazza
 *
 */

public class MatriceLib {
	/**
	 * Somma due matrici.
	 * 
	 * @param m1 la prima matrice da sommare.
	 * @param m2 la seconda matrice da sommare.
	 * @return la matrice risultante dalla somma delle due matrici.
	 */
	public static double[][] sommaMatrici(double[][] m1, double[][] m2) {
		double[][] m3 = new double[m1.length][m1[0].length];
		for (int i = 0; i < m1.length; i++)
			for (int k = 0; k < m1[0].length; k++) {
				m3[i][k] = m1[i][k] + m2[i][k];
			}
		return m3;
	}

	/**
	 * Moltiplica due matrici.
	 * 
	 * @param m1 la prima matrice da moltiplicare.
	 * @param m2 la seconda matrice da moltiplicare.
	 * @return la matrice risultante dal prodotto delle due matrici.
	 */
	public static double[][] prodottoMatrici(double[][] m1, double[][] m2) {
		double[][] m3 = new double[m1.length][m2[0].length];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m2[0].length; j++) {
				for (int k = 0; k < m1[0].length; k++) {
					m3[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		return m3;
	}

	/**
	 * Stampa una matrice.
	 * 
	 * @param m la matrice da stampare.
	 */
	public static void stampaMatrice(double[][] m) {
		System.out.println(Arrays.deepToString(m));
	}
}
