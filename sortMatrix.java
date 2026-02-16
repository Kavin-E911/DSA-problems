import java.util.*;

public class sortMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        sortMatrix1(grid);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sortMatrix1(int[][] grid) {
        int n = grid.length;

        for (int row = 0; row < n; row++) {
            sortDiagonal(grid, row, 0);
        }

        for (int col = 1; col < n; col++) {
            sortDiagonal(grid, 0, col);
        }
    }

    public static void sortDiagonal(int[][] grid, int r, int c) {
        int n = grid.length;
        List<Integer> list = new ArrayList<>();

        int row = r, col = c;

        while (row < n && col < n) {
            list.add(grid[row][col]);
            row++;
            col++;
        }

        if (r >= c) {
            Collections.sort(list, Collections.reverseOrder());
        } else {
            Collections.sort(list);
        }

        row = r;
        col = c;
        int i = 0;

        while (row < n && col < n) {
            grid[row][col] = list.get(i++);
            row++;
            col++;
        }
    }
}
