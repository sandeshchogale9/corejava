package incubation.solidprinciples;

//Definition: Software entities should be open for extension, but closed for modification.
//Avoid modifying existing code; instead, extend it.
//
//When to Use?
//When new features need to be added without changing existing code.
//To avoid breaking changes when updating functionality.
public class OpenClosedPrinciple {
    class PaymentProcessor {
        void processPayment(String type) {
            if (type.equals("CreditCard")) { /* Credit Card Logic */ }
            else if (type.equals("UPI")) { /* UPI Logic */ }
        }
    }
    //❌ Problem: Adding new payment methods requires modifying the existing class.


    //✅ After OCP (Fixed using Polymorphism)
    //Now we can extend new payment types without modifying existing code.
    interface Payment {
        void pay();
    }

    class CreditCardPayment implements Payment {
        public void pay() { /* Credit Card Logic */ }
    }

    class UpiPayment implements Payment {
        public void pay() { /* UPI Logic */ }
    }

    class PaymentProcessorUpdated {
        void processPayment(Payment payment) {
            payment.pay();
        }
    }


}
