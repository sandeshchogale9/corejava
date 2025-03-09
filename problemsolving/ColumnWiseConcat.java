package incubation.problemsolving;

import java.util.*;

public class ColumnWiseConcat {
    public static void main(String[] args) {
        String str = "a,b,c, e,f,g i,j,k m,n,o";

        // Step 1: Split by spaces to get groups
        String[] groups = str.split(" ");

        // Step 2: Split each group by commas and store as lists
        List<List<String>> columns = new ArrayList<>();
        for (String group : groups) {
            columns.add(Arrays.asList(group.split(",")));
        }

        // Step 3: Merge column-wise
        StringBuilder result = new StringBuilder();
        int colSize = columns.get(0).size(); // Assuming all columns have equal elements

        for (int i = 0; i < colSize; i++) {
            for (List<String> column : columns) {
                result.append(column.get(i));
            }
            result.append(" "); // Space after each merged set
        }

        // Step 4: Print final result
        System.out.println(result.toString().trim());
    }
}

