import java.util.*;

class billDivision {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;

        // add all items except the one Anna didn't eat
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                sum += bill.get(i);
            }
        }

        int actualShare = sum / 2;

        if (actualShare == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - actualShare);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of items
        int k = sc.nextInt();   // item Anna didn't eat

        List<Integer> bill = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bill.add(sc.nextInt());
        }

        int b = sc.nextInt();   // amount charged to Anna

        bonAppetit(bill, k, b);
    }
}
