package part_02;

import java.util.Stack;

public class BalancedBracketsChecker {
    public static boolean hasBalancedBrackets(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (isOpenBracket(c)) {
                stack.push(c);
            } else if (isCloseBracket(c)) {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isOpenBracket(char c) {
        return c == '(' || c == '{' || c == '[' || c == '<';
    }

    private static boolean isCloseBracket(char c) {
        return c == ')' || c == '}' || c == ']' || c == '>';
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']') ||
                (open == '<' && close == '>');
    }

    public static void main(String[] args) {
        String balancedString = "{[()]()}";
        String unbalancedString = "{[()()]";

        System.out.println("Has balanced brackets? " + hasBalancedBrackets(balancedString)); // true
        System.out.println("Has balanced brackets? " + hasBalancedBrackets(unbalancedString)); // false
    }
}

//1.The runtime complexity of the hasBalancedBrackets function is O(n), where n is the length of the input string.
//2.The runtime complexity of the solution code  is O(n), where n is the length of the input string.
//3.Both solutions use a stack and a HashMap to check for balanced brackets in the string.
// Therefore, there is no specific improvement that can be made.