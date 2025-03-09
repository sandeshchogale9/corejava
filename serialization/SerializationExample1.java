package incubation.serialization;

import java.io.*;

//Manually Serializing Parent Fields
class NonSerializableParent {
    int parentValue;

    NonSerializableParent(int value) {
        this.parentValue = value;
    }

    NonSerializableParent() {  // Default constructor needed
        System.out.println("Non-Serializable Parent Constructor Called");
    }
}

class SerializableChild extends NonSerializableParent implements Serializable {
    int childValue;

    SerializableChild(int parentValue, int childValue) {
        super(parentValue);
        this.childValue = childValue;
    }

    // Manually serialize parent fields
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject(); // Serialize child fields
        out.writeInt(parentValue); // Manually serialize parent value
    }

    // Manually deserialize parent fields
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject(); // Deserialize child fields
        parentValue = in.readInt(); // Manually deserialize parent value
    }

    @Override
    public String toString() {
        return "ParentValue: " + parentValue + ", ChildValue: " + childValue;
    }
}

public class SerializationExample1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableChild child = new SerializableChild(10, 20);

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

