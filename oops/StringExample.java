package incubation.oops;

public class StringExample {
    //Immutable: Once created, a String object cannot be changed.
    //Stored in the String Pool: JVM optimizes memory by reusing string literals.
    //Thread-Safe: Since it's immutable, multiple threads can access it safely.
    //Use When: The string value won’t change frequently.
    //Disadvantage: Every modification creates a new object, causing memory overhead.
    public static void main(String[] args) {
        String str = "Hello";
        str.concat(" World");//creates a new String object instead of modifying str.
        System.out.println(str);  // Output: Hello (unchanged)
    }
}

