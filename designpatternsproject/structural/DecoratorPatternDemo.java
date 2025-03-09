package incubation.designpatternsproject.structural;

//Use Case: When we need to add behavior dynamically without modifying the existing class.
//Example: Adding discount or logging to a purchase order.

// Base Component
interface Order {
    void processOrder();
}

// Concrete Component
class BasicOrder implements Order {
    public void processOrder() {
        System.out.println("Processing basic order.");
    }
}

// Decorator
class DiscountOrderDecorator implements Order {
    private final Order order;

    public DiscountOrderDecorator(Order order) {
        this.order = order;
    }

    public void processOrder() {
        order.processOrder();
        System.out.println("Applying a 10% discount.");
    }
}

// Test Decorator
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Order order = new DiscountOrderDecorator(new BasicOrder());
        order.processOrder();
        // Output:
        // Processing basic order.
        // Applying a 10% discount.
    }
}

