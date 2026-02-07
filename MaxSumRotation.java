import java.util.Scanner;

class MaxSumRotation {

    int maxSum(int[] arr) {
        int n = arr.length;
        int arrSum = 0;
        int currVal = 0;

        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
            currVal += i * arr[i];
        }

        int maxVal = currVal;

        for (int j = 1; j < n; j++) {
            currVal = currVal + arrSum - n * arr[n - j];
            maxVal = Math.max(maxVal, currVal);
        }

        return maxVal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        MaxSumRotation obj = new MaxSumRotation();
        System.out.println("Maximum rotation sum: " + obj.maxSum(arr));
    }
}
