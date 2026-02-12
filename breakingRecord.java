import java.util.*;

class breakingRecord {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int max = scores.get(0);
        int min = scores.get(0);

        int maxBreak = 0;
        int minBreak = 0;

        for (int i = 1; i < scores.size(); i++) {
            int score = scores.get(i);

            if (score > max) {
                max = score;
                maxBreak++;
            }

            if (score < min) {
                min = score;
                minBreak++;
            }
        }

        return Arrays.asList(maxBreak, minBreak);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            scores.add(sc.nextInt());
        }

        List<Integer> result = breakingRecords(scores);

        System.out.println(result.get(0) + " " + result.get(1));
    }
}
