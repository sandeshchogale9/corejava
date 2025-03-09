package incubation.solidprinciples;

//Definition: Subtypes must be substitutable for their base types without breaking behavior.
//Avoid overriding base class methods in a way that breaks expectations.
//
//When to Use?
//When creating a subclass, ensure it behaves as expected.
//If overriding methods change expected behavior, rethink inheritance.
public class LiskovSubstitutionPrinciple {
    class Rectangle {
        int width, height;
        void setWidth(int w) { this.width = w; }
        void setHeight(int h) { this.height = h; }
        int getArea() { return width * height; }
    }

    class Square extends Rectangle {
        void setWidth(int w) { this.width = this.height = w; }
        void setHeight(int h) { this.width = this.height = h; }
    }
    //❌ Problem: Square violates LSP because setWidth() and setHeight() modify both width
    // and height, which is not expected in Rectangle.


    //After LSP (Fixed)
    //Now both Rectangle and Square follow LSP correctly.
    interface Shape {
        int getArea();
    }

    class RectangleUpdated implements Shape {
        int width, height;
        void setWidth(int w) { this.width = w; }
        void setHeight(int h) { this.height = h; }
        public int getArea() { return width * height; }
    }

    class SquareUpdated implements Shape {
        int side;
        void setSide(int s) { this.side = s; }
        public int getArea() { return side * side; }
    }


}
