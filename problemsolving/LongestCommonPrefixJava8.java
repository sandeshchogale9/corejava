package incubation.problemsolving;

import java.util.Arrays;

//Use Stream.reduce() to iterate over all strings and compare them.
//Reduce the array by keeping only the common prefix.
public class LongestCommonPrefixJava8 {
    public static String findPrefix(String[] strs) {
        return Arrays.stream(strs)
                .reduce((a, b) -> {
                    int i = 0;
                    while (i < a.length() && i < b.length() && a.charAt(i) == b.charAt(i)) {
                        i++;
                    }
                    return a.substring(0, i);
                })
                .orElse("");
    }

    public static void main(String[] args) {
        String[] str = {"flower", "flag", "float", "flat"};
        System.out.println(findPrefix(str)); // Output: fl
        //O(N*M) → Similar to the traditional approach.
        //Space complexity= O(1)
    }
    //Explanation:
    //reduce((a, b) -> {...}):
    //Iterates over pairs of strings.
    //Finds the common prefix of a and b.
    //Reduces the array to the final longest prefix.
}

