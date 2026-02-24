import java.io.*;
import java.util.*;

class Result {

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        Collections.sort(arr);

        List<Integer> result = new ArrayList<>();
        int n = arr.size();

        result.add(n);

        for (int i = 1; i < n; i++) {
            if (!arr.get(i).equals(arr.get(i - 1))) {
                result.add(n - i);
            }
        }

        return result;
    }
}

public class cutTheStick {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        List<Integer> result = Result.cutTheSticks(arr);
        for (int num : result) {
            System.out.println(num);
        }

        sc.close();
    }
}