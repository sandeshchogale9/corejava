package incubation.exceptionhandling;

class MyResource implements AutoCloseable {
    public MyResource() {
        System.out.println("Resource Created");
    }

    public void doSomething() {
        System.out.println("Using Resource");
    }

    @Override
    public void close() {
        System.out.println("Resource Closed Automatically");
    }
}

public class CustomResourceExample {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            resource.doSomething();
        }
    }
}

