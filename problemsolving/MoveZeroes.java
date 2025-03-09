package incubation.problemsolving;

import java.util.Arrays;

//one pointer
public class MoveZeroes {
    public static void moveZeroes(int[] arr) {
        int index = 0; // Pointer for non-zero elements

        // Step 1: Move non-zero elements forward
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        // Step 2: Fill remaining positions with zeroes
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 3, 12, 0, 0]
    }
}

