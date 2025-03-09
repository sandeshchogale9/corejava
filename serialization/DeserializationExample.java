package incubation.serialization;

import java.io.*;
//Use Cases: Caching, Session Management, Saving Objects in Files.
public class DeserializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("employee.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);

        Employee e = (Employee) in.readObject();
        in.close();
        fileIn.close();

        System.out.println("Deserialized Employee: " + e.id + " " + e.name);
    }
}

