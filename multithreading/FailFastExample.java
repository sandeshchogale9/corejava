package incubation.multithreading;

import java.util.*;

//Fail-Fast Iterators
//These iterators throw ConcurrentModificationException if a collection is modified during iteration.
//Used in most non-concurrent collections (ArrayList, HashMap, HashSet, etc.).
//They use modCount (modification count) to track changes.
public class FailFastExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            list.add("D"); // ❌ Modifying list during iteration
            //How to Fix?
            // Use Iterator.remove() instead of List.add().
            //Use CopyOnWriteArrayList (Fail-Safe Iterator).
        }
    }
}

