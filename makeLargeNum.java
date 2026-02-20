import java.util.*;

class Solution {
    
    public String findLargest(int[] arr) {
        
        int n = arr.length;
        String[] str = new String[n];
        
        for (int i = 0; i < n; i++) {
            str[i] = String.valueOf(arr[i]);
        }
        
        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));
        
        if (str[0].equals("0")) return "0";
        
        StringBuilder result = new StringBuilder();
        for (String s : str) {
            result.append(s);
        }
        
        return result.toString();
    }
}


public class makeLargeNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Solution obj = new Solution();
        
        System.out.println(obj.findLargest(arr));
        
        sc.close();
    }
}