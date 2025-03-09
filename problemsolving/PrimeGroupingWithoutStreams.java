package incubation.problemsolving;

import java.util.*;

public class PrimeGroupingWithoutStreams {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        // Map to store prime and non-prime numbers
        Map<Boolean, List<Integer>> groupedNumbers = new HashMap<>();
        groupedNumbers.put(true, new ArrayList<>());  // List for prime numbers
        groupedNumbers.put(false, new ArrayList<>()); // List for non-prime numbers

        // Iterate through the numbers and classify them
        for (int num : numbers) {
            if (isPrime(num)) {
                groupedNumbers.get(true).add(num);
            } else {
                groupedNumbers.get(false).add(num);
            }
        }

        // Print the grouped results
        System.out.println("Prime Numbers: " + groupedNumbers.get(true));
        System.out.println("Non-Prime Numbers: " + groupedNumbers.get(false));
    }

    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

