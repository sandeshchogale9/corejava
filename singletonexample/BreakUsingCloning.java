package incubation.singletonexample;

import java.lang.Cloneable;

class Singleton4 implements Cloneable {
    private static final Singleton4 INSTANCE = new Singleton4();

    private Singleton4() { }

    public static Singleton4 getInstance() {
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Creates a new instance
    }

    /*FIX using Cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton cannot be cloned");
    }
    *
    * */
}

public class BreakUsingCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = (Singleton4) instance1.clone();

        System.out.println(instance1 == instance2); // Output: false ❌ (Two instances)
    }
}

