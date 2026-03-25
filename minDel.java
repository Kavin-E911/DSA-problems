import java.util.*;

public class minDel {

    public int minDeletion(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        if (map.size() <= k) {
            return 0;
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> a.getValue() - b.getValue());
        int sum = 0;
        for (int i = 0; i < map.size() - k; i++) {
            sum += list.get(i).getValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        minDel sol = new minDel();

        String s1 = "abc";
        int k1 = 2;
        System.out.println("Output: " + sol.minDeletion(s1, k1)); 

        String s2 = "aabb";
        int k2 = 2;
        System.out.println("Output: " + sol.minDeletion(s2, k2)); 

        String s3 = "yyyzz";
        int k3 = 1;
        System.out.println("Output: " + sol.minDeletion(s3, k3)); 
    }
}