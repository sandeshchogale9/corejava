package incubation.oops;

import java.util.*;

public class AnonymousClassExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;  // Ascending order
            }
        };

        Comparator<Integer> comparatorLamdaVersion = (a, b) -> a - b; // Shorter version

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1);
        numbers.sort(comparator);

        System.out.println(numbers); // Output: [1, 2, 5, 8]
    }
}

