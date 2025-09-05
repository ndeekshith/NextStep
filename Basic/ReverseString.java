package Basic;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    
}
