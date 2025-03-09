package incubation.problemsolving;

import java.util.HashSet;

public class SmallestMissingUnsorted {
    public static int findSmallestMissing(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        for (int i = 0; i <= arr.length; i++) {
            if (!set.contains(i)) return i;
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(findSmallestMissing(arr)); // Output: 0
    }
}

