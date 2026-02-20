import java.util.*;

public class saveThePrisoner{

    public static int saveThePrisoner1(int n, int m, int s) {
        
        int result = (s + m - 1) % n;
        
        if (result == 0)
            return n;
        else
            return result;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();   
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            
            System.out.println(saveThePrisoner1(n, m, s));
        }
        
        sc.close();
    }
}