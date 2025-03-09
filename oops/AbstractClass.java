package incubation.oops;

//Abstraction hides implementation details and only shows essential features.
//Reduces complexity.
//Provides flexibility in implementation.
abstract class Abstract1 {
    abstract void start();
}

class Car extends Abstract1 {
    void start() {
        System.out.println("Car starting...");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}

