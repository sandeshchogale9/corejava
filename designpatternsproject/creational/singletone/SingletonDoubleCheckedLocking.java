package incubation.designpatternsproject.creational.singletone;

//Double-Checked Locking (Efficient & Thread-Safe)
//When to Use?
//When you need both performance and thread safety.

//Pros: Thread-safe without performance hit.
//Cons: More complex than other implementations.
class SingletonDoubleCheckedLocking {
    //Volatile ensures visibility across threads
    private static volatile SingletonDoubleCheckedLocking instance;

    private SingletonDoubleCheckedLocking() { }

    public static SingletonDoubleCheckedLocking getInstance() {
        //First check (no locking)
        if (instance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                //Second check (inside synchronized block)
                if (instance == null) {
                    instance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}

