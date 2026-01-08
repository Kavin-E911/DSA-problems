//For a given input 'N', print the list of prime numbers that can divide it.
import java.util.*;

public class prime {
    public static void main(String[] args){  
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                while(n%i==0){
                    n/=i; 
                    
                }
            }
        }
        if(n>1) System.out.print(n);
        }
}

