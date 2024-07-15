/**
 * The {@code Demo} class demonstrates the usage of various shape classes.
 * It creates an array of different shapes and prints their details.
 */
public class Demo {

    /**
     * The main method is the entry point of the application.
     * It creates an array of different shapes and prints their details.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle("Circle1", 5);
        shapes[1] = new Ellipse("Ellipse1", 10, 5);
        shapes[2] = new Triangle("Triangle1", 3, 4, 5);
        shapes[3] = new EquilateralTriangle("EquilateralTriangle1", 6);
        shapes[4] = new Circle("Circle2", 7);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
