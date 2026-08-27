import java.util.*;

public class LargestRectangleInHistogram  {

    public static int largestRectangleArea(int[] heights) {

        int n = heights.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> s = new Stack<>();

        // Right Smaller
        for (int i = n - 1; i >= 0; i--) {

            while (!s.empty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            right[i] = s.empty() ? n : s.peek();

            s.push(i);
        }

        // Clear stack
        while (!s.empty()) {
            s.pop();
        }

        // Left Smaller
        for (int i = 0; i < n; i++) {

            while (!s.empty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            left[i] = s.empty() ? -1 : s.peek();

            s.push(i);
        }

        // Calculate maximum area
        int ans = 0;

        for (int i = 0; i < n; i++) {

            int width = right[i] - left[i] - 1;

            int currArea = heights[i] * width;

            ans = Math.max(ans, currArea);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] heights = {2, 1, 5, 6, 2, 3};

        int ans = largestRectangleArea(heights);

        System.out.println("Largest Rectangle Area = " + ans);
    }
}
