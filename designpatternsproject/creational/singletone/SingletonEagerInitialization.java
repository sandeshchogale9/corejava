package incubation.designpatternsproject.creational.singletone;

//Eager Initialization (Simple & Fast)
//When to Use?
//When instance creation is lightweight and always needed.

//Pros: Simple and thread-safe.
//Cons: Instance is created even if it’s never used.
class SingletonEagerInitialization {
    // Instance created at class loading
    private static final SingletonEagerInitialization INSTANCE = new SingletonEagerInitialization();

    // Private constructor to prevent instantiation
    private SingletonEagerInitialization() { }

    //return instance
    public static SingletonEagerInitialization getInstance() {
        return INSTANCE;
    }
}

