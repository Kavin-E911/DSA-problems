/*Spiral Matrix */

class spiral {

    public static int[][] generateMatrix(int n) {
        int top = 0, left = 0;
        int bottom = n - 1, right = n - 1;
        int val = 1;
        int[][] mat = new int[n][n];

        while (val <= n * n) {
            for (int i = left; i <= right && val <= n * n; i++) {
                mat[top][i] = val++;
            }
            top++;

            for (int i = top; i <= bottom && val <= n * n; i++) {
                mat[i][right] = val++;
            }
            right--;

            for (int i = right; i >= left && val <= n * n; i--) {
                mat[bottom][i] = val++;
            }
            bottom--;

            for (int i = bottom; i >= top && val <= n * n; i--) {
                mat[i][left] = val++;
            }
            left++;
        }

        return mat;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] res = generateMatrix(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}