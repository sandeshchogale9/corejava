package incubation.oops;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "aabbbcc";
        String result = encodeString(input);
        System.out.println(result); // Output: a2b3c2
    }

    public static String encodeString(String str) {
        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

        return frequencyMap.entrySet().stream()
                .map(e -> e.getKey().toString() + e.getValue())
                .collect(Collectors.joining());
    }
}

