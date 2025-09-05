package Strings;

public class CompressString {
    public static void main(String[] args) {
        String s = "aaabbc";
        String result = compress(s);
        System.out.println(result); // Output: a3b2c
    }

    public static String compress(String str) {
        if (str == null || str.isEmpty()) return str;

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }
        return compressed.toString();
    }
}
