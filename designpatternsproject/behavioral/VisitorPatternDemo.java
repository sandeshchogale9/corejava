package incubation.designpatternsproject.behavioral;

//Use Case: When we want to add new operations to existing classes without modifying them.
//Example: Calculating tax for different products without modifying the Product class.

// Visitor Interface
interface TaxVisitor {
    void visit(Book book);
    void visit(Electronics electronics);
}

// Concrete Visitor: Tax Calculator
class TaxCalculator implements TaxVisitor {
    public void visit(Book book) {
        System.out.println("Book Tax: " + book.getPrice() * 0.05);
    }
    public void visit(Electronics electronics) {
        System.out.println("Electronics Tax: " + electronics.getPrice() * 0.18);
    }
}

// Element Interface
interface Product {
    void accept(TaxVisitor visitor);
    double getPrice();
}

// Concrete Element: Book
class Book implements Product {
    private double price;
    public Book(double price) { this.price = price; }
    public void accept(TaxVisitor visitor) { visitor.visit(this); }
    public double getPrice() { return price; }
}

// Concrete Element: Electronics
class Electronics implements Product {
    private double price;
    public Electronics(double price) { this.price = price; }
    public void accept(TaxVisitor visitor) { visitor.visit(this); }
    public double getPrice() { return price; }
}

// Client Code
public class VisitorPatternDemo {
    public static void main(String[] args) {
        TaxVisitor taxCalculator = new TaxCalculator();
        Product book = new Book(100);
        Product phone = new Electronics(500);

        book.accept(taxCalculator);  // Book Tax: 5.0
        phone.accept(taxCalculator);  // Electronics Tax: 90.0
    }
}
