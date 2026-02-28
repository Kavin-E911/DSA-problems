public class revString {

    public static int reverseDegree(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int n = 'z' - s.charAt(i) + 1;
            sum = sum + n * (i + 1);
        }

        return sum;
    }

    public static void main(String[] args) {

        String s = "abc";   // you can change input here

        int result = reverseDegree(s);

        System.out.println("Reverse Degree = " + result);
    }
}