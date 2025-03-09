package incubation.serialization;

import java.io.*;

//Parent is NOT Serializable, Child is Serializable
class NonSerializableParent1 {
    int parentValue;

    NonSerializableParent1() {  // Default constructor required
        System.out.println("Non-Serializable Parent Constructor Called");
        parentValue = 99;  // Reset value (since it wasn't serialized)
    }

    NonSerializableParent1(int value) {
        this.parentValue = value;
    }
}

class SerializableChild1 extends NonSerializableParent1 implements Serializable {
    int childValue;

    SerializableChild1(int parentValue, int childValue) {
        super(parentValue);
        this.childValue = childValue;
    }

    @Override
    public String toString() {
        return "ParentValue: " + parentValue + ", ChildValue: " + childValue;
    }
}

public class SerializationExample2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableChild1 child = new SerializableChild1(10, 20);

        // Serialization
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.ser"));
        out.writeObject(child);
        out.close();

        // Deserialization
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.ser"));
        SerializableChild deserializedChild = (SerializableChild) in.readObject();
        in.close();

        System.out.println("Deserialized Child: " + deserializedChild);
    }
}

