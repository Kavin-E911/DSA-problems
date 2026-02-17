import java.util.*;

public class sequenceEqu {

    public static List<Integer> permutationEquation(List<Integer> p) {
        List<Integer> result = new ArrayList<>();
        int n = p.size();

        for (int x = 1; x <= n; x++) {
            int pos1 = p.indexOf(x) + 1;
            int pos2 = p.indexOf(pos1) + 1;
            result.add(pos2);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> p = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            p.add(sc.nextInt());
        }

        List<Integer> result = permutationEquation(p);

        for (int val : result) {
            System.out.println(val);
        }

        sc.close();
    }
}
