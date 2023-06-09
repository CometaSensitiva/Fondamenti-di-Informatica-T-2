package matrici;

import java.util.Arrays;

/**
 * This class provides a static method to compute the product of two matrices.
 * The matrices must be represented as two-dimensional arrays of doubles. The
 * product is computed using the standard algorithm for matrix multiplication.
 * The resulting matrix is also represented as a two-dimensional array of
 * doubles.
 * 
 * @author michelemazzaa
 */
public class ProdottoDiMatrici {

	/**
	 * Computes the product of two matrices.
	 * 
	 * @param m1 the first matrix
	 * @param m2 the second matrix
	 * @return the product of the two matrices as a two-dimensional array of doubles
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
	 * Computes the product of two sample matrices and prints the result to the
	 * console. The matrices are provided as two-dimensional arrays of doubles.
	 * 
	 * @param args the command-line arguments (not used)
	 */
	public static void main(String[] args) {
		double[][] m = { { 1.4, 4.3, 5.3 }, { 7.4, 5.0, 4.8 } };
		double[][] n = { { 5.0, 3.0 }, { 1.2, 0.6 }, { 0.5, 8.1 } };
		double[][] q = prodottoMatrici(m, n);
		System.out.println(Arrays.deepToString(q));
	}
}
