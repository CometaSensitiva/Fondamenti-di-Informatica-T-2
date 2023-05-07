package esempio2;

/**
 * A class representing a polygon with a name and vertices.
 *
 * @author michelemazzaa
 */
public class Poligono {

	private String nome;
	private Punto[] vertici;

	/**
	 * Creates a new polygon with the given name and vertices.
	 *
	 * @param nome    the name of the polygon
	 * @param vertici the array of vertices of the polygon
	 */
	public Poligono(String nome, Punto[] vertici) {
		this.nome = nome;
		this.vertici = vertici;
	}

	/**
	 * Returns the name of the polygon.
	 *
	 * @return the name of the polygon
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the number of vertices of the polygon.
	 *
	 * @return the number of vertices of the polygon
	 */
	public int getNumVertici() {
		return vertici.length;
	}

	/**
	 * Returns the array of vertices of the polygon.
	 *
	 * @return the array of vertices of the polygon
	 */
	public Punto[] getVertici() {
		return vertici;
	}

	/**
	 * Returns the Euclidean distance between two points.
	 *
	 * @param p1 the first point
	 * @param p2 the second point
	 * @return the Euclidean distance between the two points
	 */
	private double getDistance(Punto p1, Punto p2) {
		double distance = Math
				.sqrt(Math.pow(Math.abs(p1.getX() - p2.getX()), 2) + Math.pow(Math.abs(p1.getY() - p2.getY()), 2));
		return distance;
	}

	/**
	 * Returns the perimeter of the polygon.
	 *
	 * @return the perimeter of the polygon
	 */
	public double getPerimetro() {
		double perimetro = getDistance(vertici[0], vertici[getNumVertici() - 1]);
		for (int i = 0; i + 1 < getNumVertici(); i++) {
			perimetro += getDistance(vertici[i], vertici[i + 1]);
		}
		return perimetro;
	}

	/**
	 * Returns a string representation of the polygon, including its name, vertices,
	 * and perimeter.
	 *
	 * @return a string representation of the polygon
	 */
	@Override
	public String toString() {
		StringBuilder sPoligono = new StringBuilder();
		sPoligono.append("Nome: " + nome + "\nVertici: ");
		for (int i = 0; i < getNumVertici(); i++) {
			sPoligono.append(vertici[i].toString() + " ");
		}
		sPoligono.append("\nPerimetro: " + this.getPerimetro());
		return sPoligono.toString();
	}
}
