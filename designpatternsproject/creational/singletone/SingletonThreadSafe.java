package incubation.designpatternsproject.creational.singletone;

//Thread-Safe Singleton (Synchronized Method)
//When to Use?
//When multiple threads can access the Singleton simultaneously.

//Pros: Ensures thread safety.
//Cons: Performance overhead due to synchronization.
class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe() { }

    //Synchronized method
    public static synchronized SingletonThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
}

