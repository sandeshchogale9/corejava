package incubation.designpatternsproject.structural;

import java.util.HashMap;
import java.util.Map;

//Example: Reusing Tree Objects in a Forest
//Instead of creating thousands of Tree objects, we share a single TreeType instance.

// Flyweight Factory
class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color) {
        String key = name + "_" + color;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(name, color));
        }
        return treeTypes.get(key);
    }
}
// Flyweight (Shared Object)
class TreeType {
    private String name;
    private String color;

    public TreeType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void display(int x, int y) {
        System.out.println("Tree: " + name + " at (" + x + ", " + y + ")");
    }
}

