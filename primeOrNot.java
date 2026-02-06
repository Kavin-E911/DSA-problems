import java.io.*;
import java.util.*;

public class primeOrNot {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            if(prime(m)){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }
    }
    public static boolean prime(int m){
        if(m<2){
            return false;
        }
        if(m==2){
            return true;
        }
        for(int i=2;i*i<=m;i++){
            if(m%i==0){
                return false;
            }
        }
        return true;
    }
}