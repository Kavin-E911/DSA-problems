import java.util.*;

class countSquares {

    public static int countSubmatrix(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;

        long[][] prefix = new long[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                prefix[i][j] = mat[i - 1][j - 1]
                        + prefix[i - 1][j]
                        + prefix[i][j - 1]
                        - prefix[i - 1][j - 1];
            }
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                for (int size = 1; i + size - 1 <= n && j + size - 1 <= m; size++) {

                    int r2 = i + size - 1;
                    int c2 = j + size - 1;

                    long sum = prefix[r2][c2]
                            - prefix[i - 1][c2]
                            - prefix[r2][j - 1]
                            + prefix[i - 1][j - 1];

                    if (sum == x) count++;
                }
            }
        }

        return count;
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        int result = countSubmatrix(mat, x);

        System.out.println(result);
    }
}