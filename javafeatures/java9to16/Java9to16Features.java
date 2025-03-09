package incubation.javafeatures.java9to16;

public class Java9to16Features {
    /*Java 9 (Released: September 2017)
       Java 9 brought modularization and various improvements.
        Project Jigsaw (Module System)
        🔹 Helps break large applications into modules.
        module com.myapp {
            exports com.myapp.services;
        }

        * var in Lambda Expressions
        🔹 Allows using var in lambda parameters.
        (var x, var y) -> x + y;

        * List.of(), Set.of(), Map.of() (Immutable Collections)
            List<String> names = List.of("Alice", "Bob");
            Set<Integer> numbers = Set.of(1, 2, 3);
            Map<Integer, String> map = Map.of(1, "One", 2, "Two");

        * Java 10 (Released: March 2018)
        var for Local Variables
        Allows type inference in local variables
        var message = "Hello Java!";
        System.out.println(message);

        *Java 11 (Released: September 2018, LTS)
        *String API Enhancements
        System.out.println("   Hello   ".strip()); // Removes leading & trailing spaces
        System.out.println("Hello\nWorld".lines().count()); // Count lines

        HTTP Client API
        Replaces the old HttpURLConnection.
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://example.com"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        *Java 12 - Java 14 (2019-2020)
        Switch Expressions (Java 12, finalized in Java 14)
        Allows assigning switch results to variables
        String day = "MONDAY";
        String type = switch (day) {
            case "MONDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Unknown";
        };
        System.out.println(type);

        *Records (Java 14)
        A concise way to create immutable data classes.
        record Employee(String name, int age) {}

        Employee emp = new Employee("Alice", 30);
        System.out.println(emp.name()); // Output: Alice

        *Java 15 - Java 16 (2020-2021)
        Sealed Classes (Java 15)
        *Restricts which classes can inherit from a class.
        sealed class Vehicle permits Car, Bike {}
        final class Car extends Vehicle {}
        final class Bike extends Vehicle {}

        *Java 17 (Released: September 2021, LTS)
        Pattern Matching for instanceof

        Simplifies type casting after instanceof checks.
        Object obj = "Hello";
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase()); // No explicit cast needed
        }
        Enhanced Random Number Generation
        RandomGenerator generator = RandomGenerator.of("L128X256MixRandom");
        System.out.println(generator.nextInt(100));

        Java Version	Key Features
        Java 8	Lambda, Streams, Optional, Date API
        Java 9	Module System, Immutable Collections
        Java 10	var keyword
        Java 11 (LTS)	String enhancements, HTTP Client
        Java 12-14	Switch Expressions, Records
        Java 15-16	Sealed Classes
        Java 17 (LTS)	Pattern Matching, Improved Random API

    * */
}
