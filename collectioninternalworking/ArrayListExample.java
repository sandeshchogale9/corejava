package incubation.collectioninternalworking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

//ArrayList (Internal Working)
//Backed by a dynamic array.
//When the array is full, it grows by 1.5x (from Java 8 onwards).
//Fast random access (O(1)) but slow insertion/deletion (O(n)) due to shifting.
public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        list.forEach(System.out::println);

        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add("a");

        linkedList.forEach(System.out::println);

        //Best Use Case: When random access (O(1)) is needed and insertions/deletions are rare.
        List<String> listE = new ArrayList<>();
        listE.add("Java");
        listE.add("Python");
        listE.add("C++");

        System.out.println("ArrayList: " + listE);

        listE.remove(1); // Removes "Python"
        System.out.println("After removal: " + listE);

        System.out.println("Element at index 1: " + listE.get(1)); // O(1) access time


    }
}
