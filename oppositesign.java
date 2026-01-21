/*2149. Rearrange Array Elements by Sign */

import java.util.*;

public class oppositesign {

    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        Solution sol = new Solution();
        int[] result = sol.rearrangeArray(nums);
        System.out.println(Arrays.toString(result));
    }
}

class Solution {

    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int pos = 0;
        int neg = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                arr[pos] = nums[i];
                pos += 2;
            } else {
                arr[neg] = nums[i];
                neg += 2;
            }
        }
        return arr;
    }
}
