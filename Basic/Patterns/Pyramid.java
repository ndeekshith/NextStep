package Basic.Patterns;

public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        pyramid(n);
    }
    public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars (2*i - 1)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

