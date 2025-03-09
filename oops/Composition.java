package incubation.oops;

//-Engine is owned by Car (If the Car is destroyed, Engine is destroyed).
//-Stronger relationship than Aggregation.
class Engine {
    void start() {
        System.out.println("Engine is starting...");
    }
}

class Car2 {
    private Engine engine = new Engine();

    void drive() {
        engine.start(); // Using Engine inside Car
        System.out.println("Car is driving...");
    }
}

public class Composition {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.drive();
    }
}

