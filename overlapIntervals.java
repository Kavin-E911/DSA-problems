import java.util.*;

class overlapIntervals {
    
    public static int overlapInt(int[][] arr) {
        int n = arr.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = arr[i][0];
            end[i] = arr[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j = 0, count = 0, max = 0;

        while (i < n && j < n) {
            if (start[i] <= end[j]) {
                count++;
                max = Math.max(max, count);
                i++;
            } else {
                count--;
                j++;
            }
        }
        return max;
    }

    // MAIN METHOD
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3},
            {2, 4},
            {6, 8},
            {5, 7}
        };

        System.out.println(overlapInt(arr));
    }
}
