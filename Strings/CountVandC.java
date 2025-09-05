package Strings;
public class CountVandC {
    public static void main(String[] args) {
        String input = "Hello World";
        countVowelsorConsonents(input);
    }
    public static int countVowelsorConsonents(String s) {
        s = s.toLowerCase();
        int v = 0, c = 0;
        for ( char ch : s.toCharArray()) {
            if ( "aeiou".indexOf(ch) != -1) {
                v++;
            } else if (ch >= 'a' && ch <= 'z') {
                c++;
            }
        }
        System.out.println("Number of vowels: " + v + ", Number of consonants: " + c);
        return v + c;
    }
}
