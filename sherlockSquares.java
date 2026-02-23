import java.util.*;

public class sherlockSquares {

    public static int squares(int a, int b) {
        
        int low = (int)Math.ceil(Math.sqrt(a));
        int high = (int)Math.floor(Math.sqrt(b));
        
        if(high < low) return 0;
        
        return high - low + 1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int q = sc.nextInt();   // number of test cases
        
        while(q > 0) {
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            System.out.println(squares(a, b));
            
            q--;
        }
        
        sc.close();
    }
}