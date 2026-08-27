import java.util.Stack;

public class BackSpaceCompare {

    public static boolean backspaceCompare(String s, String t) {

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        // String s
        for (char c : s.toCharArray()) {

            if (c == '#') {

                if (!stack1.isEmpty()) {
                    stack1.pop();
                }

            } else {
                stack1.push(c);
            }
        }

        // String t
        for (char c : t.toCharArray()) {

            if (c == '#') {

                if (!stack2.isEmpty()) {
                    stack2.pop();
                }

            } else {
                stack2.push(c);
            }
        }

        return stack1.equals(stack2);
    }

    public static void main(String[] args) {

        String s = "ab#c";
        String t = "ad#c";

        System.out.println(backspaceCompare(s, t));
    }
}
