package incubation.collectioninternalworking;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Java");
        treeMap.put(1, "Python");
        treeMap.put(2, "C++");

        System.out.println("Sorted TreeMap: " + treeMap);

        // Custom Comparator (Descending Order)
        TreeMap<Integer, String> descTreeMap = new TreeMap<>((a, b) -> b - a);
        descTreeMap.putAll(treeMap);
        System.out.println("Descending Order: " + descTreeMap);
    }
}

