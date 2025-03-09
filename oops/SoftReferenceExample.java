package incubation.oops;

import java.lang.ref.SoftReference;

class SoftReferenceExample {
    public static void main(String[] args) {
        String str = new String("Soft Reference");
        SoftReference<String> softRef = new SoftReference<>(str);

        str = null; // Eligible for GC only if memory is low

        System.out.println("Soft Reference: " + softRef.get());
    }
}

