
import java.util.*;

class ballToBox {

    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            for (int j = 0; j < boxes.length(); j++) {
                if (boxes.charAt(j) == '1') {
                    ans[i] += Math.abs(i - j);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ballToBox obj = new ballToBox();

        System.out.println("Enter boxes string (e.g., 110): ");
        String boxes = sc.next();

        int[] result = obj.minOperations(boxes);

        System.out.println("Output:");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
