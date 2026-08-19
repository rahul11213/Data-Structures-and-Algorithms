import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Sample Input (nums array aur n)
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        // Method call
        int[] result = sol.shuffle(nums, n);

        // Output print karna
        System.out.println("Input:  " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result));
    }
}  

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[count] = nums[i];
            arr[count + 1] = nums[i + n];
            count += 2;
        }
        return arr;
    }
}