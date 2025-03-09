package incubation.problemsolving;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static List<Integer> findDuplicates(List<Integer> nums) {
        return nums.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting())) // Count occurrences
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Keep only duplicates
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()); // Convert to list
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 3, 4);
        System.out.println(findDuplicates(nums)); // Output: [2, 3, 4]
    }
}

