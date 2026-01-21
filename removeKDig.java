/*Given a non-negative integer s represented as a string and an integer k, remove exactly k digits from the string so that the resulting number is the smallest possible, while maintaining the relative order of the remaining digits.

Note : The resulting number must not contain any leading zeros.
If the resulting number is an empty string after the removal, return "0".*/

import java.util.*;

class removeKDig {
    public String removeKdig(String s, int k) {
        if (k >= s.length()) return "0";
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            while (stack.length() > 0 && k > 0 && stack.charAt(stack.length() - 1) > c) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(c);
        }
        while (k > 0 && stack.length() > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }
        int index = 0;
        while (index < stack.length() && stack.charAt(index) == '0') {
            index++;
        }
        String result = stack.substring(index);
        return result.length() == 0 ? "0" : result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        Solution obj = new Solution();
        System.out.print(obj.removeKdig(s, k));
    }
}
