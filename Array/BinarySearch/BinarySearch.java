package Array.BinarySearch;
public class BinarySearch {
    public static void main(String[] args) {
        
    }
    public static int bs (int[] a, int target){
        if (a.length == 0){
            return 0;
        }
        int s = 0, e = a.length - 1;
        while (s <= e){
            int m = s + (e - s)/2;
            if (target == a[m]){
                return m;
            }
            else if (target < a[m]){
                e = m - 1;

            }
            else {
                s = m + 1;
            }
        }
        return -1;
    }
}
