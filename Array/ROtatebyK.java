package Array;

public class ROtatebyK {
    public static void main(String[] args) {
        
    }
    public static void rotate (int[] a, int k){
        int n  = a.length;
        k = k % n;
        reverse(a, 0, n-1);
        reverse(a, 0, k -1);
        reverse(a, k , n-1);
    }
    public static void reverse(int[] a, int s, int e){
        while(s < e){
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }
}
