package incubation.oops;

import java.lang.ref.WeakReference;

class WeakReferenceExample {
    public static void main(String[] args) {
        String str = new String("Weak Reference");
        WeakReference<String> weakRef = new WeakReference<>(str);

        str = null; // Eligible for GC

        System.out.println("Weak Reference: " + weakRef.get()); // Might be null if GC runs
    }
}

