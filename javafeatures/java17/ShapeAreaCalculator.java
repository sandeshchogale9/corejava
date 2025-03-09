package incubation.javafeatures.java17;

// Define a sealed interface Shape
sealed interface Shape permits Circle, Rectangle, Triangle {}

// Define shape implementations as records
record Circle(double radius) implements Shape {}
record Rectangle(double width, double height) implements Shape {}
record Triangle(double base, double height) implements Shape {}

public class ShapeAreaCalculator {
    // Compute the area using pattern matching in switch expression
    static double computeArea(Shape shape) {
        return switch (shape) {
            case Circle c -> Math.PI * c.radius() * c.radius();
            case Rectangle r -> r.width() * r.height();
            case Triangle t -> 0.5 * t.base() * t.height();
        };
    }

    public static void main(String[] args) {
        System.out.println(computeArea(new Circle(5)));      // Output: 78.54
        System.out.println(computeArea(new Rectangle(4, 6))); // Output: 24.0
        System.out.println(computeArea(new Triangle(3, 8)));  // Output: 12.0
    }
}

