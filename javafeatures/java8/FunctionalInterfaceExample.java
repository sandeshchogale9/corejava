package incubation.javafeatures.java8;

//Java Built-in Functional Interfaces (From java.util.function)
@FunctionalInterface
interface MyFunction {
    int add(int a, int b); // Single abstract method
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunction sum = (a, b) -> a + b; // Lambda Expression
        System.out.println(sum.add(10, 20)); // Output: 30
    }
}

/*
* Interface	Method	Description
Predicate<T>	boolean test(T t)	Tests a condition (filter())
Function<T, R>	R apply(T t)	Converts T to R (map())
Consumer<T>	void accept(T t)	Performs an action (forEach())
Supplier<T>	T get()	Returns an instance (get())
* */
