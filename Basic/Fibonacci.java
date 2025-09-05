package Basic;

public class Fibonacci {
    public static void main(String[] args) {
        
    }
    public static int fibo(int n){
        if ( n <= 0 ){
            return 0;
        }
        if( n <= 1){
            return 1;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
        }
        public int foborecursive ( int n) {
            if ( n <= 0 ) return 0;
            if ( n <= 1) return 1;
            return foborecursive((n - 1)) + foborecursive((n - 2));
        }
    }

