package matrici;

import java.util.Arrays;

/**
 * Classe come tipo di dato astratto (ADT)
 * 
 * @author michelemazza
 *
 */
public class Matrix {

	private double[][] values;

	/**
	 * Costruttore che inizializza la matrice con i valori forniti.
	 *
	 * @param values matrice di valori double da utilizzare per inizializzare la
	 *               matrice
	 */
	public Matrix(double[][] values) {
		double[][] temp = new double[values.length][values[0].length];
		for (int i = 0; i < values.length; i++)
			for (int k = 0; k < values[0].length; k++)
				temp[i][k] = values[i][k];
		this.values = temp;
	}

	/**
	 * Costruttore privato che inizializza una matrice vuota di dimensioni
	 * specificate.
	 *
	 * @param rows    numero di righe della matrice
	 * @param columns numero di colonne della matrice
	 */
	private Matrix(int rows, int columns) {
		double[][] values = new double[rows][columns];
		this.values = values;
	}

	/**
	 * Metodo privato per impostare il valore di una cella specifica.
	 *
	 * @param value  valore da impostare
	 * @param row    indice della riga della cella
	 * @param column indice della colonna della cella
	 */
	private void setValue(double value, int row, int column) {
		this.values[row][column] = value;
	}

	/**
	 * Metodo per ottenere il numero di righe della matrice.
	 *
	 * @return il numero di righe della matrice
	 */
	public int getRows() {
		return this.values.length;
	}

	/**
	 * Metodo per ottenere il numero di colonne della matrice.
	 *
	 * @return il numero di colonne della matrice
	 */
	public int getCols() {
		return this.values[0].length;
	}

	/**
	 * Metodo per ottenere il valore di una cella specifica.
	 *
	 * @param row    indice della riga della cella
	 * @param column indice della colonna della cella
	 * @return il valore della cella specificata
	 */
	public double getValue(int row, int column) {
		if (row <= this.getRows() && column <= this.getCols())
			return this.values[row][column];
		// Caso border exception
		else
			return Double.NaN;
	}

	/**
	 * Metodo per verificare se la matrice è quadrata.
	 *
	 * @return true se la matrice è quadrata, false altrimenti
	 */
	public boolean isSquared() {
		if (this.getRows() == this.getCols())
			return true;
		else
			return false;
	}

	/**
	 * Metodo per sommare questa matrice con un'altra matrice fornita come
	 * parametro.
	 *
	 * @param m matrice da sommare a questa matrice
	 * @return una nuova matrice che rappresenta la somma delle due matrici
	 */
	public Matrix sum(Matrix m) {
		if (m.getRows() != this.getRows() || m.getCols() != this.getCols())
			return null;
		Matrix res = new Matrix(m.getRows(), m.getCols());
		for (int i = 0; i < m.getRows(); i++)
			for (int k = 0; k < m.getCols(); k++)
				res.setValue(m.getValue(i, k) + this.getValue(i, k), i, k);
		return res;
	}

	/**
	 * Metodo per moltiplicare questa matrice con un'altra matrice fornita come
	 * parametro.
	 *
	 * @param m matrice da moltiplicare per questa matrice
	 * @return una nuova matrice che rappresenta il prodotto delle due matrici
	 */
	public Matrix mul(Matrix m) {
		if (this.getCols() != m.getRows())
			return null;
		Matrix res = new Matrix(this.getRows(), m.getCols());
		for (int i = 0; i < this.getRows(); i++)
			for (int j = 0; j < m.getCols(); j++) {
				double temp = 0;
				for (int k = 0; k < this.getCols(); k++) {
					// è poco leggibile ma non si appoggia alla variabile temporanea
					// res.setValue(res.getValue(i, j) + this.getValue(i, k) * m.getValue(k, j), i,
					// j);
					temp = res.getValue(i, j);
					temp += this.getValue(i, k) * m.getValue(k, j);
					res.setValue(temp, i, j);
				}
			}
		return res;
	}

	/**
	 * Metodo per calcolare il determinante di questa matrice.
	 *
	 * @return il determinante della matrice se è quadrata, altrimenti Double.NaN
	 */
	public double det() {
		if (this.isSquared())
			return this.calcDet();
		return Double.NaN;

	}

	/**
	 * Calcola il determinante della matrice.
	 * 
	 * @return il determinante della matrice.
	 */
	private double calcDet() {
		double res = 0;
		if (this.getRows() == 1 && this.getCols() == 1) {
			return res = this.getValue(0, 0);
		}
		for (int i = 0; i < this.getRows(); i++) {
			res += Math.pow(-1, i) * this.getValue(i, 0) * this.extractMinor(i, 0).calcDet();

		}
		return res;
	}

	/**
	 * Estrae il minore complementare della matrice.
	 * 
	 * @param row    la riga da rimuovere.
	 * @param column la colonna da rimuovere.
	 * @return il minore complementare della matrice.
	 */
	public Matrix extractMinor(int row, int column) {
		if (!this.isSquared() || row >= this.getRows() || column >= this.getCols())
			return null;
		Matrix res = new Matrix(this.getRows() - 1, this.getCols() - 1);
		int resRow = 0;
		for (int i = 0; i < this.getRows(); i++) {
			if (i == row)
				continue;
			int resCol = 0;
			for (int j = 0; j < this.getCols(); j++) {
				if (j == column)
					continue;
				res.setValue(this.getValue(i, j), resRow, resCol);
				resCol++;
			}
			resRow++;
		}
		return res;
	}

	/**
	 * Estrae una sottomatrice dalla matrice corrente.
	 * 
	 * @param startRow la riga di partenza.
	 * @param startCol la colonna di partenza.
	 * @param rowCount il numero di righe da estrarre.
	 * @param colCount il numero di colonne da estrarre.
	 * @return la sottomatrice estratta.
	 */
	public Matrix extractSubMatrix(int startRow, int startCol, int rowCount, int colCount) {
		if (startRow + rowCount > this.getRows() || startCol + colCount > this.getCols())
			return null;
		Matrix res = new Matrix(rowCount, colCount);
		for (int i = 0; i < rowCount; i++)
			for (int j = 0; j < colCount; j++)
				res.setValue(this.getValue(startRow + i, startCol + j), i, j);
		return res;
	}

	/**
	 * Restituisce una rappresentazione in formato stringa della matrice.
	 * 
	 * @return una rappresentazione in formato stringa della matrice.
	 */
	@Override
	public String toString() {
		return Arrays.deepToString(this.values);
	}
}
