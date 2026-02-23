import java.util.*;

public class findDigits {

    public static int findDigits1(int n) {
        
        int count = 0;
        int original = n; 
        
        while(n > 0){
            
            int digit = n % 10;   
            
            if(digit != 0 && original % digit == 0){
                count++;
            }
            
            n = n / 10;   
        }
        
        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();   
        
        while(t > 0){
            
            int n = sc.nextInt();
            
            System.out.println(findDigits1(n));
            
            t--;
        }
        
        sc.close();
    }
} 
