package incubation.problemsolving;

import java.util.Arrays;

public class LargestThreeElements {
    public static void findLargestThree(int[] arr) {
        if (arr.length < 3) {
            System.out.println("Array must have at least three elements");
            return;
        }

        Arrays.sort(arr); // Sort in ascending order

        int n = arr.length;
        System.out.println("Largest three elements: " + arr[n - 1] + ", " + arr[n - 2] + ", " + arr[n - 3]);
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90};
        findLargestThree(arr);
    }
}

