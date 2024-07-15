/**
 * The {@code Shape} class represents an abstract shape with a name.
 * It provides methods to get the area and perimeter of the shape,
 * which must be implemented by subclasses.
 */
public abstract class Shape {
    /**
     * The name of the shape.
     */
    protected String name;

    /**
     * Constructs a {@code Shape} with the specified name.
     *
     * @param name the name of the shape
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * Returns the area of the shape.
     *
     * @return the area of the shape
     */
    public abstract double getArea();

    /**
     * Returns the perimeter of the shape.
     *
     * @return the perimeter of the shape
     */
    public abstract double getPerimeter();

    /**
     * Returns a string representation of the shape, including its name, area, and perimeter.
     *
     * @return a string representation of the shape
     */
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
