package revision;

import java.util.Stack;

public class ConstructExpressionTree {
    public static void main(String[] args) {
        String str = "wlrb+-*";//"ab+ef*g*-";
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (isExpression(str.charAt(i))) {
                String right = stack.pop();
                stack.push(stack.pop() + String.valueOf(str.charAt(i)) + right);
            } else
                stack.push(String.valueOf(str.charAt(i)));
        }
        System.out.println("infix of the tree is: " + stack.pop());
    }

    public static boolean isExpression(Character c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
            return true;
        return false;
    }
}
