/*There are n children standing in a line. Each child is assigned a rating value given in the integer array arr[]. You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating than their neighbors get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute. */

import java.util.*;

class candy {

    public static int minCandy(int arr[]) {
        int n = arr.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        int total = 0;
        for (int c : candies) {
            total += c;
        }

        return total;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 2};
        System.out.println("Output: " + minCandy(arr1)); 
        int[] arr2 = {1, 2, 2};
        System.out.println("Output: " + minCandy(arr2)); 
    }
}
