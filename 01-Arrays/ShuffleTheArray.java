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

        /* M2:
             int[] ans = new int[2*n];
            for(int i=0; i<n; i++){
                ans[2*i] = nums[i];
                ans[2*i+1] = nums[n+i];
            }

         return ans;
        */
        
    }
}

/*

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {

        stack.push(val);

        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

    int n  = height.length;

    int[] lmax = new int[n];
    int[] lmin = new int[n];

    lmax[0] = height[0];
    lmin[n-1] = height[n-1];


    for(int i=1; i<n; i++){
        lmax[i] = Math.max(lmax[i-1] , height[i]);
    }
    for(int i=n-2; i>=0; i--){
        rmax[i] = Math.max(rmax[i+1] , height[i]);
    }

    int ans = 0;
    for(int i=0; i<n; i++){
        ans += min(lmax[i] , rmax[i] - height[i]);
    }
*/