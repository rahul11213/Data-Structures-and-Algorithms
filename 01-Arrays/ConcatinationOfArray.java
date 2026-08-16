import java.util.Arrays;

public class ConcatinationOfArray {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
 
    public static void main(String[] args) {
        ConcatinationOfArray sol = new ConcatinationOfArray();

        // Test Case 1
        int[] nums1 = {1, 2, 1};
        System.out.println("Original 1: " + Arrays.toString(nums1));
        System.out.println("Output 1:   " + Arrays.toString(sol.getConcatenation(nums1)));

        System.out.println("-----------------------------------");

        // Test Case 2
        int[] nums2 = {1, 3, 2, 1};
        System.out.println("Original 2: " + Arrays.toString(nums2));
        System.out.println("Output 2:   " + Arrays.toString(sol.getConcatenation(nums2)));
    }
}
