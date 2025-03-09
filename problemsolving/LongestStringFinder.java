package incubation.problemsolving;

import java.util.*;
import java.util.stream.Collectors;

public class LongestStringFinder {
    public static String findLongestString(List<String> words) {
        return words.stream()
                .max(Comparator.comparingInt(String::length)) // Find max by length
                .orElse(null); // Handle empty list case
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "JavaScript", "C++");
        System.out.println(findLongestString(words)); // Output: "JavaScript"
    }
}

