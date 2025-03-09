package incubation.javafeatures.java8;

import java.util.function.Predicate;

public interface FunctionalInterfaces {

    Predicate<Integer> isEven = x -> x % 2 == 0;

    static void main(String[] args) {
        System.out.println(isEven.test(10)); // Output: true
    }

}
