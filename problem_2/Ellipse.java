/**
 * The {@code Ellipse} class represents an ellipse shape.
 * It extends the {@code Shape} class and provides implementations
 * for calculating the area and perimeter of the ellipse.
 */
public class Ellipse extends Shape implements Scalable {
    /**
     * The length of the major axis.
     */
    private double a;

    /**
     * The length of the minor axis.
     */
    private double b;

    /**
     * Constructs an {@code Ellipse} with the specified name, major axis, and minor axis.
     * If the provided major axis is less than the minor axis, they are swapped.
     *
     * @param name the name of the ellipse
     * @param a the length of the major axis
     * @param b the length of the minor axis
     */
    public Ellipse(String name, double a, double b) {
        super(name);
        if (a >= b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }

    /**
     * Returns the area of the ellipse.
     *
     * @return the area of the ellipse
     */
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    /**
     * Returns the perimeter of the ellipse.
     *
     * @return the perimeter of the ellipse
     */
    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (a * a + b * b) - (a - b) * (a - b) / 2);
    }

    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
    }
}
