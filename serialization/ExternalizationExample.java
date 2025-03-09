package incubation.serialization;

import java.io.*;

class Employee2 implements Externalizable {
    int id;
    String name;

    public Employee2() {} // Mandatory for Externalizable

    Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeObject(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        name = (String) in.readObject();
    }
}

public class ExternalizationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee2 e = new Employee2(101, "John");

        // Serialize
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp_ext.ser"));
        out.writeObject(e);
        out.close();

        // Deserialize
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp_ext.ser"));
        Employee deserializedEmp = (Employee) in.readObject();
        in.close();

        System.out.println("Externalized Employee: " + deserializedEmp.id + " " + deserializedEmp.name);
    }
}

