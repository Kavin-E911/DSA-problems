import java.util.*;

class subarrayDiv {

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;

        // check every segment of length m
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;

            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }

            if (sum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of chocolate squares
        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }

        int d = sc.nextInt();   // required sum
        int m = sc.nextInt();   // segment length

        System.out.println(birthday(s, d, m));
    }
}
