class maxpeople {
    public int maxPeople(int[] arr) {
        // code here
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int res=1;
        for(int i=0;i<arr.length;i++){
            int count=1;
            if(arr[i]==max){
                int left=i-1;
                while(left>=0 && arr[left]!=max){
                    count++;
                }
                int right=i+1;
                while(right<arr.length&& arr[right]!=max){
                    count++;
                }
            }
            res=Math.max(res,count);
        }
        return res;
    }
     public static void main(String[] args) {
        maxpeople obj = new maxpeople();

        int[] arr1 = {6, 2, 5, 4, 5, 1, 6};
        System.out.println(obj.maxPeople(arr1)); // Output: 6

        int[] arr2 = {1, 3, 6, 4};
        System.out.println(obj.maxPeople(arr2)); // Output: 4
    }
}
