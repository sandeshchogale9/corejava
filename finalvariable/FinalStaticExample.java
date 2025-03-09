package incubation.finalvariable;


//Must be initialized:
//At the time of declaration, OR
//Inside a static block.
class FinalStaticExample {
    static final int A = 50;  // ✅ Initialized at declaration
    static final int B;       // Will be initialized in a static block

    static {
        B = 100;  // ✅ Allowed inside static block
    }

    public static void main(String[] args) {
        System.out.println(FinalStaticExample.A); // 50
        System.out.println(FinalStaticExample.B); // 100
    }
}

