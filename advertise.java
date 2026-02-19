import java.io.*;

class Result {

    public static int viralAdvertising(int n) {
        
        int shared = 5;
        int total = 0;

        for(int i = 1; i <= n; i++) {
            int liked = shared / 2;
            total += liked;
            shared = liked * 3;
        }

        return total;
    }
}

public class advertise {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(Result.viralAdvertising(n));
    }
}
