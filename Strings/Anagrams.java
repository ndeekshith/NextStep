package Strings;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        int[] charCount = new int[256];

        for( char c : str1.toCharArray()) {
            charCount[c]++;
        }
        for (char c : str2.toCharArray()) {
            charCount[c]--;
            if (charCount[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
