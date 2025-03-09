package incubation.javafeatures.java8;

import java.util.Optional;

public class OptionalClasses {

    //Optional<T> is a container object that avoids NullPointerException (NPE)
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);
        System.out.println(name.orElse("Default Name")); // Output: Default Name

        Optional<String> name1 = Optional.of("John");  // Throws exception if null
        Optional<String> empty = Optional.empty();   // Empty optional
        Optional<String> nullable = Optional.ofNullable(null); // Safe for null values

    }
}
