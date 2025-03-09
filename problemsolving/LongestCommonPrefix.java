package incubation.problemsolving;

public class LongestCommonPrefix {
    //Pick the first string as a reference.
    //Compare each character of the first string with the corresponding characters in other strings.
    //Stop when a mismatch is found.
    //Return the common prefix.
    public static String findPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        //first word from array to compare with others
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            System.out.println(strs[i].indexOf(prefix));
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println(prefix);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] str = {"flower", "flag", "float", "flat"};
        System.out.println(findPrefix(str)); // Output: fl
        //O(N*M) → N = Number of strings, M = Length of the smallest string
        //Space complexity= O(1)
    }
}

