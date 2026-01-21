/*Longest Word in Dictionary through Deleting */

import java.util.*;

public class longestword {

    public static void main(String[] args) {
        String s = "abpcplea";
        List<String> dictionary = new ArrayList<>();
        dictionary.add("ale");
        dictionary.add("apple");
        dictionary.add("monkey");
        dictionary.add("plea");
        Solution sol = new Solution();
        
        String result = sol.findLongestWord(s, dictionary);
        System.out.println(result); 
    }
}

class Solution {

    public String findLongestWord(String s, List<String> dictionary) {
        String answer = "";

        for (String word : dictionary) {
            if (isSubsequence(s, word)) {
                if (word.length() > answer.length() ||
                   (word.length() == answer.length() && word.compareTo(answer) < 0)) {
                    answer = word;
                }
            }
        }
        return answer;
    }

    private boolean isSubsequence(String s, String word) {
        int i = 0, j = 0;

        while (i < s.length() && j < word.length()) {
            if (s.charAt(i) == word.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == word.length();
    }
}

