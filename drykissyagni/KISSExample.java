package incubation.drykissyagni;

//KISS (Keep It Simple, Stupid)
//Definition: Keep your code as simple as possible while still achieving the required functionality.
//Avoid unnecessary complexity.
//Make the code easy to read, understand, and maintain.
//
//When to Use?
//When designing systems, avoid over-engineering.
//Focus on clarity and simplicity instead of writing complex code.
//Useful for writing readable, maintainable, and bug-free code.
public class KISSExample {

    //❌ Bad Practice (Violates KISS)
    public static boolean isEven(int num) {
        return (num % 2 == 0) ? true : false;
    }

    //✅ Good Practice (KISS Applied)
    public static boolean isEvenUpdated(int num) {
        return num % 2 == 0;
    }


}
