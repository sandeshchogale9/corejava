package incubation.javafeatures.java8;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable(null);

        // Using orElse()
        System.out.println(opt.orElse("Default Value")); // Output: Default Value

        // Using orElseGet()
        System.out.println(opt.orElseGet(() -> "Computed Value")); // Output: Computed Value

        // Using ifPresent()
        opt.ifPresent(val -> System.out.println("Value: " + val)); // No Output

        // Using map()
        Optional<Integer> length = opt.map(String::length);
        System.out.println(length.orElse(-1)); // Output: -1

        //How to throw an exception using Optional?
        Optional<String> opt1 = Optional.empty();
        String result = opt1.orElseThrow(() -> new RuntimeException("Value not found"));
        //What happens if Optional.of(null) is used?
        //It throws NullPointerException because Optional.of() does not allow null.



    }
}

