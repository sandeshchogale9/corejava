package incubation.collectioninternalworking;

import java.util.concurrent.*;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        //Best Use Case: Read-heavy scenarios where modification is rare.
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Java");
        list.add("Python");

        for (String lang : list) {
            list.add("C++");  // No ConcurrentModificationException
            System.out.println(lang);
        }
    }
}

