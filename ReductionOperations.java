import java.util.*;

public class ReductionOperations {

    public static int reductionOperations(int[] nums) {
        Arrays.sort(nums);

        int operations = 0;
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                count++;
            }
            operations += count;
        }

        return operations;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = reductionOperations(nums);

        System.out.println("Minimum operations required: " + result);

        sc.close();
    }
}