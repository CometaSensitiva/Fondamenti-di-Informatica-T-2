package esempio5;

/**
 * The `ImpossibleTriangleException` class represents an exception that is
 * thrown when an impossible triangle is encountered. It extends the
 * `IllegalArgumentException` class.
 * 
 * This exception can be used to handle cases where the sides of a triangle do
 * not satisfy the triangle inequality.
 * 
 * @see IllegalArgumentException
 * @author michelemazzaa
 */
public class ImpossibleTriangleException extends IllegalArgumentException {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new `ImpossibleTriangleException` with no detail message.
	 */
	public ImpossibleTriangleException() {
		super();
	}

	/**
	 * Constructs a new `ImpossibleTriangleException` with the specified detail
	 * message.
	 * 
	 * @param s The detail message.
	 */
	public ImpossibleTriangleException(String s) {
		super(s);
	}
}
