package incubation.javafeatures.java17;

// Define a sealed class Animal
sealed class Animal permits Dog, Cat, Parrot {}

// Only these classes can extend Animal
final class Dog extends Animal {}
final class Cat extends Animal {}
final class Parrot extends Animal {}

public class SealedClassDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal parrot = new Parrot();

        System.out.println("Only Dog, Cat, and Parrot can extend Animal.");
    }
}

