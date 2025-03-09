package incubation.designpatternsproject.creational.singletone;

//Lazy Initialization (Created on First Use)
//When to Use?
//When you want to delay instance creation until it’s actually needed.

//Pros: Saves memory if instance isn’t needed.
//Cons: Not thread-safe in a multithreaded environment.
class SingletonLazyInitialization {
    private static SingletonLazyInitialization instance;

    // Private constructor
    private SingletonLazyInitialization() { }

    //Lazy Initialization (Created on First Use)
    public static SingletonLazyInitialization getInstance() {
        if (instance == null) {
            instance = new SingletonLazyInitialization();  // Created only when needed
        }
        return instance;
    }
}

