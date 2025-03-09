package incubation.problemsolving;

import java.util.*;

public class ListReferenceExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3));

        list1.addAll(list2); // ✅ Adds all elements of list2 to list1

        list1 = new ArrayList<>(Arrays.asList(10, 20, 30)); // ❌ New list assigned to list1

        System.out.println("List1: " + list1); // Output: [10, 20, 30] (New reference, original lost)
        System.out.println("List2: " + list2); // Output: [4, 5, 6] (Unaffected)
        System.out.println("List3: " + list3); // Output: [4, 5, 6] (Unaffected)
    }
}

