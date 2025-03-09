package incubation.problemsolving;

import java.util.Arrays;

//Input- arr[] = {2, 0, 2, 1, 1, 0}
//Output- arr[] = {0, 0, 1, 1, 2, 2}
//Count the number of 0s, 1s, and 2s.
//Overwrite the original array with the counted numbers.
//Time Complexity: O(n)
//Space Complexity: O(1)
//This solution requires two passes: one for counting and one for overwriting.
public class DNFBruteForce {
    public static void sortArray(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;

        for (int num : arr) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }

        // Overwrite the array
        int index = 0;
        while (count0-- > 0) arr[index++] = 0;
        while (count1-- > 0) arr[index++] = 1;
        while (count2-- > 0) arr[index++] = 2;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}

