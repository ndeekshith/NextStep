package Basic;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 9111;
        System.out.println(reverse(n));
    }
    public static int reverse (int n) {
        int reversed = 0;
        while ( n != 0) {
            int r =  n % 10; 
            reversed = reversed * 10 + r;
            n /= 10;
        }
        return reversed;
    }
}
