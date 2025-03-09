package incubation.singletonexample;

import java.io.*;

//Problem: instance1 and instance2 are different!
//Serialization broke the Singleton property.
class Singleton1 implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() { }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}

//Fix Using readResolve()
class Singleton2 implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

    // readResolve() ensures the same instance is returned
    protected Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}

public class SingletonExample {
    public static void main(String[] args) throws Exception {
        Singleton1 instance1 = Singleton1.getInstance();

        // Serialize
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.obj"));
        out.writeObject(instance1);
        out.close();

        // Deserialize
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.obj"));
        Singleton1 instance2 = (Singleton1) in.readObject();
        in.close();

        // Compare instances
        System.out.println(instance1 == instance2); // Output: false ❌ (Two different objects)

        //Output after Fix: true (Both instances are the same)
        //We can use readResolve() to return a different object after deserialization.
        // Serialize
        //ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.obj"));
        //out.writeObject(emp1);
        //out.close();

        // Deserialize
        //ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.obj"));
        //Employee emp2 = (Employee) in.readObject();
        //in.close();

        //System.out.println(emp2.getName()); // Output: Replaced Employee
        // Effect: The deserialized object is replaced with "Replaced Employee".

    }
}

