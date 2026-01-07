class pattern5 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2*n - 1; j++){
                if((i + j) < n - 1 || j > n - 1 + i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}