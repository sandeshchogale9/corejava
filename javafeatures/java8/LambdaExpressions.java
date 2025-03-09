package incubation.javafeatures.java8;

import java.util.Comparator;
import java.util.function.Function;

public class LambdaExpressions {
    // Without Lambda
    Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            return a.compareTo(b);
        }
    };
    // With Lambda
    Comparator<Integer> comparatorLambda = (a, b) -> a.compareTo(b);

    //A Lambda Expression is a concise way to represent a function.
    //(parameters) -> { body }

    //Lambda without parameters
    //Runnable r = () -> System.out.println("Hello from Lambda!");
    //new Thread(r).start();

    //Lambda with parameters
    //MyFunction add = (a, b) -> a + b;
    //System.out.println(add.add(5, 3)); // Output: 8

    public static void main(String[] args) {
        //Using Function to Square a Number
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5)); // Output: 25
    }

}
