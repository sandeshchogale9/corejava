package incubation.designpatternsproject.creational.singletone;

//Bill Pugh Singleton (Best Practice)
//When to Use?
//When you want lazy initialization, thread safety, and performance efficiency.

//Pros:
//Lazy initialization (Instance is created only when first accessed).
//Thread-safe without synchronization overhead.
//Cons: None—this is the best Singleton implementation in most cases
class SingletonBillPugh {
    private SingletonBillPugh() { }

    private static class SingletonHelper {
        //Loaded only when needed
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

