import java.util.*;

class maxProductSubarray {

    static int maxProduct(int[] arr) {
        int n = arr.length;

        int prefix = 1, suffix = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            prefix = (prefix == 0 ? 1 : prefix) * arr[i];
            suffix = (suffix == 0 ? 1 : suffix) * arr[n - 1 - i];

            ans = Math.max(ans, Math.max(prefix, suffix));
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxProduct(arr);
        System.out.println("Maximum Product Subarray: " + result);
    }
}

