package incubation.designpatternsproject.structural;

//Use Case: When a class has an incompatible interface, but we need to use it.
//Example: Integrating an old legacy payment system into a new application.

// Old Payment System (Incompatible)
class OldPaymentSystem {
    void processOldPayment(int amount) {
        System.out.println("Processing payment of $" + amount + " using Old System.");
    }
}

// Adapter (Converts OldPaymentSystem into the new format)
class PaymentAdapter {
    private final OldPaymentSystem oldPaymentSystem;

    public PaymentAdapter(OldPaymentSystem oldPaymentSystem) {
        this.oldPaymentSystem = oldPaymentSystem;
    }

    public void processPayment(int amount) {
        oldPaymentSystem.processOldPayment(amount);
    }
}

// Test Adapter Pattern
public class AdapterPatternDemo {
    public static void main(String[] args) {
        PaymentAdapter adapter = new PaymentAdapter(new OldPaymentSystem());
        adapter.processPayment(200);  // Output: Processing payment of $200 using Old System.
    }
}

