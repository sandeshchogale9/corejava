package incubation.multithreading;

//Fail-Safe Iterators
//They do not throw ConcurrentModificationException.
//Work on a separate copy of the collection, ensuring the original remains unchanged.
//Used in concurrent collections (CopyOnWriteArrayList, ConcurrentHashMap, etc.).
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            list.add("D"); // ✅ No ConcurrentModificationException
        }

        System.out.println("Final List: " + list);
        // Key Takeaway:
        //Fail-Safe iterators work on a separate copy.
        //Modifications during iteration do not affect the iterator.
    }
}

