package incubation.javafeatures.java8;

interface A {
    default void show() {
        System.out.println("A's show()");
    }
}

interface B {
    default void show() {
        System.out.println("B's show()");
    }
}

// Class trying to inherit from both A and B
class C implements A, B {
    // ERROR: Ambiguous method show() from both interfaces

    @Override
    public void show() {
        //A.super.show();//// Explicitly call A's method
        //super.show();
    }
}
