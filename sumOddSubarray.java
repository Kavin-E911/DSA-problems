
import java.util.*;

class sumOddSubarray {

    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - i;

            int totalSubarrays = left * right;
            int oddCount = (totalSubarrays + 1) / 2;

            sum += arr[i] * oddCount;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sumOddSubarray obj = new sumOddSubarray();
        int result = obj.sumOddLengthSubarrays(arr);

        System.out.println(result);
    }
}
