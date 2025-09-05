package Array;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,3,4,4,5};
        int result = removeDuplicates(a);
        System.out.println(Arrays.toString(Arrays.copyOf(a, result)));
        
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
    
}
