package esempio4;

import java.io.Serializable;
import java.util.Objects;

/**
 * This class represents a 2D point with x and y coordinates. It implements the
 * Serializable interface to enable object serialization. It overrides
 * hashCode(), equals(), and toString() methods.
 * <p>
 * The class provides methods to get the x and y coordinates of the point. It
 * also overrides hashCode(), equals(), and toString() methods. The
 * serialization version UID is set to 1.
 *
 * @author michelemazzaa
 */
public class Punto2D implements Serializable {
	private float x, y;
	private static final long serialVersionUID = 1;

	/**
	 * Constructs a new Punto2D object with the given x and y coordinates.
	 *
	 * @param xx The x coordinate.
	 * @param yy The y coordinate.
	 */
	public Punto2D(float xx, float yy) {
		x = xx;
		y = yy;
	}

	/**
	 * Returns the x coordinate of the point.
	 *
	 * @return The x coordinate.
	 */
	public float getX() {
		return x;
	}

	/**
	 * Returns the y coordinate of the point.
	 *
	 * @return The y coordinate.
	 */
	public float getY() {
		return y;
	}

	/**
	 * Generates a hash code for the point based on its x and y coordinates.
	 *
	 * @return The generated hash code.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	/**
	 * Checks if this point is equal to the specified object. Two points are
	 * considered equal if their x and y coordinates are equal.
	 *
	 * @param obj The object to compare.
	 * @return {@code true} if the objects are equal, {@code false} otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Punto2D))
			return false;
		Punto2D other = (Punto2D) obj;
		return Float.floatToIntBits(x) == Float.floatToIntBits(other.x)
				&& Float.floatToIntBits(y) == Float.floatToIntBits(other.y);
	}

	/**
	 * Returns a string representation of the point. The string includes the x and y
	 * coordinates of the point.
	 *
	 * @return The string representation of the point.
	 */
	@Override
	public String toString() {
		return "Punto2D [x=" + x + ", y=" + y + "]";
	}
}
