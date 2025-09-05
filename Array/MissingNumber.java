package Array;

public class MissingNumber {
    public static int find(int[] arr, int n) {
        int total = n * (n+1) / 2;
        int sum = 0;
        for (int num : arr) sum += num;
        return total - sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        System.out.println(find(arr, 6)); // 3
    }
}
