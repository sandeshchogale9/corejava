package incubation.problemsolving;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateArrayStreams {
    public static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        return IntStream.concat(
                Arrays.stream(arr, n - k, n), // Last k elements
                Arrays.stream(arr, 0, n - k)  // First n-k elements
        ).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int[] rotatedArr = rotate(arr, k);
        System.out.println(Arrays.toString(rotatedArr)); // Output: [4, 5, 1, 2, 3]
    }
}

