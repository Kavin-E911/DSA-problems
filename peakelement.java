/*You are given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist).

If there are multiple peak elements, Return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".

Note: Consider the element before the first element and the element after the last element to be negative infinity*/

class peakelement {
    public int peakElement(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return 0;
        }
        if (arr[0] > arr[1]) {
            return 0;
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }

        return -1; 
    }
    public static void main(String[] args) {
        peakelement pe = new peakelement();

        int[] arr1 = {1, 2, 4, 5, 7, 8, 3};
        System.out.println(pe.peakElement(arr1)); 

        int[] arr2 = {10, 20, 15, 2, 23, 90, 80};
        System.out.println(pe.peakElement(arr2)); 
    }
}
