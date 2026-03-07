import java.util.Scanner;

class minOperation{

    public int minOperations(int n) {
        return (n * n) / 4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        minOperation obj = new minOperation();
        int result = obj.minOperations(n);

        System.out.println("Minimum operations needed: " + result);

        sc.close();
    }
}