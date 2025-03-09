package incubation.cloning;

import java.io.*;

//Using Serialization for Deep Cloning
//Works without implementing Cloneable.
//Automatically deep copies all fields, even collections.

class Address2 implements Serializable {
    String city;
    Address2(String city) {
        this.city = city;
    }
}

class Employee2 implements Serializable {
    String name;
    Address2 address;

    Employee2(String name, Address2 address) {
        this.name = name;
        this.address = address;
    }

    public Employee2 deepClone() throws IOException, ClassNotFoundException {
        // Serialize object to byte stream
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(this);

        // Deserialize back to a new object
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bis);
        return (Employee2) in.readObject();
    }
}

public class DeepCloneSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address2 addr = new Address2("New York");
        Employee2 emp1 = new Employee2("John", addr);
        Employee2 emp2 = emp1.deepClone(); // Deep Cloning via Serialization

        emp2.address.city = "Los Angeles"; // Only emp2 is modified

        System.out.println(emp1.name + " lives in " + emp1.address.city); // John lives in New York
        System.out.println(emp2.name + " lives in " + emp2.address.city); // John lives in Los Angeles

        //Why Use Serialization for Deep Cloning?
        //It automatically clones all nested objects, even if there are many references.
        //Works even for complex object hierarchies with multiple levels of nested objects.
    }
}

