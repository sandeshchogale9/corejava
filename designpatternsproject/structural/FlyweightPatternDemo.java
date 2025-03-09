package incubation.designpatternsproject.structural;

//Use Case: When we have too many objects consuming memory and need to share common objects instead of creating new ones.
//Example: A text editor reusing Character objects instead of creating new ones.

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        // Reusing the same tree types
        TreeType oak = TreeFactory.getTreeType("Oak", "Green");
        TreeType pine = TreeFactory.getTreeType("Pine", "Dark Green");

        // Displaying trees at different locations
        oak.display(10, 20);
        oak.display(30, 40);
        pine.display(50, 60);
    }
}

