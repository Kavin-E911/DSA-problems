import java.util.*;

public class subset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> result = subsets(nums);
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());  

        for (int num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newList = new ArrayList<>(result.get(i));
                newList.add(num);
                result.add(newList);
            }
        }
        return result;
    }
}
