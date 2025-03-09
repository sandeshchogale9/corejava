package incubation.designpatternsproject.behavioral;

//Use Case: When we need multiple interchangeable behaviors (e.g., Different payment methods).

// Step 1: Define Payment Strategy Interface
interface PaymentStrategy {
    void pay(int amount);
}

// Step 2: Implement Different Payment Methods
class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

// Step 3: Use Payment Strategy in OrderService
class PaymentService {
    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(int amount) {
        paymentStrategy.pay(amount);
    }
}

// Test Strategy Pattern
public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentService payment1 = new PaymentService(new CreditCardPayment());
        payment1.processPayment(100);

        PaymentService payment2 = new PaymentService(new PayPalPayment());
        payment2.processPayment(200);
    }
}

