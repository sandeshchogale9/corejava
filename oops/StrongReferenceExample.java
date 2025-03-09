package incubation.oops;

class StrongReferenceExample {
    public static void main(String[] args) {
        String str = new String("Hello"); // Strong reference
        str = null;  // Now eligible for GC
    }
}

