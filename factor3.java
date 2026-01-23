import java.util.*;
public class factor3 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=0;j<n;j++){
            int l=sc.nextInt();
            int[] arr=new int[l];
            int count=0;
            for(int i=0;i<l;i++){
                arr[i]=sc.nextInt();
                if(arr[i]%3==0){
                    count++;
                }
            }
            if(l%2==0){
            if(count<=l/2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }}else{
                if(count<=(l/2)+1){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
            
        }
    }
}
