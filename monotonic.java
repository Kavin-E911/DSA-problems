

class Solution {

    public boolean isMonotonic(int[] nums) {

        int count1 = 1, count2 = 1;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] <= nums[i + 1]) {
                count1++;
            }

            if (nums[i] >= nums[i + 1]) {
                count2++;
            }
        }

        if (count1 == nums.length || count2 == nums.length) {
            return true;
        }

        return false;
    }
}

public class monotonic {
    public static void main(String[] args) {

        Solution s = new Solution();

        int[] nums1 = {1, 2, 2, 3};
        int[] nums2 = {6, 5, 4, 4};
        int[] nums3 = {1, 3, 2};

        System.out.println(s.isMonotonic(nums1));
        System.out.println(s.isMonotonic(nums2)); 
        System.out.println(s.isMonotonic(nums3)); 
    }
}
