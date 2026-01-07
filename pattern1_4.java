class pattern1_4 {
    public static void main(String[] args) {

        // Que:1
        System.out.println("Que:1");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        // Que:2
        System.out.println("Que:2");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4 - 1 - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        // Que:3
        System.out.println("Que:3");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        // Que:4
        System.out.println("Que:4");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 4 - i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}