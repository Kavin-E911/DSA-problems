
public class closestPair {

    public static int[] closestPair1(int[] arr1, int[] arr2, int x) {
        int i = 0;
        int j = arr2.length - 1;

        int minDiff = Integer.MAX_VALUE;
        int a = 0, b = 0;

        while (i < arr1.length && j >= 0) {
            int sum = arr1[i] + arr2[j];
            int diff = Math.abs(sum - x);

            if (diff < minDiff) {
                minDiff = diff;
                a = arr1[i];
                b = arr2[j];
            }

            if (sum > x) {
                j--;
            } else {
                i++;
            }
        }

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 7};
        int[] arr2 = {10, 20, 30, 40};
        int x = 32;

        int[] ans = closestPair1(arr1, arr2, x);

        System.out.println("Closest Pair: " + ans[0] + " " + ans[1]);
    }
}