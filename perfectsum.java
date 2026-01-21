/*Given an array arr of non-negative integers and an integer target, the task is to count all subsets of the array whose sum is equal to the given target. */

import java.util.*;

public class perfectsum {

    // Function to calculate the number of subsets with a given sum
    public static int perfectSum(int[] nums, int target) {
        int mod = 1000000007;

        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int j = target; j >= 0; j--) {
                if (j >= num) {
                    dp[j] = (dp[j] + dp[j - num]) % mod;
                }
            }
        }
        return dp[target];
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(perfectSum(nums, target));

        sc.close();
    }
}

