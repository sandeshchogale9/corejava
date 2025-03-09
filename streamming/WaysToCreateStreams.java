package incubation.streamming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WaysToCreateStreams {
    public static void main(String[] args) {
        //FROM COLLECTION
        //List<String> names = List.of("Alice", "Bob", "Charlie");//Java 14 needed
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Stream<String> stream1 = names.stream();  // Sequential stream
        Stream<String> stream2 = names.parallelStream(); // Parallel stream

        //FROM ARRAY
        String[] arr = {"one", "two", "three"};
        Stream<String> stream3 = Arrays.stream(arr);

        //From Stream.of()
        Stream<Integer> stream4 = Stream.of(1, 2, 3, 4, 5);

        //Using Stream.iterate() (Infinite Stream)
        Stream<Integer> stream5 = Stream.iterate(1, n -> n + 2).limit(5);
        stream5.forEach(System.out::println); // 1, 3, 5, 7, 9

        //Using Stream.generate()
        Supplier<Double> integerSupplier = Math::random;
        Stream<Double> stream6 = Stream.generate(integerSupplier).limit(3);
        stream6.forEach(System.out::println);

        //Using IntStream (Primitive Streams)
        IntStream intStream = IntStream.range(1, 5); // 1, 2, 3, 4
        IntStream intStream2 = IntStream.rangeClosed(1, 5); // 1, 2, 3, 4, 5

        //Using DoubleStream
        DoubleStream stream = DoubleStream.of(3.5, 5.2, 8.7);
        stream.forEach(System.out::println); // Output: 3.5 5.2 8.7


    }
}
