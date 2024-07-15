/**
 * The {@code EquilateralTriangle} class represents an equilateral triangle shape.
 * It extends the {@code Triangle} class, as an equilateral triangle is a special case of a triangle
 * where all three sides are equal.
 */
public class EquilateralTriangle extends Triangle {

    /**
     * Constructs an {@code EquilateralTriangle} with the specified name and side length.
     * The same side length is used for all three sides of the triangle.
     *
     * @param name the name of the equilateral triangle
     * @param side the length of each side of the equilateral triangle
     */
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }
}
