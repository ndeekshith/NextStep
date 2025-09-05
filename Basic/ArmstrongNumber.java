package Basic;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153; 
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    public static boolean isArmstrong( int n ) {
        int originalNumber = 0;
        int remainder = 0;
        int result = 0;
        int digits = String.valueOf(n).length();
        originalNumber = n;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
    }
    return result == n;
}
}
