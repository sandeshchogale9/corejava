package incubation.problemsolving;

import java.util.Arrays;
import java.util.List;

public class CountWordsStartingWithJ {
    public static long countWordsStartingWithJ(List<String> words) {
        return words.stream()
                .filter(word -> word.startsWith("J")) // Keep only words starting with 'J'
                .count(); // Count them
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "JavaScript", "C++", "JQuery");
        System.out.println(countWordsStartingWithJ(words)); // Output: 3
    }
}

