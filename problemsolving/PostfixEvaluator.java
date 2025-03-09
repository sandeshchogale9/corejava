package incubation.problemsolving;

import java.util.Stack;

public class PostfixEvaluator {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (String token : expression.split("\\s+")) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                    case "^": stack.push((int) Math.pow(a, b)); break;
                    default: throw new IllegalArgumentException("Invalid operator: " + token);
                }
            }
        }
        return stack.pop(); // Final result
    }

    private static boolean isNumeric(String s) {
        return s.matches("-?\\d+"); // Check if it's a number
    }

    public static void main(String[] args) {
        String postfix = "2 3 * 5 4 * + 9 -";
        System.out.println("Result: " + evaluatePostfix(postfix)); // Output: 13
    }
}

