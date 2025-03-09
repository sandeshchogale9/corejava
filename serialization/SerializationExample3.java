package incubation.serialization;

import java.io.*;

class SerializableParent implements Serializable {
    int parentValue;
}

class NonSerializableChild extends SerializableParent {  // ❌ Not Serializable
    int childValue;
}

public class SerializationExample3 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.ser"));
        out.writeObject(new NonSerializableChild());  // ❌ ERROR
    }
}

