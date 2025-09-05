package Array;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {3,5, 1, 8, 2};
        int result = findminMax(arr);
        System.out.println("Sum of Min and Max: " + result);
        
    }
    public static int findminMax(int[] arr) {
        if ( arr.length == 0) {
            return -1;
        }
        int min = arr[0], max = arr[0];
        for(int i : arr) {
            if (i > max) max = i;
            if ( i < min) min = i; 
        }
        System.out.println("Min: " + min + ", Max: " + max);
        return min + max;
    }
}
