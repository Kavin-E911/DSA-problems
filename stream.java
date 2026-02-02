import java.util.*;

class stream {

    public String firstNonRepeating(String s) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
            q.add(ch);

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.poll();
            }

            if (q.isEmpty()) {
                ans.append('#');
            } else {
                ans.append(q.peek());
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.next();

        stream obj = new stream();
        String result = obj.firstNonRepeating(s);

        System.out.println("Output: " + result);

        sc.close();
    }
}
