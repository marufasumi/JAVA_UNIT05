package part_02;

import java.util.Stack;

public class BalancedParenthesesChecker {
    public static boolean hasBalancedParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String balancedString = "((()))";
        String unbalancedString = "(()()";

        System.out.println("Has balanced parentheses? " + hasBalancedParentheses(balancedString)); // true
        System.out.println("Has balanced parentheses? " + hasBalancedParentheses(unbalancedString)); // false
    }
}
//1.The runtime complexity of the above code is O(n), where n is the length of the input string.
//3. Currently, the function returns false when a closing bracket is encountered without a matching
// opening bracket. However, it would be beneficial to provide additional information,
// such as the index or position of the unbalanced bracket, to help identify the error more accurately.
