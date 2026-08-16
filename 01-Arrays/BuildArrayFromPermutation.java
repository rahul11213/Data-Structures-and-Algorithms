import java.util.Arrays;

public class BuildArrayFromPermutation{
    public int[] buildArray(int[] nums) {
        int n = nums.length;

        // Step 1: Encode both original and new values into nums[i]
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }

        // Step 2: Extract the new values by dividing by n
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }

        return nums;
    }

    public static void main(String[] args) {
        BuildArrayFromPermutation sol = new BuildArrayFromPermutation();

        // Test Case 1
        int[] nums1 = {0, 2, 1, 5, 3, 4};
        System.out.println("Original 1: " + Arrays.toString(nums1));
        System.out.println("Output 1:   " + Arrays.toString(sol.buildArray(nums1)));

        System.out.println("-----------------------------------");

        // Test Case 2
        int[] nums2 = {5, 0, 1, 2, 3, 4};
        System.out.println("Original 2: " + Arrays.toString(nums2));
        System.out.println("Output 2:   " + Arrays.toString(sol.buildArray(nums2)));
    }
}
