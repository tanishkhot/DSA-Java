import java.util.Stack;

public class OutermostParenthesis {
    public static void main(String[] args) {
        String a = removeOuterParentheses("(AB)");
        System.out.println(a);
    }
    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int openParentheses = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(') {
                if (openParentheses > 0) {
                    sb.append(currentChar);
                }
                openParentheses++;
            } else if (currentChar == ')') {
                openParentheses--;
                if (openParentheses > 0) {
                    sb.append(currentChar);
                }
            } else {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }
}
