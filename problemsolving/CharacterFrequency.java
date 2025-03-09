package incubation.problemsolving;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Program to generate Output "a2b3c2" with the input "aabbbcc".
public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "aabbbcc";
        String output = encodeString(input);
        System.out.println(output); // Output: a2b3c2
        String output1 = encodeStringByMap(input);
        System.out.println(output1); // Output: a2b3c2
        String output2 = encodeStringByJava8(input);
        System.out.println(output2); // Output: a2b3c2

    }

    public static String encodeString(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(str.charAt(i)).append(count);
                count = 1;
            }
        }

        return result.toString();
    }

    public static String encodeStringByMap(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String[] strArr = str.split("");
        Map<String, Integer> map = new HashMap<>();
        for(String s : strArr){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else{
                map.put(s, 1);
            }
        }

        StringBuilder result = new StringBuilder();
        for(Map.Entry<String, Integer> m : map.entrySet()){
            result.append(m.getKey()+m.getValue());
        }
        return result.toString();
    }

    public static String encodeStringByJava8(String str) {
        Map<Character, Long> map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
        return map.entrySet().stream()
                .map(e -> e.getKey().toString() + e.getValue())
                .collect(Collectors.joining());
    }


}

