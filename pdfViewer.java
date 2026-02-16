import java.util.*;

public class pdfViewer {

    public static int designerPdfViewer(List<Integer> h, String word) {
        int maxHeight = 0;

        for (char c : word.toCharArray()) {
            int index = c - 'a';   // find position of letter
            maxHeight = Math.max(maxHeight, h.get(index));
        }

        return maxHeight * word.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> h = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            h.add(sc.nextInt());
        }

        String word = sc.next();

        System.out.println(designerPdfViewer(h, word));
    }
}
