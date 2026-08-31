import java.util.Stack;

public class EvaluateRPN {

    public static int evalRPN(String[] tokens) {

        Stack<Integer> s = new Stack<>();

        for (String x : tokens) {

            if (x.equals("+")) {

                int a = s.pop();
                int b = s.pop();

                s.push(b + a);

            } else if (x.equals("-")) {

                int a = s.pop();
                int b = s.pop();

                s.push(b - a);

            } else if (x.equals("*")) {

                int a = s.pop();
                int b = s.pop();

                s.push(b * a);

            } else if (x.equals("/")) {

                int a = s.pop();
                int b = s.pop();

                s.push(b / a);

            } else {

                // String → int → Stack
                s.push(Integer.parseInt(x));
            }
        }

        return s.peek();
    }

    public static void main(String[] args) {

        String[] tokens = {
            "10", "6", "9", "3", "+", "-11",
            "*", "/", "*", "17", "+", "5", "+"
        };

        int result = evalRPN(tokens);

        System.out.println("Answer = " + result);
    }
}
