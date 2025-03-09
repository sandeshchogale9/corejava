package incubation.singletonexample;

import java.lang.reflect.Constructor;

class Singleton3 {
    private static final Singleton3 INSTANCE = new Singleton3();

    private Singleton3() {
        // Prevent instantiation
        if (INSTANCE != null) {
            throw new RuntimeException("Use getInstance() to create instance");
        }
    }

    /*FIX using reflection
    private Singleton() {
        if (INSTANCE != null) {
            throw new RuntimeException("Use getInstance() method to create instance");
        }
    }*/

    public static Singleton3 getInstance() {
        return INSTANCE;
    }
}

public class BreakSingletonUsingReflection {
    public static void main(String[] args) throws Exception {
        Singleton3 instance1 = Singleton3.getInstance();

        // Using Reflection to break Singleton
        Constructor<Singleton3> constructor = Singleton3.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton3 instance2 = constructor.newInstance();

        System.out.println(instance1 == instance2); // Output: false ❌ (Two different instances)
    }
}

