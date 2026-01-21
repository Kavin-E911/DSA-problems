/* Largest Number At Least Twice of Others

You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.*/

public class largenum {

    public static int dominantIndex(int[] nums) {

        int largest = -1;
        int largestIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
                largestIndex = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != largestIndex && nums[i] * 2 > largest) {
                return -1;
            }
        }

        return largestIndex;
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};

        int result = dominantIndex(nums);

        System.out.println("Dominant Index: " + result);
    }
}
