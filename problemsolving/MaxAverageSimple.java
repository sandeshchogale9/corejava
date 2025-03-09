package incubation.problemsolving;

import java.util.ArrayList;
import java.util.List;

//find maximum average value.
//	[ [ "Bobby", 87 ],
//	   [ "Charles", 100 ],
//	   [ "Eric", 64 ],
//	   [ "Charles", 22 ] ]
//	Expected output: 87

public class MaxAverageSimple {
    public static void main(String[] args) {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Bobby", 87});
        list.add(new Object[]{"Charles", 100});
        list.add(new Object[]{"Eric", 64});
        list.add(new Object[]{"Charles", 22});

        int maxAvg = findMaxAverage(list);
        System.out.println(maxAvg); // Output: 87
    }

    public static int findMaxAverage(List<Object[]> list) {
        int maxAvg = Integer.MIN_VALUE;

        for (Object[] entry : list) {
            int value = (int) entry[1]; // Extracting the numeric value
            if (value > maxAvg) {
                maxAvg = value;
            }
        }

        return maxAvg;
    }
}

