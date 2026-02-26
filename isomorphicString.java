import java.util.Scanner;

class isomorphicString {

    public boolean areIsomorphic(String s1, String s2) {

        if (s1.length() != s2.length()) 
            return false;

        char[] arr = new char[26];

        // Mapping s1 -> s2
        for (int i = 0; i < s1.length(); i++) {
            int index = s1.charAt(i) - 'a';

            if (arr[index] == '\u0000' || arr[index] == s2.charAt(i)) {
                arr[index] = s2.charAt(i);
            } else {
                return false;
            }
        }

        char[] arr1 = new char[26];

        // Mapping s2 -> s1
        for (int i = 0; i < s2.length(); i++) {
            int index = s2.charAt(i) - 'a';

            if (arr1[index] == '\u0000' || arr1[index] == s1.charAt(i)) {
                arr1[index] = s1.charAt(i);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        isomorphicString obj = new isomorphicString();

        boolean result = obj.areIsomorphic(s1, s2);

        if (result) {
            System.out.println("Strings are Isomorphic");
        } else {
            System.out.println("Strings are NOT Isomorphic");
        }

        sc.close();
    }
}