package incubation.drykissyagni;

//DRY (Don't Repeat Yourself)
//Definition: Avoid code duplication by reusing logic through functions, classes, or modules.
//Extract reusable logic instead of repeating code.
//Helps reduce bugs, improve maintainability, and make changes easier.
//
//When to Use?
//When you notice duplicate code across multiple places.
//When you need to centralize business logic to avoid inconsistencies.
//Helps in avoiding redundancy and improving scalability.
public class DRYExample {
    //❌ Bad Practice (Violates DRY)
    public class Invoice {
        public double calculateDiscount(double amount) {
            return amount * 0.10;
        }
    }

    public class Order {
        public double calculateDiscount(double amount) {
            return amount * 0.10;
        }
    }


    //Good Practice (DRY Applied)
    public class DiscountService {
        public static double calculateDiscount(double amount) {
            return amount * 0.10;
        }
    }

    public class InvoiceUpdated {
        public double applyDiscount(double amount) {
            return DiscountService.calculateDiscount(amount);
        }
    }

    public class OrderUpdated {
        public double applyDiscount(double amount) {
            return DiscountService.calculateDiscount(amount);
        }
    }


}
