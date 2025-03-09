package incubation.exceptionhandling;

import java.util.Arrays;

public class ArraysUtilExample {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1};

        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        System.out.println("Search for 2: " + Arrays.binarySearch(arr, 2));

        int[] copiedArr = Arrays.copyOf(arr, 6);
        System.out.println("Copied: " + Arrays.toString(copiedArr));

        Integer[] numArr = {3, 6, 1};
        System.out.println("As List: " + Arrays.asList(numArr));
    }
}

