
import java.util.*;

class decode{

    public int numDecodings(String s) {
        int n = s.length();
        int[] arr = new int[n + 1];

        arr[0] = 1;  

        for (int i = 1; i < n + 1; i++) {
            if (s.charAt(i - 1) != '0') {
                arr[i] += arr[i - 1];
            }
            if (i > 1) {
                int two = Integer.parseInt(s.substring(i - 2, i));
                if (two >= 10 && two <= 26) {
                    arr[i] += arr[i - 2];
                }
            }
        }
        return arr[n];
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        decode obj = new decode();

        System.out.print("Enter string: ");
        String s = sc.next();

        int result = obj.numDecodings(s);
        System.out.println("Number of ways: " + result);

        sc.close();
    }
}
