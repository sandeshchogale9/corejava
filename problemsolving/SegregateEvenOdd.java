package incubation.problemsolving;

import java.util.Arrays;

public class SegregateEvenOdd {
    public static void segregateEvenOdd(int[] arr) {
        int j = -1; // Pointer for the last placed even number

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { // If even
                j++; // Move partition index
                swap(arr, i, j); // Swap even number to left
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        segregateEvenOdd(arr);
        System.out.println(Arrays.toString(arr)); // Output: [12, 34, 90, 8, 9, 45, 3]
    }
}

