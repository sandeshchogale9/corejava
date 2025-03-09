package incubation.collectioninternalworking;

import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        //Best Use Case: When priority-based retrieval (O(log n)) is needed.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // Retrieves in sorted order (10, 20, 30)
        }
    }
}

