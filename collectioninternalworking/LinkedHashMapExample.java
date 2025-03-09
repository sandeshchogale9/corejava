package incubation.collectioninternalworking;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        System.out.println("Insertion Order: " + map);

        // Access Order (LRU Cache Behavior)
        LinkedHashMap<Integer, String> lruCache = new LinkedHashMap<>(4, 0.75f, true);
        lruCache.put(1, "Java");
        lruCache.put(2, "Python");
        lruCache.put(3, "C++");

        // Access an element
        lruCache.get(1);
        System.out.println("Access Order (LRU-like): " + lruCache);
    }
}

