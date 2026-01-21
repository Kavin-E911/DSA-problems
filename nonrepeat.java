/*Non Repeating Character */
import java.util.*;

public class nonrepeat {
    public static char nonRepeatingChar(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        return '$';
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char result = nonRepeatingChar(s);
        System.out.println(result);

        sc.close();
    }
}
