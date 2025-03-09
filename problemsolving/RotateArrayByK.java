package incubation.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArrayByK {
    public static void reverseByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        // Reverse the whole array
        reverse(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

        // Reverse first k elements
        reverse(arr, 0, k - 1);
        System.out.println(Arrays.toString(arr));

        // Reverse remaining elements
        reverse(arr, k, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        System.out.println(Arrays.toString(arr));
        reverseByK(arr, k);
        //reverseArr(arr, k); // only swapping numbers
        //System.out.println(Arrays.toString(arr));
    }

    public static void reverseArr(int[] arr, int k) {
        int left = 0;
        int right = k - 1;
        int size = arr.length - 1;
        int count = 0;
        if (k > size) {
            System.out.println("k should be smaller");
            return;
        }
        while (count < k) {
            int temp = arr[left];
            arr[left] = arr[size - right];
            arr[size - right] = temp;
            left++;
            right--;
            count++;
        }
    }

}

