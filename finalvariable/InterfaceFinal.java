package incubation.finalvariable;

//Variables in an interface are always public static final, whether explicitly declared or not.
//Must be initialized at the time of declaration.
interface MyInterface {
    int X = 10; // Implicitly public static final
}

public class InterfaceFinal {
    public static void main(String[] args) {
        System.out.println(MyInterface.X); // 10
        // MyInterface.X = 20; ❌ Compilation Error (Cannot change final value)
    }
}

