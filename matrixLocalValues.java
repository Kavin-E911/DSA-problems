import java.util.*;

class matrixLocalValues {

    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] arr = new int[n - 2][n - 2];

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {

                int max = 0;

                for (int r = i; r < i + 3; r++) {
                    for (int h = j; h < j + 3; h++) {
                        max = Math.max(max, grid[r][h]);
                    }
                }

                arr[i][j] = max;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        matrixLocalValues obj = new matrixLocalValues();

        int[][] grid = {
            {9, 9, 8, 1},
            {5, 6, 2, 6},
            {8, 2, 6, 4},
            {6, 2, 2, 2}
        };

        int[][] result = obj.largestLocal(grid);

        System.out.println("Output matrix:");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
