package incubation.designpatternsproject.creational;

//Use Case: When we need to restrict the creation of multiple instances (e.g., Database connections, Logging).
class OrderService {
    private static OrderService instance;

    private OrderService() {} // Private constructor

    public static OrderService getInstance() {
        if (instance == null) {
            instance = new OrderService();
        }
        return instance;
    }

    public void placeOrder() {
        System.out.println("Order placed successfully.");
    }
}

// Test Singleton
public class SingletonDemo {
    public static void main(String[] args) {
        OrderService orderService1 = OrderService.getInstance();
        OrderService orderService2 = OrderService.getInstance();

        orderService2.placeOrder();

        System.out.println(orderService1 == orderService2); // true (same instance)
    }
}

