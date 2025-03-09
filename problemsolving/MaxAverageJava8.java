package incubation.problemsolving;

import java.util.*;


//find maximum average value.
//	[ [ "Bobby", 87 ],
//	   [ "Charles", 100 ],
//	   [ "Eric", 64 ],
//	   [ "Charles", 22 ] ]
//	Expected output: 87
public class MaxAverageJava8 {
    public static void main(String[] args) {
        List<Object[]> list = Arrays.asList(
                new Object[]{"Bobby", 87},
                new Object[]{"Charles", 100},
                new Object[]{"Eric", 64},
                new Object[]{"Charles", 22}
        );

        double maxAvg = list.stream()
                .mapToInt(e -> (int) e[1])
                .max()
                .orElse(0);

        System.out.println(maxAvg); // Output: 87
    }
}

