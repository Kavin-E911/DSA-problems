// number of char want to delete to make anagram for 2 strings
class anagram1 {
    public static void main(String[] args) {
    
        String str1 = "abc";
        String str2 = "asd";

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            freq2[str2.charAt(i) - 'a']++;
        }
        int count=0;
        for (int i = 0; i < 26; i++) {
            
                count+=Math.abs(freq1[i]-freq2[i]);
            
            
        }

        System.out.println(count);
    }
}