
import java.util.*;

public class commonword {

    public static String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        for (String b : banned) {
            bannedSet.add(b.toLowerCase());
        }
        String[] words = paragraph.toLowerCase().split("[^a-z]+");

        // Frequency map
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (!bannedSet.contains(word) && word.length() > 0) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        String result = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String paragraph = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] banned = new String[n];
        for (int i = 0; i < n; i++) {
            banned[i] = sc.nextLine();
        }
        String answer = mostCommonWord(paragraph, banned);
        System.out.println(answer);

        sc.close();
    }
}
