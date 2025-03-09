package incubation.oops;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

class PhantomReferenceExample {
    public static void main(String[] args) {
        String str = new String("Phantom Reference");
        ReferenceQueue<String> queue = new ReferenceQueue<>();
        PhantomReference<String> phantomRef = new PhantomReference<>(str, queue);

        str = null; // Now ready for GC
        System.out.println("Phantom Reference: " + phantomRef.get()); // Always returns null
    }
}

