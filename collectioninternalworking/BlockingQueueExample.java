package incubation.collectioninternalworking;

import java.util.concurrent.*;

public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        //Best Use Case: Thread-safe queue for producer-consumer scenarios.
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);

        queue.put(1);
        queue.put(2);
        System.out.println("Queue is full, waiting for space...");

        System.out.println("Removed: " + queue.take()); // Removes and allows another add
    }
}

