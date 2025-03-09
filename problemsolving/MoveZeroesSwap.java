package incubation.problemsolving;

//2 pointers
public class MoveZeroesSwap {
    public static void moveZeroes(int[] arr) {
        int left = 0; // Position to place non-zero elements

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                // Swap non-zero element with left pointer
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println(java.util.Arrays.toString(arr)); // Output: [1, 3, 12, 0, 0]
    }
}

