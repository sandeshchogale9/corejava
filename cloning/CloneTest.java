package incubation.cloning;

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Calls Object's clone()
    }
}

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Alice");
        Student s2 = (Student) s1.clone(); // ❌ Throws CloneNotSupportedException
        //Why Does This Happen?
        //The clone() method in Object checks if the class implements Cloneable.
        //If the class does not implement Cloneable, clone() throws CloneNotSupportedException.
        //Inside Object.clone() (JVM level):
    }
}

