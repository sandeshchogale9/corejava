package incubation.problemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2, 9, 9};
        System.out.println(findSecondLargest(arr)); // Output: 6
        System.out.println(findSecondLargestByJava8(arr));
        System.out.println(findSecodLargestFinder());
    }

    public static int findSecondLargest(int[] arr) {
        Arrays.sort(arr); // Sort the array in ascending order
        int n = arr.length;

        int largest = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                return arr[i]; // Second largest found
            }
        }
        throw new IllegalArgumentException("No second largest element");
    }

    public static int findSecondLargestByJava8(int[] arr){
        int secondLargest = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted((a, b) -> Integer.compare(b, a)) //descending order
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No second largest element"));
        return secondLargest;
    }

    public static int findSecodLargestFinder(){
        List<Integer> numbers = Arrays.asList(1, 5, 6, 2, 9, 9);

        Optional<Integer> secondLargest = numbers.stream()
                .distinct()                            // Remove duplicates
                .sorted((a, b) -> Integer.compare(b, a)) // Sort in descending order
                .skip(1)                               // Skip the largest element
                .findFirst();                          // Get the second element

        return secondLargest.get();
    }

}

