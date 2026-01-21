/*You are part of a national postal service that delivers mail across n cities. Each city is labeled with a unique postal zone from 1 to N. However, the actual delivery route is not in sorted order and must be reordered to match increasing postal zone values. The route must go through cities in ascending order — that is, city 2 cannot be delivered before city 1, city 3 cannot be before city 2, and so on.

Each time a city is reached (in the correct ascending order), it incurs a travel cost k. The goal is to find the total cost incurred in delivering to each city in the final sorted sequence.

Input Format

First line: an integer n — the number of cities

Second line: a list of n integers separated by spaces — the current delivery route (permuted postal zone numbers)

Third line: an integer k — the cost of traveling between two cities*/
import java.util.*;

public class postaldeliver {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(arr[i],i+1);
        }
        long sum=mp.get(1);
        System.out.print(sum*k+" ");
        for(int i=2;i<=n;i++){
            int val=Math.abs(mp.get(i)-mp.get(i-1));
            sum+=val;
            System.out.print(sum*k+" ");
        }
        
    }
}