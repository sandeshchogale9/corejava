package incubation.singletonexample;

import java.io.*;

class Singleton5 implements Serializable {
    private static final Singleton5 INSTANCE = new Singleton5();

    private Singleton5() { }

    public static Singleton5 getInstance() {
        return INSTANCE;
    }

    /*
    * FIX
    * protected Object readResolve() {
    return INSTANCE;
}
    * */
}

public class BreakUsingSerialization {
    public static void main(String[] args) throws Exception {
        Singleton5 instance1 = Singleton5.getInstance();

        // Serialize Singleton object
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.obj"));
        out.writeObject(instance1);
        out.close();

        // Deserialize Singleton object
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.obj"));
        Singleton5 instance2 = (Singleton5) in.readObject();
        in.close();

        System.out.println(instance1 == instance2); // Output: false ❌ (Two different instances)
    }
}

