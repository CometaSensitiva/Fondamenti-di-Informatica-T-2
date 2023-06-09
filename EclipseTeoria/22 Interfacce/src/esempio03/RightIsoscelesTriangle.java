package esempio03;

/**
 * 
 * This interface represents a right isosceles triangle, which is a triangle
 * that has two sides of equal length and one angle equal to 90 degrees. Since
 * Java does not support multiple inheritance, this interface extends either
 * {@link RightTriangle} or {@link IsoscelesTriangle}. This interface chooses to
 * extend {@link RightTriangle}, as the operations defined by it are more
 * complex than those defined by {@link IsoscelesTriangle}.
 * 
 * @see RightTriangle
 * @see IsoscelesTriangle
 * 
 * @author michelemazzaa
 */
public interface RightIsoscelesTriangle extends RightTriangle, IsoscelesTriangle {

	/**
	 * 
	 * Creates a new instance of a right isosceles triangle with the specified side
	 * length.
	 * 
	 * @param side the length of the sides of the right isosceles triangle
	 * @return a new instance of a right isosceles triangle
	 */
	public static RightIsoscelesTriangle of(double side) {
		return new ImplRightIsoscelesTriangle(side);
	}
}
