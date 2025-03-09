package incubation.problemsolving;

import java.util.Arrays;

/*
* This is the most efficient approach using three pointers: low, mid, and high.

🔢 Steps:
Initialize three pointers:
low = 0 (position for 0s)
mid = 0 (current element)
high = n - 1 (position for 2s)
Iterate through the array:
If arr[mid] == 0: Swap arr[low] and arr[mid], move low & mid forward.
If arr[mid] == 1: Just move mid forward.
If arr[mid] == 2: Swap arr[mid] and arr[high], move high backward.
Continue until mid crosses high.
*
* Time Complexity: O(n)
  Space Complexity: O(1)
* */
public class DNFOptimal {
    public static void sortArray(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low++, mid++);
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high--);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
/*
* Dry Run (Step-by-Step Execution)
Let's take arr = {2, 0, 2, 1, 1, 0}.

low	mid	high	Array State	Action
0	0	5	2, 0, 2, 1, 1, 0	Swap arr[0] & arr[5]
0	0	4	0, 0, 2, 1, 1, 2	Swap arr[0] & arr[0], Move low, mid
1	1	4	0, 0, 2, 1, 1, 2	Swap arr[1] & arr[1], Move low, mid
2	2	4	0, 0, 2, 1, 1, 2	Swap arr[2] & arr[4]
2	2	3	0, 0, 1, 1, 2, 2	Move mid
2	3	3	0, 0, 1, 1, 2, 2	Move mid
2	4	3	0, 0, 1, 1, 2, 2	Done
* */
