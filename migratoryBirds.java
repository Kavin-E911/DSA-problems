import java.util.*;

public class migratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {

        int[] freq = new int[6];   // index 1 to 5

        // Count frequency
        for (int i = 0; i < arr.size(); i++) {
            int bird = arr.get(i);
            freq[bird]++;
        }

        int maxIndex = 1;

        // Find index with maximum frequency
        for (int i = 2; i <= 5; i++) {
            if (freq[i] > freq[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println(migratoryBirds(arr));
    }
}
