package incubation.problemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercase {
    public static List<String> convertToUpperCase(List<String> words) {
        return words.stream()
                .map(String::toUpperCase) // Convert each word to uppercase
                .collect(Collectors.toList()); // Collect results into a list
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "python", "go");
        System.out.println(convertToUpperCase(words)); // Output: [JAVA, PYTHON, GO]
    }
}

