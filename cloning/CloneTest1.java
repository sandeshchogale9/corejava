package incubation.cloning;

class Student1 implements Cloneable {
    String name;

    public Student1(String name) {
        this.name = name;
    }
}

public class CloneTest1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student1 s1 = new Student1("Alice");
        //Student1 s2 = (Student1) s1.clone(); // ❌ Compilation error: clone() has protected access
        //Even if you implement Cloneable, not overriding clone() will still call Object.clone(), which is protected and not accessible:
    }
}

