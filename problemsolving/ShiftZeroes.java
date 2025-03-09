package incubation.problemsolving;

public class ShiftZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 2, 0, 4, 0, 3};
        shiftZeroesToEnd(arr);

        // Printing the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void shiftZeroesToEnd(int[] arr) {
        int n = arr.length;
        int index = 0;  // Pointer for placing non-zero elements

        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];  // Move non-zero element to the 'index'
                index++;
            }
        }

        // Fill remaining positions with zeroes
        while (index < n) {
            arr[index] = 0;
            index++;
        }
    }
}

