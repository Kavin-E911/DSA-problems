import java.util.*;

class happyTriplet {

    int[] smallestDiff(int a[], int b[], int c[]) {

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        int i = 0, j = 0, k = 0;

        int minDiff = Integer.MAX_VALUE;
        int bestSum = Integer.MAX_VALUE;

        int x = 0, y = 0, z = 0;

        while (i < a.length && j < b.length && k < c.length) {

            int minVal = Math.min(a[i], Math.min(b[j], c[k]));
            int maxVal = Math.max(a[i], Math.max(b[j], c[k]));

            int diff = maxVal - minVal;
            int sum = a[i] + b[j] + c[k];

            if (diff < minDiff || (diff == minDiff && sum < bestSum)) {
                minDiff = diff;
                bestSum = sum;
                x = a[i];
                y = b[j];
                z = c[k];
            }

            if (a[i] == minVal) {
                i++;
            } else if (b[j] == minVal) {
                j++;
            } else {
                k++;
            }
        }

        int[] ans = {x, y, z};
        Arrays.sort(ans);
        return new int[]{ans[2], ans[1], ans[0]}; // decreasing order
    }

    public static void main(String[] args) {

        happyTriplet obj = new happyTriplet();

        int[] a = {5, 2, 8};
        int[] b = {10, 7, 12};
        int[] c = {9, 14, 6};

        int[] result = obj.smallestDiff(a, b, c);

        System.out.println("Happiest Triplet: " + Arrays.toString(result));
    }
}
