package incubation.finalvariable;

//Can only be initialized at the time of declaration (since there's no constructor).
abstract class Parent {
    abstract void show();
}

public class AnonymousFinal {
    public static void main(String[] args) {
        Parent obj = new Parent() {
            final int x = 50; // ✅ Must be initialized immediately
            public void show() {
                System.out.println("Value of x: " + x);
            }
        };
        obj.show(); // Output: Value of x: 50
    }
}

