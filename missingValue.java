import java.util.*;

public class missingValue {
    
    public static ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        
        int i = 0;
        
        for(int num = low; num <= high; num++){
            
            while(i < arr.length && arr[i] < num){
                i++;
            }
            
            if(i >= arr.length || arr[i] != num){
                ans.add(num);
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int low = sc.nextInt();
        int high = sc.nextInt();
        
        ArrayList<Integer> result = missingRange(arr, low, high);
        
        for(int num : result){
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}
