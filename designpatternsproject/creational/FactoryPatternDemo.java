package incubation.designpatternsproject.creational;

//Use Case: When we don’t want the client to worry about the object creation logic.
//Example: Creating different types of orders (Regular, Express, Prime).

// Step 1: Define an Order Interface
interface Order {
    void processOrder();
}

// Step 2: Implement Different Order Types
class RegularOrder implements Order {
    public void processOrder() {
        System.out.println("Processing a regular order.");
    }
}

class ExpressOrder implements Order {
    public void processOrder() {
        System.out.println("Processing an express order.");
    }
}

// Step 3: Create Order Factory
class OrderFactory {
    public static Order createOrder(String type) {
        return switch (type) {
            case "regular" -> new RegularOrder();
            case "express" -> new ExpressOrder();
            default -> throw new IllegalArgumentException("Invalid Order Type");
        };
    }
}

// Step 4: Test the Factory
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Order order1 = OrderFactory.createOrder("regular");
        order1.processOrder();

        Order order2 = OrderFactory.createOrder("express");
        order2.processOrder();
    }
}

