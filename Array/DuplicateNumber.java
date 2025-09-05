package Array;

public class DuplicateNumber {
    public static int findDuplicate(int[] arr) {
        boolean[] seen = new boolean[arr.length];
        for (int num : arr) {
            if (seen[num]) return num;
            seen[num] = true;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr)); // 2
    }
}
