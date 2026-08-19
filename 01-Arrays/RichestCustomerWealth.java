import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Sample Input (Rows = Customers, Columns = Banks)
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };

        // Method call
        int result = sol.maximumWealth(accounts);

        // Output print karna
        System.out.println("Accounts: " + Arrays.deepToString(accounts));
        System.out.println("Maximum Wealth: " + result);
    }
}

class Solution {
    public int maximumWealth(int[][] accounts) {
         int maxwealth = 0;
         
         for(int i=0; i<accounts.length; i++){
            int currentwealth = 0;
            for(int j=0; j<accounts[i].length; j++){
                currentwealth += accounts[i][j];
            }
            maxwealth = Math.max(currentwealth, maxwealth);
         }
         return maxwealth;
    }
}
