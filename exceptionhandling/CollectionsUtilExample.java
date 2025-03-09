package incubation.exceptionhandling;

import java.util.*;

public class CollectionsUtilExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 2);

        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));

        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);
    }
}

