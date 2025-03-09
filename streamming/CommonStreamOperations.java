package incubation.streamming;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonStreamOperations {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        com = (String o1, String o2 ) -> o1.compareTo(o2);
        com = (o1,o2) -> o1.compareTo(o2);
        com = String::compareTo;

        Predicate<String> my = name -> name.startsWith("A");
        //Filtering Elements
        List<String> filtered = names.stream()
                .filter(my)
                .collect(Collectors.toList());
        System.out.println(filtered); // [Alice]

        //Mapping Elements
        List<Integer> lengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengths); // [5, 3, 7]

        //Sorting
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNames); // [Alice, Bob, Charlie]

        //Finding the First Element
        Optional<String> firstName = names.stream().findFirst();
        System.out.println(firstName.orElse("No name found"));
        Supplier<String> defaultVal = () -> "No name found";
        System.out.println(firstName.orElseGet(defaultVal));

        //Reducing Values
        int sum = IntStream.of(1, 2, 3, 4, 5).reduce(0, Integer::sum);
        System.out.println(sum); // 15

        //Collecting Data
        Set<String> nameSet = names.stream().collect(Collectors.toSet());
        Map<Integer, String> nameMap = names.stream()
                .collect(Collectors.toMap(String::length, Function.identity(), (a, b) -> a));

        //Parallel Streams (for Performance)
        //List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sumParallel = numbers.parallelStream().reduce(0, Integer::sum);
        System.out.println(sumParallel); // 15
    }
}
