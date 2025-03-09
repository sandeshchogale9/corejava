package incubation.javafeatures.java21;

public class PatternMatchingSwitchCase {
    void printValue8(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println("String: " + str);
        } else if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            System.out.println("Integer: " + num);
        }
    }

    void printValue17(Object obj) {
        switch (obj) {
            case String s -> System.out.println("String: " + s);
            case Integer i -> System.out.println("Integer: " + i);
            default -> System.out.println("Other type: " + obj);
        }
    }

    //switch doesn't accept null directly.
    //Handle it separately.
    void process(Object obj) {
        switch (obj) {
            case null -> System.out.println("Null value detected!");
            case String s -> System.out.println("It's a String: " + s);
            case Integer i -> System.out.println("It's an Integer: " + i);
            default -> System.out.println("Unknown type");
        }
    }

    //We can add conditions (guards) using when.
    void processNumber(Number num) {
        switch (num) {
            case Integer i when i > 100 -> System.out.println("Large Integer: " + i);
            case Integer i -> System.out.println("Small Integer: " + i);
            case Double d -> System.out.println("Double: " + d);
            default -> System.out.println("Unknown Number Type");
        }
    }

    //Pattern matching is powerful when used with Records & Sealed Classes.
    //
    //Using sealed classes:
    sealed interface Shape permits Circle, Rectangle {}

    record Circle(double radius) implements Shape {}

    record Rectangle(double length, double width) implements Shape {}

    void processShape(Shape shape) {
        switch (shape) {
            case Circle c -> System.out.println("Circle with radius: " + c.radius());
            case Rectangle r when r.length() == r.width() -> System.out.println("Square with side: " + r.length());
            case Rectangle r -> System.out.println("Rectangle: " + r.length() + " x " + r.width());
        }
    }





}
