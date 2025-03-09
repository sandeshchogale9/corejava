package incubation.collectioninternalworking;

import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {
        //Best Use Case: When frequent insertions/deletions in the middle of the list are required.
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.addFirst("Python");  // O(1) time complexity
        list.addLast("C++");

        System.out.println("LinkedList: " + list);

        list.removeFirst();  // Removes "Python"
        System.out.println("After removal: " + list);
    }
}

