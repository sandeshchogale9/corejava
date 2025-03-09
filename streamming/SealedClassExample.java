package incubation.streamming;

public class SealedClassExample {

    //sealed class Animal permits Dog, Cat {} // Only Dog & Cat can extend

    //final class Dog extends Animal {} // Allowed subclass
    //final class Cat extends Animal {} // Allowed subclass

    // class Tiger extends Animal {} // ❌ Compilation Error! Not allowed

}
