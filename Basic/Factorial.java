package Basic;

public class Factorial {
    public static void main(String[] args) {
        // Example usage
        System.out.println(factorialRecursive(5)); // Output: 120
    }

    public static int factorial(int n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int factorialRecursive(int n) {
        if ( n <= 0) return 0;
        if (n == 1) return 1;
        return n * factorialRecursive(n -1);
    }
}
