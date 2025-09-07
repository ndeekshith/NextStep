package Strings;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s)); // Output: "world hello"
    }

    public static String reverseWords(String s) {
        if (s == null || s.isEmpty()) return s;
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) result.append(" ");
        }
        return result.toString();
    }
}
