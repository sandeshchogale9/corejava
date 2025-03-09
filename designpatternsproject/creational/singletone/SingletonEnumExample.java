package incubation.designpatternsproject.creational.singletone;

//Why Use Enum for Singleton?
//Thread-safe by default (No need for synchronization).
//Lazy initialization guaranteed by JVM.
//Serialization & Reflection safe (Prevents breaking Singleton pattern).
//Prevents multiple instances in deserialization.

// When to Use Enum Singleton?
//When you want the simplest, most robust Singleton implementation.
//When working with serialization & reflection security concerns.
//When needing a lightweight, efficient Singleton pattern.
public enum SingletonEnumExample {
    INSTANCE;  // Single instance

    public void showMessage() {
        System.out.println("Hello from Singleton Enum!");
    }

    //Use
    public static void main(String[] args) {
        SingletonEnumExample singleton = SingletonEnumExample.INSTANCE;
        singleton.showMessage();  // Output: Hello from Singleton Enum!
    }
}

