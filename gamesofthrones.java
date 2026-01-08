
import java.io.*;

class Result {

    /*
     * Complete the 'gameOfThrones' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String gameOfThrones(String s) {
    // Write your code here
     int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            int n=s.charAt(i)-'a';
            arr[n]++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        if(count==0 || count==1){
            return "YES";
        }else{
            return "NO";
        }

    }

}

public class gamesofthrones {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
