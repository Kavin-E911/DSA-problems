import java.util.*;

public class arraySum {

    static int maxSubsetSum(int[] arr) {
        int prev2 = 0;   // sum till i-2
        int prev1 = 0;   // sum till i-1

        for (int i = 0; i < arr.length; i++) {
            int take = prev2 + arr[i];   // take current element
            int skip = prev1;            // skip current element

            int curr = Math.max(take, skip);

            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxSubsetSum(arr));
        sc.close();
    }
}
