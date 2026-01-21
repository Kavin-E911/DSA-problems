
import java.io.*;



public class binary {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String binary = Integer.toBinaryString(n);
        int max=0;
        int count=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                count++;
                max=Math.max(count,max);
            }else{
                count=0;
            }
        }
        System.out.println(max);

        bufferedReader.close();
    }
}
