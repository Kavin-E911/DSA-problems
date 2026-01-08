import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class prime1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Factors(arr));
    }
   
    public static int Factors(int[] nums) {
        Set<Integer> primes = new HashSet<>();
        for (int num : nums) {
            int x = num;

            for (int i = 2; i<=Math.sqrt(x); i++) {
                while (x % i == 0) {
                    primes.add(i);
                    x /= i;
                }
            }
            if (x > 1) {
                primes.add(x);
            }
        }

        return primes.size();
    }
}

    

