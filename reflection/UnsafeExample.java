package incubation.reflection;

import sun.misc.Unsafe;
import java.lang.reflect.Field;

class Student1 {
    private Student1() {
        System.out.println("Constructor should not be called!");
    }
}

public class UnsafeExample {
    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);

        Student obj = (Student) unsafe.allocateInstance(Student.class);
        System.out.println("Object created without calling constructor!");

        //✅ Useful for frameworks like serialization.
        //❌ Unsafe and may break object initialization.
    }

}

