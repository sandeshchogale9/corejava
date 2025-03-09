package incubation.problemsolving;

import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.rotate(list, 2); // Rotates right by 2
        System.out.println(list); // Output: [4, 5, 1, 2, 3]
    }
}

