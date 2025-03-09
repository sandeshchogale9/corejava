package incubation.collectioninternalworking;

import java.util.concurrent.*;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        //Best Use Case: Thread-safe, high-performance map.
        ConcurrentHashMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(1, "Java");
        concurrentMap.put(2, "Python");

        System.out.println("ConcurrentHashMap: " + concurrentMap);
    }
}

