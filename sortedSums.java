import java.util.*;

public class sortedSums {


    /*
    int n=a.size();
    long sum=0;
    int MOD = 1_000_000_007;
    for(int i=0;i<n;i++){
        long res=0;
        int m=1;
        
        List<Integer> sub = new ArrayList<>(a.subList(0, i + 1));
        Collections.sort(sub);
        
        for(int j=0;j<sub.size();j++){
            res=(res+(long)sub.get(j)*m)%MOD;
            m++;
        }
        sum=(sum+res)%MOD;
    }
    return (int)sum;
    */ 
   
    static final int MAX = 1_000_000;
    static final int MOD = 1_000_000_007;

    static long[] count = new long[MAX + 1];
    static long[] sum = new long[MAX + 1];

    // Update Fenwick Tree
    static void update(int index, int value) {
        while (index <= MAX) {
            count[index]++;
            sum[index] += value;
            index += index & -index;
        }
    }

    // Query count and sum till index
    static long[] query(int index) {
        long c = 0, s = 0;
        while (index > 0) {
            c += count[index];
            s += sum[index];
            index -= index & -index;
        }
        return new long[]{c, s};
    }

    static int sortedSum(int[] arr) {

        long current = 0;
        long answer = 0;
        long totalSum = 0;

        for (int x : arr) {

            long[] q = query(x);
            long smallerCount = q[0];
            long smallerSum = q[1];

            long position = smallerCount + 1;
            long greaterSum = totalSum - smallerSum;

            current = (current + position * x + greaterSum) % MOD;
            answer = (answer + current) % MOD;

            update(x, x);
            totalSum += x;
        }

        return (int) answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(sortedSum(arr));
        sc.close();
    }
}
