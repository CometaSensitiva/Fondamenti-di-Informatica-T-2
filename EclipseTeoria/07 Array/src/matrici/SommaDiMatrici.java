package matrici;

import java.util.Arrays;

/**
 * This class provides a static method to compute the sum of two matrices. The
 * matrices must be represented as two-dimensional arrays of doubles. The
 * matrices can be added only if they have the same number of rows and columns.
 * The resulting matrix is also represented as a two-dimensional array of
 * doubles.
 * 
 * @author michelemazzaa
 */
public class SommaDiMatrici {

	/**
	 * Computes the sum of two matrices.
	 * 
	 * @param m1 the first matrix
	 * @param m2 the second matrix
	 * @return the sum of the two matrices as a two-dimensional array of doubles
	 * @throws IllegalArgumentException if the matrices have different sizes
	 */
	public static double[][] sommaMatrici(double[][] m1, double[][] m2) {
		if (m1.length != m2.length || m1[0].length != m2[0].length) {
			throw new IllegalArgumentException("Matrices must have the same dimensions");
		}
		double[][] m3 = new double[m1.length][m1[0].length];
		for (int i = 0; i < m1.length; i++) {
			for (int k = 0; k < m1[0].length; k++) {
				m3[i][k] = m1[i][k] + m2[i][k];
			}
		}
		return m3;
	}

	/**
	 * Computes the sum of two sample matrices and prints the result to the console.
	 * The matrices are provided as two-dimensional arrays of doubles.
	 * 
	 * @param args the command-line arguments (not used)
	 */
	public static void main(String[] args) {
		double[][] m = { { 1.2, 2.3, 2.3 }, { 7.4, 5.1, 9.8 } };
		double[][] n = { { 5.0, 4.0, 1.3 }, { 1.2, 0.3, 3.2 } };
		double[][] q = sommaMatrici(m, n);
		System.out.println(Arrays.deepToString(q));
	}
}
