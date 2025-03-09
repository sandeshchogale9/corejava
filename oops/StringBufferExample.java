package incubation.oops;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");//append() modifies the same object instead of creating a new one.
        System.out.println(sb);  // Output: Hello World
    }
}

