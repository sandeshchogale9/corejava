package incubation.reflection;

class Student3 implements Cloneable {
    String name;

    public Student3(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student3 s1 = new Student3("Alice");
        Student3 s2 = (Student3) s1.clone();

        System.out.println(s2.name); // Alice
        //✅ Fast but requires Cloneable implementation.
        //❌ Shallow copy; doesn’t work if object has final fields.
    }
}

