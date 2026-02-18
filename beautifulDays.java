import java.util.*;

public class beautifulDays {

    public static int beautifulDays(int i, int j, int k) {
        int count = 0;

        for (int num = i; num <= j; num++) {
            int rev = 0, temp = num;

            // reverse number
            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }

            if (Math.abs(num - rev) % k == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(beautifulDays(i, j, k));
    }
}
