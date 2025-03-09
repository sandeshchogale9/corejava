package incubation.collectioninternalworking;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> setString = new HashSet<>();
        setString.add("Java");
        setString.add("Python");

        setString.forEach(s -> System.out.println(setString));

        TreeSet<String> stringTreeSet = new TreeSet<>();

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();


        //Best Use Case: When fast lookup (O(1)) and unique elements are required.
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);  // Duplicate won't be added

        System.out.println("HashSet: " + set);


        //Best Use Case: When sorted order (O(log n)) is needed.
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(30);

        System.out.println("TreeSet (Sorted Order): " + treeSet);

    }
}
