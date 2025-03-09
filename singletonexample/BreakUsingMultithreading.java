package incubation.singletonexample;

//Race Condition in Multi-Threaded Environment
class Singleton {
    private static Singleton instance;

    private Singleton() { }

    public static Singleton getInstance() {
        if (instance == null) { // Thread 1 and Thread 2 may enter here
            instance = new Singleton(); // Two instances created
        }
        return instance;
    }

    /* FIXED
    public static synchronized Singleton getInstance() {
    if (instance == null) {
        instance = new Singleton();
    }
        return instance;
    }
    * */
}


public class BreakUsingMultithreading {
    public static void main(String[] args) {
        Runnable task = () -> {
            Singleton instance = Singleton.getInstance();
            //Singleton7 instance = Singleton7.getInstance();
            System.out.println(instance);
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}
