package Array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        
    }
    public static int[] twosum(int[] a, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++){
            int complement = target - a[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            } else {
                map.put(a[i], i);
            }

        }
        return new int[]{-1, -1};
    }
    
}
