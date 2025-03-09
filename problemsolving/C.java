package incubation.problemsolving;

class A {
    static void test() {
        System.out.println("A");
    }
}

class B extends A {
    static void test() {
        System.out.println("B");
    }
}

public class C {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        A c = new B();

        a.test();   // Calls A's static method → Output: A
        b.test();   // Calls B's static method → Output: B
        c.test();   // Calls A's static method (Static methods are not overridden) → Output: A
    }
}
//a.test(); → "A"
//Since a is an instance of A, it calls A.test().
//b.test(); → "B"
//Since b is an instance of B, it calls B.test().
//c.test(); → "A"
//Static methods are not overridden, so the method is resolved based on the reference type (A),
//not the actual object (B).
