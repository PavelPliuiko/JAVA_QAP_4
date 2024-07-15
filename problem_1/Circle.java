/**
 * The {@code Circle} class represents a circle shape.
 * It extends the {@code Ellipse} class, as a circle is a special case of an ellipse
 * where the major and minor axes are equal.
 */
public class Circle extends Ellipse {

    /**
     * Constructs a {@code Circle} with the specified name and radius.
     * The radius is used for both the major and minor axes of the ellipse.
     *
     * @param name the name of the circle
     * @param radius the radius of the circle
     */
    public Circle(String name, double radius) {
        super(name, radius, radius);
    }
}
