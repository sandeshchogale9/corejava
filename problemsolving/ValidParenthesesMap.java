package incubation.problemsolving;

import java.util.*;

public class ValidParenthesesMap {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) { // Closing bracket
                char top = stack.isEmpty() ? '#' : stack.pop();
                if (top != map.get(ch)) return false; // Mismatch
            } else { // Opening bracket
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}")); // Output: true
    }
}
