package incubation.collectioninternalworking;

import java.util.concurrent.*;

public class ConcurrentLinkedQueueExample {
    public static void main(String[] args) {
        //Best Use Case: Thread-safe, lock-free queue for multi-threading.
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(10);
        queue.add(20);

        System.out.println("ConcurrentLinkedQueue: " + queue);
        System.out.println("Polled: " + queue.poll());
    }
}

