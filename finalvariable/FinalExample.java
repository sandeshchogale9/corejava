package incubation.finalvariable;

//Final variables inside methods must be initialized at the time of declaration or
// before their first use.
//They cannot be reassigned after initialization.
public class FinalExample {
    public static void main(String[] args) {
        final int x;  // Declaration without initialization
        x = 10;       // First assignment (Allowed)
        // x = 20;    // ❌ Compilation error (Reassignment not allowed)
        System.out.println(x);
    }
}

