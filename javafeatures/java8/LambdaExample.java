package incubation.javafeatures.java8;

//How can you use a lambda with a custom functional interface?
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

@FunctionalInterface
interface StringLength {
    int getLength(String s);
}

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        System.out.println(add.operate(5, 3)); // Output: 8
        //What happens if the interface has two abstract methods?
        //It won’t compile because lambda expressions only work with functional interfaces.

        StringLength lengthFunction = s -> s.length();
        System.out.println(lengthFunction.getLength("Hello")); // Output: 5
        //What if the interface has void return type?
        //Then the lambda must not return a value, or it will cause a compilation error.
    }
}

