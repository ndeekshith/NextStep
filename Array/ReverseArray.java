package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        reverse(a);
        System.out.print("Reversed Array: "+Arrays.toString(a));
    }
    public static void reverse ( int[] a) {
        if ( a.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int start = 0, end = a.length - 1;
        while( start < end) {
            int temp  = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
// o(n) time and o(1) space