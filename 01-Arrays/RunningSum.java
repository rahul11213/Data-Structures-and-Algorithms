import java.util.Arrays;

public class RunningSum{
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Sample Input
        int[] nums = {1, 2, 3, 4};
         
        // Method call
        int[] result = sol.runningSum(nums);

        // Output print karna
        System.out.println("Input:  " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result));
    }
}

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] runningSum = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}
