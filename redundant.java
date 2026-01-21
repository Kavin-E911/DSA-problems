/*Expression contains redundant bracket or not
Difficulty: MediumAccuracy: 48.71%Submissions: 38K+Points: 4
Given a string of balanced expression s, check if it contains a redundant parenthesis or not. A set of parenthesis are redundant if the same sub-expression is surrounded by unnecessary or multiple brackets.
Note: Expression may contain + , - , *, and / operators. Given expression is valid and there are no white spaces present. */
import java.util.*;

class redundant {

    public static boolean checkRedundancy(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ')') {
                boolean hasOperator = false;

                while (!st.isEmpty() && st.peek() != '(') {
                    char top = st.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        hasOperator = true;
                    }
                }

                st.pop();

                if (!hasOperator) return true;
            } else {
                st.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(checkRedundancy(s));
    }
}
