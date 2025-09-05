package Basic;

public class sumofdigits {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Sum of digits: " + sumOfDigits(n));
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while( n != 0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}
