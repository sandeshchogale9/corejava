package incubation.memorymanagement;

public class JvmMemoryExample {
    public static void main(String[] args) {
        // Heap allocation
        String name = new String("JVM Internals");

        // Stack allocation
        int value = 100;

        // Triggering GC manually (not recommended in production)
        System.gc();

        System.out.println("Memory Management Example");
        //Explanation
        //name is stored in Heap Memory.
        //value is stored in Stack Memory.
        //System.gc(); suggests GC execution, but JVM decides the actual GC execution.
    }
}

