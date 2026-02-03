
import java.util.*;

public class distributeBooks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println("0");
            return;
        }
        long[] dp=new long[n+1];
        dp[1]=0;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            dp[i]+=(dp[i-1]+dp[i-2])*(i-1);
        }
        System.out.println(dp[n]);
    }
}