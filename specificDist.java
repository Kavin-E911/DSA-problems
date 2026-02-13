import java.util.*;

public class specificDist {
    
    // Function to find digit sum
    static int digitSum(long x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
    
    // Function to count valid numbers
    public static int getCount(int n, int d) {
        long left = 1, right = n;
        long first = n + 1;
        
        // Binary search to find first valid number
        while (left <= right) {
            long mid = (left + right) / 2;
            
            if (mid - digitSum(mid) >= d) {
                first = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        if (first == n + 1) return 0;
        
        return (int)(n - first + 1);
    }
    
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        System.out.println(getCount(n, d));
        
        sc.close();
    }
}
