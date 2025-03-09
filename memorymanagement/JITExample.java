package incubation.memorymanagement;

public class JITExample {
    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            sum(i, i + 1);
        }
        long end = System.nanoTime();
        System.out.println("Execution Time: " + (end - start) / 1_000_000 + " ms");
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
//The JIT compiler optimizes the sum method by inlining it during runtime.

