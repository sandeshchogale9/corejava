package incubation.serialization;

class TestClass {
    public void show() {
        System.out.println("Hello Reflection!");
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("TestClass");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        // Invoking Method using Reflection
        clazz.getMethod("show").invoke(obj);
    }
}

