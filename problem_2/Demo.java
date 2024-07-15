// Demo.java
public class Demo {

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

        scaleShapes(shapes, 2);

        System.out.println("\nAfter scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Shape[] shapes, double factor) {
        for (Shape shape : shapes) {
            if (shape instanceof Scalable) {
                ((Scalable) shape).scale(factor);
            }
        }
    }
}
