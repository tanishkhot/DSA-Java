import java.util.Stack;

public class Q1190 {
    public static void main(String[] args) {
        Q1190.reverseParentheses("(abcd)");
    }

    public static String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int ptr = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')') {
//                StringBuilder sb = new StringBuilder();
                while(!stack.isEmpty() && stack.peek() != '('){
                    sb.append(stack.pop());
                }

                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }

                for (int j = 0; j < sb.length(); j++) {
                    stack.push(sb.charAt(j));
                }
            }
            else {

                stack.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }

}
