package incubation.designpatternsproject.creational;

//Use Case: Creating complex objects with multiple optional parameters (e.g., User profile, Order object).
class OrderClass {
    private String item;
    private int quantity;
    private String address;

    // Private Constructor
    private OrderClass(OrderBuilder builder) {
        this.item = builder.item;
        this.quantity = builder.quantity;
        this.address = builder.address;
    }

    public static class OrderBuilder {
        private String item;
        private int quantity;
        private String address;

        public OrderBuilder setItem(String item) {
            this.item = item;
            return this;
        }

        public OrderBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public OrderBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public OrderClass build() {
            return new OrderClass(this);
        }
    }

    @Override
    public String toString() {
        return "Order [Item=" + item + ", Quantity=" + quantity + ", Address=" + address + "]";
    }
}

// Test Builder
public class BuilderPatternDemo {
    public static void main(String[] args) {
        OrderClass order = new OrderClass.OrderBuilder()
                .setItem("Laptop")
                .setQuantity(1)
                .setAddress("123 Street, NY")
                .build();
        System.out.println(order);
    }
}

