package incubation.reflection;

import java.io.*;

class Student2 implements Serializable {
    String name;

    public Student2(String name) {
        this.name = name;
    }
}

public class SerializationExample {
    public static void main(String[] args) throws Exception {
        // Serialize object
        Student2 s1 = new Student2("Alice");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(s1);

        // Deserialize object
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Student2 s2 = (Student2) ois.readObject();

        System.out.println(s2.name); // Alice
    }
}

