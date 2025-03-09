package incubation.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Student {
    public Student() {
        System.out.println("Student object created!");
    }
}

public class ReflectionExample {
    //extra code added
    public ReflectionExample() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Student");
        Student obj = (Student) clazz.newInstance(); // Deprecated in Java 9+
    }
    // Works if the class has a public no-arg constructor.
    //❌ Deprecated in Java 9+ (use getDeclaredConstructor().newInstance() instead).

    Class<Student> clazz = Student.class;
    // Create object using no-arg constructor
    Student obj1 = clazz.getDeclaredConstructor().newInstance();

    // Create object using parameterized constructor
    Constructor<Student> constructor = clazz.getDeclaredConstructor(String.class);

    Student obj2 = constructor.newInstance("Alice");
    //✅ Recommended from Java 9 onwards.
    //✅ Works with both default and parameterized constructors.
}

