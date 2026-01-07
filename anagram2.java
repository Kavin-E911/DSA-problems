// From the single string to count the possible pairs of anagram after the spliting of substring
import java.util.*;
class anagram2 {

    public static boolean anagram(String str1,String str2){
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] freq = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

       return true;
    }
    public static void main(String[] args) {

        String str = "kkkk";

        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                list.add(str.substring(i, j));
            }
        }
        String[] substrings = list.toArray(new String[0]);

        for (String s : substrings) {
            System.out.println(s);
        }
        int count=0;
        for(int i=0;i<substrings.length-1;i++){
            for(int j=i+1;j<substrings.length;j++){
            if(anagram(substrings[i],substrings[j])){
                count++;
            }
        }
        }
        System.out.println(count);
    }
}
