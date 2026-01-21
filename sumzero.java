/*Given an integer n, return any array containing n unique integers such that they add up to 0.
 */

import java.util.*;

public class sumzero {

    public static int[] sumZero(int n) {
        int[] res = new int[n];
        int index = 0;
        for (int i = 1; i <= n / 2; i++) {
            res[index++] = i;
            res[index++] = -i;
        }
        if (n % 2 == 1) {
            res[index] = 0;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = sumZero(n);
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
