import java.util.Scanner;

class stringScore {

    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            sum += Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        stringScore obj = new stringScore();
        int result = obj.scoreOfString(s);

        System.out.println("Score of the string: " + result);
    }
}
