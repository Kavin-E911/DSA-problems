/*Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.

Note: If no such array is possible then, return [-1]*/
import java.util.*;

public class subarraySum {

    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        ArrayList<Integer> ans = new ArrayList<>();

        int start = 0;
        int sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                ans.add(start + 1);
                ans.add(end + 1); 
                return ans;
            }
        }

        ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          
        int target = sc.nextInt();     

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> result = subarraySum(arr, target);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
