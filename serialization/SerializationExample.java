package incubation.serialization;

import java.io.*;

class Employee implements Serializable {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationExample {
    public static void main(String[] args) throws IOException {
        Employee e = new Employee(101, "John");

        // Serialize to file
        FileOutputStream fileOut = new FileOutputStream("employee.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(e);
        out.close();
        fileOut.close();
        System.out.println("Object serialized successfully.");
    }
}

