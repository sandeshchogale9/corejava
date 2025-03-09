package incubation.collectioninternalworking;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> mapObj = new HashMap<>();
        mapObj.put("Apple", 10);
        mapObj.put("Banana", 20);

        System.out.println("HashMap: " + mapObj);

        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();

        //Best Use Case: When fast lookup (O(1)) is required.
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 10);
        map.put("Python", 20);
        map.put("C++", 30);

        System.out.println("HashMap: " + map);
        System.out.println("Value for 'Java': " + map.get("Java"));


        //Best Use Case: When sorted key-value mapping (O(log n)) is needed.
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "C++");
        treeMap.put(1, "Java");
        treeMap.put(2, "Python");

        System.out.println("TreeMap (Sorted by Key): " + treeMap);
    }
}
