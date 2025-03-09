package incubation.javafeatures.java8;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println); // Output: Alice
    }

}
