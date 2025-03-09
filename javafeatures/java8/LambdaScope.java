package incubation.javafeatures.java8;

public class LambdaScope {
    public static void main(String[] args) {
        int num = 10; // Effectively final
        Runnable r = () -> System.out.println(num);
        r.run();

        int num2 = 10;
        Runnable r1 = () -> {
            //num2++; // Compilation error! Cannot modify local variables
            System.out.println(num2);
        };

    }
}

