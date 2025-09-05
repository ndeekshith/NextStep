package Basic;

public class pallindromeNo {
    public static void main(String[] args) {
        int n = 1233211;
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n != 0) {
            int r = n % 10;
            reversed = reversed * 10 + r;
            n /= 10;
        }
        
        return original == reversed;
    }
}
