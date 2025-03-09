package incubation.problemsolving;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "act", "bat", "tab", "rat");

        // Group anagrams using a sorted version of each word as the key
        Map<String, List<String>> anagramGroups = words.stream()
                .collect(Collectors.groupingBy(word -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }));

        // Convert the values to a list of lists
        List<List<String>> result = new ArrayList<>(anagramGroups.values());

        // Print the result
        System.out.println(result);
    }
}

