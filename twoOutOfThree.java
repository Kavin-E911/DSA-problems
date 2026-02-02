import java.util.*;
public class twoOutOfThree {

    public List<Integer> twoOutofThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] arr1 = new int[101];
        int[] arr2 = new int[101];
        int[] arr3 = new int[101];

        for (int i : nums1) {
            arr1[i]++;
        }
        for (int i : nums2) {
            arr2[i]++;
        }
        for (int i : nums3) {
            arr3[i]++;
        }

        List<Integer> ls = new ArrayList<>();

        for (int i = 0; i < 101; i++) {
            if (arr1[i] > 0 && arr2[i] > 0) {
                ls.add(i);
            } 
            else if (arr2[i] > 0 && arr3[i] > 0) {
                ls.add(i);
            } 
            else if (arr3[i] > 0 && arr1[i] > 0) {
                ls.add(i);
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        twoOutOfThree obj = new twoOutOfThree();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 3, 4};
        int[] nums3 = {3, 4, 5};

        List<Integer> result = obj.twoOutofThree(nums1, nums2, nums3);

        System.out.println("Elements present in at least two arrays: " + result);
    }
}
