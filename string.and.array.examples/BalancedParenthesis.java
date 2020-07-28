import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        //String str = "[()]{}{[()()]()}";
        //String str = "[(])";
        String str = "[]";
        boolean flag = checkIfBalanced(str);

        if (flag)
            System.out.println("String is balanced");
        else
            System.out.println("String is NOT balanced");
    }

    public static boolean checkIfBalanced(String str) {
        Stack<Character> s = new Stack<>();
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[')
                s.push(ch);

            else {
                Character c = s.pop();
                if (c == null)
                    return false;

                if (c == '(' && ch == ')')
                    continue;

                if (c == '{' && ch == '}')
                    continue;

                if (c == '[' && ch == ']')
                    continue;

                return false;
            }
        }

        if (s.size() > 0)
            return false;

        return true;
    }
}
