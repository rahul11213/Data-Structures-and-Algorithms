import java.util.Stack;

public class BackSpaceCompare {

    public static boolean backspaceCompare(String s, String t) {

        /* Brute Force */

        // Stack<Character> stack1 = new Stack<>();
        // Stack<Character> stack2 = new Stack<>();

        // // String s
        // for (char c : s.toCharArray()) {

        //     if (c == '#') {

        //         if (!stack1.isEmpty()) {
        //             stack1.pop();
        //         }

        //     } else {
        //         stack1.push(c);
        //     }
        // }

        // // String t
        // for (char c : t.toCharArray()) {

        //     if (c == '#') {

        //         if (!stack2.isEmpty()) {
        //             stack2.pop();
        //         }

        //     } else {
        //         stack2.push(c);
        //     }
        // }

        // return stack1.equals(stack2);


        /* Optimized Approach */

        return getActual(s).equals(getActual(t));
    }

    private static String getActual(String input) {

        StringBuilder actualString = new StringBuilder();
        int hashCount = 0;

        for (int i = input.length() - 1; i >= 0; i--) {

            if (input.charAt(i) == '#') {
                hashCount++;
                continue;
            }

            if (hashCount > 0) {
                hashCount--;
            } else {
                actualString.insert(0, input.charAt(i));
            }
        }

        return actualString.toString();
    }

    public static void main(String[] args) {

        String s = "ab#c";
        String t = "ad#c";

        boolean result = backspaceCompare(s, t);

        System.out.println(result);
    }
}