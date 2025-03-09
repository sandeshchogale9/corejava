package incubation.designpatternsproject.creational;

//Use Case: When object creation is costly, and we need to clone existing objects efficiently.
//Example: Creating multiple instances of a document template without re-initializing it.
public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Creating original shapes
        Shape originalRectangle = new Rectangle(10, 20);
        Shape originalCircle = new Circle(15);

        // Cloning shapes
        Shape clonedRectangle = originalRectangle.clone();
        Shape clonedCircle = originalCircle.clone();

        // Drawing original and cloned shapes
        originalRectangle.draw();  // Output: Drawing Rectangle with width 10 and height 20
        clonedRectangle.draw();    // Output: Drawing Rectangle with width 10 and height 20

        originalCircle.draw();     // Output: Drawing Circle with radius 15
        clonedCircle.draw();       // Output: Drawing Circle with radius 15
    }
}
//When to Use Prototype Pattern?
//When object creation is expensive, and we want to clone instead of creating new objects
//When object state needs to be preserved in cloned copies
