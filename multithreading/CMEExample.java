package incubation.multithreading;

import java.util.*;

//How to Reproduce ConcurrentModificationException?
//You can trigger it by modifying a collection during iteration using:
//for-each loop
//Iterator (without using Iterator.remove())
public class CMEExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        for (Integer num : list) {
            if (num == 2) {
                list.remove(num); // ❌ Throws ConcurrentModificationException
            }
        }
        // How to Fix?
        //Use Iterator's remove() method.
        //Use CopyOnWriteArrayList.
        //Iterate in reverse order (for ArrayList).
    }
}

