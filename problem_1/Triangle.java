/**
 * The {@code Triangle} class represents a triangle shape.
 * It extends the {@code Shape} class and provides implementations
 * for calculating the area and perimeter of the triangle.
 */
public class Triangle extends Shape {
    /**
     * The length of the first side of the triangle.
     */
    private final double side1;

    /**
     * The length of the second side of the triangle.
     */
    private final double side2;

    /**
     * The length of the third side of the triangle.
     */
    private final double side3;

    /**
     * Constructs a {@code Triangle} with the specified name and side lengths.
     * Validates that the given sides can form a triangle.
     *
     * @param name the name of the triangle
     * @param side1 the length of the first side
     * @param side2 the length of the second side
     * @param side3 the length of the third side
     * @throws IllegalArgumentException if the sides cannot form a valid triangle
     */
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Invalid sides for a triangle");
        }
    }

    /**
     * Checks if the given sides can form a valid triangle.
     *
     * @param side1 the length of the first side
     * @param side2 the length of the second side
     * @param side3 the length of the third side
     * @return {@code true} if the sides form a valid triangle, {@code false} otherwise
     */
    private boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2);
    }

    /**
     * Returns the area of the triangle using Heron's formula.
     *
     * @return the area of the triangle
     */
    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * Returns the perimeter of the triangle.
     *
     * @return the perimeter of the triangle
     */
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
