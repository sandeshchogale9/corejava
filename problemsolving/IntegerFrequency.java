package incubation.problemsolving;

//You are given a list of integers: List<Integer> list = List.of(1, 1, 3, 2, 3, 4);. The task is to compute the frequency of each unique element in the list
//   without java8

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntegerFrequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 3, 2, 3, 4);
        Map<Integer, Integer> frequencyMap = computeFrequency(list);

        // Print the frequency map
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //By Java8
        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map); // Output: {1=2, 2=1, 3=2, 4=1}
    }

    public static Map<Integer, Integer> computeFrequency(List<Integer> list) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer num : list) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        return frequencyMap;
    }
}
